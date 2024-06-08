package com.cakemonster.admin.model.vo;

import com.cakemonster.admin.model.entity.Menu;
import lombok.Data;

import java.util.List;

/**
 * MenuVO
 *
 * @author cakemonster
 * @date 2024/6/9
 */
@Data
public class MenuVO extends Menu {

    private List<MenuVO> children;
}
