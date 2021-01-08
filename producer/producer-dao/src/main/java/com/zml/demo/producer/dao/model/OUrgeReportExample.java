package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OUrgeReportExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OUrgeReportExample() {
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

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andNewCountIsNull() {
            addCriterion("new_count is null");
            return (Criteria) this;
        }

        public Criteria andNewCountIsNotNull() {
            addCriterion("new_count is not null");
            return (Criteria) this;
        }

        public Criteria andNewCountEqualTo(Integer value) {
            addCriterion("new_count =", value, "newCount");
            return (Criteria) this;
        }

        public Criteria andNewCountNotEqualTo(Integer value) {
            addCriterion("new_count <>", value, "newCount");
            return (Criteria) this;
        }

        public Criteria andNewCountGreaterThan(Integer value) {
            addCriterion("new_count >", value, "newCount");
            return (Criteria) this;
        }

        public Criteria andNewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_count >=", value, "newCount");
            return (Criteria) this;
        }

        public Criteria andNewCountLessThan(Integer value) {
            addCriterion("new_count <", value, "newCount");
            return (Criteria) this;
        }

        public Criteria andNewCountLessThanOrEqualTo(Integer value) {
            addCriterion("new_count <=", value, "newCount");
            return (Criteria) this;
        }

        public Criteria andNewCountIn(List<Integer> values) {
            addCriterion("new_count in", values, "newCount");
            return (Criteria) this;
        }

        public Criteria andNewCountNotIn(List<Integer> values) {
            addCriterion("new_count not in", values, "newCount");
            return (Criteria) this;
        }

        public Criteria andNewCountBetween(Integer value1, Integer value2) {
            addCriterion("new_count between", value1, value2, "newCount");
            return (Criteria) this;
        }

        public Criteria andNewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("new_count not between", value1, value2, "newCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountIsNull() {
            addCriterion("success_count is null");
            return (Criteria) this;
        }

        public Criteria andSuccessCountIsNotNull() {
            addCriterion("success_count is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessCountEqualTo(Integer value) {
            addCriterion("success_count =", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountNotEqualTo(Integer value) {
            addCriterion("success_count <>", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountGreaterThan(Integer value) {
            addCriterion("success_count >", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("success_count >=", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountLessThan(Integer value) {
            addCriterion("success_count <", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountLessThanOrEqualTo(Integer value) {
            addCriterion("success_count <=", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountIn(List<Integer> values) {
            addCriterion("success_count in", values, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountNotIn(List<Integer> values) {
            addCriterion("success_count not in", values, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountBetween(Integer value1, Integer value2) {
            addCriterion("success_count between", value1, value2, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountNotBetween(Integer value1, Integer value2) {
            addCriterion("success_count not between", value1, value2, "successCount");
            return (Criteria) this;
        }

        public Criteria andFailCountIsNull() {
            addCriterion("fail_count is null");
            return (Criteria) this;
        }

        public Criteria andFailCountIsNotNull() {
            addCriterion("fail_count is not null");
            return (Criteria) this;
        }

        public Criteria andFailCountEqualTo(Integer value) {
            addCriterion("fail_count =", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotEqualTo(Integer value) {
            addCriterion("fail_count <>", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountGreaterThan(Integer value) {
            addCriterion("fail_count >", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fail_count >=", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountLessThan(Integer value) {
            addCriterion("fail_count <", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountLessThanOrEqualTo(Integer value) {
            addCriterion("fail_count <=", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountIn(List<Integer> values) {
            addCriterion("fail_count in", values, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotIn(List<Integer> values) {
            addCriterion("fail_count not in", values, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountBetween(Integer value1, Integer value2) {
            addCriterion("fail_count between", value1, value2, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fail_count not between", value1, value2, "failCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountIsNull() {
            addCriterion("wait_count is null");
            return (Criteria) this;
        }

        public Criteria andWaitCountIsNotNull() {
            addCriterion("wait_count is not null");
            return (Criteria) this;
        }

        public Criteria andWaitCountEqualTo(Integer value) {
            addCriterion("wait_count =", value, "waitCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountNotEqualTo(Integer value) {
            addCriterion("wait_count <>", value, "waitCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountGreaterThan(Integer value) {
            addCriterion("wait_count >", value, "waitCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wait_count >=", value, "waitCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountLessThan(Integer value) {
            addCriterion("wait_count <", value, "waitCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountLessThanOrEqualTo(Integer value) {
            addCriterion("wait_count <=", value, "waitCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountIn(List<Integer> values) {
            addCriterion("wait_count in", values, "waitCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountNotIn(List<Integer> values) {
            addCriterion("wait_count not in", values, "waitCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountBetween(Integer value1, Integer value2) {
            addCriterion("wait_count between", value1, value2, "waitCount");
            return (Criteria) this;
        }

        public Criteria andWaitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("wait_count not between", value1, value2, "waitCount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountIsNull() {
            addCriterion("success_amount is null");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountIsNotNull() {
            addCriterion("success_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountEqualTo(BigDecimal value) {
            addCriterion("success_amount =", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountNotEqualTo(BigDecimal value) {
            addCriterion("success_amount <>", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountGreaterThan(BigDecimal value) {
            addCriterion("success_amount >", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("success_amount >=", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountLessThan(BigDecimal value) {
            addCriterion("success_amount <", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("success_amount <=", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountIn(List<BigDecimal> values) {
            addCriterion("success_amount in", values, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountNotIn(List<BigDecimal> values) {
            addCriterion("success_amount not in", values, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("success_amount between", value1, value2, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("success_amount not between", value1, value2, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessRateIsNull() {
            addCriterion("success_rate is null");
            return (Criteria) this;
        }

        public Criteria andSuccessRateIsNotNull() {
            addCriterion("success_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessRateEqualTo(BigDecimal value) {
            addCriterion("success_rate =", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateNotEqualTo(BigDecimal value) {
            addCriterion("success_rate <>", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateGreaterThan(BigDecimal value) {
            addCriterion("success_rate >", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("success_rate >=", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateLessThan(BigDecimal value) {
            addCriterion("success_rate <", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("success_rate <=", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateIn(List<BigDecimal> values) {
            addCriterion("success_rate in", values, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateNotIn(List<BigDecimal> values) {
            addCriterion("success_rate not in", values, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("success_rate between", value1, value2, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("success_rate not between", value1, value2, "successRate");
            return (Criteria) this;
        }

        public Criteria andFailRateIsNull() {
            addCriterion("fail_rate is null");
            return (Criteria) this;
        }

        public Criteria andFailRateIsNotNull() {
            addCriterion("fail_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFailRateEqualTo(BigDecimal value) {
            addCriterion("fail_rate =", value, "failRate");
            return (Criteria) this;
        }

        public Criteria andFailRateNotEqualTo(BigDecimal value) {
            addCriterion("fail_rate <>", value, "failRate");
            return (Criteria) this;
        }

        public Criteria andFailRateGreaterThan(BigDecimal value) {
            addCriterion("fail_rate >", value, "failRate");
            return (Criteria) this;
        }

        public Criteria andFailRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fail_rate >=", value, "failRate");
            return (Criteria) this;
        }

        public Criteria andFailRateLessThan(BigDecimal value) {
            addCriterion("fail_rate <", value, "failRate");
            return (Criteria) this;
        }

        public Criteria andFailRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fail_rate <=", value, "failRate");
            return (Criteria) this;
        }

        public Criteria andFailRateIn(List<BigDecimal> values) {
            addCriterion("fail_rate in", values, "failRate");
            return (Criteria) this;
        }

        public Criteria andFailRateNotIn(List<BigDecimal> values) {
            addCriterion("fail_rate not in", values, "failRate");
            return (Criteria) this;
        }

        public Criteria andFailRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fail_rate between", value1, value2, "failRate");
            return (Criteria) this;
        }

        public Criteria andFailRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fail_rate not between", value1, value2, "failRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(BigDecimal value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(BigDecimal value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(BigDecimal value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(BigDecimal value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<BigDecimal> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<BigDecimal> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionIsNull() {
            addCriterion("total_commission is null");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionIsNotNull() {
            addCriterion("total_commission is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionEqualTo(BigDecimal value) {
            addCriterion("total_commission =", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionNotEqualTo(BigDecimal value) {
            addCriterion("total_commission <>", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionGreaterThan(BigDecimal value) {
            addCriterion("total_commission >", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_commission >=", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionLessThan(BigDecimal value) {
            addCriterion("total_commission <", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_commission <=", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionIn(List<BigDecimal> values) {
            addCriterion("total_commission in", values, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionNotIn(List<BigDecimal> values) {
            addCriterion("total_commission not in", values, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_commission between", value1, value2, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_commission not between", value1, value2, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andStatDateIsNull() {
            addCriterion("stat_date is null");
            return (Criteria) this;
        }

        public Criteria andStatDateIsNotNull() {
            addCriterion("stat_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatDateEqualTo(String value) {
            addCriterion("stat_date =", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotEqualTo(String value) {
            addCriterion("stat_date <>", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateGreaterThan(String value) {
            addCriterion("stat_date >", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateGreaterThanOrEqualTo(String value) {
            addCriterion("stat_date >=", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateLessThan(String value) {
            addCriterion("stat_date <", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateLessThanOrEqualTo(String value) {
            addCriterion("stat_date <=", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateLike(String value) {
            addCriterion("stat_date like", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotLike(String value) {
            addCriterion("stat_date not like", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateIn(List<String> values) {
            addCriterion("stat_date in", values, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotIn(List<String> values) {
            addCriterion("stat_date not in", values, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateBetween(String value1, String value2) {
            addCriterion("stat_date between", value1, value2, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotBetween(String value1, String value2) {
            addCriterion("stat_date not between", value1, value2, "statDate");
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