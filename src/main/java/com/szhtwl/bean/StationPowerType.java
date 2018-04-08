package com.szhtwl.bean;

public class StationPowerType {
    private Integer id;

    private String powerName;

    private Byte powerType;

    private Integer powerParentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public Byte getPowerType() {
        return powerType;
    }

    public void setPowerType(Byte powerType) {
        this.powerType = powerType;
    }

    public Integer getPowerParentId() {
        return powerParentId;
    }

    public void setPowerParentId(Integer powerParentId) {
        this.powerParentId = powerParentId;
    }
}