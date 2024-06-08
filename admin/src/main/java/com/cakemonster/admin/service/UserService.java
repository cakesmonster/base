package com.cakemonster.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cakemonster.admin.model.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 用户信息表(User)表服务接口
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:35
 */
public interface UserService extends IService<User>, UserDetailsService {

}

