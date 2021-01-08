package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OWithdrawExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OWithdrawExample() {
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

        public Criteria andWithdrawIdIsNull() {
            addCriterion("withdraw_id is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIsNotNull() {
            addCriterion("withdraw_id is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdEqualTo(String value) {
            addCriterion("withdraw_id =", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotEqualTo(String value) {
            addCriterion("withdraw_id <>", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThan(String value) {
            addCriterion("withdraw_id >", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_id >=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThan(String value) {
            addCriterion("withdraw_id <", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThanOrEqualTo(String value) {
            addCriterion("withdraw_id <=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLike(String value) {
            addCriterion("withdraw_id like", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotLike(String value) {
            addCriterion("withdraw_id not like", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIn(List<String> values) {
            addCriterion("withdraw_id in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotIn(List<String> values) {
            addCriterion("withdraw_id not in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdBetween(String value1, String value2) {
            addCriterion("withdraw_id between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotBetween(String value1, String value2) {
            addCriterion("withdraw_id not between", value1, value2, "withdrawId");
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

        public Criteria andWithdrawWayIsNull() {
            addCriterion("withdraw_way is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayIsNotNull() {
            addCriterion("withdraw_way is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayEqualTo(String value) {
            addCriterion("withdraw_way =", value, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayNotEqualTo(String value) {
            addCriterion("withdraw_way <>", value, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayGreaterThan(String value) {
            addCriterion("withdraw_way >", value, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_way >=", value, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayLessThan(String value) {
            addCriterion("withdraw_way <", value, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayLessThanOrEqualTo(String value) {
            addCriterion("withdraw_way <=", value, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayLike(String value) {
            addCriterion("withdraw_way like", value, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayNotLike(String value) {
            addCriterion("withdraw_way not like", value, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayIn(List<String> values) {
            addCriterion("withdraw_way in", values, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayNotIn(List<String> values) {
            addCriterion("withdraw_way not in", values, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayBetween(String value1, String value2) {
            addCriterion("withdraw_way between", value1, value2, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawWayNotBetween(String value1, String value2) {
            addCriterion("withdraw_way not between", value1, value2, "withdrawWay");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelIsNull() {
            addCriterion("withdraw_channel is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelIsNotNull() {
            addCriterion("withdraw_channel is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelEqualTo(String value) {
            addCriterion("withdraw_channel =", value, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelNotEqualTo(String value) {
            addCriterion("withdraw_channel <>", value, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelGreaterThan(String value) {
            addCriterion("withdraw_channel >", value, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_channel >=", value, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelLessThan(String value) {
            addCriterion("withdraw_channel <", value, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelLessThanOrEqualTo(String value) {
            addCriterion("withdraw_channel <=", value, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelLike(String value) {
            addCriterion("withdraw_channel like", value, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelNotLike(String value) {
            addCriterion("withdraw_channel not like", value, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelIn(List<String> values) {
            addCriterion("withdraw_channel in", values, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelNotIn(List<String> values) {
            addCriterion("withdraw_channel not in", values, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelBetween(String value1, String value2) {
            addCriterion("withdraw_channel between", value1, value2, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawChannelNotBetween(String value1, String value2) {
            addCriterion("withdraw_channel not between", value1, value2, "withdrawChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelIsNull() {
            addCriterion("withdraw_third_party_channel is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelIsNotNull() {
            addCriterion("withdraw_third_party_channel is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelEqualTo(String value) {
            addCriterion("withdraw_third_party_channel =", value, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelNotEqualTo(String value) {
            addCriterion("withdraw_third_party_channel <>", value, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelGreaterThan(String value) {
            addCriterion("withdraw_third_party_channel >", value, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_third_party_channel >=", value, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelLessThan(String value) {
            addCriterion("withdraw_third_party_channel <", value, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelLessThanOrEqualTo(String value) {
            addCriterion("withdraw_third_party_channel <=", value, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelLike(String value) {
            addCriterion("withdraw_third_party_channel like", value, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelNotLike(String value) {
            addCriterion("withdraw_third_party_channel not like", value, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelIn(List<String> values) {
            addCriterion("withdraw_third_party_channel in", values, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelNotIn(List<String> values) {
            addCriterion("withdraw_third_party_channel not in", values, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelBetween(String value1, String value2) {
            addCriterion("withdraw_third_party_channel between", value1, value2, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawThirdPartyChannelNotBetween(String value1, String value2) {
            addCriterion("withdraw_third_party_channel not between", value1, value2, "withdrawThirdPartyChannel");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultIsNull() {
            addCriterion("withdraw_result is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultIsNotNull() {
            addCriterion("withdraw_result is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultEqualTo(String value) {
            addCriterion("withdraw_result =", value, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultNotEqualTo(String value) {
            addCriterion("withdraw_result <>", value, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultGreaterThan(String value) {
            addCriterion("withdraw_result >", value, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_result >=", value, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultLessThan(String value) {
            addCriterion("withdraw_result <", value, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultLessThanOrEqualTo(String value) {
            addCriterion("withdraw_result <=", value, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultLike(String value) {
            addCriterion("withdraw_result like", value, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultNotLike(String value) {
            addCriterion("withdraw_result not like", value, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultIn(List<String> values) {
            addCriterion("withdraw_result in", values, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultNotIn(List<String> values) {
            addCriterion("withdraw_result not in", values, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultBetween(String value1, String value2) {
            addCriterion("withdraw_result between", value1, value2, "withdrawResult");
            return (Criteria) this;
        }

        public Criteria andWithdrawResultNotBetween(String value1, String value2) {
            addCriterion("withdraw_result not between", value1, value2, "withdrawResult");
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

        public Criteria andAccouneNameIsNull() {
            addCriterion("accoune_name is null");
            return (Criteria) this;
        }

        public Criteria andAccouneNameIsNotNull() {
            addCriterion("accoune_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccouneNameEqualTo(String value) {
            addCriterion("accoune_name =", value, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameNotEqualTo(String value) {
            addCriterion("accoune_name <>", value, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameGreaterThan(String value) {
            addCriterion("accoune_name >", value, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameGreaterThanOrEqualTo(String value) {
            addCriterion("accoune_name >=", value, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameLessThan(String value) {
            addCriterion("accoune_name <", value, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameLessThanOrEqualTo(String value) {
            addCriterion("accoune_name <=", value, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameLike(String value) {
            addCriterion("accoune_name like", value, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameNotLike(String value) {
            addCriterion("accoune_name not like", value, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameIn(List<String> values) {
            addCriterion("accoune_name in", values, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameNotIn(List<String> values) {
            addCriterion("accoune_name not in", values, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameBetween(String value1, String value2) {
            addCriterion("accoune_name between", value1, value2, "accouneName");
            return (Criteria) this;
        }

        public Criteria andAccouneNameNotBetween(String value1, String value2) {
            addCriterion("accoune_name not between", value1, value2, "accouneName");
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

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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