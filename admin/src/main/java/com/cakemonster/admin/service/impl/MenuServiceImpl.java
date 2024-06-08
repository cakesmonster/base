package com.cakemonster.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cakemonster.admin.dao.MenuMapper;
import com.cakemonster.admin.model.dto.MenuRoleDTO;
import com.cakemonster.admin.model.entity.Menu;
import com.cakemonster.admin.model.entity.User;
import com.cakemonster.admin.model.vo.MenuVO;
import com.cakemonster.admin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 菜单表(Menu)表服务实现类
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:32
 */
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuVO> getMenusByHrId() {
        //获取当前登录成功的用户信息
        User principal = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<MenuVO> menus = menuMapper.getMenusByHrId(principal.getId());
        if (menus == null || menus.isEmpty()) {
            throw new RuntimeException("未加载到菜单数据");
        }
        return menus;
    }

    @Override
    public List<MenuRoleDTO> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

}

