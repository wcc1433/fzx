package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门
 */
public class Department implements Serializable {
    private static final long serialVersionUID = -8735364848516108884L;

    private Integer id;

    private String departmentName;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}