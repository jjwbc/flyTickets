package com.zx.back.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("fid like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("fid not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFbeginIsNull() {
            addCriterion("fBegin is null");
            return (Criteria) this;
        }

        public Criteria andFbeginIsNotNull() {
            addCriterion("fBegin is not null");
            return (Criteria) this;
        }

        public Criteria andFbeginEqualTo(String value) {
            addCriterion("fBegin =", value, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginNotEqualTo(String value) {
            addCriterion("fBegin <>", value, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginGreaterThan(String value) {
            addCriterion("fBegin >", value, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginGreaterThanOrEqualTo(String value) {
            addCriterion("fBegin >=", value, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginLessThan(String value) {
            addCriterion("fBegin <", value, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginLessThanOrEqualTo(String value) {
            addCriterion("fBegin <=", value, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginLike(String value) {
            addCriterion("fBegin like", value, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginNotLike(String value) {
            addCriterion("fBegin not like", value, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginIn(List<String> values) {
            addCriterion("fBegin in", values, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginNotIn(List<String> values) {
            addCriterion("fBegin not in", values, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginBetween(String value1, String value2) {
            addCriterion("fBegin between", value1, value2, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFbeginNotBetween(String value1, String value2) {
            addCriterion("fBegin not between", value1, value2, "fbegin");
            return (Criteria) this;
        }

        public Criteria andFendIsNull() {
            addCriterion("fEnd is null");
            return (Criteria) this;
        }

        public Criteria andFendIsNotNull() {
            addCriterion("fEnd is not null");
            return (Criteria) this;
        }

        public Criteria andFendEqualTo(String value) {
            addCriterion("fEnd =", value, "fend");
            return (Criteria) this;
        }

        public Criteria andFendNotEqualTo(String value) {
            addCriterion("fEnd <>", value, "fend");
            return (Criteria) this;
        }

        public Criteria andFendGreaterThan(String value) {
            addCriterion("fEnd >", value, "fend");
            return (Criteria) this;
        }

        public Criteria andFendGreaterThanOrEqualTo(String value) {
            addCriterion("fEnd >=", value, "fend");
            return (Criteria) this;
        }

        public Criteria andFendLessThan(String value) {
            addCriterion("fEnd <", value, "fend");
            return (Criteria) this;
        }

        public Criteria andFendLessThanOrEqualTo(String value) {
            addCriterion("fEnd <=", value, "fend");
            return (Criteria) this;
        }

        public Criteria andFendLike(String value) {
            addCriterion("fEnd like", value, "fend");
            return (Criteria) this;
        }

        public Criteria andFendNotLike(String value) {
            addCriterion("fEnd not like", value, "fend");
            return (Criteria) this;
        }

        public Criteria andFendIn(List<String> values) {
            addCriterion("fEnd in", values, "fend");
            return (Criteria) this;
        }

        public Criteria andFendNotIn(List<String> values) {
            addCriterion("fEnd not in", values, "fend");
            return (Criteria) this;
        }

        public Criteria andFendBetween(String value1, String value2) {
            addCriterion("fEnd between", value1, value2, "fend");
            return (Criteria) this;
        }

        public Criteria andFendNotBetween(String value1, String value2) {
            addCriterion("fEnd not between", value1, value2, "fend");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("sTime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("sTime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(Date value) {
            addCriterion("sTime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(Date value) {
            addCriterion("sTime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(Date value) {
            addCriterion("sTime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sTime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(Date value) {
            addCriterion("sTime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(Date value) {
            addCriterion("sTime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<Date> values) {
            addCriterion("sTime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<Date> values) {
            addCriterion("sTime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(Date value1, Date value2) {
            addCriterion("sTime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(Date value1, Date value2) {
            addCriterion("sTime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("eTime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("eTime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterion("eTime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterion("eTime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterion("eTime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eTime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterion("eTime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterion("eTime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterion("eTime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterion("eTime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterion("eTime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterion("eTime not between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andseatsumIsNull() {
            addCriterion("seatsum is null");
            return (Criteria) this;
        }

        public Criteria andseatsumIsNotNull() {
            addCriterion("seatsum is not null");
            return (Criteria) this;
        }

        public Criteria andseatsumEqualTo(Integer value) {
            addCriterion("seatsum =", value, "seatsum");
            return (Criteria) this;
        }

        public Criteria andseatsumNotEqualTo(Integer value) {
            addCriterion("seatsum <>", value, "seatsum");
            return (Criteria) this;
        }

        public Criteria andseatsumGreaterThan(Integer value) {
            addCriterion("seatsum >", value, "seatsum");
            return (Criteria) this;
        }

        public Criteria andseatsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatsum >=", value, "seatsum");
            return (Criteria) this;
        }

        public Criteria andseatsumLessThan(Integer value) {
            addCriterion("seatsum <", value, "seatsum");
            return (Criteria) this;
        }

        public Criteria andseatsumLessThanOrEqualTo(Integer value) {
            addCriterion("seatsum <=", value, "seatsum");
            return (Criteria) this;
        }

        public Criteria andseatsumIn(List<Integer> values) {
            addCriterion("seatsum in", values, "seatsum");
            return (Criteria) this;
        }

        public Criteria andseatsumNotIn(List<Integer> values) {
            addCriterion("seatsum not in", values, "seatsum");
            return (Criteria) this;
        }

        public Criteria andseatsumBetween(Integer value1, Integer value2) {
            addCriterion("seatsum between", value1, value2, "seatsum");
            return (Criteria) this;
        }

        public Criteria andseatsumNotBetween(Integer value1, Integer value2) {
            addCriterion("seatsum not between", value1, value2, "seatsum");
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