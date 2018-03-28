package com.szhtwl.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MerchBuild implements Serializable{

    private Integer id;

    private String buildId;

    private String no;

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

    private BigDecimal expectedMoney;

    private BigDecimal transferMoney;

    private BigDecimal chargeDetail;

    private Integer constructionArea;

    private Integer useArea;

    private Integer isSpilt;

    private Integer shortArea;

    private Integer floor;

    private Integer totalFloor;

    private Integer width;

    private Integer depth;

    private Integer floorHigh;

    private Integer type;

    private Integer houseType;

    private Integer face;

    private Integer decoration;

    private Integer isStreet;

    private Integer isFreeTime;

    private String business;

    private Integer sourceChannel;

    private Integer nowStatus;

    private Integer support;

    private Integer isCertificate;

    private Integer certificateTime;

    private Integer payType;

    private Integer mortgage;

    private Integer shortLease;

    private BigDecimal propertyMoney;

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

    public BigDecimal getExpectedMoney() {
        return expectedMoney;
    }

    public void setExpectedMoney(BigDecimal expectedMoney) {
        this.expectedMoney = expectedMoney;
    }

    public BigDecimal getTransferMoney() {
        return transferMoney;
    }

    public void setTransferMoney(BigDecimal transferMoney) {
        this.transferMoney = transferMoney;
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

    public Integer getUseArea() {
        return useArea;
    }

    public void setUseArea(Integer useArea) {
        this.useArea = useArea;
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

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getFloorHigh() {
        return floorHigh;
    }

    public void setFloorHigh(Integer floorHigh) {
        this.floorHigh = floorHigh;
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

    public Integer getIsStreet() {
        return isStreet;
    }

    public void setIsStreet(Integer isStreet) {
        this.isStreet = isStreet;
    }

    public Integer getIsFreeTime() {
        return isFreeTime;
    }

    public void setIsFreeTime(Integer isFreeTime) {
        this.isFreeTime = isFreeTime;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
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

    public Integer getIsCertificate() {
        return isCertificate;
    }

    public void setIsCertificate(Integer isCertificate) {
        this.isCertificate = isCertificate;
    }

    public Integer getCertificateTime() {
        return certificateTime;
    }

    public void setCertificateTime(Integer certificateTime) {
        this.certificateTime = certificateTime;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getMortgage() {
        return mortgage;
    }

    public void setMortgage(Integer mortgage) {
        this.mortgage = mortgage;
    }

    public Integer getShortLease() {
        return shortLease;
    }

    public void setShortLease(Integer shortLease) {
        this.shortLease = shortLease;
    }

    public BigDecimal getPropertyMoney() {
        return propertyMoney;
    }

    public void setPropertyMoney(BigDecimal propertyMoney) {
        this.propertyMoney = propertyMoney;
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