package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理员
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = -540325659053005476L;

    public static final Byte ENABLE = 1;// 可用
    public static final Byte UNABLE = 0;// 禁用

    private Integer id;

    private String name;

    private String password;

    /**
     * 员工 id，关联员工表
     */
    private Integer employeeId;

    private String openId;

    /**
     * 账号是否可用（0：禁用/1：可用）
     */
    private Byte enable;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}