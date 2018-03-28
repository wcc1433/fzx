package com.szhtwl.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LandBuild implements Serializable {

    private static final long serialVersionUID = 5710890176926918096L;

    private Integer id;

    private String buildId;

    private String carNo;

    private String ownerName;

    private String ownerPhone;

    private String areaName;

    private String businessName;

    private String community;

    private String location;

    private String level;

    private BigDecimal rentalMoney;

    private Integer payMethod;

    private BigDecimal price;

    private BigDecimal reservePrice;

    private BigDecimal buyPrice;

    private Integer constructionArea;

    private Integer type;

    private Integer carType;

    private Integer circulationType;

    private String circulationTime;

    private Integer sourceChannel;

    private Integer nowStatus;

    private Integer shortLease;

    private Integer range;

    private String brokerId;

    private String maintainId;

    private Date createTime;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId == null ? null : buildId.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone == null ? null : ownerPhone.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public BigDecimal getRentalMoney() {
        return rentalMoney;
    }

    public void setRentalMoney(BigDecimal rentalMoney) {
        this.rentalMoney = rentalMoney;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(BigDecimal reservePrice) {
        this.reservePrice = reservePrice;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Integer getConstructionArea() {
        return constructionArea;
    }

    public void setConstructionArea(Integer constructionArea) {
        this.constructionArea = constructionArea;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getCirculationType() {
        return circulationType;
    }

    public void setCirculationType(Integer circulationType) {
        this.circulationType = circulationType;
    }

    public String getCirculationTime() {
        return circulationTime;
    }

    public void setCirculationTime(String circulationTime) {
        this.circulationTime = circulationTime == null ? null : circulationTime.trim();
    }

    public Integer getSourceChannel() {
        return sourceChannel;
    }

    public void setSourceChannel(Integer sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    public Integer getNowStatus() {
        return nowStatus;
    }

    public void setNowStatus(Integer nowStatus) {
        this.nowStatus = nowStatus;
    }

    public Integer getShortLease() {
        return shortLease;
    }

    public void setShortLease(Integer shortLease) {
        this.shortLease = shortLease;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId == null ? null : brokerId.trim();
    }

    public String getMaintainId() {
        return maintainId;
    }

    public void setMaintainId(String maintainId) {
        this.maintainId = maintainId == null ? null : maintainId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}