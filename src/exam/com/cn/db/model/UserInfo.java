package exam.com.cn.db.model;

import java.util.Date;

public class UserInfo {
    private String uId;

    private String uCandidateNumber;

    private String uPassword;

    private String uName;

    private String uSex;

    private String uMobilePhone;

    private String uIdCard;

    private String uSubordinateUnits;

    private String uBatch;

    private Date uCreateTime;

    private Date uUpdateTime;

    private Integer uStatus;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuCandidateNumber() {
        return uCandidateNumber;
    }

    public void setuCandidateNumber(String uCandidateNumber) {
        this.uCandidateNumber = uCandidateNumber == null ? null : uCandidateNumber.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuMobilePhone() {
        return uMobilePhone;
    }

    public void setuMobilePhone(String uMobilePhone) {
        this.uMobilePhone = uMobilePhone == null ? null : uMobilePhone.trim();
    }

    public String getuIdCard() {
        return uIdCard;
    }

    public void setuIdCard(String uIdCard) {
        this.uIdCard = uIdCard == null ? null : uIdCard.trim();
    }

    public String getuSubordinateUnits() {
        return uSubordinateUnits;
    }

    public void setuSubordinateUnits(String uSubordinateUnits) {
        this.uSubordinateUnits = uSubordinateUnits == null ? null : uSubordinateUnits.trim();
    }

    public String getuBatch() {
        return uBatch;
    }

    public void setuBatch(String uBatch) {
        this.uBatch = uBatch == null ? null : uBatch.trim();
    }

    public Date getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public Date getuUpdateTime() {
        return uUpdateTime;
    }

    public void setuUpdateTime(Date uUpdateTime) {
        this.uUpdateTime = uUpdateTime;
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }
}