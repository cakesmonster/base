package com.cakemonster.admin.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cakemonster.admin.model.entity.Role;
import org.apache.ibatis.annotations.Param;
import com.cakemonster.admin.model.entity.User;

/**
 * 用户信息表(User)表数据库访问层
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:34
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<User> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<User> entities);

    List<Role> getRolesByUserId(Long userId);

}

