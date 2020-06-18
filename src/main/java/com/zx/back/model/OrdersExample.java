package com.zx.back.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNull() {
            addCriterion("oTime is null");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNotNull() {
            addCriterion("oTime is not null");
            return (Criteria) this;
        }

        public Criteria andOtimeEqualTo(Date value) {
            addCriterion("oTime =", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotEqualTo(Date value) {
            addCriterion("oTime <>", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThan(Date value) {
            addCriterion("oTime >", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oTime >=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThan(Date value) {
            addCriterion("oTime <", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThanOrEqualTo(Date value) {
            addCriterion("oTime <=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeIn(List<Date> values) {
            addCriterion("oTime in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotIn(List<Date> values) {
            addCriterion("oTime not in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeBetween(Date value1, Date value2) {
            addCriterion("oTime between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotBetween(Date value1, Date value2) {
            addCriterion("oTime not between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andUnoIsNull() {
            addCriterion("uno is null");
            return (Criteria) this;
        }

        public Criteria andUnoIsNotNull() {
            addCriterion("uno is not null");
            return (Criteria) this;
        }

        public Criteria andUnoEqualTo(String value) {
            addCriterion("uno =", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotEqualTo(String value) {
            addCriterion("uno <>", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThan(String value) {
            addCriterion("uno >", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThanOrEqualTo(String value) {
            addCriterion("uno >=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThan(String value) {
            addCriterion("uno <", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThanOrEqualTo(String value) {
            addCriterion("uno <=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLike(String value) {
            addCriterion("uno like", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotLike(String value) {
            addCriterion("uno not like", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoIn(List<String> values) {
            addCriterion("uno in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotIn(List<String> values) {
            addCriterion("uno not in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoBetween(String value1, String value2) {
            addCriterion("uno between", value1, value2, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotBetween(String value1, String value2) {
            addCriterion("uno not between", value1, value2, "uno");
            return (Criteria) this;
        }

        public Criteria andFnoIsNull() {
            addCriterion("fno is null");
            return (Criteria) this;
        }

        public Criteria andFnoIsNotNull() {
            addCriterion("fno is not null");
            return (Criteria) this;
        }

        public Criteria andFnoEqualTo(String value) {
            addCriterion("fno =", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoNotEqualTo(String value) {
            addCriterion("fno <>", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoGreaterThan(String value) {
            addCriterion("fno >", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoGreaterThanOrEqualTo(String value) {
            addCriterion("fno >=", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoLessThan(String value) {
            addCriterion("fno <", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoLessThanOrEqualTo(String value) {
            addCriterion("fno <=", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoLike(String value) {
            addCriterion("fno like", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoNotLike(String value) {
            addCriterion("fno not like", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoIn(List<String> values) {
            addCriterion("fno in", values, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoNotIn(List<String> values) {
            addCriterion("fno not in", values, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoBetween(String value1, String value2) {
            addCriterion("fno between", value1, value2, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoNotBetween(String value1, String value2) {
            addCriterion("fno not between", value1, value2, "fno");
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