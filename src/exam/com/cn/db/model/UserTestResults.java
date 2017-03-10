package exam.com.cn.db.model;

import java.util.Date;

public class UserTestResults {
    private String uId;

    private String uUserId;

    private String uTestPaperId;

    private Date uBeginTime;

    private Date uEndTime;

    private Integer uDuration;

    private Integer uScore;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuUserId() {
        return uUserId;
    }

    public void setuUserId(String uUserId) {
        this.uUserId = uUserId == null ? null : uUserId.trim();
    }

    public String getuTestPaperId() {
        return uTestPaperId;
    }

    public void setuTestPaperId(String uTestPaperId) {
        this.uTestPaperId = uTestPaperId == null ? null : uTestPaperId.trim();
    }

    public Date getuBeginTime() {
        return uBeginTime;
    }

    public void setuBeginTime(Date uBeginTime) {
        this.uBeginTime = uBeginTime;
    }

    public Date getuEndTime() {
        return uEndTime;
    }

    public void setuEndTime(Date uEndTime) {
        this.uEndTime = uEndTime;
    }

    public Integer getuDuration() {
        return uDuration;
    }

    public void setuDuration(Integer uDuration) {
        this.uDuration = uDuration;
    }

    public Integer getuScore() {
        return uScore;
    }

    public void setuScore(Integer uScore) {
        this.uScore = uScore;
    }
}