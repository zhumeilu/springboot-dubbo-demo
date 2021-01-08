package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OExtfeeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OExtfeeExample() {
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

        public Criteria andExtfeeIdIsNull() {
            addCriterion("extfee_id is null");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdIsNotNull() {
            addCriterion("extfee_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdEqualTo(String value) {
            addCriterion("extfee_id =", value, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdNotEqualTo(String value) {
            addCriterion("extfee_id <>", value, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdGreaterThan(String value) {
            addCriterion("extfee_id >", value, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("extfee_id >=", value, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdLessThan(String value) {
            addCriterion("extfee_id <", value, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdLessThanOrEqualTo(String value) {
            addCriterion("extfee_id <=", value, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdLike(String value) {
            addCriterion("extfee_id like", value, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdNotLike(String value) {
            addCriterion("extfee_id not like", value, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdIn(List<String> values) {
            addCriterion("extfee_id in", values, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdNotIn(List<String> values) {
            addCriterion("extfee_id not in", values, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdBetween(String value1, String value2) {
            addCriterion("extfee_id between", value1, value2, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeeIdNotBetween(String value1, String value2) {
            addCriterion("extfee_id not between", value1, value2, "extfeeId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdIsNull() {
            addCriterion("extfee_pay_id is null");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdIsNotNull() {
            addCriterion("extfee_pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdEqualTo(String value) {
            addCriterion("extfee_pay_id =", value, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdNotEqualTo(String value) {
            addCriterion("extfee_pay_id <>", value, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdGreaterThan(String value) {
            addCriterion("extfee_pay_id >", value, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdGreaterThanOrEqualTo(String value) {
            addCriterion("extfee_pay_id >=", value, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdLessThan(String value) {
            addCriterion("extfee_pay_id <", value, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdLessThanOrEqualTo(String value) {
            addCriterion("extfee_pay_id <=", value, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdLike(String value) {
            addCriterion("extfee_pay_id like", value, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdNotLike(String value) {
            addCriterion("extfee_pay_id not like", value, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdIn(List<String> values) {
            addCriterion("extfee_pay_id in", values, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdNotIn(List<String> values) {
            addCriterion("extfee_pay_id not in", values, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdBetween(String value1, String value2) {
            addCriterion("extfee_pay_id between", value1, value2, "extfeePayId");
            return (Criteria) this;
        }

        public Criteria andExtfeePayIdNotBetween(String value1, String value2) {
            addCriterion("extfee_pay_id not between", value1, value2, "extfeePayId");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCreditScoreIsNull() {
            addCriterion("credit_score is null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNotNull() {
            addCriterion("credit_score is not null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreEqualTo(String value) {
            addCriterion("credit_score =", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotEqualTo(String value) {
            addCriterion("credit_score <>", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThan(String value) {
            addCriterion("credit_score >", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThanOrEqualTo(String value) {
            addCriterion("credit_score >=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThan(String value) {
            addCriterion("credit_score <", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThanOrEqualTo(String value) {
            addCriterion("credit_score <=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLike(String value) {
            addCriterion("credit_score like", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotLike(String value) {
            addCriterion("credit_score not like", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIn(List<String> values) {
            addCriterion("credit_score in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotIn(List<String> values) {
            addCriterion("credit_score not in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreBetween(String value1, String value2) {
            addCriterion("credit_score between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotBetween(String value1, String value2) {
            addCriterion("credit_score not between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(LocalDateTime value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(LocalDateTime value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(LocalDateTime value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(LocalDateTime value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<LocalDateTime> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<LocalDateTime> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andIsRealnameIsNull() {
            addCriterion("is_realname is null");
            return (Criteria) this;
        }

        public Criteria andIsRealnameIsNotNull() {
            addCriterion("is_realname is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealnameEqualTo(Byte value) {
            addCriterion("is_realname =", value, "isRealname");
            return (Criteria) this;
        }

        public Criteria andIsRealnameNotEqualTo(Byte value) {
            addCriterion("is_realname <>", value, "isRealname");
            return (Criteria) this;
        }

        public Criteria andIsRealnameGreaterThan(Byte value) {
            addCriterion("is_realname >", value, "isRealname");
            return (Criteria) this;
        }

        public Criteria andIsRealnameGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_realname >=", value, "isRealname");
            return (Criteria) this;
        }

        public Criteria andIsRealnameLessThan(Byte value) {
            addCriterion("is_realname <", value, "isRealname");
            return (Criteria) this;
        }

        public Criteria andIsRealnameLessThanOrEqualTo(Byte value) {
            addCriterion("is_realname <=", value, "isRealname");
            return (Criteria) this;
        }

        public Criteria andIsRealnameIn(List<Byte> values) {
            addCriterion("is_realname in", values, "isRealname");
            return (Criteria) this;
        }

        public Criteria andIsRealnameNotIn(List<Byte> values) {
            addCriterion("is_realname not in", values, "isRealname");
            return (Criteria) this;
        }

        public Criteria andIsRealnameBetween(Byte value1, Byte value2) {
            addCriterion("is_realname between", value1, value2, "isRealname");
            return (Criteria) this;
        }

        public Criteria andIsRealnameNotBetween(Byte value1, Byte value2) {
            addCriterion("is_realname not between", value1, value2, "isRealname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueIsNull() {
            addCriterion("is_contact_relative_overdue is null");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueIsNotNull() {
            addCriterion("is_contact_relative_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueEqualTo(Byte value) {
            addCriterion("is_contact_relative_overdue =", value, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueNotEqualTo(Byte value) {
            addCriterion("is_contact_relative_overdue <>", value, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueGreaterThan(Byte value) {
            addCriterion("is_contact_relative_overdue >", value, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_contact_relative_overdue >=", value, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueLessThan(Byte value) {
            addCriterion("is_contact_relative_overdue <", value, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueLessThanOrEqualTo(Byte value) {
            addCriterion("is_contact_relative_overdue <=", value, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueIn(List<Byte> values) {
            addCriterion("is_contact_relative_overdue in", values, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueNotIn(List<Byte> values) {
            addCriterion("is_contact_relative_overdue not in", values, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueBetween(Byte value1, Byte value2) {
            addCriterion("is_contact_relative_overdue between", value1, value2, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactRelativeOverdueNotBetween(Byte value1, Byte value2) {
            addCriterion("is_contact_relative_overdue not between", value1, value2, "isContactRelativeOverdue");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountIsNull() {
            addCriterion("contact_relative_contact_count is null");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountIsNotNull() {
            addCriterion("contact_relative_contact_count is not null");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountEqualTo(Integer value) {
            addCriterion("contact_relative_contact_count =", value, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountNotEqualTo(Integer value) {
            addCriterion("contact_relative_contact_count <>", value, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountGreaterThan(Integer value) {
            addCriterion("contact_relative_contact_count >", value, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_relative_contact_count >=", value, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountLessThan(Integer value) {
            addCriterion("contact_relative_contact_count <", value, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountLessThanOrEqualTo(Integer value) {
            addCriterion("contact_relative_contact_count <=", value, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountIn(List<Integer> values) {
            addCriterion("contact_relative_contact_count in", values, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountNotIn(List<Integer> values) {
            addCriterion("contact_relative_contact_count not in", values, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountBetween(Integer value1, Integer value2) {
            addCriterion("contact_relative_contact_count between", value1, value2, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andContactRelativeContactCountNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_relative_contact_count not between", value1, value2, "contactRelativeContactCount");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueIsNull() {
            addCriterion("is_contact_friend_overdue is null");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueIsNotNull() {
            addCriterion("is_contact_friend_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueEqualTo(Byte value) {
            addCriterion("is_contact_friend_overdue =", value, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueNotEqualTo(Byte value) {
            addCriterion("is_contact_friend_overdue <>", value, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueGreaterThan(Byte value) {
            addCriterion("is_contact_friend_overdue >", value, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_contact_friend_overdue >=", value, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueLessThan(Byte value) {
            addCriterion("is_contact_friend_overdue <", value, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueLessThanOrEqualTo(Byte value) {
            addCriterion("is_contact_friend_overdue <=", value, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueIn(List<Byte> values) {
            addCriterion("is_contact_friend_overdue in", values, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueNotIn(List<Byte> values) {
            addCriterion("is_contact_friend_overdue not in", values, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueBetween(Byte value1, Byte value2) {
            addCriterion("is_contact_friend_overdue between", value1, value2, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andIsContactFriendOverdueNotBetween(Byte value1, Byte value2) {
            addCriterion("is_contact_friend_overdue not between", value1, value2, "isContactFriendOverdue");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountIsNull() {
            addCriterion("contact_friend_contact_count is null");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountIsNotNull() {
            addCriterion("contact_friend_contact_count is not null");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountEqualTo(Integer value) {
            addCriterion("contact_friend_contact_count =", value, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountNotEqualTo(Integer value) {
            addCriterion("contact_friend_contact_count <>", value, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountGreaterThan(Integer value) {
            addCriterion("contact_friend_contact_count >", value, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_friend_contact_count >=", value, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountLessThan(Integer value) {
            addCriterion("contact_friend_contact_count <", value, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountLessThanOrEqualTo(Integer value) {
            addCriterion("contact_friend_contact_count <=", value, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountIn(List<Integer> values) {
            addCriterion("contact_friend_contact_count in", values, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountNotIn(List<Integer> values) {
            addCriterion("contact_friend_contact_count not in", values, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountBetween(Integer value1, Integer value2) {
            addCriterion("contact_friend_contact_count between", value1, value2, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactFriendContactCountNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_friend_contact_count not between", value1, value2, "contactFriendContactCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountIsNull() {
            addCriterion("contact_sensitive_count is null");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountIsNotNull() {
            addCriterion("contact_sensitive_count is not null");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountEqualTo(Integer value) {
            addCriterion("contact_sensitive_count =", value, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountNotEqualTo(Integer value) {
            addCriterion("contact_sensitive_count <>", value, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountGreaterThan(Integer value) {
            addCriterion("contact_sensitive_count >", value, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_sensitive_count >=", value, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountLessThan(Integer value) {
            addCriterion("contact_sensitive_count <", value, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountLessThanOrEqualTo(Integer value) {
            addCriterion("contact_sensitive_count <=", value, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountIn(List<Integer> values) {
            addCriterion("contact_sensitive_count in", values, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountNotIn(List<Integer> values) {
            addCriterion("contact_sensitive_count not in", values, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountBetween(Integer value1, Integer value2) {
            addCriterion("contact_sensitive_count between", value1, value2, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andContactSensitiveCountNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_sensitive_count not between", value1, value2, "contactSensitiveCount");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackIsNull() {
            addCriterion("is_idcard_black is null");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackIsNotNull() {
            addCriterion("is_idcard_black is not null");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackEqualTo(Byte value) {
            addCriterion("is_idcard_black =", value, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackNotEqualTo(Byte value) {
            addCriterion("is_idcard_black <>", value, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackGreaterThan(Byte value) {
            addCriterion("is_idcard_black >", value, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_idcard_black >=", value, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackLessThan(Byte value) {
            addCriterion("is_idcard_black <", value, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackLessThanOrEqualTo(Byte value) {
            addCriterion("is_idcard_black <=", value, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackIn(List<Byte> values) {
            addCriterion("is_idcard_black in", values, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackNotIn(List<Byte> values) {
            addCriterion("is_idcard_black not in", values, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackBetween(Byte value1, Byte value2) {
            addCriterion("is_idcard_black between", value1, value2, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBlackNotBetween(Byte value1, Byte value2) {
            addCriterion("is_idcard_black not between", value1, value2, "isIdcardBlack");
            return (Criteria) this;
        }

        public Criteria andLoanCountIsNull() {
            addCriterion("loan_count is null");
            return (Criteria) this;
        }

        public Criteria andLoanCountIsNotNull() {
            addCriterion("loan_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoanCountEqualTo(Integer value) {
            addCriterion("loan_count =", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountNotEqualTo(Integer value) {
            addCriterion("loan_count <>", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountGreaterThan(Integer value) {
            addCriterion("loan_count >", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_count >=", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountLessThan(Integer value) {
            addCriterion("loan_count <", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountLessThanOrEqualTo(Integer value) {
            addCriterion("loan_count <=", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountIn(List<Integer> values) {
            addCriterion("loan_count in", values, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountNotIn(List<Integer> values) {
            addCriterion("loan_count not in", values, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountBetween(Integer value1, Integer value2) {
            addCriterion("loan_count between", value1, value2, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_count not between", value1, value2, "loanCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountIsNull() {
            addCriterion("idcard_overdue_count is null");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountIsNotNull() {
            addCriterion("idcard_overdue_count is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountEqualTo(Integer value) {
            addCriterion("idcard_overdue_count =", value, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountNotEqualTo(Integer value) {
            addCriterion("idcard_overdue_count <>", value, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountGreaterThan(Integer value) {
            addCriterion("idcard_overdue_count >", value, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("idcard_overdue_count >=", value, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountLessThan(Integer value) {
            addCriterion("idcard_overdue_count <", value, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountLessThanOrEqualTo(Integer value) {
            addCriterion("idcard_overdue_count <=", value, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountIn(List<Integer> values) {
            addCriterion("idcard_overdue_count in", values, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountNotIn(List<Integer> values) {
            addCriterion("idcard_overdue_count not in", values, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountBetween(Integer value1, Integer value2) {
            addCriterion("idcard_overdue_count between", value1, value2, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andIdcardOverdueCountNotBetween(Integer value1, Integer value2) {
            addCriterion("idcard_overdue_count not between", value1, value2, "idcardOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLivingScoreIsNull() {
            addCriterion("living_score is null");
            return (Criteria) this;
        }

        public Criteria andLivingScoreIsNotNull() {
            addCriterion("living_score is not null");
            return (Criteria) this;
        }

        public Criteria andLivingScoreEqualTo(String value) {
            addCriterion("living_score =", value, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreNotEqualTo(String value) {
            addCriterion("living_score <>", value, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreGreaterThan(String value) {
            addCriterion("living_score >", value, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreGreaterThanOrEqualTo(String value) {
            addCriterion("living_score >=", value, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreLessThan(String value) {
            addCriterion("living_score <", value, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreLessThanOrEqualTo(String value) {
            addCriterion("living_score <=", value, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreLike(String value) {
            addCriterion("living_score like", value, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreNotLike(String value) {
            addCriterion("living_score not like", value, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreIn(List<String> values) {
            addCriterion("living_score in", values, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreNotIn(List<String> values) {
            addCriterion("living_score not in", values, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreBetween(String value1, String value2) {
            addCriterion("living_score between", value1, value2, "livingScore");
            return (Criteria) this;
        }

        public Criteria andLivingScoreNotBetween(String value1, String value2) {
            addCriterion("living_score not between", value1, value2, "livingScore");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityIsNull() {
            addCriterion("face_comparison_similarity is null");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityIsNotNull() {
            addCriterion("face_comparison_similarity is not null");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityEqualTo(String value) {
            addCriterion("face_comparison_similarity =", value, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityNotEqualTo(String value) {
            addCriterion("face_comparison_similarity <>", value, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityGreaterThan(String value) {
            addCriterion("face_comparison_similarity >", value, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityGreaterThanOrEqualTo(String value) {
            addCriterion("face_comparison_similarity >=", value, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityLessThan(String value) {
            addCriterion("face_comparison_similarity <", value, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityLessThanOrEqualTo(String value) {
            addCriterion("face_comparison_similarity <=", value, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityLike(String value) {
            addCriterion("face_comparison_similarity like", value, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityNotLike(String value) {
            addCriterion("face_comparison_similarity not like", value, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityIn(List<String> values) {
            addCriterion("face_comparison_similarity in", values, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityNotIn(List<String> values) {
            addCriterion("face_comparison_similarity not in", values, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityBetween(String value1, String value2) {
            addCriterion("face_comparison_similarity between", value1, value2, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andFaceComparisonSimilarityNotBetween(String value1, String value2) {
            addCriterion("face_comparison_similarity not between", value1, value2, "faceComparisonSimilarity");
            return (Criteria) this;
        }

        public Criteria andIsOcrIsNull() {
            addCriterion("is_ocr is null");
            return (Criteria) this;
        }

        public Criteria andIsOcrIsNotNull() {
            addCriterion("is_ocr is not null");
            return (Criteria) this;
        }

        public Criteria andIsOcrEqualTo(Byte value) {
            addCriterion("is_ocr =", value, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIsOcrNotEqualTo(Byte value) {
            addCriterion("is_ocr <>", value, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIsOcrGreaterThan(Byte value) {
            addCriterion("is_ocr >", value, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIsOcrGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_ocr >=", value, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIsOcrLessThan(Byte value) {
            addCriterion("is_ocr <", value, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIsOcrLessThanOrEqualTo(Byte value) {
            addCriterion("is_ocr <=", value, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIsOcrIn(List<Byte> values) {
            addCriterion("is_ocr in", values, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIsOcrNotIn(List<Byte> values) {
            addCriterion("is_ocr not in", values, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIsOcrBetween(Byte value1, Byte value2) {
            addCriterion("is_ocr between", value1, value2, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIsOcrNotBetween(Byte value1, Byte value2) {
            addCriterion("is_ocr not between", value1, value2, "isOcr");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysIsNull() {
            addCriterion("idcard_recent_overdue_days is null");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysIsNotNull() {
            addCriterion("idcard_recent_overdue_days is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysEqualTo(Integer value) {
            addCriterion("idcard_recent_overdue_days =", value, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysNotEqualTo(Integer value) {
            addCriterion("idcard_recent_overdue_days <>", value, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysGreaterThan(Integer value) {
            addCriterion("idcard_recent_overdue_days >", value, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("idcard_recent_overdue_days >=", value, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysLessThan(Integer value) {
            addCriterion("idcard_recent_overdue_days <", value, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("idcard_recent_overdue_days <=", value, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysIn(List<Integer> values) {
            addCriterion("idcard_recent_overdue_days in", values, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysNotIn(List<Integer> values) {
            addCriterion("idcard_recent_overdue_days not in", values, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysBetween(Integer value1, Integer value2) {
            addCriterion("idcard_recent_overdue_days between", value1, value2, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardRecentOverdueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("idcard_recent_overdue_days not between", value1, value2, "idcardRecentOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysIsNull() {
            addCriterion("idcard_history_overdue_days is null");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysIsNotNull() {
            addCriterion("idcard_history_overdue_days is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysEqualTo(Integer value) {
            addCriterion("idcard_history_overdue_days =", value, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysNotEqualTo(Integer value) {
            addCriterion("idcard_history_overdue_days <>", value, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysGreaterThan(Integer value) {
            addCriterion("idcard_history_overdue_days >", value, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("idcard_history_overdue_days >=", value, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysLessThan(Integer value) {
            addCriterion("idcard_history_overdue_days <", value, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("idcard_history_overdue_days <=", value, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysIn(List<Integer> values) {
            addCriterion("idcard_history_overdue_days in", values, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysNotIn(List<Integer> values) {
            addCriterion("idcard_history_overdue_days not in", values, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysBetween(Integer value1, Integer value2) {
            addCriterion("idcard_history_overdue_days between", value1, value2, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardHistoryOverdueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("idcard_history_overdue_days not between", value1, value2, "idcardHistoryOverdueDays");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysIsNull() {
            addCriterion("idcard_about_contact_count_180_days is null");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysIsNotNull() {
            addCriterion("idcard_about_contact_count_180_days is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysEqualTo(Integer value) {
            addCriterion("idcard_about_contact_count_180_days =", value, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysNotEqualTo(Integer value) {
            addCriterion("idcard_about_contact_count_180_days <>", value, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysGreaterThan(Integer value) {
            addCriterion("idcard_about_contact_count_180_days >", value, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("idcard_about_contact_count_180_days >=", value, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysLessThan(Integer value) {
            addCriterion("idcard_about_contact_count_180_days <", value, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysLessThanOrEqualTo(Integer value) {
            addCriterion("idcard_about_contact_count_180_days <=", value, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysIn(List<Integer> values) {
            addCriterion("idcard_about_contact_count_180_days in", values, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysNotIn(List<Integer> values) {
            addCriterion("idcard_about_contact_count_180_days not in", values, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysBetween(Integer value1, Integer value2) {
            addCriterion("idcard_about_contact_count_180_days between", value1, value2, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andIdcardAboutContactCount180DaysNotBetween(Integer value1, Integer value2) {
            addCriterion("idcard_about_contact_count_180_days not between", value1, value2, "idcardAboutContactCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysIsNull() {
            addCriterion("bank_account_about_idcard_count_180_days is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysIsNotNull() {
            addCriterion("bank_account_about_idcard_count_180_days is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysEqualTo(Integer value) {
            addCriterion("bank_account_about_idcard_count_180_days =", value, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysNotEqualTo(Integer value) {
            addCriterion("bank_account_about_idcard_count_180_days <>", value, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysGreaterThan(Integer value) {
            addCriterion("bank_account_about_idcard_count_180_days >", value, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_account_about_idcard_count_180_days >=", value, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysLessThan(Integer value) {
            addCriterion("bank_account_about_idcard_count_180_days <", value, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysLessThanOrEqualTo(Integer value) {
            addCriterion("bank_account_about_idcard_count_180_days <=", value, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysIn(List<Integer> values) {
            addCriterion("bank_account_about_idcard_count_180_days in", values, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysNotIn(List<Integer> values) {
            addCriterion("bank_account_about_idcard_count_180_days not in", values, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysBetween(Integer value1, Integer value2) {
            addCriterion("bank_account_about_idcard_count_180_days between", value1, value2, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andBankAccountAboutIdcardCount180DaysNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_account_about_idcard_count_180_days not between", value1, value2, "bankAccountAboutIdcardCount180Days");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountIsNull() {
            addCriterion("phone_about_emergency_count is null");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountIsNotNull() {
            addCriterion("phone_about_emergency_count is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountEqualTo(Integer value) {
            addCriterion("phone_about_emergency_count =", value, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountNotEqualTo(Integer value) {
            addCriterion("phone_about_emergency_count <>", value, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountGreaterThan(Integer value) {
            addCriterion("phone_about_emergency_count >", value, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_about_emergency_count >=", value, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountLessThan(Integer value) {
            addCriterion("phone_about_emergency_count <", value, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountLessThanOrEqualTo(Integer value) {
            addCriterion("phone_about_emergency_count <=", value, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountIn(List<Integer> values) {
            addCriterion("phone_about_emergency_count in", values, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountNotIn(List<Integer> values) {
            addCriterion("phone_about_emergency_count not in", values, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountBetween(Integer value1, Integer value2) {
            addCriterion("phone_about_emergency_count between", value1, value2, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andPhoneAboutEmergencyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_about_emergency_count not between", value1, value2, "phoneAboutEmergencyCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountIsNull() {
            addCriterion("contact_valid_count is null");
            return (Criteria) this;
        }

        public Criteria andContactValidCountIsNotNull() {
            addCriterion("contact_valid_count is not null");
            return (Criteria) this;
        }

        public Criteria andContactValidCountEqualTo(Integer value) {
            addCriterion("contact_valid_count =", value, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountNotEqualTo(Integer value) {
            addCriterion("contact_valid_count <>", value, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountGreaterThan(Integer value) {
            addCriterion("contact_valid_count >", value, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_valid_count >=", value, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountLessThan(Integer value) {
            addCriterion("contact_valid_count <", value, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountLessThanOrEqualTo(Integer value) {
            addCriterion("contact_valid_count <=", value, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountIn(List<Integer> values) {
            addCriterion("contact_valid_count in", values, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountNotIn(List<Integer> values) {
            addCriterion("contact_valid_count not in", values, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountBetween(Integer value1, Integer value2) {
            addCriterion("contact_valid_count between", value1, value2, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactValidCountNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_valid_count not between", value1, value2, "contactValidCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountIsNull() {
            addCriterion("contact_about_overdue_count is null");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountIsNotNull() {
            addCriterion("contact_about_overdue_count is not null");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountEqualTo(Integer value) {
            addCriterion("contact_about_overdue_count =", value, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountNotEqualTo(Integer value) {
            addCriterion("contact_about_overdue_count <>", value, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountGreaterThan(Integer value) {
            addCriterion("contact_about_overdue_count >", value, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_about_overdue_count >=", value, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountLessThan(Integer value) {
            addCriterion("contact_about_overdue_count <", value, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountLessThanOrEqualTo(Integer value) {
            addCriterion("contact_about_overdue_count <=", value, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountIn(List<Integer> values) {
            addCriterion("contact_about_overdue_count in", values, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountNotIn(List<Integer> values) {
            addCriterion("contact_about_overdue_count not in", values, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountBetween(Integer value1, Integer value2) {
            addCriterion("contact_about_overdue_count between", value1, value2, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutOverdueCountNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_about_overdue_count not between", value1, value2, "contactAboutOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountIsNull() {
            addCriterion("contact_about_bad_overdue_count is null");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountIsNotNull() {
            addCriterion("contact_about_bad_overdue_count is not null");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountEqualTo(Integer value) {
            addCriterion("contact_about_bad_overdue_count =", value, "contactAboutBadOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountNotEqualTo(Integer value) {
            addCriterion("contact_about_bad_overdue_count <>", value, "contactAboutBadOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountGreaterThan(Integer value) {
            addCriterion("contact_about_bad_overdue_count >", value, "contactAboutBadOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_about_bad_overdue_count >=", value, "contactAboutBadOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountLessThan(Integer value) {
            addCriterion("contact_about_bad_overdue_count <", value, "contactAboutBadOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountLessThanOrEqualTo(Integer value) {
            addCriterion("contact_about_bad_overdue_count <=", value, "contactAboutBadOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountIn(List<Integer> values) {
            addCriterion("contact_about_bad_overdue_count in", values, "contactAboutBadOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountNotIn(List<Integer> values) {
            addCriterion("contact_about_bad_overdue_count not in", values, "contactAboutBadOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountBetween(Integer value1, Integer value2) {
            addCriterion("contact_about_bad_overdue_count between", value1, value2, "contactAboutBadOverdueCount");
            return (Criteria) this;
        }

        public Criteria andContactAboutBadOverdueCountNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_about_bad_overdue_count not between", value1, value2, "contactAboutBadOverdueCount");
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