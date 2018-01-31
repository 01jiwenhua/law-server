package com.shx.law.entity;

import java.util.Date;

public class Department {
    private Integer id;

    private String 名称;

    private String 编号;

    private Integer 父级部门id;

    private Integer 所属公司;

    private Date 创建时间;

    private Date 更新时间;

    private Integer 创建人;

    private Integer 更新人;

    private Integer 状态;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String get名称() {
        return 名称;
    }

    public void set名称(String 名称) {
        this.名称 = 名称 == null ? null : 名称.trim();
    }

    public String get编号() {
        return 编号;
    }

    public void set编号(String 编号) {
        this.编号 = 编号 == null ? null : 编号.trim();
    }

    public Integer get父级部门id() {
        return 父级部门id;
    }

    public void set父级部门id(Integer 父级部门id) {
        this.父级部门id = 父级部门id;
    }

    public Integer get所属公司() {
        return 所属公司;
    }

    public void set所属公司(Integer 所属公司) {
        this.所属公司 = 所属公司;
    }

    public Date get创建时间() {
        return 创建时间;
    }

    public void set创建时间(Date 创建时间) {
        this.创建时间 = 创建时间;
    }

    public Date get更新时间() {
        return 更新时间;
    }

    public void set更新时间(Date 更新时间) {
        this.更新时间 = 更新时间;
    }

    public Integer get创建人() {
        return 创建人;
    }

    public void set创建人(Integer 创建人) {
        this.创建人 = 创建人;
    }

    public Integer get更新人() {
        return 更新人;
    }

    public void set更新人(Integer 更新人) {
        this.更新人 = 更新人;
    }

    public Integer get状态() {
        return 状态;
    }

    public void set状态(Integer 状态) {
        this.状态 = 状态;
    }
}