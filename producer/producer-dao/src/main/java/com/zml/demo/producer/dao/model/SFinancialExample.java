package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SFinancialExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SFinancialExample() {
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

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(LocalDateTime value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(LocalDateTime value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(LocalDateTime value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(LocalDateTime value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<LocalDateTime> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<LocalDateTime> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(LocalDateTime value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(LocalDateTime value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(LocalDateTime value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(LocalDateTime value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<LocalDateTime> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<LocalDateTime> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("utime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountIsNull() {
            addCriterion("receivable_order_count is null");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountIsNotNull() {
            addCriterion("receivable_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountEqualTo(String value) {
            addCriterion("receivable_order_count =", value, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountNotEqualTo(String value) {
            addCriterion("receivable_order_count <>", value, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountGreaterThan(String value) {
            addCriterion("receivable_order_count >", value, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("receivable_order_count >=", value, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountLessThan(String value) {
            addCriterion("receivable_order_count <", value, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountLessThanOrEqualTo(String value) {
            addCriterion("receivable_order_count <=", value, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountLike(String value) {
            addCriterion("receivable_order_count like", value, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountNotLike(String value) {
            addCriterion("receivable_order_count not like", value, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountIn(List<String> values) {
            addCriterion("receivable_order_count in", values, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountNotIn(List<String> values) {
            addCriterion("receivable_order_count not in", values, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountBetween(String value1, String value2) {
            addCriterion("receivable_order_count between", value1, value2, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivableOrderCountNotBetween(String value1, String value2) {
            addCriterion("receivable_order_count not between", value1, value2, "receivableOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalIsNull() {
            addCriterion("receivable_principal is null");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalIsNotNull() {
            addCriterion("receivable_principal is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalEqualTo(String value) {
            addCriterion("receivable_principal =", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalNotEqualTo(String value) {
            addCriterion("receivable_principal <>", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalGreaterThan(String value) {
            addCriterion("receivable_principal >", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("receivable_principal >=", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalLessThan(String value) {
            addCriterion("receivable_principal <", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalLessThanOrEqualTo(String value) {
            addCriterion("receivable_principal <=", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalLike(String value) {
            addCriterion("receivable_principal like", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalNotLike(String value) {
            addCriterion("receivable_principal not like", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalIn(List<String> values) {
            addCriterion("receivable_principal in", values, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalNotIn(List<String> values) {
            addCriterion("receivable_principal not in", values, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalBetween(String value1, String value2) {
            addCriterion("receivable_principal between", value1, value2, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalNotBetween(String value1, String value2) {
            addCriterion("receivable_principal not between", value1, value2, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostIsNull() {
            addCriterion("receivable_credit_cost is null");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostIsNotNull() {
            addCriterion("receivable_credit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostEqualTo(String value) {
            addCriterion("receivable_credit_cost =", value, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostNotEqualTo(String value) {
            addCriterion("receivable_credit_cost <>", value, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostGreaterThan(String value) {
            addCriterion("receivable_credit_cost >", value, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostGreaterThanOrEqualTo(String value) {
            addCriterion("receivable_credit_cost >=", value, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostLessThan(String value) {
            addCriterion("receivable_credit_cost <", value, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostLessThanOrEqualTo(String value) {
            addCriterion("receivable_credit_cost <=", value, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostLike(String value) {
            addCriterion("receivable_credit_cost like", value, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostNotLike(String value) {
            addCriterion("receivable_credit_cost not like", value, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostIn(List<String> values) {
            addCriterion("receivable_credit_cost in", values, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostNotIn(List<String> values) {
            addCriterion("receivable_credit_cost not in", values, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostBetween(String value1, String value2) {
            addCriterion("receivable_credit_cost between", value1, value2, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableCreditCostNotBetween(String value1, String value2) {
            addCriterion("receivable_credit_cost not between", value1, value2, "receivableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestIsNull() {
            addCriterion("receivable_interest is null");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestIsNotNull() {
            addCriterion("receivable_interest is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestEqualTo(String value) {
            addCriterion("receivable_interest =", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestNotEqualTo(String value) {
            addCriterion("receivable_interest <>", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestGreaterThan(String value) {
            addCriterion("receivable_interest >", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestGreaterThanOrEqualTo(String value) {
            addCriterion("receivable_interest >=", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestLessThan(String value) {
            addCriterion("receivable_interest <", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestLessThanOrEqualTo(String value) {
            addCriterion("receivable_interest <=", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestLike(String value) {
            addCriterion("receivable_interest like", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestNotLike(String value) {
            addCriterion("receivable_interest not like", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestIn(List<String> values) {
            addCriterion("receivable_interest in", values, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestNotIn(List<String> values) {
            addCriterion("receivable_interest not in", values, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestBetween(String value1, String value2) {
            addCriterion("receivable_interest between", value1, value2, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestNotBetween(String value1, String value2) {
            addCriterion("receivable_interest not between", value1, value2, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyIsNull() {
            addCriterion("receivable_interest_penalty is null");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyIsNotNull() {
            addCriterion("receivable_interest_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyEqualTo(String value) {
            addCriterion("receivable_interest_penalty =", value, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyNotEqualTo(String value) {
            addCriterion("receivable_interest_penalty <>", value, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyGreaterThan(String value) {
            addCriterion("receivable_interest_penalty >", value, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyGreaterThanOrEqualTo(String value) {
            addCriterion("receivable_interest_penalty >=", value, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyLessThan(String value) {
            addCriterion("receivable_interest_penalty <", value, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyLessThanOrEqualTo(String value) {
            addCriterion("receivable_interest_penalty <=", value, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyLike(String value) {
            addCriterion("receivable_interest_penalty like", value, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyNotLike(String value) {
            addCriterion("receivable_interest_penalty not like", value, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyIn(List<String> values) {
            addCriterion("receivable_interest_penalty in", values, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyNotIn(List<String> values) {
            addCriterion("receivable_interest_penalty not in", values, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyBetween(String value1, String value2) {
            addCriterion("receivable_interest_penalty between", value1, value2, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestPenaltyNotBetween(String value1, String value2) {
            addCriterion("receivable_interest_penalty not between", value1, value2, "receivableInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountIsNull() {
            addCriterion("payable_order_count is null");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountIsNotNull() {
            addCriterion("payable_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountEqualTo(String value) {
            addCriterion("payable_order_count =", value, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountNotEqualTo(String value) {
            addCriterion("payable_order_count <>", value, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountGreaterThan(String value) {
            addCriterion("payable_order_count >", value, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("payable_order_count >=", value, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountLessThan(String value) {
            addCriterion("payable_order_count <", value, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountLessThanOrEqualTo(String value) {
            addCriterion("payable_order_count <=", value, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountLike(String value) {
            addCriterion("payable_order_count like", value, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountNotLike(String value) {
            addCriterion("payable_order_count not like", value, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountIn(List<String> values) {
            addCriterion("payable_order_count in", values, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountNotIn(List<String> values) {
            addCriterion("payable_order_count not in", values, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountBetween(String value1, String value2) {
            addCriterion("payable_order_count between", value1, value2, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayableOrderCountNotBetween(String value1, String value2) {
            addCriterion("payable_order_count not between", value1, value2, "payableOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalIsNull() {
            addCriterion("payable_principal is null");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalIsNotNull() {
            addCriterion("payable_principal is not null");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalEqualTo(String value) {
            addCriterion("payable_principal =", value, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalNotEqualTo(String value) {
            addCriterion("payable_principal <>", value, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalGreaterThan(String value) {
            addCriterion("payable_principal >", value, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("payable_principal >=", value, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalLessThan(String value) {
            addCriterion("payable_principal <", value, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalLessThanOrEqualTo(String value) {
            addCriterion("payable_principal <=", value, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalLike(String value) {
            addCriterion("payable_principal like", value, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalNotLike(String value) {
            addCriterion("payable_principal not like", value, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalIn(List<String> values) {
            addCriterion("payable_principal in", values, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalNotIn(List<String> values) {
            addCriterion("payable_principal not in", values, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalBetween(String value1, String value2) {
            addCriterion("payable_principal between", value1, value2, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayablePrincipalNotBetween(String value1, String value2) {
            addCriterion("payable_principal not between", value1, value2, "payablePrincipal");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostIsNull() {
            addCriterion("payable_credit_cost is null");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostIsNotNull() {
            addCriterion("payable_credit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostEqualTo(String value) {
            addCriterion("payable_credit_cost =", value, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostNotEqualTo(String value) {
            addCriterion("payable_credit_cost <>", value, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostGreaterThan(String value) {
            addCriterion("payable_credit_cost >", value, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostGreaterThanOrEqualTo(String value) {
            addCriterion("payable_credit_cost >=", value, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostLessThan(String value) {
            addCriterion("payable_credit_cost <", value, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostLessThanOrEqualTo(String value) {
            addCriterion("payable_credit_cost <=", value, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostLike(String value) {
            addCriterion("payable_credit_cost like", value, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostNotLike(String value) {
            addCriterion("payable_credit_cost not like", value, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostIn(List<String> values) {
            addCriterion("payable_credit_cost in", values, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostNotIn(List<String> values) {
            addCriterion("payable_credit_cost not in", values, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostBetween(String value1, String value2) {
            addCriterion("payable_credit_cost between", value1, value2, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andPayableCreditCostNotBetween(String value1, String value2) {
            addCriterion("payable_credit_cost not between", value1, value2, "payableCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountIsNull() {
            addCriterion("receipts_order_count is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountIsNotNull() {
            addCriterion("receipts_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountEqualTo(String value) {
            addCriterion("receipts_order_count =", value, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountNotEqualTo(String value) {
            addCriterion("receipts_order_count <>", value, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountGreaterThan(String value) {
            addCriterion("receipts_order_count >", value, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("receipts_order_count >=", value, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountLessThan(String value) {
            addCriterion("receipts_order_count <", value, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountLessThanOrEqualTo(String value) {
            addCriterion("receipts_order_count <=", value, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountLike(String value) {
            addCriterion("receipts_order_count like", value, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountNotLike(String value) {
            addCriterion("receipts_order_count not like", value, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountIn(List<String> values) {
            addCriterion("receipts_order_count in", values, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountNotIn(List<String> values) {
            addCriterion("receipts_order_count not in", values, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountBetween(String value1, String value2) {
            addCriterion("receipts_order_count between", value1, value2, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsOrderCountNotBetween(String value1, String value2) {
            addCriterion("receipts_order_count not between", value1, value2, "receiptsOrderCount");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalIsNull() {
            addCriterion("receipts_principal is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalIsNotNull() {
            addCriterion("receipts_principal is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalEqualTo(String value) {
            addCriterion("receipts_principal =", value, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalNotEqualTo(String value) {
            addCriterion("receipts_principal <>", value, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalGreaterThan(String value) {
            addCriterion("receipts_principal >", value, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("receipts_principal >=", value, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalLessThan(String value) {
            addCriterion("receipts_principal <", value, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalLessThanOrEqualTo(String value) {
            addCriterion("receipts_principal <=", value, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalLike(String value) {
            addCriterion("receipts_principal like", value, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalNotLike(String value) {
            addCriterion("receipts_principal not like", value, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalIn(List<String> values) {
            addCriterion("receipts_principal in", values, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalNotIn(List<String> values) {
            addCriterion("receipts_principal not in", values, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalBetween(String value1, String value2) {
            addCriterion("receipts_principal between", value1, value2, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsPrincipalNotBetween(String value1, String value2) {
            addCriterion("receipts_principal not between", value1, value2, "receiptsPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostIsNull() {
            addCriterion("receipts_credit_cost is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostIsNotNull() {
            addCriterion("receipts_credit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostEqualTo(String value) {
            addCriterion("receipts_credit_cost =", value, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostNotEqualTo(String value) {
            addCriterion("receipts_credit_cost <>", value, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostGreaterThan(String value) {
            addCriterion("receipts_credit_cost >", value, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostGreaterThanOrEqualTo(String value) {
            addCriterion("receipts_credit_cost >=", value, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostLessThan(String value) {
            addCriterion("receipts_credit_cost <", value, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostLessThanOrEqualTo(String value) {
            addCriterion("receipts_credit_cost <=", value, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostLike(String value) {
            addCriterion("receipts_credit_cost like", value, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostNotLike(String value) {
            addCriterion("receipts_credit_cost not like", value, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostIn(List<String> values) {
            addCriterion("receipts_credit_cost in", values, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostNotIn(List<String> values) {
            addCriterion("receipts_credit_cost not in", values, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostBetween(String value1, String value2) {
            addCriterion("receipts_credit_cost between", value1, value2, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsCreditCostNotBetween(String value1, String value2) {
            addCriterion("receipts_credit_cost not between", value1, value2, "receiptsCreditCost");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestIsNull() {
            addCriterion("receipts_interest is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestIsNotNull() {
            addCriterion("receipts_interest is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestEqualTo(String value) {
            addCriterion("receipts_interest =", value, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestNotEqualTo(String value) {
            addCriterion("receipts_interest <>", value, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestGreaterThan(String value) {
            addCriterion("receipts_interest >", value, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestGreaterThanOrEqualTo(String value) {
            addCriterion("receipts_interest >=", value, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestLessThan(String value) {
            addCriterion("receipts_interest <", value, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestLessThanOrEqualTo(String value) {
            addCriterion("receipts_interest <=", value, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestLike(String value) {
            addCriterion("receipts_interest like", value, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestNotLike(String value) {
            addCriterion("receipts_interest not like", value, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestIn(List<String> values) {
            addCriterion("receipts_interest in", values, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestNotIn(List<String> values) {
            addCriterion("receipts_interest not in", values, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestBetween(String value1, String value2) {
            addCriterion("receipts_interest between", value1, value2, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestNotBetween(String value1, String value2) {
            addCriterion("receipts_interest not between", value1, value2, "receiptsInterest");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyIsNull() {
            addCriterion("receipts_interest_penalty is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyIsNotNull() {
            addCriterion("receipts_interest_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyEqualTo(String value) {
            addCriterion("receipts_interest_penalty =", value, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyNotEqualTo(String value) {
            addCriterion("receipts_interest_penalty <>", value, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyGreaterThan(String value) {
            addCriterion("receipts_interest_penalty >", value, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyGreaterThanOrEqualTo(String value) {
            addCriterion("receipts_interest_penalty >=", value, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyLessThan(String value) {
            addCriterion("receipts_interest_penalty <", value, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyLessThanOrEqualTo(String value) {
            addCriterion("receipts_interest_penalty <=", value, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyLike(String value) {
            addCriterion("receipts_interest_penalty like", value, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyNotLike(String value) {
            addCriterion("receipts_interest_penalty not like", value, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyIn(List<String> values) {
            addCriterion("receipts_interest_penalty in", values, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyNotIn(List<String> values) {
            addCriterion("receipts_interest_penalty not in", values, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyBetween(String value1, String value2) {
            addCriterion("receipts_interest_penalty between", value1, value2, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andReceiptsInterestPenaltyNotBetween(String value1, String value2) {
            addCriterion("receipts_interest_penalty not between", value1, value2, "receiptsInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountIsNull() {
            addCriterion("payment_order_count is null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountIsNotNull() {
            addCriterion("payment_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountEqualTo(String value) {
            addCriterion("payment_order_count =", value, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountNotEqualTo(String value) {
            addCriterion("payment_order_count <>", value, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountGreaterThan(String value) {
            addCriterion("payment_order_count >", value, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("payment_order_count >=", value, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountLessThan(String value) {
            addCriterion("payment_order_count <", value, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountLessThanOrEqualTo(String value) {
            addCriterion("payment_order_count <=", value, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountLike(String value) {
            addCriterion("payment_order_count like", value, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountNotLike(String value) {
            addCriterion("payment_order_count not like", value, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountIn(List<String> values) {
            addCriterion("payment_order_count in", values, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountNotIn(List<String> values) {
            addCriterion("payment_order_count not in", values, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountBetween(String value1, String value2) {
            addCriterion("payment_order_count between", value1, value2, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCountNotBetween(String value1, String value2) {
            addCriterion("payment_order_count not between", value1, value2, "paymentOrderCount");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalIsNull() {
            addCriterion("payment_principal is null");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalIsNotNull() {
            addCriterion("payment_principal is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalEqualTo(String value) {
            addCriterion("payment_principal =", value, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalNotEqualTo(String value) {
            addCriterion("payment_principal <>", value, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalGreaterThan(String value) {
            addCriterion("payment_principal >", value, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("payment_principal >=", value, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalLessThan(String value) {
            addCriterion("payment_principal <", value, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalLessThanOrEqualTo(String value) {
            addCriterion("payment_principal <=", value, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalLike(String value) {
            addCriterion("payment_principal like", value, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalNotLike(String value) {
            addCriterion("payment_principal not like", value, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalIn(List<String> values) {
            addCriterion("payment_principal in", values, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalNotIn(List<String> values) {
            addCriterion("payment_principal not in", values, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalBetween(String value1, String value2) {
            addCriterion("payment_principal between", value1, value2, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentPrincipalNotBetween(String value1, String value2) {
            addCriterion("payment_principal not between", value1, value2, "paymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostIsNull() {
            addCriterion("payment_credit_cost is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostIsNotNull() {
            addCriterion("payment_credit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostEqualTo(String value) {
            addCriterion("payment_credit_cost =", value, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostNotEqualTo(String value) {
            addCriterion("payment_credit_cost <>", value, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostGreaterThan(String value) {
            addCriterion("payment_credit_cost >", value, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostGreaterThanOrEqualTo(String value) {
            addCriterion("payment_credit_cost >=", value, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostLessThan(String value) {
            addCriterion("payment_credit_cost <", value, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostLessThanOrEqualTo(String value) {
            addCriterion("payment_credit_cost <=", value, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostLike(String value) {
            addCriterion("payment_credit_cost like", value, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostNotLike(String value) {
            addCriterion("payment_credit_cost not like", value, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostIn(List<String> values) {
            addCriterion("payment_credit_cost in", values, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostNotIn(List<String> values) {
            addCriterion("payment_credit_cost not in", values, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostBetween(String value1, String value2) {
            addCriterion("payment_credit_cost between", value1, value2, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andPaymentCreditCostNotBetween(String value1, String value2) {
            addCriterion("payment_credit_cost not between", value1, value2, "paymentCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountIsNull() {
            addCriterion("overdue_order_count is null");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountIsNotNull() {
            addCriterion("overdue_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountEqualTo(String value) {
            addCriterion("overdue_order_count =", value, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountNotEqualTo(String value) {
            addCriterion("overdue_order_count <>", value, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountGreaterThan(String value) {
            addCriterion("overdue_order_count >", value, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_order_count >=", value, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountLessThan(String value) {
            addCriterion("overdue_order_count <", value, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountLessThanOrEqualTo(String value) {
            addCriterion("overdue_order_count <=", value, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountLike(String value) {
            addCriterion("overdue_order_count like", value, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountNotLike(String value) {
            addCriterion("overdue_order_count not like", value, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountIn(List<String> values) {
            addCriterion("overdue_order_count in", values, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountNotIn(List<String> values) {
            addCriterion("overdue_order_count not in", values, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountBetween(String value1, String value2) {
            addCriterion("overdue_order_count between", value1, value2, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverdueOrderCountNotBetween(String value1, String value2) {
            addCriterion("overdue_order_count not between", value1, value2, "overdueOrderCount");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalIsNull() {
            addCriterion("overdue_principal is null");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalIsNotNull() {
            addCriterion("overdue_principal is not null");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalEqualTo(String value) {
            addCriterion("overdue_principal =", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalNotEqualTo(String value) {
            addCriterion("overdue_principal <>", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalGreaterThan(String value) {
            addCriterion("overdue_principal >", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_principal >=", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalLessThan(String value) {
            addCriterion("overdue_principal <", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalLessThanOrEqualTo(String value) {
            addCriterion("overdue_principal <=", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalLike(String value) {
            addCriterion("overdue_principal like", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalNotLike(String value) {
            addCriterion("overdue_principal not like", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalIn(List<String> values) {
            addCriterion("overdue_principal in", values, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalNotIn(List<String> values) {
            addCriterion("overdue_principal not in", values, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalBetween(String value1, String value2) {
            addCriterion("overdue_principal between", value1, value2, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalNotBetween(String value1, String value2) {
            addCriterion("overdue_principal not between", value1, value2, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostIsNull() {
            addCriterion("overdue_credit_cost is null");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostIsNotNull() {
            addCriterion("overdue_credit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostEqualTo(String value) {
            addCriterion("overdue_credit_cost =", value, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostNotEqualTo(String value) {
            addCriterion("overdue_credit_cost <>", value, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostGreaterThan(String value) {
            addCriterion("overdue_credit_cost >", value, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_credit_cost >=", value, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostLessThan(String value) {
            addCriterion("overdue_credit_cost <", value, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostLessThanOrEqualTo(String value) {
            addCriterion("overdue_credit_cost <=", value, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostLike(String value) {
            addCriterion("overdue_credit_cost like", value, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostNotLike(String value) {
            addCriterion("overdue_credit_cost not like", value, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostIn(List<String> values) {
            addCriterion("overdue_credit_cost in", values, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostNotIn(List<String> values) {
            addCriterion("overdue_credit_cost not in", values, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostBetween(String value1, String value2) {
            addCriterion("overdue_credit_cost between", value1, value2, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditCostNotBetween(String value1, String value2) {
            addCriterion("overdue_credit_cost not between", value1, value2, "overdueCreditCost");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNull() {
            addCriterion("overdue_interest is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNotNull() {
            addCriterion("overdue_interest is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestEqualTo(String value) {
            addCriterion("overdue_interest =", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotEqualTo(String value) {
            addCriterion("overdue_interest <>", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThan(String value) {
            addCriterion("overdue_interest >", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_interest >=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThan(String value) {
            addCriterion("overdue_interest <", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThanOrEqualTo(String value) {
            addCriterion("overdue_interest <=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLike(String value) {
            addCriterion("overdue_interest like", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotLike(String value) {
            addCriterion("overdue_interest not like", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIn(List<String> values) {
            addCriterion("overdue_interest in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotIn(List<String> values) {
            addCriterion("overdue_interest not in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBetween(String value1, String value2) {
            addCriterion("overdue_interest between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotBetween(String value1, String value2) {
            addCriterion("overdue_interest not between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyIsNull() {
            addCriterion("overdue_interest_penalty is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyIsNotNull() {
            addCriterion("overdue_interest_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyEqualTo(String value) {
            addCriterion("overdue_interest_penalty =", value, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyNotEqualTo(String value) {
            addCriterion("overdue_interest_penalty <>", value, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyGreaterThan(String value) {
            addCriterion("overdue_interest_penalty >", value, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_interest_penalty >=", value, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyLessThan(String value) {
            addCriterion("overdue_interest_penalty <", value, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyLessThanOrEqualTo(String value) {
            addCriterion("overdue_interest_penalty <=", value, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyLike(String value) {
            addCriterion("overdue_interest_penalty like", value, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyNotLike(String value) {
            addCriterion("overdue_interest_penalty not like", value, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyIn(List<String> values) {
            addCriterion("overdue_interest_penalty in", values, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyNotIn(List<String> values) {
            addCriterion("overdue_interest_penalty not in", values, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyBetween(String value1, String value2) {
            addCriterion("overdue_interest_penalty between", value1, value2, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestPenaltyNotBetween(String value1, String value2) {
            addCriterion("overdue_interest_penalty not between", value1, value2, "overdueInterestPenalty");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountIsNull() {
            addCriterion("unexpired_order_count is null");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountIsNotNull() {
            addCriterion("unexpired_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountEqualTo(String value) {
            addCriterion("unexpired_order_count =", value, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountNotEqualTo(String value) {
            addCriterion("unexpired_order_count <>", value, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountGreaterThan(String value) {
            addCriterion("unexpired_order_count >", value, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountGreaterThanOrEqualTo(String value) {
            addCriterion("unexpired_order_count >=", value, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountLessThan(String value) {
            addCriterion("unexpired_order_count <", value, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountLessThanOrEqualTo(String value) {
            addCriterion("unexpired_order_count <=", value, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountLike(String value) {
            addCriterion("unexpired_order_count like", value, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountNotLike(String value) {
            addCriterion("unexpired_order_count not like", value, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountIn(List<String> values) {
            addCriterion("unexpired_order_count in", values, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountNotIn(List<String> values) {
            addCriterion("unexpired_order_count not in", values, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountBetween(String value1, String value2) {
            addCriterion("unexpired_order_count between", value1, value2, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredOrderCountNotBetween(String value1, String value2) {
            addCriterion("unexpired_order_count not between", value1, value2, "unexpiredOrderCount");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalIsNull() {
            addCriterion("unexpired_principal is null");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalIsNotNull() {
            addCriterion("unexpired_principal is not null");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalEqualTo(String value) {
            addCriterion("unexpired_principal =", value, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalNotEqualTo(String value) {
            addCriterion("unexpired_principal <>", value, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalGreaterThan(String value) {
            addCriterion("unexpired_principal >", value, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("unexpired_principal >=", value, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalLessThan(String value) {
            addCriterion("unexpired_principal <", value, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalLessThanOrEqualTo(String value) {
            addCriterion("unexpired_principal <=", value, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalLike(String value) {
            addCriterion("unexpired_principal like", value, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalNotLike(String value) {
            addCriterion("unexpired_principal not like", value, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalIn(List<String> values) {
            addCriterion("unexpired_principal in", values, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalNotIn(List<String> values) {
            addCriterion("unexpired_principal not in", values, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalBetween(String value1, String value2) {
            addCriterion("unexpired_principal between", value1, value2, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredPrincipalNotBetween(String value1, String value2) {
            addCriterion("unexpired_principal not between", value1, value2, "unexpiredPrincipal");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostIsNull() {
            addCriterion("unexpired_credit_cost is null");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostIsNotNull() {
            addCriterion("unexpired_credit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostEqualTo(String value) {
            addCriterion("unexpired_credit_cost =", value, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostNotEqualTo(String value) {
            addCriterion("unexpired_credit_cost <>", value, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostGreaterThan(String value) {
            addCriterion("unexpired_credit_cost >", value, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostGreaterThanOrEqualTo(String value) {
            addCriterion("unexpired_credit_cost >=", value, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostLessThan(String value) {
            addCriterion("unexpired_credit_cost <", value, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostLessThanOrEqualTo(String value) {
            addCriterion("unexpired_credit_cost <=", value, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostLike(String value) {
            addCriterion("unexpired_credit_cost like", value, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostNotLike(String value) {
            addCriterion("unexpired_credit_cost not like", value, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostIn(List<String> values) {
            addCriterion("unexpired_credit_cost in", values, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostNotIn(List<String> values) {
            addCriterion("unexpired_credit_cost not in", values, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostBetween(String value1, String value2) {
            addCriterion("unexpired_credit_cost between", value1, value2, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredCreditCostNotBetween(String value1, String value2) {
            addCriterion("unexpired_credit_cost not between", value1, value2, "unexpiredCreditCost");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestIsNull() {
            addCriterion("unexpired_interest is null");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestIsNotNull() {
            addCriterion("unexpired_interest is not null");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestEqualTo(String value) {
            addCriterion("unexpired_interest =", value, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestNotEqualTo(String value) {
            addCriterion("unexpired_interest <>", value, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestGreaterThan(String value) {
            addCriterion("unexpired_interest >", value, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestGreaterThanOrEqualTo(String value) {
            addCriterion("unexpired_interest >=", value, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestLessThan(String value) {
            addCriterion("unexpired_interest <", value, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestLessThanOrEqualTo(String value) {
            addCriterion("unexpired_interest <=", value, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestLike(String value) {
            addCriterion("unexpired_interest like", value, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestNotLike(String value) {
            addCriterion("unexpired_interest not like", value, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestIn(List<String> values) {
            addCriterion("unexpired_interest in", values, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestNotIn(List<String> values) {
            addCriterion("unexpired_interest not in", values, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestBetween(String value1, String value2) {
            addCriterion("unexpired_interest between", value1, value2, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andUnexpiredInterestNotBetween(String value1, String value2) {
            addCriterion("unexpired_interest not between", value1, value2, "unexpiredInterest");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNull() {
            addCriterion("balance_amount is null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNotNull() {
            addCriterion("balance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountEqualTo(String value) {
            addCriterion("balance_amount =", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotEqualTo(String value) {
            addCriterion("balance_amount <>", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThan(String value) {
            addCriterion("balance_amount >", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThanOrEqualTo(String value) {
            addCriterion("balance_amount >=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThan(String value) {
            addCriterion("balance_amount <", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThanOrEqualTo(String value) {
            addCriterion("balance_amount <=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLike(String value) {
            addCriterion("balance_amount like", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotLike(String value) {
            addCriterion("balance_amount not like", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIn(List<String> values) {
            addCriterion("balance_amount in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotIn(List<String> values) {
            addCriterion("balance_amount not in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountBetween(String value1, String value2) {
            addCriterion("balance_amount between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotBetween(String value1, String value2) {
            addCriterion("balance_amount not between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberIsNull() {
            addCriterion("rollover_number is null");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberIsNotNull() {
            addCriterion("rollover_number is not null");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberEqualTo(String value) {
            addCriterion("rollover_number =", value, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberNotEqualTo(String value) {
            addCriterion("rollover_number <>", value, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberGreaterThan(String value) {
            addCriterion("rollover_number >", value, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberGreaterThanOrEqualTo(String value) {
            addCriterion("rollover_number >=", value, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberLessThan(String value) {
            addCriterion("rollover_number <", value, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberLessThanOrEqualTo(String value) {
            addCriterion("rollover_number <=", value, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberLike(String value) {
            addCriterion("rollover_number like", value, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberNotLike(String value) {
            addCriterion("rollover_number not like", value, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberIn(List<String> values) {
            addCriterion("rollover_number in", values, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberNotIn(List<String> values) {
            addCriterion("rollover_number not in", values, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberBetween(String value1, String value2) {
            addCriterion("rollover_number between", value1, value2, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverNumberNotBetween(String value1, String value2) {
            addCriterion("rollover_number not between", value1, value2, "rolloverNumber");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeIsNull() {
            addCriterion("rollover_fee is null");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeIsNotNull() {
            addCriterion("rollover_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeEqualTo(String value) {
            addCriterion("rollover_fee =", value, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeNotEqualTo(String value) {
            addCriterion("rollover_fee <>", value, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeGreaterThan(String value) {
            addCriterion("rollover_fee >", value, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeGreaterThanOrEqualTo(String value) {
            addCriterion("rollover_fee >=", value, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeLessThan(String value) {
            addCriterion("rollover_fee <", value, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeLessThanOrEqualTo(String value) {
            addCriterion("rollover_fee <=", value, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeLike(String value) {
            addCriterion("rollover_fee like", value, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeNotLike(String value) {
            addCriterion("rollover_fee not like", value, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeIn(List<String> values) {
            addCriterion("rollover_fee in", values, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeNotIn(List<String> values) {
            addCriterion("rollover_fee not in", values, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeBetween(String value1, String value2) {
            addCriterion("rollover_fee between", value1, value2, "rolloverFee");
            return (Criteria) this;
        }

        public Criteria andRolloverFeeNotBetween(String value1, String value2) {
            addCriterion("rollover_fee not between", value1, value2, "rolloverFee");
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