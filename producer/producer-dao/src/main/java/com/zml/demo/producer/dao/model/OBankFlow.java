package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OBankFlow implements Serializable {
    private Integer id;

    /**
     * 序号
     *
     * @mbg.generated
     */
    private String flowId;

    /**
     * 收款时间
     *
     * @mbg.generated
     */
    private LocalDateTime collectionTime;

    /**
     * 收款金额
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * 收款详情
     *
     * @mbg.generated
     */
    private String details;

    /**
     * 流水状态
10 未关联
20 已关联
30 其他收入
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 关联订单号
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 关联pay编号
     *
     * @mbg.generated
     */
    private String payId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * 最后操作人
     *
     * @mbg.generated
     */
    private String operator;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public LocalDateTime getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(LocalDateTime collectionTime) {
        this.collectionTime = collectionTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowId=").append(flowId);
        sb.append(", collectionTime=").append(collectionTime);
        sb.append(", amount=").append(amount);
        sb.append(", details=").append(details);
        sb.append(", status=").append(status);
        sb.append(", orderId=").append(orderId);
        sb.append(", payId=").append(payId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", operator=").append(operator);
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
        OBankFlow other = (OBankFlow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()))
            && (this.getCollectionTime() == null ? other.getCollectionTime() == null : this.getCollectionTime().equals(other.getCollectionTime()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        result = prime * result + ((getCollectionTime() == null) ? 0 : getCollectionTime().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }
}