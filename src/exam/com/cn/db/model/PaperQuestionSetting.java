package exam.com.cn.db.model;

public class PaperQuestionSetting {
    private String pId;

    private String pTestPaperId;

    private String pClassifyId;

    private String pQuestionId;

    private Integer pQuestionScore;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getpTestPaperId() {
        return pTestPaperId;
    }

    public void setpTestPaperId(String pTestPaperId) {
        this.pTestPaperId = pTestPaperId == null ? null : pTestPaperId.trim();
    }

    public String getpClassifyId() {
        return pClassifyId;
    }

    public void setpClassifyId(String pClassifyId) {
        this.pClassifyId = pClassifyId == null ? null : pClassifyId.trim();
    }

    public String getpQuestionId() {
        return pQuestionId;
    }

    public void setpQuestionId(String pQuestionId) {
        this.pQuestionId = pQuestionId == null ? null : pQuestionId.trim();
    }

    public Integer getpQuestionScore() {
        return pQuestionScore;
    }

    public void setpQuestionScore(Integer pQuestionScore) {
        this.pQuestionScore = pQuestionScore;
    }
}