package exam.com.cn.db.model;

public class Question {
    private String qId;

    private String qClassifyId;

    private Integer qType;

    private String qTitle;

    private String qOptionA;

    private String qOptionB;

    private String qOptionC;

    private String qOptionD;

    private String qOptionE;

    private String qOptionF;

    private String qAnswer;

    private String qKnowledge;

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId == null ? null : qId.trim();
    }

    public String getqClassifyId() {
        return qClassifyId;
    }

    public void setqClassifyId(String qClassifyId) {
        this.qClassifyId = qClassifyId == null ? null : qClassifyId.trim();
    }

    public Integer getqType() {
        return qType;
    }

    public void setqType(Integer qType) {
        this.qType = qType;
    }

    public String getqTitle() {
        return qTitle;
    }

    public void setqTitle(String qTitle) {
        this.qTitle = qTitle == null ? null : qTitle.trim();
    }

    public String getqOptionA() {
        return qOptionA;
    }

    public void setqOptionA(String qOptionA) {
        this.qOptionA = qOptionA == null ? null : qOptionA.trim();
    }

    public String getqOptionB() {
        return qOptionB;
    }

    public void setqOptionB(String qOptionB) {
        this.qOptionB = qOptionB == null ? null : qOptionB.trim();
    }

    public String getqOptionC() {
        return qOptionC;
    }

    public void setqOptionC(String qOptionC) {
        this.qOptionC = qOptionC == null ? null : qOptionC.trim();
    }

    public String getqOptionD() {
        return qOptionD;
    }

    public void setqOptionD(String qOptionD) {
        this.qOptionD = qOptionD == null ? null : qOptionD.trim();
    }

    public String getqOptionE() {
        return qOptionE;
    }

    public void setqOptionE(String qOptionE) {
        this.qOptionE = qOptionE == null ? null : qOptionE.trim();
    }

    public String getqOptionF() {
        return qOptionF;
    }

    public void setqOptionF(String qOptionF) {
        this.qOptionF = qOptionF == null ? null : qOptionF.trim();
    }

    public String getqAnswer() {
        return qAnswer;
    }

    public void setqAnswer(String qAnswer) {
        this.qAnswer = qAnswer == null ? null : qAnswer.trim();
    }

    public String getqKnowledge() {
        return qKnowledge;
    }

    public void setqKnowledge(String qKnowledge) {
        this.qKnowledge = qKnowledge == null ? null : qKnowledge.trim();
    }
}