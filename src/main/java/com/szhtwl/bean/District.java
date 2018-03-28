package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

public class District implements Serializable {

    private static final long serialVersionUID = -5578489486426670548L;

    private Integer id;

    private String districtName;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}