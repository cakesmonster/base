package com.cakemonster.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cakemonster.admin.model.dto.MenuRoleDTO;
import com.cakemonster.admin.model.entity.Menu;
import com.cakemonster.admin.model.vo.MenuVO;

import java.util.List;

/**
 * 菜单表(Menu)表服务接口
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:30
 */
public interface MenuService extends IService<Menu> {

    List<MenuVO> getMenusByHrId();

    List<MenuRoleDTO> getAllMenusWithRole();
}

