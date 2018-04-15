package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 店铺
 */
public class Shop implements Serializable {
    private static final long serialVersionUID = 1421267221591689914L;

    private Integer id;

    private String shopName;

    private Integer districtId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}