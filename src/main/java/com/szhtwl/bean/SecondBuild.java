package com.szhtwl.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SecondBuild implements Serializable {
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

    private BigDecimal price;

    private BigDecimal reservePrice;

    private BigDecimal buyPrice;

    private Integer room;

    private Integer hall;

    private Integer bathRoom;

    private Integer balcony;

    private Integer constructionArea;

    private Integer useArea;

    private Integer floor;

    private Integer totalFloor;

    private Integer type;

    private Integer houseType;

    private Integer face;

    private Integer decoration;

    private Integer sellPoint;

    private Integer sourceChannel;

    private Integer nowStatus;

    private Integer elevator;

    private Integer elevatorNum;

    private Integer houseYear;

    private Integer isOnly;

    private Integer buildStructure;

    private Integer buildAge;

    private Integer estateType;

    private Integer estateAge;

    private Integer isCertificate;

    private Integer certificateTime;

    private Integer payType;

    private Integer support;

    private Integer mortgage;

    private Integer hallType;

    private Integer floorArea;

    private Integer gardenArea;

    private Integer basement;

    private Integer basementArea;

    private Integer garageNum;

    private Integer parkNum;

    private Integer range;

    private String brokerId;

    private String maintainId;

    private String saveKeyId;

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

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getHall() {
        return hall;
    }

    public void setHall(Integer hall) {
        this.hall = hall;
    }

    public Integer getBathRoom() {
        return bathRoom;
    }

    public void setBathRoom(Integer bathRoom) {
        this.bathRoom = bathRoom;
    }

    public Integer getBalcony() {
        return balcony;
    }

    public void setBalcony(Integer balcony) {
        this.balcony = balcony;
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

    public Integer getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(Integer sellPoint) {
        this.sellPoint = sellPoint;
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

    public Integer getElevator() {
        return elevator;
    }

    public void setElevator(Integer elevator) {
        this.elevator = elevator;
    }

    public Integer getElevatorNum() {
        return elevatorNum;
    }

    public void setElevatorNum(Integer elevatorNum) {
        this.elevatorNum = elevatorNum;
    }

    public Integer getHouseYear() {
        return houseYear;
    }

    public void setHouseYear(Integer houseYear) {
        this.houseYear = houseYear;
    }

    public Integer getIsOnly() {
        return isOnly;
    }

    public void setIsOnly(Integer isOnly) {
        this.isOnly = isOnly;
    }

    public Integer getBuildStructure() {
        return buildStructure;
    }

    public void setBuildStructure(Integer buildStructure) {
        this.buildStructure = buildStructure;
    }

    public Integer getBuildAge() {
        return buildAge;
    }

    public void setBuildAge(Integer buildAge) {
        this.buildAge = buildAge;
    }

    public Integer getEstateType() {
        return estateType;
    }

    public void setEstateType(Integer estateType) {
        this.estateType = estateType;
    }

    public Integer getEstateAge() {
        return estateAge;
    }

    public void setEstateAge(Integer estateAge) {
        this.estateAge = estateAge;
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

    public Integer getHallType() {
        return hallType;
    }

    public void setHallType(Integer hallType) {
        this.hallType = hallType;
    }

    public Integer getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(Integer floorArea) {
        this.floorArea = floorArea;
    }

    public Integer getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(Integer gardenArea) {
        this.gardenArea = gardenArea;
    }

    public Integer getBasement() {
        return basement;
    }

    public void setBasement(Integer basement) {
        this.basement = basement;
    }

    public Integer getBasementArea() {
        return basementArea;
    }

    public void setBasementArea(Integer basementArea) {
        this.basementArea = basementArea;
    }

    public Integer getGarageNum() {
        return garageNum;
    }

    public void setGarageNum(Integer garageNum) {
        this.garageNum = garageNum;
    }

    public Integer getParkNum() {
        return parkNum;
    }

    public void setParkNum(Integer parkNum) {
        this.parkNum = parkNum;
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

    public String getSaveKeyId() {
        return saveKeyId;
    }

    public void setSaveKeyId(String saveKeyId) {
        this.saveKeyId = saveKeyId == null ? null : saveKeyId.trim();
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