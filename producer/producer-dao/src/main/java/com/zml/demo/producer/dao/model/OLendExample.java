package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OLendExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OLendExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIsNull() {
            addCriterion("withdraw_status is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIsNotNull() {
            addCriterion("withdraw_status is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusEqualTo(Byte value) {
            addCriterion("withdraw_status =", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotEqualTo(Byte value) {
            addCriterion("withdraw_status <>", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusGreaterThan(Byte value) {
            addCriterion("withdraw_status >", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("withdraw_status >=", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusLessThan(Byte value) {
            addCriterion("withdraw_status <", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusLessThanOrEqualTo(Byte value) {
            addCriterion("withdraw_status <=", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIn(List<Byte> values) {
            addCriterion("withdraw_status in", values, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotIn(List<Byte> values) {
            addCriterion("withdraw_status not in", values, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_status between", value1, value2, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_status not between", value1, value2, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNull() {
            addCriterion("review_status is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("review_status is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusEqualTo(Byte value) {
            addCriterion("review_status =", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotEqualTo(Byte value) {
            addCriterion("review_status <>", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThan(Byte value) {
            addCriterion("review_status >", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("review_status >=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThan(Byte value) {
            addCriterion("review_status <", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(Byte value) {
            addCriterion("review_status <=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIn(List<Byte> values) {
            addCriterion("review_status in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotIn(List<Byte> values) {
            addCriterion("review_status not in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusBetween(Byte value1, Byte value2) {
            addCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("review_status not between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusIsNull() {
            addCriterion("repay_status is null");
            return (Criteria) this;
        }

        public Criteria andRepayStatusIsNotNull() {
            addCriterion("repay_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepayStatusEqualTo(Byte value) {
            addCriterion("repay_status =", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotEqualTo(Byte value) {
            addCriterion("repay_status <>", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusGreaterThan(Byte value) {
            addCriterion("repay_status >", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("repay_status >=", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusLessThan(Byte value) {
            addCriterion("repay_status <", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("repay_status <=", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusIn(List<Byte> values) {
            addCriterion("repay_status in", values, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotIn(List<Byte> values) {
            addCriterion("repay_status not in", values, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusBetween(Byte value1, Byte value2) {
            addCriterion("repay_status between", value1, value2, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("repay_status not between", value1, value2, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusIsNull() {
            addCriterion("ext_pay_status is null");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusIsNotNull() {
            addCriterion("ext_pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusEqualTo(Byte value) {
            addCriterion("ext_pay_status =", value, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusNotEqualTo(Byte value) {
            addCriterion("ext_pay_status <>", value, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusGreaterThan(Byte value) {
            addCriterion("ext_pay_status >", value, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ext_pay_status >=", value, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusLessThan(Byte value) {
            addCriterion("ext_pay_status <", value, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("ext_pay_status <=", value, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusIn(List<Byte> values) {
            addCriterion("ext_pay_status in", values, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusNotIn(List<Byte> values) {
            addCriterion("ext_pay_status not in", values, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusBetween(Byte value1, Byte value2) {
            addCriterion("ext_pay_status between", value1, value2, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andExtPayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("ext_pay_status not between", value1, value2, "extPayStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusIsNull() {
            addCriterion("pause_status is null");
            return (Criteria) this;
        }

        public Criteria andPauseStatusIsNotNull() {
            addCriterion("pause_status is not null");
            return (Criteria) this;
        }

        public Criteria andPauseStatusEqualTo(Boolean value) {
            addCriterion("pause_status =", value, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusNotEqualTo(Boolean value) {
            addCriterion("pause_status <>", value, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusGreaterThan(Boolean value) {
            addCriterion("pause_status >", value, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pause_status >=", value, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusLessThan(Boolean value) {
            addCriterion("pause_status <", value, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("pause_status <=", value, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusIn(List<Boolean> values) {
            addCriterion("pause_status in", values, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusNotIn(List<Boolean> values) {
            addCriterion("pause_status not in", values, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("pause_status between", value1, value2, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andPauseStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pause_status not between", value1, value2, "pauseStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusIsNull() {
            addCriterion("supplement_status is null");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusIsNotNull() {
            addCriterion("supplement_status is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusEqualTo(Byte value) {
            addCriterion("supplement_status =", value, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusNotEqualTo(Byte value) {
            addCriterion("supplement_status <>", value, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusGreaterThan(Byte value) {
            addCriterion("supplement_status >", value, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("supplement_status >=", value, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusLessThan(Byte value) {
            addCriterion("supplement_status <", value, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusLessThanOrEqualTo(Byte value) {
            addCriterion("supplement_status <=", value, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusIn(List<Byte> values) {
            addCriterion("supplement_status in", values, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusNotIn(List<Byte> values) {
            addCriterion("supplement_status not in", values, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusBetween(Byte value1, Byte value2) {
            addCriterion("supplement_status between", value1, value2, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andSupplementStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("supplement_status not between", value1, value2, "supplementStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Byte value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Byte value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Byte value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Byte value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Byte value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Byte> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Byte> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Byte value1, Byte value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusIsNull() {
            addCriterion("bank_review_status is null");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusIsNotNull() {
            addCriterion("bank_review_status is not null");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusEqualTo(Byte value) {
            addCriterion("bank_review_status =", value, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusNotEqualTo(Byte value) {
            addCriterion("bank_review_status <>", value, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusGreaterThan(Byte value) {
            addCriterion("bank_review_status >", value, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("bank_review_status >=", value, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusLessThan(Byte value) {
            addCriterion("bank_review_status <", value, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusLessThanOrEqualTo(Byte value) {
            addCriterion("bank_review_status <=", value, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusIn(List<Byte> values) {
            addCriterion("bank_review_status in", values, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusNotIn(List<Byte> values) {
            addCriterion("bank_review_status not in", values, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusBetween(Byte value1, Byte value2) {
            addCriterion("bank_review_status between", value1, value2, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andBankReviewStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("bank_review_status not between", value1, value2, "bankReviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterestRatioIsNull() {
            addCriterion("interest_ratio is null");
            return (Criteria) this;
        }

        public Criteria andInterestRatioIsNotNull() {
            addCriterion("interest_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRatioEqualTo(BigDecimal value) {
            addCriterion("interest_ratio =", value, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andInterestRatioNotEqualTo(BigDecimal value) {
            addCriterion("interest_ratio <>", value, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andInterestRatioGreaterThan(BigDecimal value) {
            addCriterion("interest_ratio >", value, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andInterestRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_ratio >=", value, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andInterestRatioLessThan(BigDecimal value) {
            addCriterion("interest_ratio <", value, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andInterestRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_ratio <=", value, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andInterestRatioIn(List<BigDecimal> values) {
            addCriterion("interest_ratio in", values, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andInterestRatioNotIn(List<BigDecimal> values) {
            addCriterion("interest_ratio not in", values, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andInterestRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_ratio between", value1, value2, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andInterestRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_ratio not between", value1, value2, "interestRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioIsNull() {
            addCriterion("overdue_ratio is null");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioIsNotNull() {
            addCriterion("overdue_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioEqualTo(BigDecimal value) {
            addCriterion("overdue_ratio =", value, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioNotEqualTo(BigDecimal value) {
            addCriterion("overdue_ratio <>", value, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioGreaterThan(BigDecimal value) {
            addCriterion("overdue_ratio >", value, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_ratio >=", value, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioLessThan(BigDecimal value) {
            addCriterion("overdue_ratio <", value, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_ratio <=", value, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioIn(List<BigDecimal> values) {
            addCriterion("overdue_ratio in", values, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioNotIn(List<BigDecimal> values) {
            addCriterion("overdue_ratio not in", values, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_ratio between", value1, value2, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_ratio not between", value1, value2, "overdueRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioIsNull() {
            addCriterion("overdue_max_ratio is null");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioIsNotNull() {
            addCriterion("overdue_max_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioEqualTo(BigDecimal value) {
            addCriterion("overdue_max_ratio =", value, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioNotEqualTo(BigDecimal value) {
            addCriterion("overdue_max_ratio <>", value, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioGreaterThan(BigDecimal value) {
            addCriterion("overdue_max_ratio >", value, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_max_ratio >=", value, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioLessThan(BigDecimal value) {
            addCriterion("overdue_max_ratio <", value, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_max_ratio <=", value, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioIn(List<BigDecimal> values) {
            addCriterion("overdue_max_ratio in", values, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioNotIn(List<BigDecimal> values) {
            addCriterion("overdue_max_ratio not in", values, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_max_ratio between", value1, value2, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andOverdueMaxRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_max_ratio not between", value1, value2, "overdueMaxRatio");
            return (Criteria) this;
        }

        public Criteria andLoanDaysIsNull() {
            addCriterion("loan_days is null");
            return (Criteria) this;
        }

        public Criteria andLoanDaysIsNotNull() {
            addCriterion("loan_days is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDaysEqualTo(Integer value) {
            addCriterion("loan_days =", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysNotEqualTo(Integer value) {
            addCriterion("loan_days <>", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysGreaterThan(Integer value) {
            addCriterion("loan_days >", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_days >=", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysLessThan(Integer value) {
            addCriterion("loan_days <", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysLessThanOrEqualTo(Integer value) {
            addCriterion("loan_days <=", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysIn(List<Integer> values) {
            addCriterion("loan_days in", values, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysNotIn(List<Integer> values) {
            addCriterion("loan_days not in", values, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysBetween(Integer value1, Integer value2) {
            addCriterion("loan_days between", value1, value2, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_days not between", value1, value2, "loanDays");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(LocalDateTime value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(LocalDateTime value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(LocalDateTime value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(LocalDateTime value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<LocalDateTime> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<LocalDateTime> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeIsNull() {
            addCriterion("withdraw_time is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeIsNotNull() {
            addCriterion("withdraw_time is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeEqualTo(LocalDateTime value) {
            addCriterion("withdraw_time =", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeNotEqualTo(LocalDateTime value) {
            addCriterion("withdraw_time <>", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeGreaterThan(LocalDateTime value) {
            addCriterion("withdraw_time >", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("withdraw_time >=", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeLessThan(LocalDateTime value) {
            addCriterion("withdraw_time <", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("withdraw_time <=", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeIn(List<LocalDateTime> values) {
            addCriterion("withdraw_time in", values, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeNotIn(List<LocalDateTime> values) {
            addCriterion("withdraw_time not in", values, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("withdraw_time between", value1, value2, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("withdraw_time not between", value1, value2, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateIsNull() {
            addCriterion("should_return_date is null");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateIsNotNull() {
            addCriterion("should_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateEqualTo(LocalDate value) {
            addCriterion("should_return_date =", value, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateNotEqualTo(LocalDate value) {
            addCriterion("should_return_date <>", value, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateGreaterThan(LocalDate value) {
            addCriterion("should_return_date >", value, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("should_return_date >=", value, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateLessThan(LocalDate value) {
            addCriterion("should_return_date <", value, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("should_return_date <=", value, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateIn(List<LocalDate> values) {
            addCriterion("should_return_date in", values, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateNotIn(List<LocalDate> values) {
            addCriterion("should_return_date not in", values, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("should_return_date between", value1, value2, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andShouldReturnDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("should_return_date not between", value1, value2, "shouldReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateIsNull() {
            addCriterion("delay_return_date is null");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateIsNotNull() {
            addCriterion("delay_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateEqualTo(LocalDate value) {
            addCriterion("delay_return_date =", value, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateNotEqualTo(LocalDate value) {
            addCriterion("delay_return_date <>", value, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateGreaterThan(LocalDate value) {
            addCriterion("delay_return_date >", value, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("delay_return_date >=", value, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateLessThan(LocalDate value) {
            addCriterion("delay_return_date <", value, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("delay_return_date <=", value, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateIn(List<LocalDate> values) {
            addCriterion("delay_return_date in", values, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateNotIn(List<LocalDate> values) {
            addCriterion("delay_return_date not in", values, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("delay_return_date between", value1, value2, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andDelayReturnDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("delay_return_date not between", value1, value2, "delayReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeIsNull() {
            addCriterion("repaid_over_time is null");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeIsNotNull() {
            addCriterion("repaid_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeEqualTo(LocalDateTime value) {
            addCriterion("repaid_over_time =", value, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeNotEqualTo(LocalDateTime value) {
            addCriterion("repaid_over_time <>", value, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeGreaterThan(LocalDateTime value) {
            addCriterion("repaid_over_time >", value, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("repaid_over_time >=", value, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeLessThan(LocalDateTime value) {
            addCriterion("repaid_over_time <", value, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("repaid_over_time <=", value, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeIn(List<LocalDateTime> values) {
            addCriterion("repaid_over_time in", values, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeNotIn(List<LocalDateTime> values) {
            addCriterion("repaid_over_time not in", values, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("repaid_over_time between", value1, value2, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andRepaidOverTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("repaid_over_time not between", value1, value2, "repaidOverTime");
            return (Criteria) this;
        }

        public Criteria andFirstIsNull() {
            addCriterion("first is null");
            return (Criteria) this;
        }

        public Criteria andFirstIsNotNull() {
            addCriterion("first is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEqualTo(Byte value) {
            addCriterion("first =", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotEqualTo(Byte value) {
            addCriterion("first <>", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThan(Byte value) {
            addCriterion("first >", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThanOrEqualTo(Byte value) {
            addCriterion("first >=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThan(Byte value) {
            addCriterion("first <", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThanOrEqualTo(Byte value) {
            addCriterion("first <=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstIn(List<Byte> values) {
            addCriterion("first in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotIn(List<Byte> values) {
            addCriterion("first not in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstBetween(Byte value1, Byte value2) {
            addCriterion("first between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotBetween(Byte value1, Byte value2) {
            addCriterion("first not between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andLoanModelIsNull() {
            addCriterion("loan_model is null");
            return (Criteria) this;
        }

        public Criteria andLoanModelIsNotNull() {
            addCriterion("loan_model is not null");
            return (Criteria) this;
        }

        public Criteria andLoanModelEqualTo(Byte value) {
            addCriterion("loan_model =", value, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanModelNotEqualTo(Byte value) {
            addCriterion("loan_model <>", value, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanModelGreaterThan(Byte value) {
            addCriterion("loan_model >", value, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanModelGreaterThanOrEqualTo(Byte value) {
            addCriterion("loan_model >=", value, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanModelLessThan(Byte value) {
            addCriterion("loan_model <", value, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanModelLessThanOrEqualTo(Byte value) {
            addCriterion("loan_model <=", value, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanModelIn(List<Byte> values) {
            addCriterion("loan_model in", values, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanModelNotIn(List<Byte> values) {
            addCriterion("loan_model not in", values, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanModelBetween(Byte value1, Byte value2) {
            addCriterion("loan_model between", value1, value2, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanModelNotBetween(Byte value1, Byte value2) {
            addCriterion("loan_model not between", value1, value2, "loanModel");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountIsNull() {
            addCriterion("ext_fee_amount is null");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountIsNotNull() {
            addCriterion("ext_fee_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountEqualTo(BigDecimal value) {
            addCriterion("ext_fee_amount =", value, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountNotEqualTo(BigDecimal value) {
            addCriterion("ext_fee_amount <>", value, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountGreaterThan(BigDecimal value) {
            addCriterion("ext_fee_amount >", value, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ext_fee_amount >=", value, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountLessThan(BigDecimal value) {
            addCriterion("ext_fee_amount <", value, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ext_fee_amount <=", value, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountIn(List<BigDecimal> values) {
            addCriterion("ext_fee_amount in", values, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountNotIn(List<BigDecimal> values) {
            addCriterion("ext_fee_amount not in", values, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ext_fee_amount between", value1, value2, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andExtFeeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ext_fee_amount not between", value1, value2, "extFeeAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIsNull() {
            addCriterion("interest_amount is null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIsNotNull() {
            addCriterion("interest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountEqualTo(BigDecimal value) {
            addCriterion("interest_amount =", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotEqualTo(BigDecimal value) {
            addCriterion("interest_amount <>", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountGreaterThan(BigDecimal value) {
            addCriterion("interest_amount >", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount >=", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountLessThan(BigDecimal value) {
            addCriterion("interest_amount <", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount <=", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIn(List<BigDecimal> values) {
            addCriterion("interest_amount in", values, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotIn(List<BigDecimal> values) {
            addCriterion("interest_amount not in", values, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount between", value1, value2, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount not between", value1, value2, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountIsNull() {
            addCriterion("in_hand_amount is null");
            return (Criteria) this;
        }

        public Criteria andInHandAmountIsNotNull() {
            addCriterion("in_hand_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInHandAmountEqualTo(BigDecimal value) {
            addCriterion("in_hand_amount =", value, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountNotEqualTo(BigDecimal value) {
            addCriterion("in_hand_amount <>", value, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountGreaterThan(BigDecimal value) {
            addCriterion("in_hand_amount >", value, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("in_hand_amount >=", value, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountLessThan(BigDecimal value) {
            addCriterion("in_hand_amount <", value, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("in_hand_amount <=", value, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountIn(List<BigDecimal> values) {
            addCriterion("in_hand_amount in", values, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountNotIn(List<BigDecimal> values) {
            addCriterion("in_hand_amount not in", values, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_hand_amount between", value1, value2, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andInHandAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_hand_amount not between", value1, value2, "inHandAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountIsNull() {
            addCriterion("withdraw_amount is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountIsNotNull() {
            addCriterion("withdraw_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountEqualTo(BigDecimal value) {
            addCriterion("withdraw_amount =", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountNotEqualTo(BigDecimal value) {
            addCriterion("withdraw_amount <>", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountGreaterThan(BigDecimal value) {
            addCriterion("withdraw_amount >", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_amount >=", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountLessThan(BigDecimal value) {
            addCriterion("withdraw_amount <", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_amount <=", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountIn(List<BigDecimal> values) {
            addCriterion("withdraw_amount in", values, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountNotIn(List<BigDecimal> values) {
            addCriterion("withdraw_amount not in", values, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_amount between", value1, value2, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_amount not between", value1, value2, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountIsNull() {
            addCriterion("repaid_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountIsNotNull() {
            addCriterion("repaid_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountEqualTo(BigDecimal value) {
            addCriterion("repaid_amount =", value, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountNotEqualTo(BigDecimal value) {
            addCriterion("repaid_amount <>", value, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountGreaterThan(BigDecimal value) {
            addCriterion("repaid_amount >", value, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_amount >=", value, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountLessThan(BigDecimal value) {
            addCriterion("repaid_amount <", value, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_amount <=", value, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountIn(List<BigDecimal> values) {
            addCriterion("repaid_amount in", values, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountNotIn(List<BigDecimal> values) {
            addCriterion("repaid_amount not in", values, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_amount between", value1, value2, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_amount not between", value1, value2, "repaidAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountIsNull() {
            addCriterion("reduction_amount is null");
            return (Criteria) this;
        }

        public Criteria andReductionAmountIsNotNull() {
            addCriterion("reduction_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReductionAmountEqualTo(BigDecimal value) {
            addCriterion("reduction_amount =", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountNotEqualTo(BigDecimal value) {
            addCriterion("reduction_amount <>", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountGreaterThan(BigDecimal value) {
            addCriterion("reduction_amount >", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reduction_amount >=", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountLessThan(BigDecimal value) {
            addCriterion("reduction_amount <", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reduction_amount <=", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountIn(List<BigDecimal> values) {
            addCriterion("reduction_amount in", values, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountNotIn(List<BigDecimal> values) {
            addCriterion("reduction_amount not in", values, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduction_amount between", value1, value2, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduction_amount not between", value1, value2, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountIsNull() {
            addCriterion("repaid_principal_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountIsNotNull() {
            addCriterion("repaid_principal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountEqualTo(BigDecimal value) {
            addCriterion("repaid_principal_amount =", value, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountNotEqualTo(BigDecimal value) {
            addCriterion("repaid_principal_amount <>", value, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountGreaterThan(BigDecimal value) {
            addCriterion("repaid_principal_amount >", value, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_principal_amount >=", value, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountLessThan(BigDecimal value) {
            addCriterion("repaid_principal_amount <", value, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_principal_amount <=", value, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountIn(List<BigDecimal> values) {
            addCriterion("repaid_principal_amount in", values, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountNotIn(List<BigDecimal> values) {
            addCriterion("repaid_principal_amount not in", values, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_principal_amount between", value1, value2, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_principal_amount not between", value1, value2, "repaidPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountIsNull() {
            addCriterion("repaid_overdue_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountIsNotNull() {
            addCriterion("repaid_overdue_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountEqualTo(BigDecimal value) {
            addCriterion("repaid_overdue_amount =", value, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountNotEqualTo(BigDecimal value) {
            addCriterion("repaid_overdue_amount <>", value, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountGreaterThan(BigDecimal value) {
            addCriterion("repaid_overdue_amount >", value, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_overdue_amount >=", value, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountLessThan(BigDecimal value) {
            addCriterion("repaid_overdue_amount <", value, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_overdue_amount <=", value, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountIn(List<BigDecimal> values) {
            addCriterion("repaid_overdue_amount in", values, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountNotIn(List<BigDecimal> values) {
            addCriterion("repaid_overdue_amount not in", values, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_overdue_amount between", value1, value2, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOverdueAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_overdue_amount not between", value1, value2, "repaidOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountIsNull() {
            addCriterion("repaid_interest_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountIsNotNull() {
            addCriterion("repaid_interest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountEqualTo(BigDecimal value) {
            addCriterion("repaid_interest_amount =", value, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountNotEqualTo(BigDecimal value) {
            addCriterion("repaid_interest_amount <>", value, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountGreaterThan(BigDecimal value) {
            addCriterion("repaid_interest_amount >", value, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_interest_amount >=", value, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountLessThan(BigDecimal value) {
            addCriterion("repaid_interest_amount <", value, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_interest_amount <=", value, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountIn(List<BigDecimal> values) {
            addCriterion("repaid_interest_amount in", values, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountNotIn(List<BigDecimal> values) {
            addCriterion("repaid_interest_amount not in", values, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_interest_amount between", value1, value2, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_interest_amount not between", value1, value2, "repaidInterestAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountIsNull() {
            addCriterion("repaid_extfee_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountIsNotNull() {
            addCriterion("repaid_extfee_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountEqualTo(BigDecimal value) {
            addCriterion("repaid_extfee_amount =", value, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountNotEqualTo(BigDecimal value) {
            addCriterion("repaid_extfee_amount <>", value, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountGreaterThan(BigDecimal value) {
            addCriterion("repaid_extfee_amount >", value, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_extfee_amount >=", value, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountLessThan(BigDecimal value) {
            addCriterion("repaid_extfee_amount <", value, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_extfee_amount <=", value, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountIn(List<BigDecimal> values) {
            addCriterion("repaid_extfee_amount in", values, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountNotIn(List<BigDecimal> values) {
            addCriterion("repaid_extfee_amount not in", values, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_extfee_amount between", value1, value2, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidExtfeeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_extfee_amount not between", value1, value2, "repaidExtfeeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountIsNull() {
            addCriterion("repaid_other_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountIsNotNull() {
            addCriterion("repaid_other_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountEqualTo(BigDecimal value) {
            addCriterion("repaid_other_amount =", value, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountNotEqualTo(BigDecimal value) {
            addCriterion("repaid_other_amount <>", value, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountGreaterThan(BigDecimal value) {
            addCriterion("repaid_other_amount >", value, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_other_amount >=", value, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountLessThan(BigDecimal value) {
            addCriterion("repaid_other_amount <", value, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repaid_other_amount <=", value, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountIn(List<BigDecimal> values) {
            addCriterion("repaid_other_amount in", values, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountNotIn(List<BigDecimal> values) {
            addCriterion("repaid_other_amount not in", values, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_other_amount between", value1, value2, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andRepaidOtherAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaid_other_amount not between", value1, value2, "repaidOtherAmount");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIsNull() {
            addCriterion("bank_card_id is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIsNotNull() {
            addCriterion("bank_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdEqualTo(Integer value) {
            addCriterion("bank_card_id =", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotEqualTo(Integer value) {
            addCriterion("bank_card_id <>", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThan(Integer value) {
            addCriterion("bank_card_id >", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_card_id >=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThan(Integer value) {
            addCriterion("bank_card_id <", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_card_id <=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIn(List<Integer> values) {
            addCriterion("bank_card_id in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotIn(List<Integer> values) {
            addCriterion("bank_card_id not in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_card_id between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_card_id not between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNull() {
            addCriterion("pause_time is null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNotNull() {
            addCriterion("pause_time is not null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeEqualTo(LocalDateTime value) {
            addCriterion("pause_time =", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotEqualTo(LocalDateTime value) {
            addCriterion("pause_time <>", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThan(LocalDateTime value) {
            addCriterion("pause_time >", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("pause_time >=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThan(LocalDateTime value) {
            addCriterion("pause_time <", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("pause_time <=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIn(List<LocalDateTime> values) {
            addCriterion("pause_time in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotIn(List<LocalDateTime> values) {
            addCriterion("pause_time not in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pause_time between", value1, value2, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pause_time not between", value1, value2, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNull() {
            addCriterion("review_time is null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNotNull() {
            addCriterion("review_time is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeEqualTo(LocalDateTime value) {
            addCriterion("review_time =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(LocalDateTime value) {
            addCriterion("review_time <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(LocalDateTime value) {
            addCriterion("review_time >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("review_time >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(LocalDateTime value) {
            addCriterion("review_time <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("review_time <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<LocalDateTime> values) {
            addCriterion("review_time in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<LocalDateTime> values) {
            addCriterion("review_time not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("review_time between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("review_time not between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusIsNull() {
            addCriterion("first_allot_status is null");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusIsNotNull() {
            addCriterion("first_allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusEqualTo(Boolean value) {
            addCriterion("first_allot_status =", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusNotEqualTo(Boolean value) {
            addCriterion("first_allot_status <>", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusGreaterThan(Boolean value) {
            addCriterion("first_allot_status >", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("first_allot_status >=", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusLessThan(Boolean value) {
            addCriterion("first_allot_status <", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("first_allot_status <=", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusIn(List<Boolean> values) {
            addCriterion("first_allot_status in", values, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusNotIn(List<Boolean> values) {
            addCriterion("first_allot_status not in", values, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("first_allot_status between", value1, value2, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("first_allot_status not between", value1, value2, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusIsNull() {
            addCriterion("last_allot_status is null");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusIsNotNull() {
            addCriterion("last_allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusEqualTo(Boolean value) {
            addCriterion("last_allot_status =", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusNotEqualTo(Boolean value) {
            addCriterion("last_allot_status <>", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusGreaterThan(Boolean value) {
            addCriterion("last_allot_status >", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("last_allot_status >=", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusLessThan(Boolean value) {
            addCriterion("last_allot_status <", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("last_allot_status <=", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusIn(List<Boolean> values) {
            addCriterion("last_allot_status in", values, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusNotIn(List<Boolean> values) {
            addCriterion("last_allot_status not in", values, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("last_allot_status between", value1, value2, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("last_allot_status not between", value1, value2, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusIsNull() {
            addCriterion("check_allot_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusIsNotNull() {
            addCriterion("check_allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusEqualTo(Boolean value) {
            addCriterion("check_allot_status =", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusNotEqualTo(Boolean value) {
            addCriterion("check_allot_status <>", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusGreaterThan(Boolean value) {
            addCriterion("check_allot_status >", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("check_allot_status >=", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusLessThan(Boolean value) {
            addCriterion("check_allot_status <", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("check_allot_status <=", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusIn(List<Boolean> values) {
            addCriterion("check_allot_status in", values, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusNotIn(List<Boolean> values) {
            addCriterion("check_allot_status not in", values, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("check_allot_status between", value1, value2, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("check_allot_status not between", value1, value2, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerIsNull() {
            addCriterion("first_reviewer is null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerIsNotNull() {
            addCriterion("first_reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerEqualTo(String value) {
            addCriterion("first_reviewer =", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerNotEqualTo(String value) {
            addCriterion("first_reviewer <>", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerGreaterThan(String value) {
            addCriterion("first_reviewer >", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("first_reviewer >=", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerLessThan(String value) {
            addCriterion("first_reviewer <", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerLessThanOrEqualTo(String value) {
            addCriterion("first_reviewer <=", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerLike(String value) {
            addCriterion("first_reviewer like", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerNotLike(String value) {
            addCriterion("first_reviewer not like", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerIn(List<String> values) {
            addCriterion("first_reviewer in", values, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerNotIn(List<String> values) {
            addCriterion("first_reviewer not in", values, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerBetween(String value1, String value2) {
            addCriterion("first_reviewer between", value1, value2, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerNotBetween(String value1, String value2) {
            addCriterion("first_reviewer not between", value1, value2, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerIsNull() {
            addCriterion("last_reviewer is null");
            return (Criteria) this;
        }

        public Criteria andLastReviewerIsNotNull() {
            addCriterion("last_reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andLastReviewerEqualTo(String value) {
            addCriterion("last_reviewer =", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerNotEqualTo(String value) {
            addCriterion("last_reviewer <>", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerGreaterThan(String value) {
            addCriterion("last_reviewer >", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("last_reviewer >=", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerLessThan(String value) {
            addCriterion("last_reviewer <", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerLessThanOrEqualTo(String value) {
            addCriterion("last_reviewer <=", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerLike(String value) {
            addCriterion("last_reviewer like", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerNotLike(String value) {
            addCriterion("last_reviewer not like", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerIn(List<String> values) {
            addCriterion("last_reviewer in", values, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerNotIn(List<String> values) {
            addCriterion("last_reviewer not in", values, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerBetween(String value1, String value2) {
            addCriterion("last_reviewer between", value1, value2, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerNotBetween(String value1, String value2) {
            addCriterion("last_reviewer not between", value1, value2, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("checker like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("checker not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(LocalDateTime value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(LocalDateTime value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(LocalDateTime value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(LocalDateTime value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<LocalDateTime> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<LocalDateTime> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andBackLabelIsNull() {
            addCriterion("back_label is null");
            return (Criteria) this;
        }

        public Criteria andBackLabelIsNotNull() {
            addCriterion("back_label is not null");
            return (Criteria) this;
        }

        public Criteria andBackLabelEqualTo(Byte value) {
            addCriterion("back_label =", value, "backLabel");
            return (Criteria) this;
        }

        public Criteria andBackLabelNotEqualTo(Byte value) {
            addCriterion("back_label <>", value, "backLabel");
            return (Criteria) this;
        }

        public Criteria andBackLabelGreaterThan(Byte value) {
            addCriterion("back_label >", value, "backLabel");
            return (Criteria) this;
        }

        public Criteria andBackLabelGreaterThanOrEqualTo(Byte value) {
            addCriterion("back_label >=", value, "backLabel");
            return (Criteria) this;
        }

        public Criteria andBackLabelLessThan(Byte value) {
            addCriterion("back_label <", value, "backLabel");
            return (Criteria) this;
        }

        public Criteria andBackLabelLessThanOrEqualTo(Byte value) {
            addCriterion("back_label <=", value, "backLabel");
            return (Criteria) this;
        }

        public Criteria andBackLabelIn(List<Byte> values) {
            addCriterion("back_label in", values, "backLabel");
            return (Criteria) this;
        }

        public Criteria andBackLabelNotIn(List<Byte> values) {
            addCriterion("back_label not in", values, "backLabel");
            return (Criteria) this;
        }

        public Criteria andBackLabelBetween(Byte value1, Byte value2) {
            addCriterion("back_label between", value1, value2, "backLabel");
            return (Criteria) this;
        }

        public Criteria andBackLabelNotBetween(Byte value1, Byte value2) {
            addCriterion("back_label not between", value1, value2, "backLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelIsNull() {
            addCriterion("remind_label is null");
            return (Criteria) this;
        }

        public Criteria andRemindLabelIsNotNull() {
            addCriterion("remind_label is not null");
            return (Criteria) this;
        }

        public Criteria andRemindLabelEqualTo(Byte value) {
            addCriterion("remind_label =", value, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelNotEqualTo(Byte value) {
            addCriterion("remind_label <>", value, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelGreaterThan(Byte value) {
            addCriterion("remind_label >", value, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelGreaterThanOrEqualTo(Byte value) {
            addCriterion("remind_label >=", value, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelLessThan(Byte value) {
            addCriterion("remind_label <", value, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelLessThanOrEqualTo(Byte value) {
            addCriterion("remind_label <=", value, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelIn(List<Byte> values) {
            addCriterion("remind_label in", values, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelNotIn(List<Byte> values) {
            addCriterion("remind_label not in", values, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelBetween(Byte value1, Byte value2) {
            addCriterion("remind_label between", value1, value2, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andRemindLabelNotBetween(Byte value1, Byte value2) {
            addCriterion("remind_label not between", value1, value2, "remindLabel");
            return (Criteria) this;
        }

        public Criteria andLoanUsageIsNull() {
            addCriterion("loan_usage is null");
            return (Criteria) this;
        }

        public Criteria andLoanUsageIsNotNull() {
            addCriterion("loan_usage is not null");
            return (Criteria) this;
        }

        public Criteria andLoanUsageEqualTo(String value) {
            addCriterion("loan_usage =", value, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageNotEqualTo(String value) {
            addCriterion("loan_usage <>", value, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageGreaterThan(String value) {
            addCriterion("loan_usage >", value, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageGreaterThanOrEqualTo(String value) {
            addCriterion("loan_usage >=", value, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageLessThan(String value) {
            addCriterion("loan_usage <", value, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageLessThanOrEqualTo(String value) {
            addCriterion("loan_usage <=", value, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageLike(String value) {
            addCriterion("loan_usage like", value, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageNotLike(String value) {
            addCriterion("loan_usage not like", value, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageIn(List<String> values) {
            addCriterion("loan_usage in", values, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageNotIn(List<String> values) {
            addCriterion("loan_usage not in", values, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageBetween(String value1, String value2) {
            addCriterion("loan_usage between", value1, value2, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andLoanUsageNotBetween(String value1, String value2) {
            addCriterion("loan_usage not between", value1, value2, "loanUsage");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andWaitSettleIsNull() {
            addCriterion("wait_settle is null");
            return (Criteria) this;
        }

        public Criteria andWaitSettleIsNotNull() {
            addCriterion("wait_settle is not null");
            return (Criteria) this;
        }

        public Criteria andWaitSettleEqualTo(Boolean value) {
            addCriterion("wait_settle =", value, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleNotEqualTo(Boolean value) {
            addCriterion("wait_settle <>", value, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleGreaterThan(Boolean value) {
            addCriterion("wait_settle >", value, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wait_settle >=", value, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleLessThan(Boolean value) {
            addCriterion("wait_settle <", value, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleLessThanOrEqualTo(Boolean value) {
            addCriterion("wait_settle <=", value, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleIn(List<Boolean> values) {
            addCriterion("wait_settle in", values, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleNotIn(List<Boolean> values) {
            addCriterion("wait_settle not in", values, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleBetween(Boolean value1, Boolean value2) {
            addCriterion("wait_settle between", value1, value2, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wait_settle not between", value1, value2, "waitSettle");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeIsNull() {
            addCriterion("wait_settle_time is null");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeIsNotNull() {
            addCriterion("wait_settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeEqualTo(LocalDateTime value) {
            addCriterion("wait_settle_time =", value, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeNotEqualTo(LocalDateTime value) {
            addCriterion("wait_settle_time <>", value, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeGreaterThan(LocalDateTime value) {
            addCriterion("wait_settle_time >", value, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("wait_settle_time >=", value, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeLessThan(LocalDateTime value) {
            addCriterion("wait_settle_time <", value, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("wait_settle_time <=", value, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeIn(List<LocalDateTime> values) {
            addCriterion("wait_settle_time in", values, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeNotIn(List<LocalDateTime> values) {
            addCriterion("wait_settle_time not in", values, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("wait_settle_time between", value1, value2, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andWaitSettleTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("wait_settle_time not between", value1, value2, "waitSettleTime");
            return (Criteria) this;
        }

        public Criteria andDelayIsNull() {
            addCriterion("delay is null");
            return (Criteria) this;
        }

        public Criteria andDelayIsNotNull() {
            addCriterion("delay is not null");
            return (Criteria) this;
        }

        public Criteria andDelayEqualTo(Boolean value) {
            addCriterion("delay =", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotEqualTo(Boolean value) {
            addCriterion("delay <>", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayGreaterThan(Boolean value) {
            addCriterion("delay >", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delay >=", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayLessThan(Boolean value) {
            addCriterion("delay <", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayLessThanOrEqualTo(Boolean value) {
            addCriterion("delay <=", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayIn(List<Boolean> values) {
            addCriterion("delay in", values, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotIn(List<Boolean> values) {
            addCriterion("delay not in", values, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayBetween(Boolean value1, Boolean value2) {
            addCriterion("delay between", value1, value2, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delay not between", value1, value2, "delay");
            return (Criteria) this;
        }

        public Criteria andOverdueIsNull() {
            addCriterion("overdue is null");
            return (Criteria) this;
        }

        public Criteria andOverdueIsNotNull() {
            addCriterion("overdue is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueEqualTo(Boolean value) {
            addCriterion("overdue =", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueNotEqualTo(Boolean value) {
            addCriterion("overdue <>", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueGreaterThan(Boolean value) {
            addCriterion("overdue >", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueGreaterThanOrEqualTo(Boolean value) {
            addCriterion("overdue >=", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueLessThan(Boolean value) {
            addCriterion("overdue <", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueLessThanOrEqualTo(Boolean value) {
            addCriterion("overdue <=", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueIn(List<Boolean> values) {
            addCriterion("overdue in", values, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueNotIn(List<Boolean> values) {
            addCriterion("overdue not in", values, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueBetween(Boolean value1, Boolean value2) {
            addCriterion("overdue between", value1, value2, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueNotBetween(Boolean value1, Boolean value2) {
            addCriterion("overdue not between", value1, value2, "overdue");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIsNull() {
            addCriterion("reject_code is null");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIsNotNull() {
            addCriterion("reject_code is not null");
            return (Criteria) this;
        }

        public Criteria andRejectCodeEqualTo(String value) {
            addCriterion("reject_code =", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotEqualTo(String value) {
            addCriterion("reject_code <>", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeGreaterThan(String value) {
            addCriterion("reject_code >", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reject_code >=", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLessThan(String value) {
            addCriterion("reject_code <", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLessThanOrEqualTo(String value) {
            addCriterion("reject_code <=", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLike(String value) {
            addCriterion("reject_code like", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotLike(String value) {
            addCriterion("reject_code not like", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIn(List<String> values) {
            addCriterion("reject_code in", values, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotIn(List<String> values) {
            addCriterion("reject_code not in", values, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeBetween(String value1, String value2) {
            addCriterion("reject_code between", value1, value2, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotBetween(String value1, String value2) {
            addCriterion("reject_code not between", value1, value2, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeIsNull() {
            addCriterion("pause_code is null");
            return (Criteria) this;
        }

        public Criteria andPauseCodeIsNotNull() {
            addCriterion("pause_code is not null");
            return (Criteria) this;
        }

        public Criteria andPauseCodeEqualTo(String value) {
            addCriterion("pause_code =", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeNotEqualTo(String value) {
            addCriterion("pause_code <>", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeGreaterThan(String value) {
            addCriterion("pause_code >", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pause_code >=", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeLessThan(String value) {
            addCriterion("pause_code <", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeLessThanOrEqualTo(String value) {
            addCriterion("pause_code <=", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeLike(String value) {
            addCriterion("pause_code like", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeNotLike(String value) {
            addCriterion("pause_code not like", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeIn(List<String> values) {
            addCriterion("pause_code in", values, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeNotIn(List<String> values) {
            addCriterion("pause_code not in", values, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeBetween(String value1, String value2) {
            addCriterion("pause_code between", value1, value2, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeNotBetween(String value1, String value2) {
            addCriterion("pause_code not between", value1, value2, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusIsNull() {
            addCriterion("repay_review_status is null");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusIsNotNull() {
            addCriterion("repay_review_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusEqualTo(Byte value) {
            addCriterion("repay_review_status =", value, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusNotEqualTo(Byte value) {
            addCriterion("repay_review_status <>", value, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusGreaterThan(Byte value) {
            addCriterion("repay_review_status >", value, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("repay_review_status >=", value, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusLessThan(Byte value) {
            addCriterion("repay_review_status <", value, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusLessThanOrEqualTo(Byte value) {
            addCriterion("repay_review_status <=", value, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusIn(List<Byte> values) {
            addCriterion("repay_review_status in", values, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusNotIn(List<Byte> values) {
            addCriterion("repay_review_status not in", values, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusBetween(Byte value1, Byte value2) {
            addCriterion("repay_review_status between", value1, value2, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRepayReviewStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("repay_review_status not between", value1, value2, "repayReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusIsNull() {
            addCriterion("withdraw_review_status is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusIsNotNull() {
            addCriterion("withdraw_review_status is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusEqualTo(Byte value) {
            addCriterion("withdraw_review_status =", value, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusNotEqualTo(Byte value) {
            addCriterion("withdraw_review_status <>", value, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusGreaterThan(Byte value) {
            addCriterion("withdraw_review_status >", value, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("withdraw_review_status >=", value, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusLessThan(Byte value) {
            addCriterion("withdraw_review_status <", value, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusLessThanOrEqualTo(Byte value) {
            addCriterion("withdraw_review_status <=", value, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusIn(List<Byte> values) {
            addCriterion("withdraw_review_status in", values, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusNotIn(List<Byte> values) {
            addCriterion("withdraw_review_status not in", values, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_review_status between", value1, value2, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawReviewStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_review_status not between", value1, value2, "withdrawReviewStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDelayTimesIsNull() {
            addCriterion("delay_times is null");
            return (Criteria) this;
        }

        public Criteria andDelayTimesIsNotNull() {
            addCriterion("delay_times is not null");
            return (Criteria) this;
        }

        public Criteria andDelayTimesEqualTo(Integer value) {
            addCriterion("delay_times =", value, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andDelayTimesNotEqualTo(Integer value) {
            addCriterion("delay_times <>", value, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andDelayTimesGreaterThan(Integer value) {
            addCriterion("delay_times >", value, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andDelayTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("delay_times >=", value, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andDelayTimesLessThan(Integer value) {
            addCriterion("delay_times <", value, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andDelayTimesLessThanOrEqualTo(Integer value) {
            addCriterion("delay_times <=", value, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andDelayTimesIn(List<Integer> values) {
            addCriterion("delay_times in", values, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andDelayTimesNotIn(List<Integer> values) {
            addCriterion("delay_times not in", values, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andDelayTimesBetween(Integer value1, Integer value2) {
            addCriterion("delay_times between", value1, value2, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andDelayTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("delay_times not between", value1, value2, "delayTimes");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andDelayStatusIsNull() {
            addCriterion("delay_status is null");
            return (Criteria) this;
        }

        public Criteria andDelayStatusIsNotNull() {
            addCriterion("delay_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelayStatusEqualTo(Byte value) {
            addCriterion("delay_status =", value, "delayStatus");
            return (Criteria) this;
        }

        public Criteria andDelayStatusNotEqualTo(Byte value) {
            addCriterion("delay_status <>", value, "delayStatus");
            return (Criteria) this;
        }

        public Criteria andDelayStatusGreaterThan(Byte value) {
            addCriterion("delay_status >", value, "delayStatus");
            return (Criteria) this;
        }

        public Criteria andDelayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("delay_status >=", value, "delayStatus");
            return (Criteria) this;
        }

        public Criteria andDelayStatusLessThan(Byte value) {
            addCriterion("delay_status <", value, "delayStatus");
            return (Criteria) this;
        }

        public Criteria andDelayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("delay_status <=", value, "delayStatus");
            return (Criteria) this;
        }

        public Criteria andDelayStatusIn(List<Byte> values) {
            addCriterion("delay_status in", values, "delayStatus");
            return (Criteria) this;
        }

        public Criteria andDelayStatusNotIn(List<Byte> values) {
            addCriterion("delay_status not in", values, "delayStatus");
            return (Criteria) this;
        }

        public Criteria andDelayStatusBetween(Byte value1, Byte value2) {
            addCriterion("delay_status between", value1, value2, "delayStatus");
            return (Criteria) this;
        }

        public Criteria andDelayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("delay_status not between", value1, value2, "delayStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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