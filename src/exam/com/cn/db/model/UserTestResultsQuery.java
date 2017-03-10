package exam.com.cn.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTestResultsQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTestResultsQuery() {
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

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("U_ID like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("U_ID not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUUserIdIsNull() {
            addCriterion("U_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUUserIdIsNotNull() {
            addCriterion("U_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUUserIdEqualTo(String value) {
            addCriterion("U_USER_ID =", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdNotEqualTo(String value) {
            addCriterion("U_USER_ID <>", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdGreaterThan(String value) {
            addCriterion("U_USER_ID >", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("U_USER_ID >=", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdLessThan(String value) {
            addCriterion("U_USER_ID <", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdLessThanOrEqualTo(String value) {
            addCriterion("U_USER_ID <=", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdLike(String value) {
            addCriterion("U_USER_ID like", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdNotLike(String value) {
            addCriterion("U_USER_ID not like", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdIn(List<String> values) {
            addCriterion("U_USER_ID in", values, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdNotIn(List<String> values) {
            addCriterion("U_USER_ID not in", values, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdBetween(String value1, String value2) {
            addCriterion("U_USER_ID between", value1, value2, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdNotBetween(String value1, String value2) {
            addCriterion("U_USER_ID not between", value1, value2, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdIsNull() {
            addCriterion("U_TEST_PAPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdIsNotNull() {
            addCriterion("U_TEST_PAPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdEqualTo(String value) {
            addCriterion("U_TEST_PAPER_ID =", value, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdNotEqualTo(String value) {
            addCriterion("U_TEST_PAPER_ID <>", value, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdGreaterThan(String value) {
            addCriterion("U_TEST_PAPER_ID >", value, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("U_TEST_PAPER_ID >=", value, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdLessThan(String value) {
            addCriterion("U_TEST_PAPER_ID <", value, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdLessThanOrEqualTo(String value) {
            addCriterion("U_TEST_PAPER_ID <=", value, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdLike(String value) {
            addCriterion("U_TEST_PAPER_ID like", value, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdNotLike(String value) {
            addCriterion("U_TEST_PAPER_ID not like", value, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdIn(List<String> values) {
            addCriterion("U_TEST_PAPER_ID in", values, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdNotIn(List<String> values) {
            addCriterion("U_TEST_PAPER_ID not in", values, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdBetween(String value1, String value2) {
            addCriterion("U_TEST_PAPER_ID between", value1, value2, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUTestPaperIdNotBetween(String value1, String value2) {
            addCriterion("U_TEST_PAPER_ID not between", value1, value2, "uTestPaperId");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeIsNull() {
            addCriterion("U_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeIsNotNull() {
            addCriterion("U_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeEqualTo(Date value) {
            addCriterion("U_BEGIN_TIME =", value, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeNotEqualTo(Date value) {
            addCriterion("U_BEGIN_TIME <>", value, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeGreaterThan(Date value) {
            addCriterion("U_BEGIN_TIME >", value, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("U_BEGIN_TIME >=", value, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeLessThan(Date value) {
            addCriterion("U_BEGIN_TIME <", value, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("U_BEGIN_TIME <=", value, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeIn(List<Date> values) {
            addCriterion("U_BEGIN_TIME in", values, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeNotIn(List<Date> values) {
            addCriterion("U_BEGIN_TIME not in", values, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeBetween(Date value1, Date value2) {
            addCriterion("U_BEGIN_TIME between", value1, value2, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("U_BEGIN_TIME not between", value1, value2, "uBeginTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeIsNull() {
            addCriterion("U_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUEndTimeIsNotNull() {
            addCriterion("U_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUEndTimeEqualTo(Date value) {
            addCriterion("U_END_TIME =", value, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeNotEqualTo(Date value) {
            addCriterion("U_END_TIME <>", value, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeGreaterThan(Date value) {
            addCriterion("U_END_TIME >", value, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("U_END_TIME >=", value, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeLessThan(Date value) {
            addCriterion("U_END_TIME <", value, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("U_END_TIME <=", value, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeIn(List<Date> values) {
            addCriterion("U_END_TIME in", values, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeNotIn(List<Date> values) {
            addCriterion("U_END_TIME not in", values, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeBetween(Date value1, Date value2) {
            addCriterion("U_END_TIME between", value1, value2, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("U_END_TIME not between", value1, value2, "uEndTime");
            return (Criteria) this;
        }

        public Criteria andUDurationIsNull() {
            addCriterion("\"U_ DURATION\" is null");
            return (Criteria) this;
        }

        public Criteria andUDurationIsNotNull() {
            addCriterion("\"U_ DURATION\" is not null");
            return (Criteria) this;
        }

        public Criteria andUDurationEqualTo(Integer value) {
            addCriterion("\"U_ DURATION\" =", value, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUDurationNotEqualTo(Integer value) {
            addCriterion("\"U_ DURATION\" <>", value, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUDurationGreaterThan(Integer value) {
            addCriterion("\"U_ DURATION\" >", value, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"U_ DURATION\" >=", value, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUDurationLessThan(Integer value) {
            addCriterion("\"U_ DURATION\" <", value, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUDurationLessThanOrEqualTo(Integer value) {
            addCriterion("\"U_ DURATION\" <=", value, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUDurationIn(List<Integer> values) {
            addCriterion("\"U_ DURATION\" in", values, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUDurationNotIn(List<Integer> values) {
            addCriterion("\"U_ DURATION\" not in", values, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUDurationBetween(Integer value1, Integer value2) {
            addCriterion("\"U_ DURATION\" between", value1, value2, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("\"U_ DURATION\" not between", value1, value2, "uDuration");
            return (Criteria) this;
        }

        public Criteria andUScoreIsNull() {
            addCriterion("\"U_ SCORE\" is null");
            return (Criteria) this;
        }

        public Criteria andUScoreIsNotNull() {
            addCriterion("\"U_ SCORE\" is not null");
            return (Criteria) this;
        }

        public Criteria andUScoreEqualTo(Integer value) {
            addCriterion("\"U_ SCORE\" =", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreNotEqualTo(Integer value) {
            addCriterion("\"U_ SCORE\" <>", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreGreaterThan(Integer value) {
            addCriterion("\"U_ SCORE\" >", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"U_ SCORE\" >=", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreLessThan(Integer value) {
            addCriterion("\"U_ SCORE\" <", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreLessThanOrEqualTo(Integer value) {
            addCriterion("\"U_ SCORE\" <=", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreIn(List<Integer> values) {
            addCriterion("\"U_ SCORE\" in", values, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreNotIn(List<Integer> values) {
            addCriterion("\"U_ SCORE\" not in", values, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreBetween(Integer value1, Integer value2) {
            addCriterion("\"U_ SCORE\" between", value1, value2, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("\"U_ SCORE\" not between", value1, value2, "uScore");
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