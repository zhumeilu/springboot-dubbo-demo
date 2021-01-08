package com.zml.demo.producer.dao.model;

import java.io.Serializable;

public class SOrder implements Serializable {
    private Integer id;

    /**
     * 日期
     *
     * @mbg.generated
     */
    private String staDate;

    /**
     * 实付订单数
     *
     * @mbg.generated
     */
    private String realOrderCount;

    /**
     * 实付本金
     *
     * @mbg.generated
     */
    private String realPrincipal;

    /**
     * 实付报告费
     *
     * @mbg.generated
     */
    private String realCreditFee;

    /**
     * 已结清订单数
     *
     * @mbg.generated
     */
    private String settleOrderCount;

    /**
     * 已结清本金
     *
     * @mbg.generated
     */
    private String settlePrincipal;

    /**
     * 已结清报告费
     *
     * @mbg.generated
     */
    private String settleCreditFee;

    /**
     * 已结清利息
     *
     * @mbg.generated
     */
    private String settleInterest;

    /**
     * 已结清罚息
     *
     * @mbg.generated
     */
    private String settlePenaltyInterest;

    /**
     * 已结清其他收入
     *
     * @mbg.generated
     */
    private String settleOtherAmount;

    /**
     * 已结清平账
     *
     * @mbg.generated
     */
    private String settleBalance;

    /**
     * 未结清订单数
     *
     * @mbg.generated
     */
    private String unclearedOrderCount;

    /**
     * 未结清本金
     *
     * @mbg.generated
     */
    private String unclearedPrincipal;

    /**
     * 未结清报告费
     *
     * @mbg.generated
     */
    private String unclearedCreditFee;

    /**
     * 未结清利息
     *
     * @mbg.generated
     */
    private String unclearedInterest;

    /**
     * 未结清罚息
     *
     * @mbg.generated
     */
    private String unclearedPenaltyInterest;

    /**
     * 部分还款订单数
     *
     * @mbg.generated
     */
    private String partialOrderCount;

    /**
     * 部分还款本金
     *
     * @mbg.generated
     */
    private String partialPrincipal;

    /**
     * 部分还款报告费
     *
     * @mbg.generated
     */
    private String partialCreditFee;

    /**
     * 部分还款利息
     *
     * @mbg.generated
     */
    private String partialInterest;

    /**
     * 部分还款罚息
     *
     * @mbg.generated
     */
    private String partialPenaltyInterest;

    /**
     * 部分还款平账
     *
     * @mbg.generated
     */
    private String partialBalance;

    /**
     * 展期订单数
     *
     * @mbg.generated
     */
    private String rolloverOrderCount;

    /**
     * 展期金额
     *
     * @mbg.generated
     */
    private String rolloverAmount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaDate() {
        return staDate;
    }

    public void setStaDate(String staDate) {
        this.staDate = staDate;
    }

    public String getRealOrderCount() {
        return realOrderCount;
    }

    public void setRealOrderCount(String realOrderCount) {
        this.realOrderCount = realOrderCount;
    }

    public String getRealPrincipal() {
        return realPrincipal;
    }

    public void setRealPrincipal(String realPrincipal) {
        this.realPrincipal = realPrincipal;
    }

    public String getRealCreditFee() {
        return realCreditFee;
    }

    public void setRealCreditFee(String realCreditFee) {
        this.realCreditFee = realCreditFee;
    }

    public String getSettleOrderCount() {
        return settleOrderCount;
    }

    public void setSettleOrderCount(String settleOrderCount) {
        this.settleOrderCount = settleOrderCount;
    }

    public String getSettlePrincipal() {
        return settlePrincipal;
    }

    public void setSettlePrincipal(String settlePrincipal) {
        this.settlePrincipal = settlePrincipal;
    }

    public String getSettleCreditFee() {
        return settleCreditFee;
    }

    public void setSettleCreditFee(String settleCreditFee) {
        this.settleCreditFee = settleCreditFee;
    }

    public String getSettleInterest() {
        return settleInterest;
    }

    public void setSettleInterest(String settleInterest) {
        this.settleInterest = settleInterest;
    }

    public String getSettlePenaltyInterest() {
        return settlePenaltyInterest;
    }

    public void setSettlePenaltyInterest(String settlePenaltyInterest) {
        this.settlePenaltyInterest = settlePenaltyInterest;
    }

    public String getSettleOtherAmount() {
        return settleOtherAmount;
    }

    public void setSettleOtherAmount(String settleOtherAmount) {
        this.settleOtherAmount = settleOtherAmount;
    }

    public String getSettleBalance() {
        return settleBalance;
    }

    public void setSettleBalance(String settleBalance) {
        this.settleBalance = settleBalance;
    }

    public String getUnclearedOrderCount() {
        return unclearedOrderCount;
    }

    public void setUnclearedOrderCount(String unclearedOrderCount) {
        this.unclearedOrderCount = unclearedOrderCount;
    }

    public String getUnclearedPrincipal() {
        return unclearedPrincipal;
    }

    public void setUnclearedPrincipal(String unclearedPrincipal) {
        this.unclearedPrincipal = unclearedPrincipal;
    }

    public String getUnclearedCreditFee() {
        return unclearedCreditFee;
    }

    public void setUnclearedCreditFee(String unclearedCreditFee) {
        this.unclearedCreditFee = unclearedCreditFee;
    }

    public String getUnclearedInterest() {
        return unclearedInterest;
    }

    public void setUnclearedInterest(String unclearedInterest) {
        this.unclearedInterest = unclearedInterest;
    }

    public String getUnclearedPenaltyInterest() {
        return unclearedPenaltyInterest;
    }

    public void setUnclearedPenaltyInterest(String unclearedPenaltyInterest) {
        this.unclearedPenaltyInterest = unclearedPenaltyInterest;
    }

    public String getPartialOrderCount() {
        return partialOrderCount;
    }

    public void setPartialOrderCount(String partialOrderCount) {
        this.partialOrderCount = partialOrderCount;
    }

    public String getPartialPrincipal() {
        return partialPrincipal;
    }

    public void setPartialPrincipal(String partialPrincipal) {
        this.partialPrincipal = partialPrincipal;
    }

    public String getPartialCreditFee() {
        return partialCreditFee;
    }

    public void setPartialCreditFee(String partialCreditFee) {
        this.partialCreditFee = partialCreditFee;
    }

    public String getPartialInterest() {
        return partialInterest;
    }

    public void setPartialInterest(String partialInterest) {
        this.partialInterest = partialInterest;
    }

    public String getPartialPenaltyInterest() {
        return partialPenaltyInterest;
    }

    public void setPartialPenaltyInterest(String partialPenaltyInterest) {
        this.partialPenaltyInterest = partialPenaltyInterest;
    }

    public String getPartialBalance() {
        return partialBalance;
    }

    public void setPartialBalance(String partialBalance) {
        this.partialBalance = partialBalance;
    }

    public String getRolloverOrderCount() {
        return rolloverOrderCount;
    }

    public void setRolloverOrderCount(String rolloverOrderCount) {
        this.rolloverOrderCount = rolloverOrderCount;
    }

    public String getRolloverAmount() {
        return rolloverAmount;
    }

    public void setRolloverAmount(String rolloverAmount) {
        this.rolloverAmount = rolloverAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", staDate=").append(staDate);
        sb.append(", realOrderCount=").append(realOrderCount);
        sb.append(", realPrincipal=").append(realPrincipal);
        sb.append(", realCreditFee=").append(realCreditFee);
        sb.append(", settleOrderCount=").append(settleOrderCount);
        sb.append(", settlePrincipal=").append(settlePrincipal);
        sb.append(", settleCreditFee=").append(settleCreditFee);
        sb.append(", settleInterest=").append(settleInterest);
        sb.append(", settlePenaltyInterest=").append(settlePenaltyInterest);
        sb.append(", settleOtherAmount=").append(settleOtherAmount);
        sb.append(", settleBalance=").append(settleBalance);
        sb.append(", unclearedOrderCount=").append(unclearedOrderCount);
        sb.append(", unclearedPrincipal=").append(unclearedPrincipal);
        sb.append(", unclearedCreditFee=").append(unclearedCreditFee);
        sb.append(", unclearedInterest=").append(unclearedInterest);
        sb.append(", unclearedPenaltyInterest=").append(unclearedPenaltyInterest);
        sb.append(", partialOrderCount=").append(partialOrderCount);
        sb.append(", partialPrincipal=").append(partialPrincipal);
        sb.append(", partialCreditFee=").append(partialCreditFee);
        sb.append(", partialInterest=").append(partialInterest);
        sb.append(", partialPenaltyInterest=").append(partialPenaltyInterest);
        sb.append(", partialBalance=").append(partialBalance);
        sb.append(", rolloverOrderCount=").append(rolloverOrderCount);
        sb.append(", rolloverAmount=").append(rolloverAmount);
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
        SOrder other = (SOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStaDate() == null ? other.getStaDate() == null : this.getStaDate().equals(other.getStaDate()))
            && (this.getRealOrderCount() == null ? other.getRealOrderCount() == null : this.getRealOrderCount().equals(other.getRealOrderCount()))
            && (this.getRealPrincipal() == null ? other.getRealPrincipal() == null : this.getRealPrincipal().equals(other.getRealPrincipal()))
            && (this.getRealCreditFee() == null ? other.getRealCreditFee() == null : this.getRealCreditFee().equals(other.getRealCreditFee()))
            && (this.getSettleOrderCount() == null ? other.getSettleOrderCount() == null : this.getSettleOrderCount().equals(other.getSettleOrderCount()))
            && (this.getSettlePrincipal() == null ? other.getSettlePrincipal() == null : this.getSettlePrincipal().equals(other.getSettlePrincipal()))
            && (this.getSettleCreditFee() == null ? other.getSettleCreditFee() == null : this.getSettleCreditFee().equals(other.getSettleCreditFee()))
            && (this.getSettleInterest() == null ? other.getSettleInterest() == null : this.getSettleInterest().equals(other.getSettleInterest()))
            && (this.getSettlePenaltyInterest() == null ? other.getSettlePenaltyInterest() == null : this.getSettlePenaltyInterest().equals(other.getSettlePenaltyInterest()))
            && (this.getSettleOtherAmount() == null ? other.getSettleOtherAmount() == null : this.getSettleOtherAmount().equals(other.getSettleOtherAmount()))
            && (this.getSettleBalance() == null ? other.getSettleBalance() == null : this.getSettleBalance().equals(other.getSettleBalance()))
            && (this.getUnclearedOrderCount() == null ? other.getUnclearedOrderCount() == null : this.getUnclearedOrderCount().equals(other.getUnclearedOrderCount()))
            && (this.getUnclearedPrincipal() == null ? other.getUnclearedPrincipal() == null : this.getUnclearedPrincipal().equals(other.getUnclearedPrincipal()))
            && (this.getUnclearedCreditFee() == null ? other.getUnclearedCreditFee() == null : this.getUnclearedCreditFee().equals(other.getUnclearedCreditFee()))
            && (this.getUnclearedInterest() == null ? other.getUnclearedInterest() == null : this.getUnclearedInterest().equals(other.getUnclearedInterest()))
            && (this.getUnclearedPenaltyInterest() == null ? other.getUnclearedPenaltyInterest() == null : this.getUnclearedPenaltyInterest().equals(other.getUnclearedPenaltyInterest()))
            && (this.getPartialOrderCount() == null ? other.getPartialOrderCount() == null : this.getPartialOrderCount().equals(other.getPartialOrderCount()))
            && (this.getPartialPrincipal() == null ? other.getPartialPrincipal() == null : this.getPartialPrincipal().equals(other.getPartialPrincipal()))
            && (this.getPartialCreditFee() == null ? other.getPartialCreditFee() == null : this.getPartialCreditFee().equals(other.getPartialCreditFee()))
            && (this.getPartialInterest() == null ? other.getPartialInterest() == null : this.getPartialInterest().equals(other.getPartialInterest()))
            && (this.getPartialPenaltyInterest() == null ? other.getPartialPenaltyInterest() == null : this.getPartialPenaltyInterest().equals(other.getPartialPenaltyInterest()))
            && (this.getPartialBalance() == null ? other.getPartialBalance() == null : this.getPartialBalance().equals(other.getPartialBalance()))
            && (this.getRolloverOrderCount() == null ? other.getRolloverOrderCount() == null : this.getRolloverOrderCount().equals(other.getRolloverOrderCount()))
            && (this.getRolloverAmount() == null ? other.getRolloverAmount() == null : this.getRolloverAmount().equals(other.getRolloverAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStaDate() == null) ? 0 : getStaDate().hashCode());
        result = prime * result + ((getRealOrderCount() == null) ? 0 : getRealOrderCount().hashCode());
        result = prime * result + ((getRealPrincipal() == null) ? 0 : getRealPrincipal().hashCode());
        result = prime * result + ((getRealCreditFee() == null) ? 0 : getRealCreditFee().hashCode());
        result = prime * result + ((getSettleOrderCount() == null) ? 0 : getSettleOrderCount().hashCode());
        result = prime * result + ((getSettlePrincipal() == null) ? 0 : getSettlePrincipal().hashCode());
        result = prime * result + ((getSettleCreditFee() == null) ? 0 : getSettleCreditFee().hashCode());
        result = prime * result + ((getSettleInterest() == null) ? 0 : getSettleInterest().hashCode());
        result = prime * result + ((getSettlePenaltyInterest() == null) ? 0 : getSettlePenaltyInterest().hashCode());
        result = prime * result + ((getSettleOtherAmount() == null) ? 0 : getSettleOtherAmount().hashCode());
        result = prime * result + ((getSettleBalance() == null) ? 0 : getSettleBalance().hashCode());
        result = prime * result + ((getUnclearedOrderCount() == null) ? 0 : getUnclearedOrderCount().hashCode());
        result = prime * result + ((getUnclearedPrincipal() == null) ? 0 : getUnclearedPrincipal().hashCode());
        result = prime * result + ((getUnclearedCreditFee() == null) ? 0 : getUnclearedCreditFee().hashCode());
        result = prime * result + ((getUnclearedInterest() == null) ? 0 : getUnclearedInterest().hashCode());
        result = prime * result + ((getUnclearedPenaltyInterest() == null) ? 0 : getUnclearedPenaltyInterest().hashCode());
        result = prime * result + ((getPartialOrderCount() == null) ? 0 : getPartialOrderCount().hashCode());
        result = prime * result + ((getPartialPrincipal() == null) ? 0 : getPartialPrincipal().hashCode());
        result = prime * result + ((getPartialCreditFee() == null) ? 0 : getPartialCreditFee().hashCode());
        result = prime * result + ((getPartialInterest() == null) ? 0 : getPartialInterest().hashCode());
        result = prime * result + ((getPartialPenaltyInterest() == null) ? 0 : getPartialPenaltyInterest().hashCode());
        result = prime * result + ((getPartialBalance() == null) ? 0 : getPartialBalance().hashCode());
        result = prime * result + ((getRolloverOrderCount() == null) ? 0 : getRolloverOrderCount().hashCode());
        result = prime * result + ((getRolloverAmount() == null) ? 0 : getRolloverAmount().hashCode());
        return result;
    }
}