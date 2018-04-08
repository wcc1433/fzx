package com.szhtwl.form;

import java.io.Serializable;
/**
 * Created by Administrator on 2018/3/29.
 */
public class ConditionForm implements Serializable{

    private static final long serialVersionUID = 3697187291798352556L;

    /**
     *  主键ID
     */
    private Integer id;

    /**
     * 房屋ID
     */
    private String buildId;

    /**
     * 地区名
     */
    private String areaName;

    /**
     * 商圈名
     */
    private String businessName;

    /**
     * 小区名
     */
    private String community;

    /**
     * 室
     */
    private Integer room;

    /**
     * 最大建筑面积
     */
    private Integer maxArea;

    /**
     * 最小建筑面积
     */
    private Integer minArea;

    /**
     * 最高总价
     */
    private Integer maxTotalMoney;
    /**
     * 最低总价
     */
    private Integer minTotalMoney;
    /**
     * 最高单价
     */
    private Integer maxMoney;
    /**
     * 最低单价
     */
    private Integer minMoney;

    /**
     * 栋座
     */
    private Integer buildNumber;

    /**
     * 房号
     */
    private String roomNo;

    /**
     * 最高楼层
     */
    private Integer maxMloor;
    /**
     * 最低楼层
     */
    private Integer minFloor;

    /**
     * 朝向
     */
    private String face;

    /**
     * 装修
     */
    private String decoration;

    /**
     * 类型
     */
    private String houseType;

    /**
     * 范围
     */
    private String range;

    /**
     * 经纪人ID
     */
    private String brokerId;

    /**
     * 经纪人名
     */
    private String brokerName;

    /**
     * 排序方式 0-默认排序 1-总价从高到低 2-总价从低到高 3-单价从高到低
     *  4-单价从低到高 5-面积从大到小  6-面积从小到大 7-最新录入时间
     *  8-跟进时间由近到远 9-跟进时间由远到近
    */
    private Integer condition;

    @Override
    public String toString() {
        return "ConditionForm{" +
                "id=" + id +
                ", buildId='" + buildId + '\'' +
                ", areaName='" + areaName + '\'' +
                ", businessName='" + businessName + '\'' +
                ", community='" + community + '\'' +
                ", room=" + room +
                ", maxArea=" + maxArea +
                ", minArea=" + minArea +
                ", maxTotalMoney=" + maxTotalMoney +
                ", minTotalMoney=" + minTotalMoney +
                ", maxMoney=" + maxMoney +
                ", minMoney=" + minMoney +
                ", buildNumber=" + buildNumber +
                ", roomNo='" + roomNo + '\'' +
                ", maxMloor=" + maxMloor +
                ", minFloor=" + minFloor +
                ", face='" + face + '\'' +
                ", decoration='" + decoration + '\'' +
                ", houseType='" + houseType + '\'' +
                ", range='" + range + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", brokerName='" + brokerName + '\'' +
                ", condition=" + condition +
                '}';
    }

    public ConditionForm() {
    }
}
