package cn.xinzhi.xsxs.pojo;



import java.util.Date;

public class Userinfo {
    private Integer id;
    private Integer uid;
    private String uname;
    private String upwd;
    private String pPhone;
    private String pIdnumber;
    private Date pBrithday;
    private Integer pSex;
    private Integer pCityid;
    private String pAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone;
    }

    public String getpIdnumber() {
        return pIdnumber;
    }

    public void setpIdnumber(String pIdnumber) {
        this.pIdnumber = pIdnumber;
    }

    public Date getpBrithday() {
        return pBrithday;
    }

    public void setpBrithday(Date pBrithday) {
        this.pBrithday = pBrithday;
    }

    public Integer getpSex() {
        return pSex;
    }

    public void setpSex(Integer pSex) {
        this.pSex = pSex;
    }

    public Integer getpCityid() {
        return pCityid;
    }

    public void setpCityid(Integer pCityid) {
        this.pCityid = pCityid;
    }

    public String getpAge() {
        return pAge;
    }

    public void setpAge(String pAge) {
        this.pAge = pAge;
    }
}
