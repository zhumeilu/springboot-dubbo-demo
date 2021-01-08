package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OUrgeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OUrgeExample() {
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

        public Criteria andUrgeIdIsNull() {
            addCriterion("urge_id is null");
            return (Criteria) this;
        }

        public Criteria andUrgeIdIsNotNull() {
            addCriterion("urge_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrgeIdEqualTo(String value) {
            addCriterion("urge_id =", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdNotEqualTo(String value) {
            addCriterion("urge_id <>", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdGreaterThan(String value) {
            addCriterion("urge_id >", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdGreaterThanOrEqualTo(String value) {
            addCriterion("urge_id >=", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdLessThan(String value) {
            addCriterion("urge_id <", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdLessThanOrEqualTo(String value) {
            addCriterion("urge_id <=", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdLike(String value) {
            addCriterion("urge_id like", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdNotLike(String value) {
            addCriterion("urge_id not like", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdIn(List<String> values) {
            addCriterion("urge_id in", values, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdNotIn(List<String> values) {
            addCriterion("urge_id not in", values, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdBetween(String value1, String value2) {
            addCriterion("urge_id between", value1, value2, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdNotBetween(String value1, String value2) {
            addCriterion("urge_id not between", value1, value2, "urgeId");
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

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(LocalDateTime value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(LocalDateTime value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(LocalDateTime value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(LocalDateTime value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<LocalDateTime> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<LocalDateTime> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
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

        public Criteria andOverdueAmountIsNull() {
            addCriterion("overdue_amount is null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIsNotNull() {
            addCriterion("overdue_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountEqualTo(BigDecimal value) {
            addCriterion("overdue_amount =", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotEqualTo(BigDecimal value) {
            addCriterion("overdue_amount <>", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThan(BigDecimal value) {
            addCriterion("overdue_amount >", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_amount >=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThan(BigDecimal value) {
            addCriterion("overdue_amount <", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_amount <=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIn(List<BigDecimal> values) {
            addCriterion("overdue_amount in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotIn(List<BigDecimal> values) {
            addCriterion("overdue_amount not in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_amount between", value1, value2, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_amount not between", value1, value2, "overdueAmount");
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

        public Criteria andStageChangeTimeIsNull() {
            addCriterion("stage_change_time is null");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeIsNotNull() {
            addCriterion("stage_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeEqualTo(LocalDateTime value) {
            addCriterion("stage_change_time =", value, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeNotEqualTo(LocalDateTime value) {
            addCriterion("stage_change_time <>", value, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeGreaterThan(LocalDateTime value) {
            addCriterion("stage_change_time >", value, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("stage_change_time >=", value, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeLessThan(LocalDateTime value) {
            addCriterion("stage_change_time <", value, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("stage_change_time <=", value, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeIn(List<LocalDateTime> values) {
            addCriterion("stage_change_time in", values, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeNotIn(List<LocalDateTime> values) {
            addCriterion("stage_change_time not in", values, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("stage_change_time between", value1, value2, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageChangeTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("stage_change_time not between", value1, value2, "stageChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeIsNull() {
            addCriterion("operator_change_time is null");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeIsNotNull() {
            addCriterion("operator_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeEqualTo(LocalDateTime value) {
            addCriterion("operator_change_time =", value, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeNotEqualTo(LocalDateTime value) {
            addCriterion("operator_change_time <>", value, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeGreaterThan(LocalDateTime value) {
            addCriterion("operator_change_time >", value, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("operator_change_time >=", value, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeLessThan(LocalDateTime value) {
            addCriterion("operator_change_time <", value, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("operator_change_time <=", value, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeIn(List<LocalDateTime> values) {
            addCriterion("operator_change_time in", values, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeNotIn(List<LocalDateTime> values) {
            addCriterion("operator_change_time not in", values, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("operator_change_time between", value1, value2, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andOperatorChangeTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("operator_change_time not between", value1, value2, "operatorChangeTime");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("stage is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("stage is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("stage =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("stage <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("stage >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("stage >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("stage <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("stage <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("stage like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("stage not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("stage in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("stage not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("stage between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("stage not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Boolean value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Boolean value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Boolean value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Boolean value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Boolean value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Boolean> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Boolean> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
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

        public Criteria andRepayTimeIsNull() {
            addCriterion("repay_time is null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIsNotNull() {
            addCriterion("repay_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeEqualTo(LocalDateTime value) {
            addCriterion("repay_time =", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotEqualTo(LocalDateTime value) {
            addCriterion("repay_time <>", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThan(LocalDateTime value) {
            addCriterion("repay_time >", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("repay_time >=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThan(LocalDateTime value) {
            addCriterion("repay_time <", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("repay_time <=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIn(List<LocalDateTime> values) {
            addCriterion("repay_time in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotIn(List<LocalDateTime> values) {
            addCriterion("repay_time not in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("repay_time between", value1, value2, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("repay_time not between", value1, value2, "repayTime");
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

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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

        public Criteria andOverdueDaysIsNull() {
            addCriterion("overdue_days is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNotNull() {
            addCriterion("overdue_days is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysEqualTo(Integer value) {
            addCriterion("overdue_days =", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotEqualTo(Integer value) {
            addCriterion("overdue_days <>", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThan(Integer value) {
            addCriterion("overdue_days >", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_days >=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThan(Integer value) {
            addCriterion("overdue_days <", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_days <=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIn(List<Integer> values) {
            addCriterion("overdue_days in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotIn(List<Integer> values) {
            addCriterion("overdue_days not in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysBetween(Integer value1, Integer value2) {
            addCriterion("overdue_days between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_days not between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorIsNull() {
            addCriterion("urge_operator is null");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorIsNotNull() {
            addCriterion("urge_operator is not null");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorEqualTo(String value) {
            addCriterion("urge_operator =", value, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorNotEqualTo(String value) {
            addCriterion("urge_operator <>", value, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorGreaterThan(String value) {
            addCriterion("urge_operator >", value, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("urge_operator >=", value, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorLessThan(String value) {
            addCriterion("urge_operator <", value, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorLessThanOrEqualTo(String value) {
            addCriterion("urge_operator <=", value, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorLike(String value) {
            addCriterion("urge_operator like", value, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorNotLike(String value) {
            addCriterion("urge_operator not like", value, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorIn(List<String> values) {
            addCriterion("urge_operator in", values, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorNotIn(List<String> values) {
            addCriterion("urge_operator not in", values, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorBetween(String value1, String value2) {
            addCriterion("urge_operator between", value1, value2, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andUrgeOperatorNotBetween(String value1, String value2) {
            addCriterion("urge_operator not between", value1, value2, "urgeOperator");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeIsNull() {
            addCriterion("last_follow_time is null");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeIsNotNull() {
            addCriterion("last_follow_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeEqualTo(LocalDateTime value) {
            addCriterion("last_follow_time =", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeNotEqualTo(LocalDateTime value) {
            addCriterion("last_follow_time <>", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeGreaterThan(LocalDateTime value) {
            addCriterion("last_follow_time >", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_follow_time >=", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeLessThan(LocalDateTime value) {
            addCriterion("last_follow_time <", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_follow_time <=", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeIn(List<LocalDateTime> values) {
            addCriterion("last_follow_time in", values, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeNotIn(List<LocalDateTime> values) {
            addCriterion("last_follow_time not in", values, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_follow_time between", value1, value2, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_follow_time not between", value1, value2, "lastFollowTime");
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

        public Criteria andLabelIdIsNull() {
            addCriterion("label_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNotNull() {
            addCriterion("label_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIdEqualTo(Integer value) {
            addCriterion("label_id =", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotEqualTo(Integer value) {
            addCriterion("label_id <>", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThan(Integer value) {
            addCriterion("label_id >", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_id >=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThan(Integer value) {
            addCriterion("label_id <", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThanOrEqualTo(Integer value) {
            addCriterion("label_id <=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdIn(List<Integer> values) {
            addCriterion("label_id in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotIn(List<Integer> values) {
            addCriterion("label_id not in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdBetween(Integer value1, Integer value2) {
            addCriterion("label_id between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("label_id not between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIsNull() {
            addCriterion("allot_status is null");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIsNotNull() {
            addCriterion("allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andAllotStatusEqualTo(Boolean value) {
            addCriterion("allot_status =", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotEqualTo(Boolean value) {
            addCriterion("allot_status <>", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusGreaterThan(Boolean value) {
            addCriterion("allot_status >", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allot_status >=", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusLessThan(Boolean value) {
            addCriterion("allot_status <", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("allot_status <=", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIn(List<Boolean> values) {
            addCriterion("allot_status in", values, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotIn(List<Boolean> values) {
            addCriterion("allot_status not in", values, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("allot_status between", value1, value2, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allot_status not between", value1, value2, "allotStatus");
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