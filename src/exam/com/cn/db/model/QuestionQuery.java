package exam.com.cn.db.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionQuery() {
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

        public Criteria andQIdIsNull() {
            addCriterion("Q_ID is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("Q_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(String value) {
            addCriterion("Q_ID =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(String value) {
            addCriterion("Q_ID <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(String value) {
            addCriterion("Q_ID >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(String value) {
            addCriterion("Q_ID >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(String value) {
            addCriterion("Q_ID <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(String value) {
            addCriterion("Q_ID <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLike(String value) {
            addCriterion("Q_ID like", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotLike(String value) {
            addCriterion("Q_ID not like", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<String> values) {
            addCriterion("Q_ID in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<String> values) {
            addCriterion("Q_ID not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(String value1, String value2) {
            addCriterion("Q_ID between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(String value1, String value2) {
            addCriterion("Q_ID not between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdIsNull() {
            addCriterion("\"Q_ CLASSIFY_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdIsNotNull() {
            addCriterion("\"Q_ CLASSIFY_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdEqualTo(String value) {
            addCriterion("\"Q_ CLASSIFY_ID\" =", value, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdNotEqualTo(String value) {
            addCriterion("\"Q_ CLASSIFY_ID\" <>", value, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdGreaterThan(String value) {
            addCriterion("\"Q_ CLASSIFY_ID\" >", value, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"Q_ CLASSIFY_ID\" >=", value, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdLessThan(String value) {
            addCriterion("\"Q_ CLASSIFY_ID\" <", value, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdLessThanOrEqualTo(String value) {
            addCriterion("\"Q_ CLASSIFY_ID\" <=", value, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdLike(String value) {
            addCriterion("\"Q_ CLASSIFY_ID\" like", value, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdNotLike(String value) {
            addCriterion("\"Q_ CLASSIFY_ID\" not like", value, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdIn(List<String> values) {
            addCriterion("\"Q_ CLASSIFY_ID\" in", values, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdNotIn(List<String> values) {
            addCriterion("\"Q_ CLASSIFY_ID\" not in", values, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdBetween(String value1, String value2) {
            addCriterion("\"Q_ CLASSIFY_ID\" between", value1, value2, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQClassifyIdNotBetween(String value1, String value2) {
            addCriterion("\"Q_ CLASSIFY_ID\" not between", value1, value2, "qClassifyId");
            return (Criteria) this;
        }

        public Criteria andQTypeIsNull() {
            addCriterion("Q_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andQTypeIsNotNull() {
            addCriterion("Q_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQTypeEqualTo(Integer value) {
            addCriterion("Q_TYPE =", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotEqualTo(Integer value) {
            addCriterion("Q_TYPE <>", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeGreaterThan(Integer value) {
            addCriterion("Q_TYPE >", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Q_TYPE >=", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLessThan(Integer value) {
            addCriterion("Q_TYPE <", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Q_TYPE <=", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeIn(List<Integer> values) {
            addCriterion("Q_TYPE in", values, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotIn(List<Integer> values) {
            addCriterion("Q_TYPE not in", values, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeBetween(Integer value1, Integer value2) {
            addCriterion("Q_TYPE between", value1, value2, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Q_TYPE not between", value1, value2, "qType");
            return (Criteria) this;
        }

        public Criteria andQTitleIsNull() {
            addCriterion("Q_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andQTitleIsNotNull() {
            addCriterion("Q_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andQTitleEqualTo(String value) {
            addCriterion("Q_TITLE =", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleNotEqualTo(String value) {
            addCriterion("Q_TITLE <>", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleGreaterThan(String value) {
            addCriterion("Q_TITLE >", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Q_TITLE >=", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleLessThan(String value) {
            addCriterion("Q_TITLE <", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleLessThanOrEqualTo(String value) {
            addCriterion("Q_TITLE <=", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleLike(String value) {
            addCriterion("Q_TITLE like", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleNotLike(String value) {
            addCriterion("Q_TITLE not like", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleIn(List<String> values) {
            addCriterion("Q_TITLE in", values, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleNotIn(List<String> values) {
            addCriterion("Q_TITLE not in", values, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleBetween(String value1, String value2) {
            addCriterion("Q_TITLE between", value1, value2, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleNotBetween(String value1, String value2) {
            addCriterion("Q_TITLE not between", value1, value2, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQOptionAIsNull() {
            addCriterion("\"Q_ OPTION_A\" is null");
            return (Criteria) this;
        }

        public Criteria andQOptionAIsNotNull() {
            addCriterion("\"Q_ OPTION_A\" is not null");
            return (Criteria) this;
        }

        public Criteria andQOptionAEqualTo(String value) {
            addCriterion("\"Q_ OPTION_A\" =", value, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionANotEqualTo(String value) {
            addCriterion("\"Q_ OPTION_A\" <>", value, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionAGreaterThan(String value) {
            addCriterion("\"Q_ OPTION_A\" >", value, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionAGreaterThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_A\" >=", value, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionALessThan(String value) {
            addCriterion("\"Q_ OPTION_A\" <", value, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionALessThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_A\" <=", value, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionALike(String value) {
            addCriterion("\"Q_ OPTION_A\" like", value, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionANotLike(String value) {
            addCriterion("\"Q_ OPTION_A\" not like", value, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionAIn(List<String> values) {
            addCriterion("\"Q_ OPTION_A\" in", values, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionANotIn(List<String> values) {
            addCriterion("\"Q_ OPTION_A\" not in", values, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionABetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_A\" between", value1, value2, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionANotBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_A\" not between", value1, value2, "qOptionA");
            return (Criteria) this;
        }

        public Criteria andQOptionBIsNull() {
            addCriterion("\"Q_ OPTION_B\" is null");
            return (Criteria) this;
        }

        public Criteria andQOptionBIsNotNull() {
            addCriterion("\"Q_ OPTION_B\" is not null");
            return (Criteria) this;
        }

        public Criteria andQOptionBEqualTo(String value) {
            addCriterion("\"Q_ OPTION_B\" =", value, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBNotEqualTo(String value) {
            addCriterion("\"Q_ OPTION_B\" <>", value, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBGreaterThan(String value) {
            addCriterion("\"Q_ OPTION_B\" >", value, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBGreaterThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_B\" >=", value, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBLessThan(String value) {
            addCriterion("\"Q_ OPTION_B\" <", value, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBLessThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_B\" <=", value, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBLike(String value) {
            addCriterion("\"Q_ OPTION_B\" like", value, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBNotLike(String value) {
            addCriterion("\"Q_ OPTION_B\" not like", value, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBIn(List<String> values) {
            addCriterion("\"Q_ OPTION_B\" in", values, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBNotIn(List<String> values) {
            addCriterion("\"Q_ OPTION_B\" not in", values, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_B\" between", value1, value2, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionBNotBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_B\" not between", value1, value2, "qOptionB");
            return (Criteria) this;
        }

        public Criteria andQOptionCIsNull() {
            addCriterion("\"Q_ OPTION_C\" is null");
            return (Criteria) this;
        }

        public Criteria andQOptionCIsNotNull() {
            addCriterion("\"Q_ OPTION_C\" is not null");
            return (Criteria) this;
        }

        public Criteria andQOptionCEqualTo(String value) {
            addCriterion("\"Q_ OPTION_C\" =", value, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCNotEqualTo(String value) {
            addCriterion("\"Q_ OPTION_C\" <>", value, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCGreaterThan(String value) {
            addCriterion("\"Q_ OPTION_C\" >", value, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCGreaterThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_C\" >=", value, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCLessThan(String value) {
            addCriterion("\"Q_ OPTION_C\" <", value, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCLessThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_C\" <=", value, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCLike(String value) {
            addCriterion("\"Q_ OPTION_C\" like", value, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCNotLike(String value) {
            addCriterion("\"Q_ OPTION_C\" not like", value, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCIn(List<String> values) {
            addCriterion("\"Q_ OPTION_C\" in", values, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCNotIn(List<String> values) {
            addCriterion("\"Q_ OPTION_C\" not in", values, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_C\" between", value1, value2, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionCNotBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_C\" not between", value1, value2, "qOptionC");
            return (Criteria) this;
        }

        public Criteria andQOptionDIsNull() {
            addCriterion("\"Q_ OPTION_D\" is null");
            return (Criteria) this;
        }

        public Criteria andQOptionDIsNotNull() {
            addCriterion("\"Q_ OPTION_D\" is not null");
            return (Criteria) this;
        }

        public Criteria andQOptionDEqualTo(String value) {
            addCriterion("\"Q_ OPTION_D\" =", value, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDNotEqualTo(String value) {
            addCriterion("\"Q_ OPTION_D\" <>", value, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDGreaterThan(String value) {
            addCriterion("\"Q_ OPTION_D\" >", value, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDGreaterThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_D\" >=", value, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDLessThan(String value) {
            addCriterion("\"Q_ OPTION_D\" <", value, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDLessThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_D\" <=", value, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDLike(String value) {
            addCriterion("\"Q_ OPTION_D\" like", value, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDNotLike(String value) {
            addCriterion("\"Q_ OPTION_D\" not like", value, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDIn(List<String> values) {
            addCriterion("\"Q_ OPTION_D\" in", values, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDNotIn(List<String> values) {
            addCriterion("\"Q_ OPTION_D\" not in", values, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_D\" between", value1, value2, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionDNotBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_D\" not between", value1, value2, "qOptionD");
            return (Criteria) this;
        }

        public Criteria andQOptionEIsNull() {
            addCriterion("\"Q_ OPTION_E\" is null");
            return (Criteria) this;
        }

        public Criteria andQOptionEIsNotNull() {
            addCriterion("\"Q_ OPTION_E\" is not null");
            return (Criteria) this;
        }

        public Criteria andQOptionEEqualTo(String value) {
            addCriterion("\"Q_ OPTION_E\" =", value, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionENotEqualTo(String value) {
            addCriterion("\"Q_ OPTION_E\" <>", value, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionEGreaterThan(String value) {
            addCriterion("\"Q_ OPTION_E\" >", value, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionEGreaterThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_E\" >=", value, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionELessThan(String value) {
            addCriterion("\"Q_ OPTION_E\" <", value, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionELessThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_E\" <=", value, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionELike(String value) {
            addCriterion("\"Q_ OPTION_E\" like", value, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionENotLike(String value) {
            addCriterion("\"Q_ OPTION_E\" not like", value, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionEIn(List<String> values) {
            addCriterion("\"Q_ OPTION_E\" in", values, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionENotIn(List<String> values) {
            addCriterion("\"Q_ OPTION_E\" not in", values, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionEBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_E\" between", value1, value2, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionENotBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_E\" not between", value1, value2, "qOptionE");
            return (Criteria) this;
        }

        public Criteria andQOptionFIsNull() {
            addCriterion("\"Q_ OPTION_F\" is null");
            return (Criteria) this;
        }

        public Criteria andQOptionFIsNotNull() {
            addCriterion("\"Q_ OPTION_F\" is not null");
            return (Criteria) this;
        }

        public Criteria andQOptionFEqualTo(String value) {
            addCriterion("\"Q_ OPTION_F\" =", value, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFNotEqualTo(String value) {
            addCriterion("\"Q_ OPTION_F\" <>", value, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFGreaterThan(String value) {
            addCriterion("\"Q_ OPTION_F\" >", value, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFGreaterThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_F\" >=", value, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFLessThan(String value) {
            addCriterion("\"Q_ OPTION_F\" <", value, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFLessThanOrEqualTo(String value) {
            addCriterion("\"Q_ OPTION_F\" <=", value, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFLike(String value) {
            addCriterion("\"Q_ OPTION_F\" like", value, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFNotLike(String value) {
            addCriterion("\"Q_ OPTION_F\" not like", value, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFIn(List<String> values) {
            addCriterion("\"Q_ OPTION_F\" in", values, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFNotIn(List<String> values) {
            addCriterion("\"Q_ OPTION_F\" not in", values, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_F\" between", value1, value2, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQOptionFNotBetween(String value1, String value2) {
            addCriterion("\"Q_ OPTION_F\" not between", value1, value2, "qOptionF");
            return (Criteria) this;
        }

        public Criteria andQAnswerIsNull() {
            addCriterion("Q_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andQAnswerIsNotNull() {
            addCriterion("Q_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andQAnswerEqualTo(String value) {
            addCriterion("Q_ANSWER =", value, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerNotEqualTo(String value) {
            addCriterion("Q_ANSWER <>", value, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerGreaterThan(String value) {
            addCriterion("Q_ANSWER >", value, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("Q_ANSWER >=", value, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerLessThan(String value) {
            addCriterion("Q_ANSWER <", value, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerLessThanOrEqualTo(String value) {
            addCriterion("Q_ANSWER <=", value, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerLike(String value) {
            addCriterion("Q_ANSWER like", value, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerNotLike(String value) {
            addCriterion("Q_ANSWER not like", value, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerIn(List<String> values) {
            addCriterion("Q_ANSWER in", values, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerNotIn(List<String> values) {
            addCriterion("Q_ANSWER not in", values, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerBetween(String value1, String value2) {
            addCriterion("Q_ANSWER between", value1, value2, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQAnswerNotBetween(String value1, String value2) {
            addCriterion("Q_ANSWER not between", value1, value2, "qAnswer");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeIsNull() {
            addCriterion("Q_KNOWLEDGE is null");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeIsNotNull() {
            addCriterion("Q_KNOWLEDGE is not null");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeEqualTo(String value) {
            addCriterion("Q_KNOWLEDGE =", value, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeNotEqualTo(String value) {
            addCriterion("Q_KNOWLEDGE <>", value, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeGreaterThan(String value) {
            addCriterion("Q_KNOWLEDGE >", value, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeGreaterThanOrEqualTo(String value) {
            addCriterion("Q_KNOWLEDGE >=", value, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeLessThan(String value) {
            addCriterion("Q_KNOWLEDGE <", value, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeLessThanOrEqualTo(String value) {
            addCriterion("Q_KNOWLEDGE <=", value, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeLike(String value) {
            addCriterion("Q_KNOWLEDGE like", value, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeNotLike(String value) {
            addCriterion("Q_KNOWLEDGE not like", value, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeIn(List<String> values) {
            addCriterion("Q_KNOWLEDGE in", values, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeNotIn(List<String> values) {
            addCriterion("Q_KNOWLEDGE not in", values, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeBetween(String value1, String value2) {
            addCriterion("Q_KNOWLEDGE between", value1, value2, "qKnowledge");
            return (Criteria) this;
        }

        public Criteria andQKnowledgeNotBetween(String value1, String value2) {
            addCriterion("Q_KNOWLEDGE not between", value1, value2, "qKnowledge");
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