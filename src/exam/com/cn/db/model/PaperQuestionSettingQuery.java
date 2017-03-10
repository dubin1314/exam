package exam.com.cn.db.model;

import java.util.ArrayList;
import java.util.List;

public class PaperQuestionSettingQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperQuestionSettingQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPIdIsNull() {
            addCriterion("P_ID is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("P_ID =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("P_ID <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("P_ID >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("P_ID >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("P_ID <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("P_ID <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("P_ID like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("P_ID not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("P_ID in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("P_ID not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("P_ID between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("P_ID not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdIsNull() {
            addCriterion("P_TEST_PAPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdIsNotNull() {
            addCriterion("P_TEST_PAPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdEqualTo(String value) {
            addCriterion("P_TEST_PAPER_ID =", value, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdNotEqualTo(String value) {
            addCriterion("P_TEST_PAPER_ID <>", value, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdGreaterThan(String value) {
            addCriterion("P_TEST_PAPER_ID >", value, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("P_TEST_PAPER_ID >=", value, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdLessThan(String value) {
            addCriterion("P_TEST_PAPER_ID <", value, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdLessThanOrEqualTo(String value) {
            addCriterion("P_TEST_PAPER_ID <=", value, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdLike(String value) {
            addCriterion("P_TEST_PAPER_ID like", value, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdNotLike(String value) {
            addCriterion("P_TEST_PAPER_ID not like", value, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdIn(List<String> values) {
            addCriterion("P_TEST_PAPER_ID in", values, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdNotIn(List<String> values) {
            addCriterion("P_TEST_PAPER_ID not in", values, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdBetween(String value1, String value2) {
            addCriterion("P_TEST_PAPER_ID between", value1, value2, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPTestPaperIdNotBetween(String value1, String value2) {
            addCriterion("P_TEST_PAPER_ID not between", value1, value2, "pTestPaperId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdIsNull() {
            addCriterion("\"P_ CLASSIFY_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdIsNotNull() {
            addCriterion("\"P_ CLASSIFY_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdEqualTo(String value) {
            addCriterion("\"P_ CLASSIFY_ID\" =", value, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdNotEqualTo(String value) {
            addCriterion("\"P_ CLASSIFY_ID\" <>", value, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdGreaterThan(String value) {
            addCriterion("\"P_ CLASSIFY_ID\" >", value, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"P_ CLASSIFY_ID\" >=", value, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdLessThan(String value) {
            addCriterion("\"P_ CLASSIFY_ID\" <", value, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdLessThanOrEqualTo(String value) {
            addCriterion("\"P_ CLASSIFY_ID\" <=", value, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdLike(String value) {
            addCriterion("\"P_ CLASSIFY_ID\" like", value, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdNotLike(String value) {
            addCriterion("\"P_ CLASSIFY_ID\" not like", value, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdIn(List<String> values) {
            addCriterion("\"P_ CLASSIFY_ID\" in", values, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdNotIn(List<String> values) {
            addCriterion("\"P_ CLASSIFY_ID\" not in", values, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdBetween(String value1, String value2) {
            addCriterion("\"P_ CLASSIFY_ID\" between", value1, value2, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPClassifyIdNotBetween(String value1, String value2) {
            addCriterion("\"P_ CLASSIFY_ID\" not between", value1, value2, "pClassifyId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdIsNull() {
            addCriterion("\"P_ QUESTION_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdIsNotNull() {
            addCriterion("\"P_ QUESTION_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdEqualTo(String value) {
            addCriterion("\"P_ QUESTION_ID\" =", value, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdNotEqualTo(String value) {
            addCriterion("\"P_ QUESTION_ID\" <>", value, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdGreaterThan(String value) {
            addCriterion("\"P_ QUESTION_ID\" >", value, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"P_ QUESTION_ID\" >=", value, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdLessThan(String value) {
            addCriterion("\"P_ QUESTION_ID\" <", value, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdLessThanOrEqualTo(String value) {
            addCriterion("\"P_ QUESTION_ID\" <=", value, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdLike(String value) {
            addCriterion("\"P_ QUESTION_ID\" like", value, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdNotLike(String value) {
            addCriterion("\"P_ QUESTION_ID\" not like", value, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdIn(List<String> values) {
            addCriterion("\"P_ QUESTION_ID\" in", values, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdNotIn(List<String> values) {
            addCriterion("\"P_ QUESTION_ID\" not in", values, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdBetween(String value1, String value2) {
            addCriterion("\"P_ QUESTION_ID\" between", value1, value2, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionIdNotBetween(String value1, String value2) {
            addCriterion("\"P_ QUESTION_ID\" not between", value1, value2, "pQuestionId");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreIsNull() {
            addCriterion("\"P_ QUESTION_ SCORE\" is null");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreIsNotNull() {
            addCriterion("\"P_ QUESTION_ SCORE\" is not null");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreEqualTo(Integer value) {
            addCriterion("\"P_ QUESTION_ SCORE\" =", value, "pQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreNotEqualTo(Integer value) {
            addCriterion("\"P_ QUESTION_ SCORE\" <>", value, "pQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreGreaterThan(Integer value) {
            addCriterion("\"P_ QUESTION_ SCORE\" >", value, "pQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"P_ QUESTION_ SCORE\" >=", value, "pQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreLessThan(Integer value) {
            addCriterion("\"P_ QUESTION_ SCORE\" <", value, "pQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreLessThanOrEqualTo(Integer value) {
            addCriterion("\"P_ QUESTION_ SCORE\" <=", value, "pQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreIn(List<Integer> values) {
            addCriterion("\"P_ QUESTION_ SCORE\" in", values, "pQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreNotIn(List<Integer> values) {
            addCriterion("\"P_ QUESTION_ SCORE\" not in", values, "pQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreBetween(Integer value1, Integer value2) {
            addCriterion("\"P_ QUESTION_ SCORE\" between", value1, value2, "pQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPQuestionScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("\"P_ QUESTION_ SCORE\" not between", value1, value2, "pQuestionScore");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}