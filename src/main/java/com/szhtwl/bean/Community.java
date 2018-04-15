package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 小区
 */
public class Community implements Serializable {
    private static final long serialVersionUID = -3814530369737528112L;

    private Integer id;

    private String communityName;

    private Integer businessId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName == null ? null : communityName.trim();
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}