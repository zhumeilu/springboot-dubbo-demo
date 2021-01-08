package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OUrge implements Serializable {
    /**
     * 主键ID
     *
     * @mbg.generated
     */
    private Integer id;

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
     * 催收订单编号
     *
     * @mbg.generated
     */
    private String urgeId;

    /**
     * 订单ID，=order.id
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 订单生成时间，等于order.ctime
     *
     * @mbg.generated
     */
    private LocalDateTime orderTime;

    /**
     * 银行卡id，关联到user_bankcard表中的id
     *
     * @mbg.generated
     */
    private Integer bankCardId;

    /**
     * 用户Id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 地区或国家编码
     *
     * @mbg.generated
     */
    private String areaCode;

    /**
     * 用户电话号码
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 借款金额（合同）
     *
     * @mbg.generated
     */
    private BigDecimal loanAmount;

    /**
     * 利息
     *
     * @mbg.generated
     */
    private BigDecimal interestAmount;

    /**
     * 罚息（每天更新）
     *
     * @mbg.generated
     */
    private BigDecimal overdueAmount;

    /**
     * 借款周期
     *
     * @mbg.generated
     */
    private Integer loanDays;

    /**
     * 放款时间
     *
     * @mbg.generated
     */
    private LocalDateTime withdrawTime;

    /**
     * 应还日期（基于打款时间）
     *
     * @mbg.generated
     */
    private LocalDate shouldReturnDate;

    /**
     * 阶段变化时间
     *
     * @mbg.generated
     */
    private LocalDateTime stageChangeTime;

    /**
     * operator变化时：更新指派时间
     *
     * @mbg.generated
     */
    private LocalDateTime operatorChangeTime;

    /**
     * 状态/阶段：s0,s1,s2,s3,s4,bad（每天更新）
     *
     * @mbg.generated
     */
    private String stage;

    /**
     * 是否锁定（0:否 1:是）
     *
     * @mbg.generated
     */
    private Boolean isLock;

    /**
     * 减免金额
     *
     * @mbg.generated
     */
    private BigDecimal reductionAmount;

    /**
     * 已还金额
     *
     * @mbg.generated
     */
    private BigDecimal repaidAmount;

    /**
     * 结清时间，非空表示已结清
     *
     * @mbg.generated
     */
    private LocalDateTime repayTime;

    /**
     * 对应product表里的id
     *
     * @mbg.generated
     */
    private Integer productId;

    /**
     * 日罚息率
     *
     * @mbg.generated
     */
    private BigDecimal overdueRatio;

    /**
     * 最大的逾期费率，已loan_amount为基数
     *
     * @mbg.generated
     */
    private BigDecimal overdueMaxRatio;

    /**
     * 日利息，后置收
     *
     * @mbg.generated
     */
    private BigDecimal interestRatio;

    /**
     * 逾期天数（每天更新）
     *
     * @mbg.generated
     */
    private Integer overdueDays;

    /**
     * 催收人员
     *
     * @mbg.generated
     */
    private String urgeOperator;

    /**
     * 最后一次跟进时间(添加修改催收记录，添加修改通讯录备注，添加修改标签，锁定/解锁，还款审核）
     *
     * @mbg.generated
     */
    private LocalDateTime lastFollowTime;

    /**
     * 操作者
     *
     * @mbg.generated
     */
    private String operator;

    /**
     * 催收状态 50催收中;  70催收完成;
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 标签id
     *
     * @mbg.generated
     */
    private Integer labelId;

    /**
     * 分配状态 0待分配 1已分配
     *
     * @mbg.generated
     */
    private Boolean allotStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUrgeId() {
        return urgeId;
    }

    public void setUrgeId(String urgeId) {
        this.urgeId = urgeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(BigDecimal overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public Integer getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(Integer loanDays) {
        this.loanDays = loanDays;
    }

    public LocalDateTime getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(LocalDateTime withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public LocalDate getShouldReturnDate() {
        return shouldReturnDate;
    }

    public void setShouldReturnDate(LocalDate shouldReturnDate) {
        this.shouldReturnDate = shouldReturnDate;
    }

    public LocalDateTime getStageChangeTime() {
        return stageChangeTime;
    }

    public void setStageChangeTime(LocalDateTime stageChangeTime) {
        this.stageChangeTime = stageChangeTime;
    }

    public LocalDateTime getOperatorChangeTime() {
        return operatorChangeTime;
    }

    public void setOperatorChangeTime(LocalDateTime operatorChangeTime) {
        this.operatorChangeTime = operatorChangeTime;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public BigDecimal getRepaidAmount() {
        return repaidAmount;
    }

    public void setRepaidAmount(BigDecimal repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

    public LocalDateTime getRepayTime() {
        return repayTime;
    }

    public void setRepayTime(LocalDateTime repayTime) {
        this.repayTime = repayTime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getOverdueRatio() {
        return overdueRatio;
    }

    public void setOverdueRatio(BigDecimal overdueRatio) {
        this.overdueRatio = overdueRatio;
    }

    public BigDecimal getOverdueMaxRatio() {
        return overdueMaxRatio;
    }

    public void setOverdueMaxRatio(BigDecimal overdueMaxRatio) {
        this.overdueMaxRatio = overdueMaxRatio;
    }

    public BigDecimal getInterestRatio() {
        return interestRatio;
    }

    public void setInterestRatio(BigDecimal interestRatio) {
        this.interestRatio = interestRatio;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getUrgeOperator() {
        return urgeOperator;
    }

    public void setUrgeOperator(String urgeOperator) {
        this.urgeOperator = urgeOperator;
    }

    public LocalDateTime getLastFollowTime() {
        return lastFollowTime;
    }

    public void setLastFollowTime(LocalDateTime lastFollowTime) {
        this.lastFollowTime = lastFollowTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public Boolean getAllotStatus() {
        return allotStatus;
    }

    public void setAllotStatus(Boolean allotStatus) {
        this.allotStatus = allotStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", urgeId=").append(urgeId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", bankCardId=").append(bankCardId);
        sb.append(", userId=").append(userId);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", mobile=").append(mobile);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", interestAmount=").append(interestAmount);
        sb.append(", overdueAmount=").append(overdueAmount);
        sb.append(", loanDays=").append(loanDays);
        sb.append(", withdrawTime=").append(withdrawTime);
        sb.append(", shouldReturnDate=").append(shouldReturnDate);
        sb.append(", stageChangeTime=").append(stageChangeTime);
        sb.append(", operatorChangeTime=").append(operatorChangeTime);
        sb.append(", stage=").append(stage);
        sb.append(", isLock=").append(isLock);
        sb.append(", reductionAmount=").append(reductionAmount);
        sb.append(", repaidAmount=").append(repaidAmount);
        sb.append(", repayTime=").append(repayTime);
        sb.append(", productId=").append(productId);
        sb.append(", overdueRatio=").append(overdueRatio);
        sb.append(", overdueMaxRatio=").append(overdueMaxRatio);
        sb.append(", interestRatio=").append(interestRatio);
        sb.append(", overdueDays=").append(overdueDays);
        sb.append(", urgeOperator=").append(urgeOperator);
        sb.append(", lastFollowTime=").append(lastFollowTime);
        sb.append(", operator=").append(operator);
        sb.append(", status=").append(status);
        sb.append(", labelId=").append(labelId);
        sb.append(", allotStatus=").append(allotStatus);
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
        OUrge other = (OUrge) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUrgeId() == null ? other.getUrgeId() == null : this.getUrgeId().equals(other.getUrgeId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getBankCardId() == null ? other.getBankCardId() == null : this.getBankCardId().equals(other.getBankCardId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getInterestAmount() == null ? other.getInterestAmount() == null : this.getInterestAmount().equals(other.getInterestAmount()))
            && (this.getOverdueAmount() == null ? other.getOverdueAmount() == null : this.getOverdueAmount().equals(other.getOverdueAmount()))
            && (this.getLoanDays() == null ? other.getLoanDays() == null : this.getLoanDays().equals(other.getLoanDays()))
            && (this.getWithdrawTime() == null ? other.getWithdrawTime() == null : this.getWithdrawTime().equals(other.getWithdrawTime()))
            && (this.getShouldReturnDate() == null ? other.getShouldReturnDate() == null : this.getShouldReturnDate().equals(other.getShouldReturnDate()))
            && (this.getStageChangeTime() == null ? other.getStageChangeTime() == null : this.getStageChangeTime().equals(other.getStageChangeTime()))
            && (this.getOperatorChangeTime() == null ? other.getOperatorChangeTime() == null : this.getOperatorChangeTime().equals(other.getOperatorChangeTime()))
            && (this.getStage() == null ? other.getStage() == null : this.getStage().equals(other.getStage()))
            && (this.getIsLock() == null ? other.getIsLock() == null : this.getIsLock().equals(other.getIsLock()))
            && (this.getReductionAmount() == null ? other.getReductionAmount() == null : this.getReductionAmount().equals(other.getReductionAmount()))
            && (this.getRepaidAmount() == null ? other.getRepaidAmount() == null : this.getRepaidAmount().equals(other.getRepaidAmount()))
            && (this.getRepayTime() == null ? other.getRepayTime() == null : this.getRepayTime().equals(other.getRepayTime()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getOverdueRatio() == null ? other.getOverdueRatio() == null : this.getOverdueRatio().equals(other.getOverdueRatio()))
            && (this.getOverdueMaxRatio() == null ? other.getOverdueMaxRatio() == null : this.getOverdueMaxRatio().equals(other.getOverdueMaxRatio()))
            && (this.getInterestRatio() == null ? other.getInterestRatio() == null : this.getInterestRatio().equals(other.getInterestRatio()))
            && (this.getOverdueDays() == null ? other.getOverdueDays() == null : this.getOverdueDays().equals(other.getOverdueDays()))
            && (this.getUrgeOperator() == null ? other.getUrgeOperator() == null : this.getUrgeOperator().equals(other.getUrgeOperator()))
            && (this.getLastFollowTime() == null ? other.getLastFollowTime() == null : this.getLastFollowTime().equals(other.getLastFollowTime()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLabelId() == null ? other.getLabelId() == null : this.getLabelId().equals(other.getLabelId()))
            && (this.getAllotStatus() == null ? other.getAllotStatus() == null : this.getAllotStatus().equals(other.getAllotStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUrgeId() == null) ? 0 : getUrgeId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getBankCardId() == null) ? 0 : getBankCardId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getInterestAmount() == null) ? 0 : getInterestAmount().hashCode());
        result = prime * result + ((getOverdueAmount() == null) ? 0 : getOverdueAmount().hashCode());
        result = prime * result + ((getLoanDays() == null) ? 0 : getLoanDays().hashCode());
        result = prime * result + ((getWithdrawTime() == null) ? 0 : getWithdrawTime().hashCode());
        result = prime * result + ((getShouldReturnDate() == null) ? 0 : getShouldReturnDate().hashCode());
        result = prime * result + ((getStageChangeTime() == null) ? 0 : getStageChangeTime().hashCode());
        result = prime * result + ((getOperatorChangeTime() == null) ? 0 : getOperatorChangeTime().hashCode());
        result = prime * result + ((getStage() == null) ? 0 : getStage().hashCode());
        result = prime * result + ((getIsLock() == null) ? 0 : getIsLock().hashCode());
        result = prime * result + ((getReductionAmount() == null) ? 0 : getReductionAmount().hashCode());
        result = prime * result + ((getRepaidAmount() == null) ? 0 : getRepaidAmount().hashCode());
        result = prime * result + ((getRepayTime() == null) ? 0 : getRepayTime().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getOverdueRatio() == null) ? 0 : getOverdueRatio().hashCode());
        result = prime * result + ((getOverdueMaxRatio() == null) ? 0 : getOverdueMaxRatio().hashCode());
        result = prime * result + ((getInterestRatio() == null) ? 0 : getInterestRatio().hashCode());
        result = prime * result + ((getOverdueDays() == null) ? 0 : getOverdueDays().hashCode());
        result = prime * result + ((getUrgeOperator() == null) ? 0 : getUrgeOperator().hashCode());
        result = prime * result + ((getLastFollowTime() == null) ? 0 : getLastFollowTime().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLabelId() == null) ? 0 : getLabelId().hashCode());
        result = prime * result + ((getAllotStatus() == null) ? 0 : getAllotStatus().hashCode());
        return result;
    }
}