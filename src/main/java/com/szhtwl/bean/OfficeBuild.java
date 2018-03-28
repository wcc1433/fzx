package com.szhtwl.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OfficeBuild implements Serializable {
    private Integer id;

    private String buildId;

    private String no;

    private String ownerName;

    private String ownerPhone;

    private String areaName;

    private String businessName;

    private String community;

    private String buildNumber;

    private String unitNumber;

    private String roomNo;

    private String level;

    private BigDecimal rentalMoney;

    private Integer payMethod;

    private BigDecimal reservePrice;

    private String incrementType;

    private BigDecimal chargeDetail;

    private Integer constructionArea;

    private Integer isSpilt;

    private Integer shortArea;

    private Integer floor;

    private Integer totalFloor;

    private Integer floorHigh;

    private Integer propertyLevel;

    private BigDecimal propertyMoney;

    private Integer isRegist;

    private Integer type;

    private Integer houseType;

    private Integer face;

    private Integer decoration;

    private Integer isInvoice;

    private Integer stationNum;

    private Integer isFreeTime;

    private Integer sourceChannel;

    private Integer nowStatus;

    private Integer support;

    private Integer shortLease;

    private Integer elevator;

    private Integer range;

    private String broker;

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

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
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

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber == null ? null : buildNumber.trim();
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber == null ? null : unitNumber.trim();
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo == null ? null : roomNo.trim();
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

    public BigDecimal getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(BigDecimal reservePrice) {
        this.reservePrice = reservePrice;
    }

    public String getIncrementType() {
        return incrementType;
    }

    public void setIncrementType(String incrementType) {
        this.incrementType = incrementType == null ? null : incrementType.trim();
    }

    public BigDecimal getChargeDetail() {
        return chargeDetail;
    }

    public void setChargeDetail(BigDecimal chargeDetail) {
        this.chargeDetail = chargeDetail;
    }

    public Integer getConstructionArea() {
        return constructionArea;
    }

    public void setConstructionArea(Integer constructionArea) {
        this.constructionArea = constructionArea;
    }

    public Integer getIsSpilt() {
        return isSpilt;
    }

    public void setIsSpilt(Integer isSpilt) {
        this.isSpilt = isSpilt;
    }

    public Integer getShortArea() {
        return shortArea;
    }

    public void setShortArea(Integer shortArea) {
        this.shortArea = shortArea;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(Integer totalFloor) {
        this.totalFloor = totalFloor;
    }

    public Integer getFloorHigh() {
        return floorHigh;
    }

    public void setFloorHigh(Integer floorHigh) {
        this.floorHigh = floorHigh;
    }

    public Integer getPropertyLevel() {
        return propertyLevel;
    }

    public void setPropertyLevel(Integer propertyLevel) {
        this.propertyLevel = propertyLevel;
    }

    public BigDecimal getPropertyMoney() {
        return propertyMoney;
    }

    public void setPropertyMoney(BigDecimal propertyMoney) {
        this.propertyMoney = propertyMoney;
    }

    public Integer getIsRegist() {
        return isRegist;
    }

    public void setIsRegist(Integer isRegist) {
        this.isRegist = isRegist;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public Integer getFace() {
        return face;
    }

    public void setFace(Integer face) {
        this.face = face;
    }

    public Integer getDecoration() {
        return decoration;
    }

    public void setDecoration(Integer decoration) {
        this.decoration = decoration;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Integer getStationNum() {
        return stationNum;
    }

    public void setStationNum(Integer stationNum) {
        this.stationNum = stationNum;
    }

    public Integer getIsFreeTime() {
        return isFreeTime;
    }

    public void setIsFreeTime(Integer isFreeTime) {
        this.isFreeTime = isFreeTime;
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

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getShortLease() {
        return shortLease;
    }

    public void setShortLease(Integer shortLease) {
        this.shortLease = shortLease;
    }

    public Integer getElevator() {
        return elevator;
    }

    public void setElevator(Integer elevator) {
        this.elevator = elevator;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker == null ? null : broker.trim();
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

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
}