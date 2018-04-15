package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 商圈
 */
public class Business implements Serializable {
    private static final long serialVersionUID = 223887788860275197L;

    private Integer id;

    private Byte area;

    private String name;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getArea() {
        return area;
    }

    public void setArea(Byte area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}