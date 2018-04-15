package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 岗位
 */
public class Station implements Serializable {
    private static final long serialVersionUID = 4429020781638000083L;

    private Integer id;

    private String stationName;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}