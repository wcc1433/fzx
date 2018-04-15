package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限值
 */
public class StationPowerValue implements Serializable {
    private static final long serialVersionUID = 3220877529760089334L;

    private Integer id;

    private Integer stationId;

    private Integer powerId;

    private Integer powerValue;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public Integer getPowerValue() {
        return powerValue;
    }

    public void setPowerValue(Integer powerValue) {
        this.powerValue = powerValue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}