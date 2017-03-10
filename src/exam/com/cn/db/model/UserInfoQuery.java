package exam.com.cn.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoQuery() {
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

        public Criteria andUCandidateNumberIsNull() {
            addCriterion("U_CANDIDATE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberIsNotNull() {
            addCriterion("U_CANDIDATE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberEqualTo(String value) {
            addCriterion("U_CANDIDATE_NUMBER =", value, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberNotEqualTo(String value) {
            addCriterion("U_CANDIDATE_NUMBER <>", value, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberGreaterThan(String value) {
            addCriterion("U_CANDIDATE_NUMBER >", value, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("U_CANDIDATE_NUMBER >=", value, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberLessThan(String value) {
            addCriterion("U_CANDIDATE_NUMBER <", value, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberLessThanOrEqualTo(String value) {
            addCriterion("U_CANDIDATE_NUMBER <=", value, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberLike(String value) {
            addCriterion("U_CANDIDATE_NUMBER like", value, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberNotLike(String value) {
            addCriterion("U_CANDIDATE_NUMBER not like", value, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberIn(List<String> values) {
            addCriterion("U_CANDIDATE_NUMBER in", values, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberNotIn(List<String> values) {
            addCriterion("U_CANDIDATE_NUMBER not in", values, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberBetween(String value1, String value2) {
            addCriterion("U_CANDIDATE_NUMBER between", value1, value2, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUCandidateNumberNotBetween(String value1, String value2) {
            addCriterion("U_CANDIDATE_NUMBER not between", value1, value2, "uCandidateNumber");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("U_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("U_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("U_PASSWORD =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("U_PASSWORD <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("U_PASSWORD >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("U_PASSWORD >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("U_PASSWORD <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("U_PASSWORD <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("U_PASSWORD like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("U_PASSWORD not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("U_PASSWORD in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("U_PASSWORD not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("U_PASSWORD between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("U_PASSWORD not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("U_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("U_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("U_NAME =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("U_NAME <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("U_NAME >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NAME >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("U_NAME <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("U_NAME <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("U_NAME like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("U_NAME not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("U_NAME in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("U_NAME not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("U_NAME between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("U_NAME not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("U_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("U_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("U_SEX =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("U_SEX <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("U_SEX >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("U_SEX >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("U_SEX <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("U_SEX <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("U_SEX like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("U_SEX not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("U_SEX in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("U_SEX not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("U_SEX between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("U_SEX not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneIsNull() {
            addCriterion("U_MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneIsNotNull() {
            addCriterion("U_MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneEqualTo(String value) {
            addCriterion("U_MOBILE_PHONE =", value, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneNotEqualTo(String value) {
            addCriterion("U_MOBILE_PHONE <>", value, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneGreaterThan(String value) {
            addCriterion("U_MOBILE_PHONE >", value, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("U_MOBILE_PHONE >=", value, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneLessThan(String value) {
            addCriterion("U_MOBILE_PHONE <", value, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("U_MOBILE_PHONE <=", value, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneLike(String value) {
            addCriterion("U_MOBILE_PHONE like", value, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneNotLike(String value) {
            addCriterion("U_MOBILE_PHONE not like", value, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneIn(List<String> values) {
            addCriterion("U_MOBILE_PHONE in", values, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneNotIn(List<String> values) {
            addCriterion("U_MOBILE_PHONE not in", values, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneBetween(String value1, String value2) {
            addCriterion("U_MOBILE_PHONE between", value1, value2, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("U_MOBILE_PHONE not between", value1, value2, "uMobilePhone");
            return (Criteria) this;
        }

        public Criteria andUIdCardIsNull() {
            addCriterion("U_ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andUIdCardIsNotNull() {
            addCriterion("U_ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andUIdCardEqualTo(String value) {
            addCriterion("U_ID_CARD =", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardNotEqualTo(String value) {
            addCriterion("U_ID_CARD <>", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardGreaterThan(String value) {
            addCriterion("U_ID_CARD >", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("U_ID_CARD >=", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardLessThan(String value) {
            addCriterion("U_ID_CARD <", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardLessThanOrEqualTo(String value) {
            addCriterion("U_ID_CARD <=", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardLike(String value) {
            addCriterion("U_ID_CARD like", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardNotLike(String value) {
            addCriterion("U_ID_CARD not like", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardIn(List<String> values) {
            addCriterion("U_ID_CARD in", values, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardNotIn(List<String> values) {
            addCriterion("U_ID_CARD not in", values, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardBetween(String value1, String value2) {
            addCriterion("U_ID_CARD between", value1, value2, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardNotBetween(String value1, String value2) {
            addCriterion("U_ID_CARD not between", value1, value2, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsIsNull() {
            addCriterion("U_SUBORDINATE_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsIsNotNull() {
            addCriterion("U_SUBORDINATE_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsEqualTo(String value) {
            addCriterion("U_SUBORDINATE_UNITS =", value, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsNotEqualTo(String value) {
            addCriterion("U_SUBORDINATE_UNITS <>", value, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsGreaterThan(String value) {
            addCriterion("U_SUBORDINATE_UNITS >", value, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("U_SUBORDINATE_UNITS >=", value, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsLessThan(String value) {
            addCriterion("U_SUBORDINATE_UNITS <", value, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsLessThanOrEqualTo(String value) {
            addCriterion("U_SUBORDINATE_UNITS <=", value, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsLike(String value) {
            addCriterion("U_SUBORDINATE_UNITS like", value, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsNotLike(String value) {
            addCriterion("U_SUBORDINATE_UNITS not like", value, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsIn(List<String> values) {
            addCriterion("U_SUBORDINATE_UNITS in", values, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsNotIn(List<String> values) {
            addCriterion("U_SUBORDINATE_UNITS not in", values, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsBetween(String value1, String value2) {
            addCriterion("U_SUBORDINATE_UNITS between", value1, value2, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUSubordinateUnitsNotBetween(String value1, String value2) {
            addCriterion("U_SUBORDINATE_UNITS not between", value1, value2, "uSubordinateUnits");
            return (Criteria) this;
        }

        public Criteria andUBatchIsNull() {
            addCriterion("U_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andUBatchIsNotNull() {
            addCriterion("U_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andUBatchEqualTo(String value) {
            addCriterion("U_BATCH =", value, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchNotEqualTo(String value) {
            addCriterion("U_BATCH <>", value, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchGreaterThan(String value) {
            addCriterion("U_BATCH >", value, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchGreaterThanOrEqualTo(String value) {
            addCriterion("U_BATCH >=", value, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchLessThan(String value) {
            addCriterion("U_BATCH <", value, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchLessThanOrEqualTo(String value) {
            addCriterion("U_BATCH <=", value, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchLike(String value) {
            addCriterion("U_BATCH like", value, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchNotLike(String value) {
            addCriterion("U_BATCH not like", value, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchIn(List<String> values) {
            addCriterion("U_BATCH in", values, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchNotIn(List<String> values) {
            addCriterion("U_BATCH not in", values, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchBetween(String value1, String value2) {
            addCriterion("U_BATCH between", value1, value2, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUBatchNotBetween(String value1, String value2) {
            addCriterion("U_BATCH not between", value1, value2, "uBatch");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeIsNull() {
            addCriterion("U_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeIsNotNull() {
            addCriterion("U_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeEqualTo(Date value) {
            addCriterion("U_CREATE_TIME =", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeNotEqualTo(Date value) {
            addCriterion("U_CREATE_TIME <>", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeGreaterThan(Date value) {
            addCriterion("U_CREATE_TIME >", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("U_CREATE_TIME >=", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeLessThan(Date value) {
            addCriterion("U_CREATE_TIME <", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("U_CREATE_TIME <=", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeIn(List<Date> values) {
            addCriterion("U_CREATE_TIME in", values, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeNotIn(List<Date> values) {
            addCriterion("U_CREATE_TIME not in", values, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeBetween(Date value1, Date value2) {
            addCriterion("U_CREATE_TIME between", value1, value2, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("U_CREATE_TIME not between", value1, value2, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeIsNull() {
            addCriterion("U_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeIsNotNull() {
            addCriterion("U_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeEqualTo(Date value) {
            addCriterion("U_UPDATE_TIME =", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeNotEqualTo(Date value) {
            addCriterion("U_UPDATE_TIME <>", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeGreaterThan(Date value) {
            addCriterion("U_UPDATE_TIME >", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("U_UPDATE_TIME >=", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeLessThan(Date value) {
            addCriterion("U_UPDATE_TIME <", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("U_UPDATE_TIME <=", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeIn(List<Date> values) {
            addCriterion("U_UPDATE_TIME in", values, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeNotIn(List<Date> values) {
            addCriterion("U_UPDATE_TIME not in", values, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("U_UPDATE_TIME between", value1, value2, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("U_UPDATE_TIME not between", value1, value2, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNull() {
            addCriterion("U_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNotNull() {
            addCriterion("U_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUStatusEqualTo(Integer value) {
            addCriterion("U_STATUS =", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotEqualTo(Integer value) {
            addCriterion("U_STATUS <>", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThan(Integer value) {
            addCriterion("U_STATUS >", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_STATUS >=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThan(Integer value) {
            addCriterion("U_STATUS <", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThanOrEqualTo(Integer value) {
            addCriterion("U_STATUS <=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusIn(List<Integer> values) {
            addCriterion("U_STATUS in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotIn(List<Integer> values) {
            addCriterion("U_STATUS not in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusBetween(Integer value1, Integer value2) {
            addCriterion("U_STATUS between", value1, value2, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("U_STATUS not between", value1, value2, "uStatus");
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