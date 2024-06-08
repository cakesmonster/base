package com.cakemonster.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cakemonster.admin.dao.UserMapper;
import com.cakemonster.admin.model.entity.User;
import com.cakemonster.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 用户信息表(User)表服务实现类
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:35
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.lambda().eq(User::getUsername, username);
        //查询某一个具体的用户
        User user = getOne(qw);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在，登录失败");
        }
        user.setRoles(userMapper.getRolesByUserId(user.getId()));
        return user;
    }
}

