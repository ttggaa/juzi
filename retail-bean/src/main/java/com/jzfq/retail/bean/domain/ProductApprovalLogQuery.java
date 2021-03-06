package com.jzfq.retail.bean.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductApprovalLogQuery {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public ProductApprovalLogQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
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
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
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

        public Criteria andIdIsNull() {
            addCriterion("productApprovalLog.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("productApprovalLog.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("productApprovalLog.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("productApprovalLog.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("productApprovalLog.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productApprovalLog.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("productApprovalLog.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("productApprovalLog.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("productApprovalLog.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("productApprovalLog.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("productApprovalLog.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productApprovalLog.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("productApprovalLog.product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("productApprovalLog.product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("productApprovalLog.product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("productApprovalLog.product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("productApprovalLog.product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productApprovalLog.product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("productApprovalLog.product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("productApprovalLog.product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("productApprovalLog.product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("productApprovalLog.product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("productApprovalLog.product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productApprovalLog.product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("productApprovalLog.state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("productApprovalLog.state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("productApprovalLog.state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("productApprovalLog.state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("productApprovalLog.state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("productApprovalLog.state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("productApprovalLog.state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("productApprovalLog.state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("productApprovalLog.state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("productApprovalLog.state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("productApprovalLog.state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("productApprovalLog.state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("productApprovalLog.reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("productApprovalLog.reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("productApprovalLog.reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("productApprovalLog.reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("productApprovalLog.reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("productApprovalLog.reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("productApprovalLog.reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("productApprovalLog.reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("productApprovalLog.reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("productApprovalLog.reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("productApprovalLog.reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("productApprovalLog.reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("productApprovalLog.reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("productApprovalLog.reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIsNull() {
            addCriterion("productApprovalLog.approval_user is null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIsNotNull() {
            addCriterion("productApprovalLog.approval_user is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserEqualTo(String value) {
            addCriterion("productApprovalLog.approval_user =", value, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNotEqualTo(String value) {
            addCriterion("productApprovalLog.approval_user <>", value, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserGreaterThan(String value) {
            addCriterion("productApprovalLog.approval_user >", value, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserGreaterThanOrEqualTo(String value) {
            addCriterion("productApprovalLog.approval_user >=", value, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserLessThan(String value) {
            addCriterion("productApprovalLog.approval_user <", value, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserLessThanOrEqualTo(String value) {
            addCriterion("productApprovalLog.approval_user <=", value, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserLike(String value) {
            addCriterion("productApprovalLog.approval_user like", value, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNotLike(String value) {
            addCriterion("productApprovalLog.approval_user not like", value, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIn(List<String> values) {
            addCriterion("productApprovalLog.approval_user in", values, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNotIn(List<String> values) {
            addCriterion("productApprovalLog.approval_user not in", values, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserBetween(String value1, String value2) {
            addCriterion("productApprovalLog.approval_user between", value1, value2, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNotBetween(String value1, String value2) {
            addCriterion("productApprovalLog.approval_user not between", value1, value2, "approvalUser");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdIsNull() {
            addCriterion("productApprovalLog.approval_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdIsNotNull() {
            addCriterion("productApprovalLog.approval_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdEqualTo(Integer value) {
            addCriterion("productApprovalLog.approval_user_id =", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdNotEqualTo(Integer value) {
            addCriterion("productApprovalLog.approval_user_id <>", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdGreaterThan(Integer value) {
            addCriterion("productApprovalLog.approval_user_id >", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productApprovalLog.approval_user_id >=", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdLessThan(Integer value) {
            addCriterion("productApprovalLog.approval_user_id <", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("productApprovalLog.approval_user_id <=", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdIn(List<Integer> values) {
            addCriterion("productApprovalLog.approval_user_id in", values, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdNotIn(List<Integer> values) {
            addCriterion("productApprovalLog.approval_user_id not in", values, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdBetween(Integer value1, Integer value2) {
            addCriterion("productApprovalLog.approval_user_id between", value1, value2, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productApprovalLog.approval_user_id not between", value1, value2, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNull() {
            addCriterion("productApprovalLog.approval_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNotNull() {
            addCriterion("productApprovalLog.approval_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeEqualTo(Date value) {
            addCriterion("productApprovalLog.approval_time =", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotEqualTo(Date value) {
            addCriterion("productApprovalLog.approval_time <>", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThan(Date value) {
            addCriterion("productApprovalLog.approval_time >", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("productApprovalLog.approval_time >=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThan(Date value) {
            addCriterion("productApprovalLog.approval_time <", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThanOrEqualTo(Date value) {
            addCriterion("productApprovalLog.approval_time <=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIn(List<Date> values) {
            addCriterion("productApprovalLog.approval_time in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotIn(List<Date> values) {
            addCriterion("productApprovalLog.approval_time not in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeBetween(Date value1, Date value2) {
            addCriterion("productApprovalLog.approval_time between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotBetween(Date value1, Date value2) {
            addCriterion("productApprovalLog.approval_time not between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andReasonLikeInsensitive(String value) {
            addCriterion("upper(productApprovalLog.reason) like", value.toUpperCase(), "reason");
            return (Criteria) this;
        }

        public Criteria andApprovalUserLikeInsensitive(String value) {
            addCriterion("upper(productApprovalLog.approval_user) like", value.toUpperCase(), "approvalUser");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_approval_log
     *
     * @mbggenerated do_not_delete_during_merge Wed Jun 27 16:29:15 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
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