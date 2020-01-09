package cn.xinzhi.xsxs.pojo;


import java.util.Date;

public class Rpacket {
    private Integer id;
    private Integer rpAmount;
    private Integer rpNum;
    private Integer rpPid;
    private Integer rpDistribution;
    private String rpBless;
    private Integer rpStatus;
    private Date rpStatime;
    private Date rpOvertime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRpAmount() {
        return rpAmount;
    }

    public void setRpAmount(Integer rpAmount) {
        this.rpAmount = rpAmount;
    }

    public Integer getRpNum() {
        return rpNum;
    }

    public void setRpNum(Integer rpNum) {
        this.rpNum = rpNum;
    }

    public Integer getRpPid() {
        return rpPid;
    }

    public void setRpPid(Integer rpPid) {
        this.rpPid = rpPid;
    }

    public Integer getRpDistribution() {
        return rpDistribution;
    }

    public void setRpDistribution(Integer rpDistribution) {
        this.rpDistribution = rpDistribution;
    }

    public String getRpBless() {
        return rpBless;
    }

    public void setRpBless(String rpBless) {
        this.rpBless = rpBless;
    }

    public Integer getRpStatus() {
        return rpStatus;
    }

    public void setRpStatus(Integer rpStatus) {
        this.rpStatus = rpStatus;
    }

    public Date getRpStatime() {
        return rpStatime;
    }

    public void setRpStatime(Date rpStatime) {
        this.rpStatime = rpStatime;
    }

    public Date getRpOvertime() {
        return rpOvertime;
    }

    public void setRpOvertime(Date rpOvertime) {
        this.rpOvertime = rpOvertime;
    }
}
