package pams.repository.model;

import java.util.ArrayList;
import java.util.List;

public class SvpsprdinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public SvpsprdinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
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

        public Criteria andPrdidIsNull() {
            addCriterion("PRDID is null");
            return (Criteria) this;
        }

        public Criteria andPrdidIsNotNull() {
            addCriterion("PRDID is not null");
            return (Criteria) this;
        }

        public Criteria andPrdidEqualTo(String value) {
            addCriterion("PRDID =", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidNotEqualTo(String value) {
            addCriterion("PRDID <>", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidGreaterThan(String value) {
            addCriterion("PRDID >", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidGreaterThanOrEqualTo(String value) {
            addCriterion("PRDID >=", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidLessThan(String value) {
            addCriterion("PRDID <", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidLessThanOrEqualTo(String value) {
            addCriterion("PRDID <=", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidLike(String value) {
            addCriterion("PRDID like", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidNotLike(String value) {
            addCriterion("PRDID not like", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidIn(List<String> values) {
            addCriterion("PRDID in", values, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidNotIn(List<String> values) {
            addCriterion("PRDID not in", values, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidBetween(String value1, String value2) {
            addCriterion("PRDID between", value1, value2, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidNotBetween(String value1, String value2) {
            addCriterion("PRDID not between", value1, value2, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdcodeIsNull() {
            addCriterion("PRDCODE is null");
            return (Criteria) this;
        }

        public Criteria andPrdcodeIsNotNull() {
            addCriterion("PRDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrdcodeEqualTo(String value) {
            addCriterion("PRDCODE =", value, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeNotEqualTo(String value) {
            addCriterion("PRDCODE <>", value, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeGreaterThan(String value) {
            addCriterion("PRDCODE >", value, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRDCODE >=", value, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeLessThan(String value) {
            addCriterion("PRDCODE <", value, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeLessThanOrEqualTo(String value) {
            addCriterion("PRDCODE <=", value, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeLike(String value) {
            addCriterion("PRDCODE like", value, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeNotLike(String value) {
            addCriterion("PRDCODE not like", value, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeIn(List<String> values) {
            addCriterion("PRDCODE in", values, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeNotIn(List<String> values) {
            addCriterion("PRDCODE not in", values, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeBetween(String value1, String value2) {
            addCriterion("PRDCODE between", value1, value2, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdcodeNotBetween(String value1, String value2) {
            addCriterion("PRDCODE not between", value1, value2, "prdcode");
            return (Criteria) this;
        }

        public Criteria andPrdnameIsNull() {
            addCriterion("PRDNAME is null");
            return (Criteria) this;
        }

        public Criteria andPrdnameIsNotNull() {
            addCriterion("PRDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrdnameEqualTo(String value) {
            addCriterion("PRDNAME =", value, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameNotEqualTo(String value) {
            addCriterion("PRDNAME <>", value, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameGreaterThan(String value) {
            addCriterion("PRDNAME >", value, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRDNAME >=", value, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameLessThan(String value) {
            addCriterion("PRDNAME <", value, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameLessThanOrEqualTo(String value) {
            addCriterion("PRDNAME <=", value, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameLike(String value) {
            addCriterion("PRDNAME like", value, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameNotLike(String value) {
            addCriterion("PRDNAME not like", value, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameIn(List<String> values) {
            addCriterion("PRDNAME in", values, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameNotIn(List<String> values) {
            addCriterion("PRDNAME not in", values, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameBetween(String value1, String value2) {
            addCriterion("PRDNAME between", value1, value2, "prdname");
            return (Criteria) this;
        }

        public Criteria andPrdnameNotBetween(String value1, String value2) {
            addCriterion("PRDNAME not between", value1, value2, "prdname");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNull() {
            addCriterion("VALIDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNotNull() {
            addCriterion("VALIDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValidflagEqualTo(String value) {
            addCriterion("VALIDFLAG =", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotEqualTo(String value) {
            addCriterion("VALIDFLAG <>", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThan(String value) {
            addCriterion("VALIDFLAG >", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDFLAG >=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThan(String value) {
            addCriterion("VALIDFLAG <", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThanOrEqualTo(String value) {
            addCriterion("VALIDFLAG <=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLike(String value) {
            addCriterion("VALIDFLAG like", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotLike(String value) {
            addCriterion("VALIDFLAG not like", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagIn(List<String> values) {
            addCriterion("VALIDFLAG in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotIn(List<String> values) {
            addCriterion("VALIDFLAG not in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagBetween(String value1, String value2) {
            addCriterion("VALIDFLAG between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotBetween(String value1, String value2) {
            addCriterion("VALIDFLAG not between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated do_not_delete_during_merge Tue May 03 15:10:25 CST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
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