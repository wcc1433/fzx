package com.szhtwl.bean;

import java.io.Serializable;
import java.util.Date;

public class ClientFootmark implements Serializable {

    private static final long serialVersionUID = 3458063981261478105L;

    private Integer id;

    private Integer clientId;

    private Integer employeeId;

    private String clientLeaveMessage;

    private Integer houseType;

    private Integer houseId;

    private String remark;

    private Integer type;

    private Date createTiem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getClientLeaveMessage() {
        return clientLeaveMessage;
    }

    public void setClientLeaveMessage(String clientLeaveMessage) {
        this.clientLeaveMessage = clientLeaveMessage == null ? null : clientLeaveMessage.trim();
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTiem() {
        return createTiem;
    }

    public void setCreateTiem(Date createTiem) {
        this.createTiem = createTiem;
    }
}