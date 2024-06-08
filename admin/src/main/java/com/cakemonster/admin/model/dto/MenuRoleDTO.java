package com.cakemonster.admin.model.dto;

import com.cakemonster.admin.model.entity.Menu;
import com.cakemonster.admin.model.entity.Role;
import lombok.Data;

import java.util.List;

/**
 * MenuRoleDTO
 *
 * @author cakemonster
 * @date 2024/6/9
 */
@Data
public class MenuRoleDTO extends Menu {

    private List<Role> roles;

}
