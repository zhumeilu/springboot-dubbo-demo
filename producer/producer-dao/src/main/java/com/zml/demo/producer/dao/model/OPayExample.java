package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OPayExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OPayExample() {
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

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
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