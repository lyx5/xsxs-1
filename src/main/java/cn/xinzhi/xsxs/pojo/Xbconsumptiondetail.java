package cn.xinzhi.xsxs.pojo;

import java.util.Date;

public class Xbconsumptiondetail extends Price{
    private Integer xbid;
    private Integer xcdPrice;
    private Integer xcdWay;
    private Date xcdTime;
    private Integer xcdType;
    private Integer xcdXid;

    public Integer getXbid() {
        return xbid;
    }

    public void setXbid(Integer xbid) {
        this.xbid = xbid;
    }

    public Integer getXcdPrice() {
        return xcdPrice;
    }

    public void setXcdPrice(Integer xcdPrice) {
        this.xcdPrice = xcdPrice;
    }

    public Integer getXcdWay() {
        return xcdWay;
    }

    public void setXcdWay(Integer xcdWay) {
        this.xcdWay = xcdWay;
    }

    public Date getXcdTime() {
        return xcdTime;
    }

    public void setXcdTime(Date xcdTime) {
        this.xcdTime = xcdTime;
    }

    public Integer getXcdType() {
        return xcdType;
    }

    public void setXcdType(Integer xcdType) {
        this.xcdType = xcdType;
    }

    public Integer getXcdXid() {
        return xcdXid;
    }

    public void setXcdXid(Integer xcdXid) {
        this.xcdXid = xcdXid;
    }
}
