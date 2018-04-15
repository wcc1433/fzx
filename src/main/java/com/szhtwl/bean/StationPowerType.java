package com.szhtwl.bean;

import java.io.Serializable;

/**
 * 权限分类
 */
public class StationPowerType implements Serializable {
    private static final long serialVersionUID = -4169594889378407065L;

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