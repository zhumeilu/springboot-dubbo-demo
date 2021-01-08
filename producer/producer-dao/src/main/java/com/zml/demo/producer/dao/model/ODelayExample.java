package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ODelayExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ODelayExample() {
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

        public Criteria andDelayIdIsNull() {
            addCriterion("delay_id is null");
            return (Criteria) this;
        }

        public Criteria andDelayIdIsNotNull() {
            addCriterion("delay_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelayIdEqualTo(String value) {
            addCriterion("delay_id =", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotEqualTo(String value) {
            addCriterion("delay_id <>", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdGreaterThan(String value) {
            addCriterion("delay_id >", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdGreaterThanOrEqualTo(String value) {
            addCriterion("delay_id >=", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdLessThan(String value) {
            addCriterion("delay_id <", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdLessThanOrEqualTo(String value) {
            addCriterion("delay_id <=", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdLike(String value) {
            addCriterion("delay_id like", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotLike(String value) {
            addCriterion("delay_id not like", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdIn(List<String> values) {
            addCriterion("delay_id in", values, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotIn(List<String> values) {
            addCriterion("delay_id not in", values, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdBetween(String value1, String value2) {
            addCriterion("delay_id between", value1, value2, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotBetween(String value1, String value2) {
            addCriterion("delay_id not between", value1, value2, "delayId");
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

        public Criteria andThirdOrderIdIsNull() {
            addCriterion("third_order_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdIsNotNull() {
            addCriterion("third_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdEqualTo(String value) {
            addCriterion("third_order_id =", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdNotEqualTo(String value) {
            addCriterion("third_order_id <>", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdGreaterThan(String value) {
            addCriterion("third_order_id >", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_order_id >=", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdLessThan(String value) {
            addCriterion("third_order_id <", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdLessThanOrEqualTo(String value) {
            addCriterion("third_order_id <=", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdLike(String value) {
            addCriterion("third_order_id like", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdNotLike(String value) {
            addCriterion("third_order_id not like", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdIn(List<String> values) {
            addCriterion("third_order_id in", values, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdNotIn(List<String> values) {
            addCriterion("third_order_id not in", values, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdBetween(String value1, String value2) {
            addCriterion("third_order_id between", value1, value2, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdNotBetween(String value1, String value2) {
            addCriterion("third_order_id not between", value1, value2, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(String value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(String value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(String value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(String value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(String value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLike(String value) {
            addCriterion("payment_id like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotLike(String value) {
            addCriterion("payment_id not like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<String> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<String> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(String value1, String value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(String value1, String value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Byte value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Byte value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Byte value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Byte value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Byte> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Byte> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Byte value1, Byte value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
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

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(LocalDateTime value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(LocalDateTime value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(LocalDateTime value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(LocalDateTime value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<LocalDateTime> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<LocalDateTime> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeIsNull() {
            addCriterion("user_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeIsNotNull() {
            addCriterion("user_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeEqualTo(LocalDateTime value) {
            addCriterion("user_pay_time =", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeNotEqualTo(LocalDateTime value) {
            addCriterion("user_pay_time <>", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeGreaterThan(LocalDateTime value) {
            addCriterion("user_pay_time >", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_pay_time >=", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeLessThan(LocalDateTime value) {
            addCriterion("user_pay_time <", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_pay_time <=", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeIn(List<LocalDateTime> values) {
            addCriterion("user_pay_time in", values, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeNotIn(List<LocalDateTime> values) {
            addCriterion("user_pay_time not in", values, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_pay_time between", value1, value2, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_pay_time not between", value1, value2, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(LocalDateTime value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(LocalDateTime value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(LocalDateTime value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(LocalDateTime value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<LocalDateTime> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<LocalDateTime> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
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

        public Criteria andShouldReturnAmountIsNull() {
            addCriterion("should_return_amount is null");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountIsNotNull() {
            addCriterion("should_return_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountEqualTo(BigDecimal value) {
            addCriterion("should_return_amount =", value, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountNotEqualTo(BigDecimal value) {
            addCriterion("should_return_amount <>", value, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountGreaterThan(BigDecimal value) {
            addCriterion("should_return_amount >", value, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("should_return_amount >=", value, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountLessThan(BigDecimal value) {
            addCriterion("should_return_amount <", value, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("should_return_amount <=", value, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountIn(List<BigDecimal> values) {
            addCriterion("should_return_amount in", values, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountNotIn(List<BigDecimal> values) {
            addCriterion("should_return_amount not in", values, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_return_amount between", value1, value2, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andShouldReturnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_return_amount not between", value1, value2, "shouldReturnAmount");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlIsNull() {
            addCriterion("pay_proof_url is null");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlIsNotNull() {
            addCriterion("pay_proof_url is not null");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlEqualTo(String value) {
            addCriterion("pay_proof_url =", value, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlNotEqualTo(String value) {
            addCriterion("pay_proof_url <>", value, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlGreaterThan(String value) {
            addCriterion("pay_proof_url >", value, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pay_proof_url >=", value, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlLessThan(String value) {
            addCriterion("pay_proof_url <", value, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlLessThanOrEqualTo(String value) {
            addCriterion("pay_proof_url <=", value, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlLike(String value) {
            addCriterion("pay_proof_url like", value, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlNotLike(String value) {
            addCriterion("pay_proof_url not like", value, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlIn(List<String> values) {
            addCriterion("pay_proof_url in", values, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlNotIn(List<String> values) {
            addCriterion("pay_proof_url not in", values, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlBetween(String value1, String value2) {
            addCriterion("pay_proof_url between", value1, value2, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofUrlNotBetween(String value1, String value2) {
            addCriterion("pay_proof_url not between", value1, value2, "payProofUrl");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusIsNull() {
            addCriterion("pay_proof_status is null");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusIsNotNull() {
            addCriterion("pay_proof_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusEqualTo(Byte value) {
            addCriterion("pay_proof_status =", value, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusNotEqualTo(Byte value) {
            addCriterion("pay_proof_status <>", value, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusGreaterThan(Byte value) {
            addCriterion("pay_proof_status >", value, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_proof_status >=", value, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusLessThan(Byte value) {
            addCriterion("pay_proof_status <", value, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pay_proof_status <=", value, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusIn(List<Byte> values) {
            addCriterion("pay_proof_status in", values, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusNotIn(List<Byte> values) {
            addCriterion("pay_proof_status not in", values, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusBetween(Byte value1, Byte value2) {
            addCriterion("pay_proof_status between", value1, value2, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andPayProofStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_proof_status not between", value1, value2, "payProofStatus");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(LocalDateTime value) {
            addCriterion("upload_time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(LocalDateTime value) {
            addCriterion("upload_time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(LocalDateTime value) {
            addCriterion("upload_time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("upload_time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(LocalDateTime value) {
            addCriterion("upload_time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("upload_time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<LocalDateTime> values) {
            addCriterion("upload_time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<LocalDateTime> values) {
            addCriterion("upload_time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("upload_time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("upload_time not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("pay_way like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("pay_way not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("payer is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("payer is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("payer =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("payer <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("payer >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("payer >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("payer <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("payer <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("payer like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("payer not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("payer in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("payer not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("payer between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("payer not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNull() {
            addCriterion("payee is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("payee is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(String value) {
            addCriterion("payee =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(String value) {
            addCriterion("payee <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(String value) {
            addCriterion("payee >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("payee >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(String value) {
            addCriterion("payee <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(String value) {
            addCriterion("payee <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLike(String value) {
            addCriterion("payee like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotLike(String value) {
            addCriterion("payee not like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<String> values) {
            addCriterion("payee in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<String> values) {
            addCriterion("payee not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(String value1, String value2) {
            addCriterion("payee between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(String value1, String value2) {
            addCriterion("payee not between", value1, value2, "payee");
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

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankBranchIsNull() {
            addCriterion("bank_branch is null");
            return (Criteria) this;
        }

        public Criteria andBankBranchIsNotNull() {
            addCriterion("bank_branch is not null");
            return (Criteria) this;
        }

        public Criteria andBankBranchEqualTo(String value) {
            addCriterion("bank_branch =", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotEqualTo(String value) {
            addCriterion("bank_branch <>", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchGreaterThan(String value) {
            addCriterion("bank_branch >", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchGreaterThanOrEqualTo(String value) {
            addCriterion("bank_branch >=", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLessThan(String value) {
            addCriterion("bank_branch <", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLessThanOrEqualTo(String value) {
            addCriterion("bank_branch <=", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLike(String value) {
            addCriterion("bank_branch like", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotLike(String value) {
            addCriterion("bank_branch not like", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchIn(List<String> values) {
            addCriterion("bank_branch in", values, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotIn(List<String> values) {
            addCriterion("bank_branch not in", values, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchBetween(String value1, String value2) {
            addCriterion("bank_branch between", value1, value2, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotBetween(String value1, String value2) {
            addCriterion("bank_branch not between", value1, value2, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("account_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("account_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("account_no =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("account_no <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("account_no >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("account_no <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("account_no like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("account_no not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("account_no in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("account_no not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThIsNull() {
            addCriterion("bank_card_first_name_th is null");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThIsNotNull() {
            addCriterion("bank_card_first_name_th is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThEqualTo(String value) {
            addCriterion("bank_card_first_name_th =", value, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThNotEqualTo(String value) {
            addCriterion("bank_card_first_name_th <>", value, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThGreaterThan(String value) {
            addCriterion("bank_card_first_name_th >", value, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_first_name_th >=", value, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThLessThan(String value) {
            addCriterion("bank_card_first_name_th <", value, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThLessThanOrEqualTo(String value) {
            addCriterion("bank_card_first_name_th <=", value, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThLike(String value) {
            addCriterion("bank_card_first_name_th like", value, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThNotLike(String value) {
            addCriterion("bank_card_first_name_th not like", value, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThIn(List<String> values) {
            addCriterion("bank_card_first_name_th in", values, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThNotIn(List<String> values) {
            addCriterion("bank_card_first_name_th not in", values, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThBetween(String value1, String value2) {
            addCriterion("bank_card_first_name_th between", value1, value2, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameThNotBetween(String value1, String value2) {
            addCriterion("bank_card_first_name_th not between", value1, value2, "bankCardFirstNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThIsNull() {
            addCriterion("bank_card_last_name_th is null");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThIsNotNull() {
            addCriterion("bank_card_last_name_th is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThEqualTo(String value) {
            addCriterion("bank_card_last_name_th =", value, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThNotEqualTo(String value) {
            addCriterion("bank_card_last_name_th <>", value, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThGreaterThan(String value) {
            addCriterion("bank_card_last_name_th >", value, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_last_name_th >=", value, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThLessThan(String value) {
            addCriterion("bank_card_last_name_th <", value, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThLessThanOrEqualTo(String value) {
            addCriterion("bank_card_last_name_th <=", value, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThLike(String value) {
            addCriterion("bank_card_last_name_th like", value, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThNotLike(String value) {
            addCriterion("bank_card_last_name_th not like", value, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThIn(List<String> values) {
            addCriterion("bank_card_last_name_th in", values, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThNotIn(List<String> values) {
            addCriterion("bank_card_last_name_th not in", values, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThBetween(String value1, String value2) {
            addCriterion("bank_card_last_name_th between", value1, value2, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameThNotBetween(String value1, String value2) {
            addCriterion("bank_card_last_name_th not between", value1, value2, "bankCardLastNameTh");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnIsNull() {
            addCriterion("bank_card_first_name_en is null");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnIsNotNull() {
            addCriterion("bank_card_first_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnEqualTo(String value) {
            addCriterion("bank_card_first_name_en =", value, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnNotEqualTo(String value) {
            addCriterion("bank_card_first_name_en <>", value, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnGreaterThan(String value) {
            addCriterion("bank_card_first_name_en >", value, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_first_name_en >=", value, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnLessThan(String value) {
            addCriterion("bank_card_first_name_en <", value, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnLessThanOrEqualTo(String value) {
            addCriterion("bank_card_first_name_en <=", value, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnLike(String value) {
            addCriterion("bank_card_first_name_en like", value, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnNotLike(String value) {
            addCriterion("bank_card_first_name_en not like", value, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnIn(List<String> values) {
            addCriterion("bank_card_first_name_en in", values, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnNotIn(List<String> values) {
            addCriterion("bank_card_first_name_en not in", values, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnBetween(String value1, String value2) {
            addCriterion("bank_card_first_name_en between", value1, value2, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardFirstNameEnNotBetween(String value1, String value2) {
            addCriterion("bank_card_first_name_en not between", value1, value2, "bankCardFirstNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnIsNull() {
            addCriterion("bank_card_last_name_en is null");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnIsNotNull() {
            addCriterion("bank_card_last_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnEqualTo(String value) {
            addCriterion("bank_card_last_name_en =", value, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnNotEqualTo(String value) {
            addCriterion("bank_card_last_name_en <>", value, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnGreaterThan(String value) {
            addCriterion("bank_card_last_name_en >", value, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_last_name_en >=", value, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnLessThan(String value) {
            addCriterion("bank_card_last_name_en <", value, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnLessThanOrEqualTo(String value) {
            addCriterion("bank_card_last_name_en <=", value, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnLike(String value) {
            addCriterion("bank_card_last_name_en like", value, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnNotLike(String value) {
            addCriterion("bank_card_last_name_en not like", value, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnIn(List<String> values) {
            addCriterion("bank_card_last_name_en in", values, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnNotIn(List<String> values) {
            addCriterion("bank_card_last_name_en not in", values, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnBetween(String value1, String value2) {
            addCriterion("bank_card_last_name_en between", value1, value2, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andBankCardLastNameEnNotBetween(String value1, String value2) {
            addCriterion("bank_card_last_name_en not between", value1, value2, "bankCardLastNameEn");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andPayResultIsNull() {
            addCriterion("pay_result is null");
            return (Criteria) this;
        }

        public Criteria andPayResultIsNotNull() {
            addCriterion("pay_result is not null");
            return (Criteria) this;
        }

        public Criteria andPayResultEqualTo(String value) {
            addCriterion("pay_result =", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotEqualTo(String value) {
            addCriterion("pay_result <>", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultGreaterThan(String value) {
            addCriterion("pay_result >", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultGreaterThanOrEqualTo(String value) {
            addCriterion("pay_result >=", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLessThan(String value) {
            addCriterion("pay_result <", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLessThanOrEqualTo(String value) {
            addCriterion("pay_result <=", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLike(String value) {
            addCriterion("pay_result like", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotLike(String value) {
            addCriterion("pay_result not like", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultIn(List<String> values) {
            addCriterion("pay_result in", values, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotIn(List<String> values) {
            addCriterion("pay_result not in", values, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultBetween(String value1, String value2) {
            addCriterion("pay_result between", value1, value2, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotBetween(String value1, String value2) {
            addCriterion("pay_result not between", value1, value2, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("pay_channel like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("pay_channel not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelIsNull() {
            addCriterion("pay_third_party_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelIsNotNull() {
            addCriterion("pay_third_party_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelEqualTo(String value) {
            addCriterion("pay_third_party_channel =", value, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelNotEqualTo(String value) {
            addCriterion("pay_third_party_channel <>", value, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelGreaterThan(String value) {
            addCriterion("pay_third_party_channel >", value, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelGreaterThanOrEqualTo(String value) {
            addCriterion("pay_third_party_channel >=", value, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelLessThan(String value) {
            addCriterion("pay_third_party_channel <", value, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelLessThanOrEqualTo(String value) {
            addCriterion("pay_third_party_channel <=", value, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelLike(String value) {
            addCriterion("pay_third_party_channel like", value, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelNotLike(String value) {
            addCriterion("pay_third_party_channel not like", value, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelIn(List<String> values) {
            addCriterion("pay_third_party_channel in", values, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelNotIn(List<String> values) {
            addCriterion("pay_third_party_channel not in", values, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelBetween(String value1, String value2) {
            addCriterion("pay_third_party_channel between", value1, value2, "payThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andPayThirdPartyChannelNotBetween(String value1, String value2) {
            addCriterion("pay_third_party_channel not between", value1, value2, "payThirdPartyChannel");
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

        public Criteria andCompanyBankNameIsNull() {
            addCriterion("company_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameIsNotNull() {
            addCriterion("company_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameEqualTo(String value) {
            addCriterion("company_bank_name =", value, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameNotEqualTo(String value) {
            addCriterion("company_bank_name <>", value, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameGreaterThan(String value) {
            addCriterion("company_bank_name >", value, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_bank_name >=", value, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameLessThan(String value) {
            addCriterion("company_bank_name <", value, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameLessThanOrEqualTo(String value) {
            addCriterion("company_bank_name <=", value, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameLike(String value) {
            addCriterion("company_bank_name like", value, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameNotLike(String value) {
            addCriterion("company_bank_name not like", value, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameIn(List<String> values) {
            addCriterion("company_bank_name in", values, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameNotIn(List<String> values) {
            addCriterion("company_bank_name not in", values, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameBetween(String value1, String value2) {
            addCriterion("company_bank_name between", value1, value2, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankNameNotBetween(String value1, String value2) {
            addCriterion("company_bank_name not between", value1, value2, "companyBankName");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoIsNull() {
            addCriterion("company_account_no is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoIsNotNull() {
            addCriterion("company_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoEqualTo(String value) {
            addCriterion("company_account_no =", value, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoNotEqualTo(String value) {
            addCriterion("company_account_no <>", value, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoGreaterThan(String value) {
            addCriterion("company_account_no >", value, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("company_account_no >=", value, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoLessThan(String value) {
            addCriterion("company_account_no <", value, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoLessThanOrEqualTo(String value) {
            addCriterion("company_account_no <=", value, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoLike(String value) {
            addCriterion("company_account_no like", value, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoNotLike(String value) {
            addCriterion("company_account_no not like", value, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoIn(List<String> values) {
            addCriterion("company_account_no in", values, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoNotIn(List<String> values) {
            addCriterion("company_account_no not in", values, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoBetween(String value1, String value2) {
            addCriterion("company_account_no between", value1, value2, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNoNotBetween(String value1, String value2) {
            addCriterion("company_account_no not between", value1, value2, "companyAccountNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchIsNull() {
            addCriterion("company_bank_branch is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchIsNotNull() {
            addCriterion("company_bank_branch is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchEqualTo(String value) {
            addCriterion("company_bank_branch =", value, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchNotEqualTo(String value) {
            addCriterion("company_bank_branch <>", value, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchGreaterThan(String value) {
            addCriterion("company_bank_branch >", value, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchGreaterThanOrEqualTo(String value) {
            addCriterion("company_bank_branch >=", value, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchLessThan(String value) {
            addCriterion("company_bank_branch <", value, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchLessThanOrEqualTo(String value) {
            addCriterion("company_bank_branch <=", value, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchLike(String value) {
            addCriterion("company_bank_branch like", value, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchNotLike(String value) {
            addCriterion("company_bank_branch not like", value, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchIn(List<String> values) {
            addCriterion("company_bank_branch in", values, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchNotIn(List<String> values) {
            addCriterion("company_bank_branch not in", values, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchBetween(String value1, String value2) {
            addCriterion("company_bank_branch between", value1, value2, "companyBankBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBankBranchNotBetween(String value1, String value2) {
            addCriterion("company_bank_branch not between", value1, value2, "companyBankBranch");
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