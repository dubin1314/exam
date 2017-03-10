package exam.com.cn.db.model;

import java.util.ArrayList;
import java.util.List;

public class UserAnswerQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAnswerQuery() {
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

        public Criteria andAIdIsNull() {
            addCriterion("A_ID is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("A_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(String value) {
            addCriterion("A_ID =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(String value) {
            addCriterion("A_ID <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(String value) {
            addCriterion("A_ID >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(String value) {
            addCriterion("A_ID >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(String value) {
            addCriterion("A_ID <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(String value) {
            addCriterion("A_ID <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLike(String value) {
            addCriterion("A_ID like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotLike(String value) {
            addCriterion("A_ID not like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<String> values) {
            addCriterion("A_ID in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<String> values) {
            addCriterion("A_ID not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(String value1, String value2) {
            addCriterion("A_ID between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(String value1, String value2) {
            addCriterion("A_ID not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdIsNull() {
            addCriterion("A_TEST_RESULTS_ID is null");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdIsNotNull() {
            addCriterion("A_TEST_RESULTS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdEqualTo(String value) {
            addCriterion("A_TEST_RESULTS_ID =", value, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdNotEqualTo(String value) {
            addCriterion("A_TEST_RESULTS_ID <>", value, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdGreaterThan(String value) {
            addCriterion("A_TEST_RESULTS_ID >", value, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdGreaterThanOrEqualTo(String value) {
            addCriterion("A_TEST_RESULTS_ID >=", value, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdLessThan(String value) {
            addCriterion("A_TEST_RESULTS_ID <", value, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdLessThanOrEqualTo(String value) {
            addCriterion("A_TEST_RESULTS_ID <=", value, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdLike(String value) {
            addCriterion("A_TEST_RESULTS_ID like", value, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdNotLike(String value) {
            addCriterion("A_TEST_RESULTS_ID not like", value, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdIn(List<String> values) {
            addCriterion("A_TEST_RESULTS_ID in", values, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdNotIn(List<String> values) {
            addCriterion("A_TEST_RESULTS_ID not in", values, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdBetween(String value1, String value2) {
            addCriterion("A_TEST_RESULTS_ID between", value1, value2, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andATestResultsIdNotBetween(String value1, String value2) {
            addCriterion("A_TEST_RESULTS_ID not between", value1, value2, "aTestResultsId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdIsNull() {
            addCriterion("\"A_ CLASSIFY_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdIsNotNull() {
            addCriterion("\"A_ CLASSIFY_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdEqualTo(String value) {
            addCriterion("\"A_ CLASSIFY_ID\" =", value, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdNotEqualTo(String value) {
            addCriterion("\"A_ CLASSIFY_ID\" <>", value, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdGreaterThan(String value) {
            addCriterion("\"A_ CLASSIFY_ID\" >", value, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"A_ CLASSIFY_ID\" >=", value, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdLessThan(String value) {
            addCriterion("\"A_ CLASSIFY_ID\" <", value, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdLessThanOrEqualTo(String value) {
            addCriterion("\"A_ CLASSIFY_ID\" <=", value, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdLike(String value) {
            addCriterion("\"A_ CLASSIFY_ID\" like", value, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdNotLike(String value) {
            addCriterion("\"A_ CLASSIFY_ID\" not like", value, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdIn(List<String> values) {
            addCriterion("\"A_ CLASSIFY_ID\" in", values, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdNotIn(List<String> values) {
            addCriterion("\"A_ CLASSIFY_ID\" not in", values, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdBetween(String value1, String value2) {
            addCriterion("\"A_ CLASSIFY_ID\" between", value1, value2, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAClassifyIdNotBetween(String value1, String value2) {
            addCriterion("\"A_ CLASSIFY_ID\" not between", value1, value2, "aClassifyId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdIsNull() {
            addCriterion("\"A_ QUESTION_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdIsNotNull() {
            addCriterion("\"A_ QUESTION_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdEqualTo(String value) {
            addCriterion("\"A_ QUESTION_ID\" =", value, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdNotEqualTo(String value) {
            addCriterion("\"A_ QUESTION_ID\" <>", value, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdGreaterThan(String value) {
            addCriterion("\"A_ QUESTION_ID\" >", value, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"A_ QUESTION_ID\" >=", value, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdLessThan(String value) {
            addCriterion("\"A_ QUESTION_ID\" <", value, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdLessThanOrEqualTo(String value) {
            addCriterion("\"A_ QUESTION_ID\" <=", value, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdLike(String value) {
            addCriterion("\"A_ QUESTION_ID\" like", value, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdNotLike(String value) {
            addCriterion("\"A_ QUESTION_ID\" not like", value, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdIn(List<String> values) {
            addCriterion("\"A_ QUESTION_ID\" in", values, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdNotIn(List<String> values) {
            addCriterion("\"A_ QUESTION_ID\" not in", values, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdBetween(String value1, String value2) {
            addCriterion("\"A_ QUESTION_ID\" between", value1, value2, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAQuestionIdNotBetween(String value1, String value2) {
            addCriterion("\"A_ QUESTION_ID\" not between", value1, value2, "aQuestionId");
            return (Criteria) this;
        }

        public Criteria andAAnswerIsNull() {
            addCriterion("\"A_ ANSWER\" is null");
            return (Criteria) this;
        }

        public Criteria andAAnswerIsNotNull() {
            addCriterion("\"A_ ANSWER\" is not null");
            return (Criteria) this;
        }

        public Criteria andAAnswerEqualTo(String value) {
            addCriterion("\"A_ ANSWER\" =", value, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerNotEqualTo(String value) {
            addCriterion("\"A_ ANSWER\" <>", value, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerGreaterThan(String value) {
            addCriterion("\"A_ ANSWER\" >", value, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("\"A_ ANSWER\" >=", value, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerLessThan(String value) {
            addCriterion("\"A_ ANSWER\" <", value, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerLessThanOrEqualTo(String value) {
            addCriterion("\"A_ ANSWER\" <=", value, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerLike(String value) {
            addCriterion("\"A_ ANSWER\" like", value, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerNotLike(String value) {
            addCriterion("\"A_ ANSWER\" not like", value, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerIn(List<String> values) {
            addCriterion("\"A_ ANSWER\" in", values, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerNotIn(List<String> values) {
            addCriterion("\"A_ ANSWER\" not in", values, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerBetween(String value1, String value2) {
            addCriterion("\"A_ ANSWER\" between", value1, value2, "aAnswer");
            return (Criteria) this;
        }

        public Criteria andAAnswerNotBetween(String value1, String value2) {
            addCriterion("\"A_ ANSWER\" not between", value1, value2, "aAnswer");
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