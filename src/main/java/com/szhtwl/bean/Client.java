package com.szhtwl.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户
 */
public class Client implements Serializable {
    private static final long serialVersionUID = -2843284294455191798L;

    private Integer id;

    /**
     * 头像链接
     */
    private String headImgUri;

    private String clientName;

    private String clientPhone;

    private Integer sex;

    /**
     * 客户所属区域
     */
    private Integer clientArea;

    /**
     * 客户地址
     */
    private String clientAddress;

    private String cartId;

    private Date birthday;

    /**
     * 意向商圈
     */
    private Integer clientBusinessId;

    private Integer requireHouseType;

    /**
     * 意向小区
     */
    private Integer requireCommunityId;

    private Integer requireAreaMin;

    private Integer requireAreaMax;

    private Integer requireFloorMin;

    private Integer requireFloorMax;

    private BigDecimal requireSellMin;

    private BigDecimal requireSellMax;

    private String target;

    /**
     * 备注
     */
    private String remark;

    private Integer dynamicCount;

    private Integer type;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadImgUri() {
        return headImgUri;
    }

    public void setHeadImgUri(String headImgUri) {
        this.headImgUri = headImgUri == null ? null : headImgUri.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone == null ? null : clientPhone.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getClientArea() {
        return clientArea;
    }

    public void setClientArea(Integer clientArea) {
        this.clientArea = clientArea;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress == null ? null : clientAddress.trim();
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId == null ? null : cartId.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getClientBusinessId() {
        return clientBusinessId;
    }

    public void setClientBusinessId(Integer clientBusinessId) {
        this.clientBusinessId = clientBusinessId;
    }

    public Integer getRequireHouseType() {
        return requireHouseType;
    }

    public void setRequireHouseType(Integer requireHouseType) {
        this.requireHouseType = requireHouseType;
    }

    public Integer getRequireCommunityId() {
        return requireCommunityId;
    }

    public void setRequireCommunityId(Integer requireCommunityId) {
        this.requireCommunityId = requireCommunityId;
    }

    public Integer getRequireAreaMin() {
        return requireAreaMin;
    }

    public void setRequireAreaMin(Integer requireAreaMin) {
        this.requireAreaMin = requireAreaMin;
    }

    public Integer getRequireAreaMax() {
        return requireAreaMax;
    }

    public void setRequireAreaMax(Integer requireAreaMax) {
        this.requireAreaMax = requireAreaMax;
    }

    public Integer getRequireFloorMin() {
        return requireFloorMin;
    }

    public void setRequireFloorMin(Integer requireFloorMin) {
        this.requireFloorMin = requireFloorMin;
    }

    public Integer getRequireFloorMax() {
        return requireFloorMax;
    }

    public void setRequireFloorMax(Integer requireFloorMax) {
        this.requireFloorMax = requireFloorMax;
    }

    public BigDecimal getRequireSellMin() {
        return requireSellMin;
    }

    public void setRequireSellMin(BigDecimal requireSellMin) {
        this.requireSellMin = requireSellMin;
    }

    public BigDecimal getRequireSellMax() {
        return requireSellMax;
    }

    public void setRequireSellMax(BigDecimal requireSellMax) {
        this.requireSellMax = requireSellMax;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDynamicCount() {
        return dynamicCount;
    }

    public void setDynamicCount(Integer dynamicCount) {
        this.dynamicCount = dynamicCount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}