package exam.com.cn.db.model;

import java.util.Date;

public class TestPaperInfo {
    private String tId;

    private String tName;

    private Integer tDuration;

    private Integer tType;

    private Integer tSelectQuestions;

    private Integer tStatus;

    private Date tCreateTime;

    private Integer tTotalScore;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer gettDuration() {
        return tDuration;
    }

    public void settDuration(Integer tDuration) {
        this.tDuration = tDuration;
    }

    public Integer gettType() {
        return tType;
    }

    public void settType(Integer tType) {
        this.tType = tType;
    }

    public Integer gettSelectQuestions() {
        return tSelectQuestions;
    }

    public void settSelectQuestions(Integer tSelectQuestions) {
        this.tSelectQuestions = tSelectQuestions;
    }

    public Integer gettStatus() {
        return tStatus;
    }

    public void settStatus(Integer tStatus) {
        this.tStatus = tStatus;
    }

    public Date gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(Date tCreateTime) {
        this.tCreateTime = tCreateTime;
    }

    public Integer gettTotalScore() {
        return tTotalScore;
    }

    public void settTotalScore(Integer tTotalScore) {
        this.tTotalScore = tTotalScore;
    }
}