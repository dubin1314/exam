package exam.com.cn.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestPaperInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestPaperInfoQuery() {
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

        public Criteria andTIdIsNull() {
            addCriterion("T_ID is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("T_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("T_ID =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("T_ID <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("T_ID >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_ID >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("T_ID <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("T_ID <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("T_ID like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("T_ID not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("T_ID in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("T_ID not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("T_ID between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("T_ID not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("T_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("T_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("T_NAME =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("T_NAME <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("T_NAME >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_NAME >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("T_NAME <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("T_NAME <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("T_NAME like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("T_NAME not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("T_NAME in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("T_NAME not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("T_NAME between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("T_NAME not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTDurationIsNull() {
            addCriterion("T_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andTDurationIsNotNull() {
            addCriterion("T_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andTDurationEqualTo(Integer value) {
            addCriterion("T_DURATION =", value, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTDurationNotEqualTo(Integer value) {
            addCriterion("T_DURATION <>", value, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTDurationGreaterThan(Integer value) {
            addCriterion("T_DURATION >", value, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_DURATION >=", value, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTDurationLessThan(Integer value) {
            addCriterion("T_DURATION <", value, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTDurationLessThanOrEqualTo(Integer value) {
            addCriterion("T_DURATION <=", value, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTDurationIn(List<Integer> values) {
            addCriterion("T_DURATION in", values, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTDurationNotIn(List<Integer> values) {
            addCriterion("T_DURATION not in", values, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTDurationBetween(Integer value1, Integer value2) {
            addCriterion("T_DURATION between", value1, value2, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("T_DURATION not between", value1, value2, "tDuration");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNull() {
            addCriterion("T_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNotNull() {
            addCriterion("T_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTTypeEqualTo(Integer value) {
            addCriterion("T_TYPE =", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotEqualTo(Integer value) {
            addCriterion("T_TYPE <>", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThan(Integer value) {
            addCriterion("T_TYPE >", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_TYPE >=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThan(Integer value) {
            addCriterion("T_TYPE <", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThanOrEqualTo(Integer value) {
            addCriterion("T_TYPE <=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeIn(List<Integer> values) {
            addCriterion("T_TYPE in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotIn(List<Integer> values) {
            addCriterion("T_TYPE not in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeBetween(Integer value1, Integer value2) {
            addCriterion("T_TYPE between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("T_TYPE not between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsIsNull() {
            addCriterion("T_SELECT_QUESTIONS is null");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsIsNotNull() {
            addCriterion("T_SELECT_QUESTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsEqualTo(Integer value) {
            addCriterion("T_SELECT_QUESTIONS =", value, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsNotEqualTo(Integer value) {
            addCriterion("T_SELECT_QUESTIONS <>", value, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsGreaterThan(Integer value) {
            addCriterion("T_SELECT_QUESTIONS >", value, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SELECT_QUESTIONS >=", value, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsLessThan(Integer value) {
            addCriterion("T_SELECT_QUESTIONS <", value, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsLessThanOrEqualTo(Integer value) {
            addCriterion("T_SELECT_QUESTIONS <=", value, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsIn(List<Integer> values) {
            addCriterion("T_SELECT_QUESTIONS in", values, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsNotIn(List<Integer> values) {
            addCriterion("T_SELECT_QUESTIONS not in", values, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsBetween(Integer value1, Integer value2) {
            addCriterion("T_SELECT_QUESTIONS between", value1, value2, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTSelectQuestionsNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SELECT_QUESTIONS not between", value1, value2, "tSelectQuestions");
            return (Criteria) this;
        }

        public Criteria andTStatusIsNull() {
            addCriterion("T_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTStatusIsNotNull() {
            addCriterion("T_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTStatusEqualTo(Integer value) {
            addCriterion("T_STATUS =", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusNotEqualTo(Integer value) {
            addCriterion("T_STATUS <>", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusGreaterThan(Integer value) {
            addCriterion("T_STATUS >", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_STATUS >=", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusLessThan(Integer value) {
            addCriterion("T_STATUS <", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusLessThanOrEqualTo(Integer value) {
            addCriterion("T_STATUS <=", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusIn(List<Integer> values) {
            addCriterion("T_STATUS in", values, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusNotIn(List<Integer> values) {
            addCriterion("T_STATUS not in", values, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusBetween(Integer value1, Integer value2) {
            addCriterion("T_STATUS between", value1, value2, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("T_STATUS not between", value1, value2, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIsNull() {
            addCriterion("T_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIsNotNull() {
            addCriterion("T_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeEqualTo(Date value) {
            addCriterion("T_CREATE_TIME =", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotEqualTo(Date value) {
            addCriterion("T_CREATE_TIME <>", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThan(Date value) {
            addCriterion("T_CREATE_TIME >", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("T_CREATE_TIME >=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThan(Date value) {
            addCriterion("T_CREATE_TIME <", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("T_CREATE_TIME <=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIn(List<Date> values) {
            addCriterion("T_CREATE_TIME in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotIn(List<Date> values) {
            addCriterion("T_CREATE_TIME not in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeBetween(Date value1, Date value2) {
            addCriterion("T_CREATE_TIME between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("T_CREATE_TIME not between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreIsNull() {
            addCriterion("T_TOTAL_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreIsNotNull() {
            addCriterion("T_TOTAL_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreEqualTo(Integer value) {
            addCriterion("T_TOTAL_SCORE =", value, "tTotalScore");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreNotEqualTo(Integer value) {
            addCriterion("T_TOTAL_SCORE <>", value, "tTotalScore");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreGreaterThan(Integer value) {
            addCriterion("T_TOTAL_SCORE >", value, "tTotalScore");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_TOTAL_SCORE >=", value, "tTotalScore");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreLessThan(Integer value) {
            addCriterion("T_TOTAL_SCORE <", value, "tTotalScore");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("T_TOTAL_SCORE <=", value, "tTotalScore");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreIn(List<Integer> values) {
            addCriterion("T_TOTAL_SCORE in", values, "tTotalScore");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreNotIn(List<Integer> values) {
            addCriterion("T_TOTAL_SCORE not in", values, "tTotalScore");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("T_TOTAL_SCORE between", value1, value2, "tTotalScore");
            return (Criteria) this;
        }

        public Criteria andTTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("T_TOTAL_SCORE not between", value1, value2, "tTotalScore");
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