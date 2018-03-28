package com.szhtwl.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WorkshopBuild implements Serializable{

    private static final long serialVersionUID = -738497996133031473L;

    private Integer id;

    private String buildId;

    private String no;

    private String ownerName;

    private String ownerPhone;

    private String areaName;

    private String businessName;

    private String location;

    private String level;

    private BigDecimal price;

    private BigDecimal rentalMoney;

    private Integer payType;

    private BigDecimal chargeDetail;

    private BigDecimal reservePrice;

    private BigDecimal buyPrice;

    private Integer constructionArea;

    private Integer workShopArea;

    private Integer hostelArea;

    private Integer floorArea;

    private Integer spaceArea;

    private Integer publicArea;

    private Integer nowPower;

    private Integer usePower;

    private Integer floorHigh;

    private Integer floorNum;

    private Integer isNew;

    private Integer socialIndustry;

    private Integer fireContro;

    private Integer isDrive;

    private Integer isElevator;

    private Integer factoryStructure;

    private Integer isBigCar;

    private Integer workArea;

    private Integer type;

    private Integer sourceChannel;

    private Integer nowStatus;

    private Integer buildAge;

    private Integer isCertificate;

    private Integer certificateTime;

    private Integer isInvoice;

    private Integer support;

    private Integer mortgage;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getRentalMoney() {
        return rentalMoney;
    }

    public void setRentalMoney(BigDecimal rentalMoney) {
        this.rentalMoney = rentalMoney;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public BigDecimal getChargeDetail() {
        return chargeDetail;
    }

    public void setChargeDetail(BigDecimal chargeDetail) {
        this.chargeDetail = chargeDetail;
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

    public Integer getWorkShopArea() {
        return workShopArea;
    }

    public void setWorkShopArea(Integer workShopArea) {
        this.workShopArea = workShopArea;
    }

    public Integer getHostelArea() {
        return hostelArea;
    }

    public void setHostelArea(Integer hostelArea) {
        this.hostelArea = hostelArea;
    }

    public Integer getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(Integer floorArea) {
        this.floorArea = floorArea;
    }

    public Integer getSpaceArea() {
        return spaceArea;
    }

    public void setSpaceArea(Integer spaceArea) {
        this.spaceArea = spaceArea;
    }

    public Integer getPublicArea() {
        return publicArea;
    }

    public void setPublicArea(Integer publicArea) {
        this.publicArea = publicArea;
    }

    public Integer getNowPower() {
        return nowPower;
    }

    public void setNowPower(Integer nowPower) {
        this.nowPower = nowPower;
    }

    public Integer getUsePower() {
        return usePower;
    }

    public void setUsePower(Integer usePower) {
        this.usePower = usePower;
    }

    public Integer getFloorHigh() {
        return floorHigh;
    }

    public void setFloorHigh(Integer floorHigh) {
        this.floorHigh = floorHigh;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getSocialIndustry() {
        return socialIndustry;
    }

    public void setSocialIndustry(Integer socialIndustry) {
        this.socialIndustry = socialIndustry;
    }

    public Integer getFireContro() {
        return fireContro;
    }

    public void setFireContro(Integer fireContro) {
        this.fireContro = fireContro;
    }

    public Integer getIsDrive() {
        return isDrive;
    }

    public void setIsDrive(Integer isDrive) {
        this.isDrive = isDrive;
    }

    public Integer getIsElevator() {
        return isElevator;
    }

    public void setIsElevator(Integer isElevator) {
        this.isElevator = isElevator;
    }

    public Integer getFactoryStructure() {
        return factoryStructure;
    }

    public void setFactoryStructure(Integer factoryStructure) {
        this.factoryStructure = factoryStructure;
    }

    public Integer getIsBigCar() {
        return isBigCar;
    }

    public void setIsBigCar(Integer isBigCar) {
        this.isBigCar = isBigCar;
    }

    public Integer getWorkArea() {
        return workArea;
    }

    public void setWorkArea(Integer workArea) {
        this.workArea = workArea;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getBuildAge() {
        return buildAge;
    }

    public void setBuildAge(Integer buildAge) {
        this.buildAge = buildAge;
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

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getMortgage() {
        return mortgage;
    }

    public void setMortgage(Integer mortgage) {
        this.mortgage = mortgage;
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