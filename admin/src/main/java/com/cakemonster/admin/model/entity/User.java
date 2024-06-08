package com.cakemonster.admin.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.cakemonster.admin.enums.UserEnableEnum;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户信息表(User)表实体类
 *
 * @author cakemonster
 * @date 2024-06-08 23:57:34
 */
@Data
@SuppressWarnings("serial")
public class User extends Model<User> implements UserDetails {

    /**
     * id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 0未启用,1启用,2注销,3封禁
     */
    private Integer enabled;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 备注
     */
    private String remark;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 个性签名
     */
    private String slogan;

    /**
     * 性别,0未知,1男,2女
     */
    private Integer gender;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 最后登录IP
     */
    private String loginIp;

    /**
     * 最后登录时间
     */
    private Date loginDate;

    /**
     * 密码最后更新时间
     */
    private Date pwdUpdateDate;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人
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
     * 因为使用了 MyBatisPLus，那么这里的 hr 就会和数据表中的 hr 表一一对应起来，
     * 当然 roles 字段也会对应，但是实际上数据表中并没有该字段，所以这里添加注解表示表中无该字段
     */
    @TableField(exist = false)
    private List<Role> roles;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream().map(r -> new SimpleGrantedAuthority(r.getName())).collect(Collectors.toList());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return UserEnableEnum.parse(this.enabled);
    }
}

