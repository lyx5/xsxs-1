package cn.xinzhi.xsxs.pojo;

import java.util.Date;

public class Balanceconsumptiondetail extends Price{
    private Integer baid;
    private Double bcdPrice;
    private Integer bcdWay;
    private Date bcdTime;
    private Integer bcdType;
    private Integer bcdXid;

    public Integer getBaid() {
        return baid;
    }

    public void setBaid(Integer baid) {
        this.baid = baid;
    }

    public Double getBcdPrice() {
        return bcdPrice;
    }

    public void setBcdPrice(Double bcdPrice) {
        this.bcdPrice = bcdPrice;
    }

    public Integer getBcdWay() {
        return bcdWay;
    }

    public void setBcdWay(Integer bcdWay) {
        this.bcdWay = bcdWay;
    }

     public Date getBcdTime() {
        return bcdTime;
    }

    public void setBcdTime(Date bcdTime) {
        this.bcdTime = bcdTime;
    }

    public Integer getBcdType() {
        return bcdType;
    }

    public void setBcdType(Integer bcdType) {
        this.bcdType = bcdType;
    }

    public Integer getBcdXid() {
        return bcdXid;
    }

    public void setBcdXid(Integer bcdXid) {
        this.bcdXid = bcdXid;
    }
}
