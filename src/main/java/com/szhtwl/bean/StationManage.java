package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

public class StationManage implements Serializable {

    private static final long serialVersionUID = -3789550736232273493L;

    private Integer id;

    private String stationName;

    private Integer powerHouseScope;

    private Integer powerAddressBook;

    private Integer powerStation;

    private Integer powerCommunity;

    private Integer powerContract;

    private Integer powerAttendance;

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

    public Integer getPowerHouseScope() {
        return powerHouseScope;
    }

    public void setPowerHouseScope(Integer powerHouseScope) {
        this.powerHouseScope = powerHouseScope;
    }

    public Integer getPowerAddressBook() {
        return powerAddressBook;
    }

    public void setPowerAddressBook(Integer powerAddressBook) {
        this.powerAddressBook = powerAddressBook;
    }

    public Integer getPowerStation() {
        return powerStation;
    }

    public void setPowerStation(Integer powerStation) {
        this.powerStation = powerStation;
    }

    public Integer getPowerCommunity() {
        return powerCommunity;
    }

    public void setPowerCommunity(Integer powerCommunity) {
        this.powerCommunity = powerCommunity;
    }

    public Integer getPowerContract() {
        return powerContract;
    }

    public void setPowerContract(Integer powerContract) {
        this.powerContract = powerContract;
    }

    public Integer getPowerAttendance() {
        return powerAttendance;
    }

    public void setPowerAttendance(Integer powerAttendance) {
        this.powerAttendance = powerAttendance;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}