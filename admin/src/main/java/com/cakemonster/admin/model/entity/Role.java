package com.cakemonster.admin.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色表(Role)表实体类
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:33
 */
@Data
@SuppressWarnings("serial")
public class Role extends Model<Role> {

    private Integer id;

    private String name;

    /**
     * 角色名称
     */
    private String nameZh;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新人
     */
    private String modifier;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModify;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.id;
    }
}

