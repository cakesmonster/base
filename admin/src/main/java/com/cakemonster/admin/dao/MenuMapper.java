package com.cakemonster.admin.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cakemonster.admin.model.dto.MenuRoleDTO;
import com.cakemonster.admin.model.vo.MenuVO;
import org.apache.ibatis.annotations.Param;
import com.cakemonster.admin.model.entity.Menu;

/**
 * 菜单表(Menu)表数据库访问层
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:27
 */
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Menu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Menu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Menu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Menu> entities);

    List<MenuVO> getMenusByHrId(Long userId);

    List<MenuRoleDTO> getAllMenusWithRole();

}

