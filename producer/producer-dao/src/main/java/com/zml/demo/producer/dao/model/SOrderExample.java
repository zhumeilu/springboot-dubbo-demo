package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SOrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SOrderExample() {
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

        public Criteria andStaDateIsNull() {
            addCriterion("sta_date is null");
            return (Criteria) this;
        }

        public Criteria andStaDateIsNotNull() {
            addCriterion("sta_date is not null");
            return (Criteria) this;
        }

        public Criteria andStaDateEqualTo(String value) {
            addCriterion("sta_date =", value, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateNotEqualTo(String value) {
            addCriterion("sta_date <>", value, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateGreaterThan(String value) {
            addCriterion("sta_date >", value, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateGreaterThanOrEqualTo(String value) {
            addCriterion("sta_date >=", value, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateLessThan(String value) {
            addCriterion("sta_date <", value, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateLessThanOrEqualTo(String value) {
            addCriterion("sta_date <=", value, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateLike(String value) {
            addCriterion("sta_date like", value, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateNotLike(String value) {
            addCriterion("sta_date not like", value, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateIn(List<String> values) {
            addCriterion("sta_date in", values, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateNotIn(List<String> values) {
            addCriterion("sta_date not in", values, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateBetween(String value1, String value2) {
            addCriterion("sta_date between", value1, value2, "staDate");
            return (Criteria) this;
        }

        public Criteria andStaDateNotBetween(String value1, String value2) {
            addCriterion("sta_date not between", value1, value2, "staDate");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountIsNull() {
            addCriterion("real_order_count is null");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountIsNotNull() {
            addCriterion("real_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountEqualTo(String value) {
            addCriterion("real_order_count =", value, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountNotEqualTo(String value) {
            addCriterion("real_order_count <>", value, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountGreaterThan(String value) {
            addCriterion("real_order_count >", value, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("real_order_count >=", value, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountLessThan(String value) {
            addCriterion("real_order_count <", value, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountLessThanOrEqualTo(String value) {
            addCriterion("real_order_count <=", value, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountLike(String value) {
            addCriterion("real_order_count like", value, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountNotLike(String value) {
            addCriterion("real_order_count not like", value, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountIn(List<String> values) {
            addCriterion("real_order_count in", values, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountNotIn(List<String> values) {
            addCriterion("real_order_count not in", values, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountBetween(String value1, String value2) {
            addCriterion("real_order_count between", value1, value2, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealOrderCountNotBetween(String value1, String value2) {
            addCriterion("real_order_count not between", value1, value2, "realOrderCount");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalIsNull() {
            addCriterion("real_principal is null");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalIsNotNull() {
            addCriterion("real_principal is not null");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalEqualTo(String value) {
            addCriterion("real_principal =", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalNotEqualTo(String value) {
            addCriterion("real_principal <>", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalGreaterThan(String value) {
            addCriterion("real_principal >", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("real_principal >=", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalLessThan(String value) {
            addCriterion("real_principal <", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalLessThanOrEqualTo(String value) {
            addCriterion("real_principal <=", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalLike(String value) {
            addCriterion("real_principal like", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalNotLike(String value) {
            addCriterion("real_principal not like", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalIn(List<String> values) {
            addCriterion("real_principal in", values, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalNotIn(List<String> values) {
            addCriterion("real_principal not in", values, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalBetween(String value1, String value2) {
            addCriterion("real_principal between", value1, value2, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalNotBetween(String value1, String value2) {
            addCriterion("real_principal not between", value1, value2, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeIsNull() {
            addCriterion("real_credit_fee is null");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeIsNotNull() {
            addCriterion("real_credit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeEqualTo(String value) {
            addCriterion("real_credit_fee =", value, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeNotEqualTo(String value) {
            addCriterion("real_credit_fee <>", value, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeGreaterThan(String value) {
            addCriterion("real_credit_fee >", value, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeGreaterThanOrEqualTo(String value) {
            addCriterion("real_credit_fee >=", value, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeLessThan(String value) {
            addCriterion("real_credit_fee <", value, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeLessThanOrEqualTo(String value) {
            addCriterion("real_credit_fee <=", value, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeLike(String value) {
            addCriterion("real_credit_fee like", value, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeNotLike(String value) {
            addCriterion("real_credit_fee not like", value, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeIn(List<String> values) {
            addCriterion("real_credit_fee in", values, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeNotIn(List<String> values) {
            addCriterion("real_credit_fee not in", values, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeBetween(String value1, String value2) {
            addCriterion("real_credit_fee between", value1, value2, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andRealCreditFeeNotBetween(String value1, String value2) {
            addCriterion("real_credit_fee not between", value1, value2, "realCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountIsNull() {
            addCriterion("settle_order_count is null");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountIsNotNull() {
            addCriterion("settle_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountEqualTo(String value) {
            addCriterion("settle_order_count =", value, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountNotEqualTo(String value) {
            addCriterion("settle_order_count <>", value, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountGreaterThan(String value) {
            addCriterion("settle_order_count >", value, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("settle_order_count >=", value, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountLessThan(String value) {
            addCriterion("settle_order_count <", value, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountLessThanOrEqualTo(String value) {
            addCriterion("settle_order_count <=", value, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountLike(String value) {
            addCriterion("settle_order_count like", value, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountNotLike(String value) {
            addCriterion("settle_order_count not like", value, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountIn(List<String> values) {
            addCriterion("settle_order_count in", values, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountNotIn(List<String> values) {
            addCriterion("settle_order_count not in", values, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountBetween(String value1, String value2) {
            addCriterion("settle_order_count between", value1, value2, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettleOrderCountNotBetween(String value1, String value2) {
            addCriterion("settle_order_count not between", value1, value2, "settleOrderCount");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalIsNull() {
            addCriterion("settle_principal is null");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalIsNotNull() {
            addCriterion("settle_principal is not null");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalEqualTo(String value) {
            addCriterion("settle_principal =", value, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalNotEqualTo(String value) {
            addCriterion("settle_principal <>", value, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalGreaterThan(String value) {
            addCriterion("settle_principal >", value, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("settle_principal >=", value, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalLessThan(String value) {
            addCriterion("settle_principal <", value, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalLessThanOrEqualTo(String value) {
            addCriterion("settle_principal <=", value, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalLike(String value) {
            addCriterion("settle_principal like", value, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalNotLike(String value) {
            addCriterion("settle_principal not like", value, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalIn(List<String> values) {
            addCriterion("settle_principal in", values, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalNotIn(List<String> values) {
            addCriterion("settle_principal not in", values, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalBetween(String value1, String value2) {
            addCriterion("settle_principal between", value1, value2, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettlePrincipalNotBetween(String value1, String value2) {
            addCriterion("settle_principal not between", value1, value2, "settlePrincipal");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeIsNull() {
            addCriterion("settle_credit_fee is null");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeIsNotNull() {
            addCriterion("settle_credit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeEqualTo(String value) {
            addCriterion("settle_credit_fee =", value, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeNotEqualTo(String value) {
            addCriterion("settle_credit_fee <>", value, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeGreaterThan(String value) {
            addCriterion("settle_credit_fee >", value, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeGreaterThanOrEqualTo(String value) {
            addCriterion("settle_credit_fee >=", value, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeLessThan(String value) {
            addCriterion("settle_credit_fee <", value, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeLessThanOrEqualTo(String value) {
            addCriterion("settle_credit_fee <=", value, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeLike(String value) {
            addCriterion("settle_credit_fee like", value, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeNotLike(String value) {
            addCriterion("settle_credit_fee not like", value, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeIn(List<String> values) {
            addCriterion("settle_credit_fee in", values, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeNotIn(List<String> values) {
            addCriterion("settle_credit_fee not in", values, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeBetween(String value1, String value2) {
            addCriterion("settle_credit_fee between", value1, value2, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleCreditFeeNotBetween(String value1, String value2) {
            addCriterion("settle_credit_fee not between", value1, value2, "settleCreditFee");
            return (Criteria) this;
        }

        public Criteria andSettleInterestIsNull() {
            addCriterion("settle_interest is null");
            return (Criteria) this;
        }

        public Criteria andSettleInterestIsNotNull() {
            addCriterion("settle_interest is not null");
            return (Criteria) this;
        }

        public Criteria andSettleInterestEqualTo(String value) {
            addCriterion("settle_interest =", value, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestNotEqualTo(String value) {
            addCriterion("settle_interest <>", value, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestGreaterThan(String value) {
            addCriterion("settle_interest >", value, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestGreaterThanOrEqualTo(String value) {
            addCriterion("settle_interest >=", value, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestLessThan(String value) {
            addCriterion("settle_interest <", value, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestLessThanOrEqualTo(String value) {
            addCriterion("settle_interest <=", value, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestLike(String value) {
            addCriterion("settle_interest like", value, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestNotLike(String value) {
            addCriterion("settle_interest not like", value, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestIn(List<String> values) {
            addCriterion("settle_interest in", values, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestNotIn(List<String> values) {
            addCriterion("settle_interest not in", values, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestBetween(String value1, String value2) {
            addCriterion("settle_interest between", value1, value2, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettleInterestNotBetween(String value1, String value2) {
            addCriterion("settle_interest not between", value1, value2, "settleInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestIsNull() {
            addCriterion("settle_penalty_interest is null");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestIsNotNull() {
            addCriterion("settle_penalty_interest is not null");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestEqualTo(String value) {
            addCriterion("settle_penalty_interest =", value, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestNotEqualTo(String value) {
            addCriterion("settle_penalty_interest <>", value, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestGreaterThan(String value) {
            addCriterion("settle_penalty_interest >", value, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestGreaterThanOrEqualTo(String value) {
            addCriterion("settle_penalty_interest >=", value, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestLessThan(String value) {
            addCriterion("settle_penalty_interest <", value, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestLessThanOrEqualTo(String value) {
            addCriterion("settle_penalty_interest <=", value, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestLike(String value) {
            addCriterion("settle_penalty_interest like", value, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestNotLike(String value) {
            addCriterion("settle_penalty_interest not like", value, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestIn(List<String> values) {
            addCriterion("settle_penalty_interest in", values, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestNotIn(List<String> values) {
            addCriterion("settle_penalty_interest not in", values, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestBetween(String value1, String value2) {
            addCriterion("settle_penalty_interest between", value1, value2, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettlePenaltyInterestNotBetween(String value1, String value2) {
            addCriterion("settle_penalty_interest not between", value1, value2, "settlePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountIsNull() {
            addCriterion("settle_other_amount is null");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountIsNotNull() {
            addCriterion("settle_other_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountEqualTo(String value) {
            addCriterion("settle_other_amount =", value, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountNotEqualTo(String value) {
            addCriterion("settle_other_amount <>", value, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountGreaterThan(String value) {
            addCriterion("settle_other_amount >", value, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountGreaterThanOrEqualTo(String value) {
            addCriterion("settle_other_amount >=", value, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountLessThan(String value) {
            addCriterion("settle_other_amount <", value, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountLessThanOrEqualTo(String value) {
            addCriterion("settle_other_amount <=", value, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountLike(String value) {
            addCriterion("settle_other_amount like", value, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountNotLike(String value) {
            addCriterion("settle_other_amount not like", value, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountIn(List<String> values) {
            addCriterion("settle_other_amount in", values, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountNotIn(List<String> values) {
            addCriterion("settle_other_amount not in", values, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountBetween(String value1, String value2) {
            addCriterion("settle_other_amount between", value1, value2, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleOtherAmountNotBetween(String value1, String value2) {
            addCriterion("settle_other_amount not between", value1, value2, "settleOtherAmount");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceIsNull() {
            addCriterion("settle_balance is null");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceIsNotNull() {
            addCriterion("settle_balance is not null");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceEqualTo(String value) {
            addCriterion("settle_balance =", value, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceNotEqualTo(String value) {
            addCriterion("settle_balance <>", value, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceGreaterThan(String value) {
            addCriterion("settle_balance >", value, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("settle_balance >=", value, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceLessThan(String value) {
            addCriterion("settle_balance <", value, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceLessThanOrEqualTo(String value) {
            addCriterion("settle_balance <=", value, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceLike(String value) {
            addCriterion("settle_balance like", value, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceNotLike(String value) {
            addCriterion("settle_balance not like", value, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceIn(List<String> values) {
            addCriterion("settle_balance in", values, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceNotIn(List<String> values) {
            addCriterion("settle_balance not in", values, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceBetween(String value1, String value2) {
            addCriterion("settle_balance between", value1, value2, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andSettleBalanceNotBetween(String value1, String value2) {
            addCriterion("settle_balance not between", value1, value2, "settleBalance");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountIsNull() {
            addCriterion("uncleared_order_count is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountIsNotNull() {
            addCriterion("uncleared_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountEqualTo(String value) {
            addCriterion("uncleared_order_count =", value, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountNotEqualTo(String value) {
            addCriterion("uncleared_order_count <>", value, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountGreaterThan(String value) {
            addCriterion("uncleared_order_count >", value, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_order_count >=", value, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountLessThan(String value) {
            addCriterion("uncleared_order_count <", value, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountLessThanOrEqualTo(String value) {
            addCriterion("uncleared_order_count <=", value, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountLike(String value) {
            addCriterion("uncleared_order_count like", value, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountNotLike(String value) {
            addCriterion("uncleared_order_count not like", value, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountIn(List<String> values) {
            addCriterion("uncleared_order_count in", values, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountNotIn(List<String> values) {
            addCriterion("uncleared_order_count not in", values, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountBetween(String value1, String value2) {
            addCriterion("uncleared_order_count between", value1, value2, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedOrderCountNotBetween(String value1, String value2) {
            addCriterion("uncleared_order_count not between", value1, value2, "unclearedOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalIsNull() {
            addCriterion("uncleared_principal is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalIsNotNull() {
            addCriterion("uncleared_principal is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalEqualTo(String value) {
            addCriterion("uncleared_principal =", value, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalNotEqualTo(String value) {
            addCriterion("uncleared_principal <>", value, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalGreaterThan(String value) {
            addCriterion("uncleared_principal >", value, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_principal >=", value, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalLessThan(String value) {
            addCriterion("uncleared_principal <", value, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalLessThanOrEqualTo(String value) {
            addCriterion("uncleared_principal <=", value, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalLike(String value) {
            addCriterion("uncleared_principal like", value, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalNotLike(String value) {
            addCriterion("uncleared_principal not like", value, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalIn(List<String> values) {
            addCriterion("uncleared_principal in", values, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalNotIn(List<String> values) {
            addCriterion("uncleared_principal not in", values, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalBetween(String value1, String value2) {
            addCriterion("uncleared_principal between", value1, value2, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedPrincipalNotBetween(String value1, String value2) {
            addCriterion("uncleared_principal not between", value1, value2, "unclearedPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeIsNull() {
            addCriterion("uncleared_credit_fee is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeIsNotNull() {
            addCriterion("uncleared_credit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeEqualTo(String value) {
            addCriterion("uncleared_credit_fee =", value, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeNotEqualTo(String value) {
            addCriterion("uncleared_credit_fee <>", value, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeGreaterThan(String value) {
            addCriterion("uncleared_credit_fee >", value, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_credit_fee >=", value, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeLessThan(String value) {
            addCriterion("uncleared_credit_fee <", value, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeLessThanOrEqualTo(String value) {
            addCriterion("uncleared_credit_fee <=", value, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeLike(String value) {
            addCriterion("uncleared_credit_fee like", value, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeNotLike(String value) {
            addCriterion("uncleared_credit_fee not like", value, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeIn(List<String> values) {
            addCriterion("uncleared_credit_fee in", values, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeNotIn(List<String> values) {
            addCriterion("uncleared_credit_fee not in", values, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeBetween(String value1, String value2) {
            addCriterion("uncleared_credit_fee between", value1, value2, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditFeeNotBetween(String value1, String value2) {
            addCriterion("uncleared_credit_fee not between", value1, value2, "unclearedCreditFee");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestIsNull() {
            addCriterion("uncleared_interest is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestIsNotNull() {
            addCriterion("uncleared_interest is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestEqualTo(String value) {
            addCriterion("uncleared_interest =", value, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestNotEqualTo(String value) {
            addCriterion("uncleared_interest <>", value, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestGreaterThan(String value) {
            addCriterion("uncleared_interest >", value, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_interest >=", value, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestLessThan(String value) {
            addCriterion("uncleared_interest <", value, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestLessThanOrEqualTo(String value) {
            addCriterion("uncleared_interest <=", value, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestLike(String value) {
            addCriterion("uncleared_interest like", value, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestNotLike(String value) {
            addCriterion("uncleared_interest not like", value, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestIn(List<String> values) {
            addCriterion("uncleared_interest in", values, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestNotIn(List<String> values) {
            addCriterion("uncleared_interest not in", values, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestBetween(String value1, String value2) {
            addCriterion("uncleared_interest between", value1, value2, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedInterestNotBetween(String value1, String value2) {
            addCriterion("uncleared_interest not between", value1, value2, "unclearedInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestIsNull() {
            addCriterion("uncleared_penalty_interest is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestIsNotNull() {
            addCriterion("uncleared_penalty_interest is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestEqualTo(String value) {
            addCriterion("uncleared_penalty_interest =", value, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestNotEqualTo(String value) {
            addCriterion("uncleared_penalty_interest <>", value, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestGreaterThan(String value) {
            addCriterion("uncleared_penalty_interest >", value, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_penalty_interest >=", value, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestLessThan(String value) {
            addCriterion("uncleared_penalty_interest <", value, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestLessThanOrEqualTo(String value) {
            addCriterion("uncleared_penalty_interest <=", value, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestLike(String value) {
            addCriterion("uncleared_penalty_interest like", value, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestNotLike(String value) {
            addCriterion("uncleared_penalty_interest not like", value, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestIn(List<String> values) {
            addCriterion("uncleared_penalty_interest in", values, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestNotIn(List<String> values) {
            addCriterion("uncleared_penalty_interest not in", values, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestBetween(String value1, String value2) {
            addCriterion("uncleared_penalty_interest between", value1, value2, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andUnclearedPenaltyInterestNotBetween(String value1, String value2) {
            addCriterion("uncleared_penalty_interest not between", value1, value2, "unclearedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountIsNull() {
            addCriterion("partial_order_count is null");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountIsNotNull() {
            addCriterion("partial_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountEqualTo(String value) {
            addCriterion("partial_order_count =", value, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountNotEqualTo(String value) {
            addCriterion("partial_order_count <>", value, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountGreaterThan(String value) {
            addCriterion("partial_order_count >", value, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("partial_order_count >=", value, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountLessThan(String value) {
            addCriterion("partial_order_count <", value, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountLessThanOrEqualTo(String value) {
            addCriterion("partial_order_count <=", value, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountLike(String value) {
            addCriterion("partial_order_count like", value, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountNotLike(String value) {
            addCriterion("partial_order_count not like", value, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountIn(List<String> values) {
            addCriterion("partial_order_count in", values, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountNotIn(List<String> values) {
            addCriterion("partial_order_count not in", values, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountBetween(String value1, String value2) {
            addCriterion("partial_order_count between", value1, value2, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialOrderCountNotBetween(String value1, String value2) {
            addCriterion("partial_order_count not between", value1, value2, "partialOrderCount");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalIsNull() {
            addCriterion("partial_principal is null");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalIsNotNull() {
            addCriterion("partial_principal is not null");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalEqualTo(String value) {
            addCriterion("partial_principal =", value, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalNotEqualTo(String value) {
            addCriterion("partial_principal <>", value, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalGreaterThan(String value) {
            addCriterion("partial_principal >", value, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("partial_principal >=", value, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalLessThan(String value) {
            addCriterion("partial_principal <", value, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalLessThanOrEqualTo(String value) {
            addCriterion("partial_principal <=", value, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalLike(String value) {
            addCriterion("partial_principal like", value, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalNotLike(String value) {
            addCriterion("partial_principal not like", value, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalIn(List<String> values) {
            addCriterion("partial_principal in", values, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalNotIn(List<String> values) {
            addCriterion("partial_principal not in", values, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalBetween(String value1, String value2) {
            addCriterion("partial_principal between", value1, value2, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialPrincipalNotBetween(String value1, String value2) {
            addCriterion("partial_principal not between", value1, value2, "partialPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeIsNull() {
            addCriterion("partial_credit_fee is null");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeIsNotNull() {
            addCriterion("partial_credit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeEqualTo(String value) {
            addCriterion("partial_credit_fee =", value, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeNotEqualTo(String value) {
            addCriterion("partial_credit_fee <>", value, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeGreaterThan(String value) {
            addCriterion("partial_credit_fee >", value, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeGreaterThanOrEqualTo(String value) {
            addCriterion("partial_credit_fee >=", value, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeLessThan(String value) {
            addCriterion("partial_credit_fee <", value, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeLessThanOrEqualTo(String value) {
            addCriterion("partial_credit_fee <=", value, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeLike(String value) {
            addCriterion("partial_credit_fee like", value, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeNotLike(String value) {
            addCriterion("partial_credit_fee not like", value, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeIn(List<String> values) {
            addCriterion("partial_credit_fee in", values, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeNotIn(List<String> values) {
            addCriterion("partial_credit_fee not in", values, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeBetween(String value1, String value2) {
            addCriterion("partial_credit_fee between", value1, value2, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialCreditFeeNotBetween(String value1, String value2) {
            addCriterion("partial_credit_fee not between", value1, value2, "partialCreditFee");
            return (Criteria) this;
        }

        public Criteria andPartialInterestIsNull() {
            addCriterion("partial_interest is null");
            return (Criteria) this;
        }

        public Criteria andPartialInterestIsNotNull() {
            addCriterion("partial_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPartialInterestEqualTo(String value) {
            addCriterion("partial_interest =", value, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestNotEqualTo(String value) {
            addCriterion("partial_interest <>", value, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestGreaterThan(String value) {
            addCriterion("partial_interest >", value, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestGreaterThanOrEqualTo(String value) {
            addCriterion("partial_interest >=", value, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestLessThan(String value) {
            addCriterion("partial_interest <", value, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestLessThanOrEqualTo(String value) {
            addCriterion("partial_interest <=", value, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestLike(String value) {
            addCriterion("partial_interest like", value, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestNotLike(String value) {
            addCriterion("partial_interest not like", value, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestIn(List<String> values) {
            addCriterion("partial_interest in", values, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestNotIn(List<String> values) {
            addCriterion("partial_interest not in", values, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestBetween(String value1, String value2) {
            addCriterion("partial_interest between", value1, value2, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialInterestNotBetween(String value1, String value2) {
            addCriterion("partial_interest not between", value1, value2, "partialInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestIsNull() {
            addCriterion("partial_penalty_interest is null");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestIsNotNull() {
            addCriterion("partial_penalty_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestEqualTo(String value) {
            addCriterion("partial_penalty_interest =", value, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestNotEqualTo(String value) {
            addCriterion("partial_penalty_interest <>", value, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestGreaterThan(String value) {
            addCriterion("partial_penalty_interest >", value, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestGreaterThanOrEqualTo(String value) {
            addCriterion("partial_penalty_interest >=", value, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestLessThan(String value) {
            addCriterion("partial_penalty_interest <", value, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestLessThanOrEqualTo(String value) {
            addCriterion("partial_penalty_interest <=", value, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestLike(String value) {
            addCriterion("partial_penalty_interest like", value, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestNotLike(String value) {
            addCriterion("partial_penalty_interest not like", value, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestIn(List<String> values) {
            addCriterion("partial_penalty_interest in", values, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestNotIn(List<String> values) {
            addCriterion("partial_penalty_interest not in", values, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestBetween(String value1, String value2) {
            addCriterion("partial_penalty_interest between", value1, value2, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialPenaltyInterestNotBetween(String value1, String value2) {
            addCriterion("partial_penalty_interest not between", value1, value2, "partialPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceIsNull() {
            addCriterion("partial_balance is null");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceIsNotNull() {
            addCriterion("partial_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceEqualTo(String value) {
            addCriterion("partial_balance =", value, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceNotEqualTo(String value) {
            addCriterion("partial_balance <>", value, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceGreaterThan(String value) {
            addCriterion("partial_balance >", value, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("partial_balance >=", value, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceLessThan(String value) {
            addCriterion("partial_balance <", value, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceLessThanOrEqualTo(String value) {
            addCriterion("partial_balance <=", value, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceLike(String value) {
            addCriterion("partial_balance like", value, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceNotLike(String value) {
            addCriterion("partial_balance not like", value, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceIn(List<String> values) {
            addCriterion("partial_balance in", values, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceNotIn(List<String> values) {
            addCriterion("partial_balance not in", values, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceBetween(String value1, String value2) {
            addCriterion("partial_balance between", value1, value2, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andPartialBalanceNotBetween(String value1, String value2) {
            addCriterion("partial_balance not between", value1, value2, "partialBalance");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountIsNull() {
            addCriterion("rollover_order_count is null");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountIsNotNull() {
            addCriterion("rollover_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountEqualTo(String value) {
            addCriterion("rollover_order_count =", value, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountNotEqualTo(String value) {
            addCriterion("rollover_order_count <>", value, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountGreaterThan(String value) {
            addCriterion("rollover_order_count >", value, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("rollover_order_count >=", value, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountLessThan(String value) {
            addCriterion("rollover_order_count <", value, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountLessThanOrEqualTo(String value) {
            addCriterion("rollover_order_count <=", value, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountLike(String value) {
            addCriterion("rollover_order_count like", value, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountNotLike(String value) {
            addCriterion("rollover_order_count not like", value, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountIn(List<String> values) {
            addCriterion("rollover_order_count in", values, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountNotIn(List<String> values) {
            addCriterion("rollover_order_count not in", values, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountBetween(String value1, String value2) {
            addCriterion("rollover_order_count between", value1, value2, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverOrderCountNotBetween(String value1, String value2) {
            addCriterion("rollover_order_count not between", value1, value2, "rolloverOrderCount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountIsNull() {
            addCriterion("rollover_amount is null");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountIsNotNull() {
            addCriterion("rollover_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountEqualTo(String value) {
            addCriterion("rollover_amount =", value, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountNotEqualTo(String value) {
            addCriterion("rollover_amount <>", value, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountGreaterThan(String value) {
            addCriterion("rollover_amount >", value, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountGreaterThanOrEqualTo(String value) {
            addCriterion("rollover_amount >=", value, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountLessThan(String value) {
            addCriterion("rollover_amount <", value, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountLessThanOrEqualTo(String value) {
            addCriterion("rollover_amount <=", value, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountLike(String value) {
            addCriterion("rollover_amount like", value, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountNotLike(String value) {
            addCriterion("rollover_amount not like", value, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountIn(List<String> values) {
            addCriterion("rollover_amount in", values, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountNotIn(List<String> values) {
            addCriterion("rollover_amount not in", values, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountBetween(String value1, String value2) {
            addCriterion("rollover_amount between", value1, value2, "rolloverAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverAmountNotBetween(String value1, String value2) {
            addCriterion("rollover_amount not between", value1, value2, "rolloverAmount");
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