package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OBillExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OBillExample() {
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

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(String value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(String value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(String value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(String value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(String value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLike(String value) {
            addCriterion("bill_id like", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotLike(String value) {
            addCriterion("bill_id not like", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<String> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<String> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(String value1, String value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(String value1, String value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
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

        public Criteria andBizOrderIdIsNull() {
            addCriterion("biz_order_id is null");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdIsNotNull() {
            addCriterion("biz_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdEqualTo(String value) {
            addCriterion("biz_order_id =", value, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdNotEqualTo(String value) {
            addCriterion("biz_order_id <>", value, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdGreaterThan(String value) {
            addCriterion("biz_order_id >", value, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("biz_order_id >=", value, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdLessThan(String value) {
            addCriterion("biz_order_id <", value, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdLessThanOrEqualTo(String value) {
            addCriterion("biz_order_id <=", value, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdLike(String value) {
            addCriterion("biz_order_id like", value, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdNotLike(String value) {
            addCriterion("biz_order_id not like", value, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdIn(List<String> values) {
            addCriterion("biz_order_id in", values, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdNotIn(List<String> values) {
            addCriterion("biz_order_id not in", values, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdBetween(String value1, String value2) {
            addCriterion("biz_order_id between", value1, value2, "bizOrderId");
            return (Criteria) this;
        }

        public Criteria andBizOrderIdNotBetween(String value1, String value2) {
            addCriterion("biz_order_id not between", value1, value2, "bizOrderId");
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

        public Criteria andTradeAmountIsNull() {
            addCriterion("trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(BigDecimal value) {
            addCriterion("trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(BigDecimal value) {
            addCriterion("trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(BigDecimal value) {
            addCriterion("trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(BigDecimal value) {
            addCriterion("trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<BigDecimal> values) {
            addCriterion("trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<BigDecimal> values) {
            addCriterion("trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeIsNull() {
            addCriterion("trade_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeIsNotNull() {
            addCriterion("trade_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("trade_create_time =", value, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("trade_create_time <>", value, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("trade_create_time >", value, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("trade_create_time >=", value, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeLessThan(LocalDateTime value) {
            addCriterion("trade_create_time <", value, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("trade_create_time <=", value, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("trade_create_time in", values, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("trade_create_time not in", values, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("trade_create_time between", value1, value2, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("trade_create_time not between", value1, value2, "tradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeIsNull() {
            addCriterion("trade_over_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeIsNotNull() {
            addCriterion("trade_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeEqualTo(LocalDateTime value) {
            addCriterion("trade_over_time =", value, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeNotEqualTo(LocalDateTime value) {
            addCriterion("trade_over_time <>", value, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeGreaterThan(LocalDateTime value) {
            addCriterion("trade_over_time >", value, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("trade_over_time >=", value, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeLessThan(LocalDateTime value) {
            addCriterion("trade_over_time <", value, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("trade_over_time <=", value, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeIn(List<LocalDateTime> values) {
            addCriterion("trade_over_time in", values, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeNotIn(List<LocalDateTime> values) {
            addCriterion("trade_over_time not in", values, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("trade_over_time between", value1, value2, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andTradeOverTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("trade_over_time not between", value1, value2, "tradeOverTime");
            return (Criteria) this;
        }

        public Criteria andFlowTypeIsNull() {
            addCriterion("flow_type is null");
            return (Criteria) this;
        }

        public Criteria andFlowTypeIsNotNull() {
            addCriterion("flow_type is not null");
            return (Criteria) this;
        }

        public Criteria andFlowTypeEqualTo(Byte value) {
            addCriterion("flow_type =", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotEqualTo(Byte value) {
            addCriterion("flow_type <>", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeGreaterThan(Byte value) {
            addCriterion("flow_type >", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("flow_type >=", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeLessThan(Byte value) {
            addCriterion("flow_type <", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeLessThanOrEqualTo(Byte value) {
            addCriterion("flow_type <=", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeIn(List<Byte> values) {
            addCriterion("flow_type in", values, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotIn(List<Byte> values) {
            addCriterion("flow_type not in", values, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeBetween(Byte value1, Byte value2) {
            addCriterion("flow_type between", value1, value2, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("flow_type not between", value1, value2, "flowType");
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

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Byte value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Byte value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Byte value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Byte value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Byte> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Byte> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
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

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(Byte value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(Byte value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(Byte value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(Byte value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(Byte value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<Byte> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<Byte> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(Byte value1, Byte value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
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

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(Boolean value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(Boolean value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(Boolean value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(Boolean value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<Boolean> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<Boolean> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
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