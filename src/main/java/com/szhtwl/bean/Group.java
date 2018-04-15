package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 分组
 */
public class Group implements Serializable {
    private static final long serialVersionUID = -4702759948015683L;

    private Integer id;

    private String groupName;

    private Integer shopId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}