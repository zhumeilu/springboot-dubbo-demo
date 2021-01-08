package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OUrgeReport implements Serializable {
    private Integer id;

    /**
     * 催收阶段
     *
     * @mbg.generated
     */
    private String stage;

    /**
     * 催收人员
     *
     * @mbg.generated
     */
    private String urgeOperator;

    /**
     * 总订单数
     *
     * @mbg.generated
     */
    private Integer totalCount;

    /**
     * 新增订单数
     *
     * @mbg.generated
     */
    private Integer newCount;

    /**
     * 成功订单数
     *
     * @mbg.generated
     */
    private Integer successCount;

    /**
     * 失败订单数
     *
     * @mbg.generated
     */
    private Integer failCount;

    /**
     * 待处理订单数
     *
     * @mbg.generated
     */
    private Integer waitCount;

    /**
     * 催收总金额
     *
     * @mbg.generated
     */
    private BigDecimal totalAmount;

    /**
     * 催回金额
     *
     * @mbg.generated
     */
    private BigDecimal successAmount;

    /**
     * 订单催回率
     *
     * @mbg.generated
     */
    private BigDecimal successRate;

    /**
     * 订单失败率
     *
     * @mbg.generated
     */
    private BigDecimal failRate;

    /**
     * 提成比例
     *
     * @mbg.generated
     */
    private BigDecimal commissionRate;

    /**
     * 总提成
     *
     * @mbg.generated
     */
    private BigDecimal totalCommission;

    /**
     * 统计日期
     *
     * @mbg.generated
     */
    private String statDate;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getUrgeOperator() {
        return urgeOperator;
    }

    public void setUrgeOperator(String urgeOperator) {
        this.urgeOperator = urgeOperator;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getNewCount() {
        return newCount;
    }

    public void setNewCount(Integer newCount) {
        this.newCount = newCount;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public Integer getWaitCount() {
        return waitCount;
    }

    public void setWaitCount(Integer waitCount) {
        this.waitCount = waitCount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getSuccessAmount() {
        return successAmount;
    }

    public void setSuccessAmount(BigDecimal successAmount) {
        this.successAmount = successAmount;
    }

    public BigDecimal getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(BigDecimal successRate) {
        this.successRate = successRate;
    }

    public BigDecimal getFailRate() {
        return failRate;
    }

    public void setFailRate(BigDecimal failRate) {
        this.failRate = failRate;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(BigDecimal totalCommission) {
        this.totalCommission = totalCommission;
    }

    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stage=").append(stage);
        sb.append(", urgeOperator=").append(urgeOperator);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", newCount=").append(newCount);
        sb.append(", successCount=").append(successCount);
        sb.append(", failCount=").append(failCount);
        sb.append(", waitCount=").append(waitCount);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", successAmount=").append(successAmount);
        sb.append(", successRate=").append(successRate);
        sb.append(", failRate=").append(failRate);
        sb.append(", commissionRate=").append(commissionRate);
        sb.append(", totalCommission=").append(totalCommission);
        sb.append(", statDate=").append(statDate);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OUrgeReport other = (OUrgeReport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStage() == null ? other.getStage() == null : this.getStage().equals(other.getStage()))
            && (this.getUrgeOperator() == null ? other.getUrgeOperator() == null : this.getUrgeOperator().equals(other.getUrgeOperator()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getNewCount() == null ? other.getNewCount() == null : this.getNewCount().equals(other.getNewCount()))
            && (this.getSuccessCount() == null ? other.getSuccessCount() == null : this.getSuccessCount().equals(other.getSuccessCount()))
            && (this.getFailCount() == null ? other.getFailCount() == null : this.getFailCount().equals(other.getFailCount()))
            && (this.getWaitCount() == null ? other.getWaitCount() == null : this.getWaitCount().equals(other.getWaitCount()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getSuccessAmount() == null ? other.getSuccessAmount() == null : this.getSuccessAmount().equals(other.getSuccessAmount()))
            && (this.getSuccessRate() == null ? other.getSuccessRate() == null : this.getSuccessRate().equals(other.getSuccessRate()))
            && (this.getFailRate() == null ? other.getFailRate() == null : this.getFailRate().equals(other.getFailRate()))
            && (this.getCommissionRate() == null ? other.getCommissionRate() == null : this.getCommissionRate().equals(other.getCommissionRate()))
            && (this.getTotalCommission() == null ? other.getTotalCommission() == null : this.getTotalCommission().equals(other.getTotalCommission()))
            && (this.getStatDate() == null ? other.getStatDate() == null : this.getStatDate().equals(other.getStatDate()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStage() == null) ? 0 : getStage().hashCode());
        result = prime * result + ((getUrgeOperator() == null) ? 0 : getUrgeOperator().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getNewCount() == null) ? 0 : getNewCount().hashCode());
        result = prime * result + ((getSuccessCount() == null) ? 0 : getSuccessCount().hashCode());
        result = prime * result + ((getFailCount() == null) ? 0 : getFailCount().hashCode());
        result = prime * result + ((getWaitCount() == null) ? 0 : getWaitCount().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getSuccessAmount() == null) ? 0 : getSuccessAmount().hashCode());
        result = prime * result + ((getSuccessRate() == null) ? 0 : getSuccessRate().hashCode());
        result = prime * result + ((getFailRate() == null) ? 0 : getFailRate().hashCode());
        result = prime * result + ((getCommissionRate() == null) ? 0 : getCommissionRate().hashCode());
        result = prime * result + ((getTotalCommission() == null) ? 0 : getTotalCommission().hashCode());
        result = prime * result + ((getStatDate() == null) ? 0 : getStatDate().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}