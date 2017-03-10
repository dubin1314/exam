package exam.com.cn.db.model;

public class UserAnswer {
    private String aId;

    private String aTestResultsId;

    private String aClassifyId;

    private String aQuestionId;

    private String aAnswer;

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId == null ? null : aId.trim();
    }

    public String getaTestResultsId() {
        return aTestResultsId;
    }

    public void setaTestResultsId(String aTestResultsId) {
        this.aTestResultsId = aTestResultsId == null ? null : aTestResultsId.trim();
    }

    public String getaClassifyId() {
        return aClassifyId;
    }

    public void setaClassifyId(String aClassifyId) {
        this.aClassifyId = aClassifyId == null ? null : aClassifyId.trim();
    }

    public String getaQuestionId() {
        return aQuestionId;
    }

    public void setaQuestionId(String aQuestionId) {
        this.aQuestionId = aQuestionId == null ? null : aQuestionId.trim();
    }

    public String getaAnswer() {
        return aAnswer;
    }

    public void setaAnswer(String aAnswer) {
        this.aAnswer = aAnswer == null ? null : aAnswer.trim();
    }
}