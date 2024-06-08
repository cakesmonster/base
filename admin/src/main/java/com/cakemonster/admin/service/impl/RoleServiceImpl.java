package com.cakemonster.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cakemonster.admin.dao.RoleMapper;
import com.cakemonster.admin.model.entity.Role;
import com.cakemonster.admin.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * 角色表(Role)表服务实现类
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:34
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}

