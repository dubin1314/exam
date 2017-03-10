package exam.com.cn.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemAdminQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemAdminQuery() {
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

        public Criteria andSIdIsNull() {
            addCriterion("S_ID is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("S_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("S_ID =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("S_ID <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("S_ID >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("S_ID >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("S_ID <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("S_ID <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("S_ID like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("S_ID not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("S_ID in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("S_ID not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("S_ID between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("S_ID not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("S_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("S_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("S_NAME =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("S_NAME <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("S_NAME >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("S_NAME >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("S_NAME <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("S_NAME <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("S_NAME like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("S_NAME not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("S_NAME in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("S_NAME not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("S_NAME between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("S_NAME not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNull() {
            addCriterion("S_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNotNull() {
            addCriterion("S_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andSPasswordEqualTo(String value) {
            addCriterion("S_PASSWORD =", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotEqualTo(String value) {
            addCriterion("S_PASSWORD <>", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThan(String value) {
            addCriterion("S_PASSWORD >", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("S_PASSWORD >=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThan(String value) {
            addCriterion("S_PASSWORD <", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThanOrEqualTo(String value) {
            addCriterion("S_PASSWORD <=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLike(String value) {
            addCriterion("S_PASSWORD like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotLike(String value) {
            addCriterion("S_PASSWORD not like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordIn(List<String> values) {
            addCriterion("S_PASSWORD in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotIn(List<String> values) {
            addCriterion("S_PASSWORD not in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordBetween(String value1, String value2) {
            addCriterion("S_PASSWORD between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotBetween(String value1, String value2) {
            addCriterion("S_PASSWORD not between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSDescriptionIsNull() {
            addCriterion("S_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andSDescriptionIsNotNull() {
            addCriterion("S_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andSDescriptionEqualTo(String value) {
            addCriterion("S_DESCRIPTION =", value, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionNotEqualTo(String value) {
            addCriterion("S_DESCRIPTION <>", value, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionGreaterThan(String value) {
            addCriterion("S_DESCRIPTION >", value, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("S_DESCRIPTION >=", value, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionLessThan(String value) {
            addCriterion("S_DESCRIPTION <", value, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionLessThanOrEqualTo(String value) {
            addCriterion("S_DESCRIPTION <=", value, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionLike(String value) {
            addCriterion("S_DESCRIPTION like", value, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionNotLike(String value) {
            addCriterion("S_DESCRIPTION not like", value, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionIn(List<String> values) {
            addCriterion("S_DESCRIPTION in", values, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionNotIn(List<String> values) {
            addCriterion("S_DESCRIPTION not in", values, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionBetween(String value1, String value2) {
            addCriterion("S_DESCRIPTION between", value1, value2, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSDescriptionNotBetween(String value1, String value2) {
            addCriterion("S_DESCRIPTION not between", value1, value2, "sDescription");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIsNull() {
            addCriterion("S_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIsNotNull() {
            addCriterion("S_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeEqualTo(Date value) {
            addCriterion("S_CREATE_TIME =", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotEqualTo(Date value) {
            addCriterion("S_CREATE_TIME <>", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeGreaterThan(Date value) {
            addCriterion("S_CREATE_TIME >", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("S_CREATE_TIME >=", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeLessThan(Date value) {
            addCriterion("S_CREATE_TIME <", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("S_CREATE_TIME <=", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIn(List<Date> values) {
            addCriterion("S_CREATE_TIME in", values, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotIn(List<Date> values) {
            addCriterion("S_CREATE_TIME not in", values, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeBetween(Date value1, Date value2) {
            addCriterion("S_CREATE_TIME between", value1, value2, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("S_CREATE_TIME not between", value1, value2, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeIsNull() {
            addCriterion("S_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeIsNotNull() {
            addCriterion("S_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeEqualTo(Date value) {
            addCriterion("S_UPDATE_TIME =", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeNotEqualTo(Date value) {
            addCriterion("S_UPDATE_TIME <>", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeGreaterThan(Date value) {
            addCriterion("S_UPDATE_TIME >", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("S_UPDATE_TIME >=", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeLessThan(Date value) {
            addCriterion("S_UPDATE_TIME <", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("S_UPDATE_TIME <=", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeIn(List<Date> values) {
            addCriterion("S_UPDATE_TIME in", values, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeNotIn(List<Date> values) {
            addCriterion("S_UPDATE_TIME not in", values, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("S_UPDATE_TIME between", value1, value2, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("S_UPDATE_TIME not between", value1, value2, "sUpdateTime");
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