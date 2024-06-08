package com.cakemonster.admin.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 菜单表(Menu)表实体类
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:28
 */
@Data
@SuppressWarnings("serial")
public class Menu extends Model<Menu> {

    /**
     * id
     */
    private Integer id;

    /**
     * url
     */
    private String url;

    /**
     * path
     */
    private String path;

    /**
     * 对应组建
     */
    private String component;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单icon
     */
    private String iconCls;

    /**
     * 保持连接
     */
    private Integer keepAlive;

    /**
     * 授权
     */
    private Integer requireAuth;

    /**
     * 父菜单id
     */
    private Integer parentId;

    private Integer enabled;

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

