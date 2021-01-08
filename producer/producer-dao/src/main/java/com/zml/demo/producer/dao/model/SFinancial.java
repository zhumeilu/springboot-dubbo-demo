package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SFinancial implements Serializable {
    private Integer id;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private LocalDateTime ctime;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private LocalDateTime utime;

    /**
     * 日期
     *
     * @mbg.generated
     */
    private String date;

    /**
     * 应收订单数
     *
     * @mbg.generated
     */
    private String receivableOrderCount;

    /**
     * 应收本金
     *
     * @mbg.generated
     */
    private String receivablePrincipal;

    /**
     * 应收报告费
     *
     * @mbg.generated
     */
    private String receivableCreditCost;

    /**
     * 应收利息
     *
     * @mbg.generated
     */
    private String receivableInterest;

    /**
     * 应收罚息
     *
     * @mbg.generated
     */
    private String receivableInterestPenalty;

    /**
     * 应付订单数
     *
     * @mbg.generated
     */
    private String payableOrderCount;

    /**
     * 应付本金
     *
     * @mbg.generated
     */
    private String payablePrincipal;

    /**
     * 应付报告费
     *
     * @mbg.generated
     */
    private String payableCreditCost;

    /**
     * 实收订单数
     *
     * @mbg.generated
     */
    private String receiptsOrderCount;

    /**
     * 实收本金
     *
     * @mbg.generated
     */
    private String receiptsPrincipal;

    /**
     * 实收报告费
     *
     * @mbg.generated
     */
    private String receiptsCreditCost;

    /**
     * 实收利息
     *
     * @mbg.generated
     */
    private String receiptsInterest;

    /**
     * 实收罚息
     *
     * @mbg.generated
     */
    private String receiptsInterestPenalty;

    /**
     * 实付订单数
     *
     * @mbg.generated
     */
    private String paymentOrderCount;

    /**
     * 实付本金
     *
     * @mbg.generated
     */
    private String paymentPrincipal;

    /**
     * 实付报告费
     *
     * @mbg.generated
     */
    private String paymentCreditCost;

    /**
     * 逾期订单数
     *
     * @mbg.generated
     */
    private String overdueOrderCount;

    /**
     * 逾期本金
     *
     * @mbg.generated
     */
    private String overduePrincipal;

    /**
     * 逾期报告费
     *
     * @mbg.generated
     */
    private String overdueCreditCost;

    /**
     * 逾期利息
     *
     * @mbg.generated
     */
    private String overdueInterest;

    /**
     * 逾期罚息
     *
     * @mbg.generated
     */
    private String overdueInterestPenalty;

    /**
     * 未到期订单数
     *
     * @mbg.generated
     */
    private String unexpiredOrderCount;

    /**
     * 未到期本金
     *
     * @mbg.generated
     */
    private String unexpiredPrincipal;

    /**
     * 未到期报告费
     *
     * @mbg.generated
     */
    private String unexpiredCreditCost;

    /**
     * 未到期利息
     *
     * @mbg.generated
     */
    private String unexpiredInterest;

    /**
     * 平账金额
     *
     * @mbg.generated
     */
    private String balanceAmount;

    /**
     * 展期订单数
     *
     * @mbg.generated
     */
    private String rolloverNumber;

    /**
     * 展期费
     *
     * @mbg.generated
     */
    private String rolloverFee;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCtime() {
        return ctime;
    }

    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    public LocalDateTime getUtime() {
        return utime;
    }

    public void setUtime(LocalDateTime utime) {
        this.utime = utime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReceivableOrderCount() {
        return receivableOrderCount;
    }

    public void setReceivableOrderCount(String receivableOrderCount) {
        this.receivableOrderCount = receivableOrderCount;
    }

    public String getReceivablePrincipal() {
        return receivablePrincipal;
    }

    public void setReceivablePrincipal(String receivablePrincipal) {
        this.receivablePrincipal = receivablePrincipal;
    }

    public String getReceivableCreditCost() {
        return receivableCreditCost;
    }

    public void setReceivableCreditCost(String receivableCreditCost) {
        this.receivableCreditCost = receivableCreditCost;
    }

    public String getReceivableInterest() {
        return receivableInterest;
    }

    public void setReceivableInterest(String receivableInterest) {
        this.receivableInterest = receivableInterest;
    }

    public String getReceivableInterestPenalty() {
        return receivableInterestPenalty;
    }

    public void setReceivableInterestPenalty(String receivableInterestPenalty) {
        this.receivableInterestPenalty = receivableInterestPenalty;
    }

    public String getPayableOrderCount() {
        return payableOrderCount;
    }

    public void setPayableOrderCount(String payableOrderCount) {
        this.payableOrderCount = payableOrderCount;
    }

    public String getPayablePrincipal() {
        return payablePrincipal;
    }

    public void setPayablePrincipal(String payablePrincipal) {
        this.payablePrincipal = payablePrincipal;
    }

    public String getPayableCreditCost() {
        return payableCreditCost;
    }

    public void setPayableCreditCost(String payableCreditCost) {
        this.payableCreditCost = payableCreditCost;
    }

    public String getReceiptsOrderCount() {
        return receiptsOrderCount;
    }

    public void setReceiptsOrderCount(String receiptsOrderCount) {
        this.receiptsOrderCount = receiptsOrderCount;
    }

    public String getReceiptsPrincipal() {
        return receiptsPrincipal;
    }

    public void setReceiptsPrincipal(String receiptsPrincipal) {
        this.receiptsPrincipal = receiptsPrincipal;
    }

    public String getReceiptsCreditCost() {
        return receiptsCreditCost;
    }

    public void setReceiptsCreditCost(String receiptsCreditCost) {
        this.receiptsCreditCost = receiptsCreditCost;
    }

    public String getReceiptsInterest() {
        return receiptsInterest;
    }

    public void setReceiptsInterest(String receiptsInterest) {
        this.receiptsInterest = receiptsInterest;
    }

    public String getReceiptsInterestPenalty() {
        return receiptsInterestPenalty;
    }

    public void setReceiptsInterestPenalty(String receiptsInterestPenalty) {
        this.receiptsInterestPenalty = receiptsInterestPenalty;
    }

    public String getPaymentOrderCount() {
        return paymentOrderCount;
    }

    public void setPaymentOrderCount(String paymentOrderCount) {
        this.paymentOrderCount = paymentOrderCount;
    }

    public String getPaymentPrincipal() {
        return paymentPrincipal;
    }

    public void setPaymentPrincipal(String paymentPrincipal) {
        this.paymentPrincipal = paymentPrincipal;
    }

    public String getPaymentCreditCost() {
        return paymentCreditCost;
    }

    public void setPaymentCreditCost(String paymentCreditCost) {
        this.paymentCreditCost = paymentCreditCost;
    }

    public String getOverdueOrderCount() {
        return overdueOrderCount;
    }

    public void setOverdueOrderCount(String overdueOrderCount) {
        this.overdueOrderCount = overdueOrderCount;
    }

    public String getOverduePrincipal() {
        return overduePrincipal;
    }

    public void setOverduePrincipal(String overduePrincipal) {
        this.overduePrincipal = overduePrincipal;
    }

    public String getOverdueCreditCost() {
        return overdueCreditCost;
    }

    public void setOverdueCreditCost(String overdueCreditCost) {
        this.overdueCreditCost = overdueCreditCost;
    }

    public String getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(String overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public String getOverdueInterestPenalty() {
        return overdueInterestPenalty;
    }

    public void setOverdueInterestPenalty(String overdueInterestPenalty) {
        this.overdueInterestPenalty = overdueInterestPenalty;
    }

    public String getUnexpiredOrderCount() {
        return unexpiredOrderCount;
    }

    public void setUnexpiredOrderCount(String unexpiredOrderCount) {
        this.unexpiredOrderCount = unexpiredOrderCount;
    }

    public String getUnexpiredPrincipal() {
        return unexpiredPrincipal;
    }

    public void setUnexpiredPrincipal(String unexpiredPrincipal) {
        this.unexpiredPrincipal = unexpiredPrincipal;
    }

    public String getUnexpiredCreditCost() {
        return unexpiredCreditCost;
    }

    public void setUnexpiredCreditCost(String unexpiredCreditCost) {
        this.unexpiredCreditCost = unexpiredCreditCost;
    }

    public String getUnexpiredInterest() {
        return unexpiredInterest;
    }

    public void setUnexpiredInterest(String unexpiredInterest) {
        this.unexpiredInterest = unexpiredInterest;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getRolloverNumber() {
        return rolloverNumber;
    }

    public void setRolloverNumber(String rolloverNumber) {
        this.rolloverNumber = rolloverNumber;
    }

    public String getRolloverFee() {
        return rolloverFee;
    }

    public void setRolloverFee(String rolloverFee) {
        this.rolloverFee = rolloverFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ctime=").append(ctime);
        sb.append(", utime=").append(utime);
        sb.append(", date=").append(date);
        sb.append(", receivableOrderCount=").append(receivableOrderCount);
        sb.append(", receivablePrincipal=").append(receivablePrincipal);
        sb.append(", receivableCreditCost=").append(receivableCreditCost);
        sb.append(", receivableInterest=").append(receivableInterest);
        sb.append(", receivableInterestPenalty=").append(receivableInterestPenalty);
        sb.append(", payableOrderCount=").append(payableOrderCount);
        sb.append(", payablePrincipal=").append(payablePrincipal);
        sb.append(", payableCreditCost=").append(payableCreditCost);
        sb.append(", receiptsOrderCount=").append(receiptsOrderCount);
        sb.append(", receiptsPrincipal=").append(receiptsPrincipal);
        sb.append(", receiptsCreditCost=").append(receiptsCreditCost);
        sb.append(", receiptsInterest=").append(receiptsInterest);
        sb.append(", receiptsInterestPenalty=").append(receiptsInterestPenalty);
        sb.append(", paymentOrderCount=").append(paymentOrderCount);
        sb.append(", paymentPrincipal=").append(paymentPrincipal);
        sb.append(", paymentCreditCost=").append(paymentCreditCost);
        sb.append(", overdueOrderCount=").append(overdueOrderCount);
        sb.append(", overduePrincipal=").append(overduePrincipal);
        sb.append(", overdueCreditCost=").append(overdueCreditCost);
        sb.append(", overdueInterest=").append(overdueInterest);
        sb.append(", overdueInterestPenalty=").append(overdueInterestPenalty);
        sb.append(", unexpiredOrderCount=").append(unexpiredOrderCount);
        sb.append(", unexpiredPrincipal=").append(unexpiredPrincipal);
        sb.append(", unexpiredCreditCost=").append(unexpiredCreditCost);
        sb.append(", unexpiredInterest=").append(unexpiredInterest);
        sb.append(", balanceAmount=").append(balanceAmount);
        sb.append(", rolloverNumber=").append(rolloverNumber);
        sb.append(", rolloverFee=").append(rolloverFee);
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
        SFinancial other = (SFinancial) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getUtime() == null ? other.getUtime() == null : this.getUtime().equals(other.getUtime()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getReceivableOrderCount() == null ? other.getReceivableOrderCount() == null : this.getReceivableOrderCount().equals(other.getReceivableOrderCount()))
            && (this.getReceivablePrincipal() == null ? other.getReceivablePrincipal() == null : this.getReceivablePrincipal().equals(other.getReceivablePrincipal()))
            && (this.getReceivableCreditCost() == null ? other.getReceivableCreditCost() == null : this.getReceivableCreditCost().equals(other.getReceivableCreditCost()))
            && (this.getReceivableInterest() == null ? other.getReceivableInterest() == null : this.getReceivableInterest().equals(other.getReceivableInterest()))
            && (this.getReceivableInterestPenalty() == null ? other.getReceivableInterestPenalty() == null : this.getReceivableInterestPenalty().equals(other.getReceivableInterestPenalty()))
            && (this.getPayableOrderCount() == null ? other.getPayableOrderCount() == null : this.getPayableOrderCount().equals(other.getPayableOrderCount()))
            && (this.getPayablePrincipal() == null ? other.getPayablePrincipal() == null : this.getPayablePrincipal().equals(other.getPayablePrincipal()))
            && (this.getPayableCreditCost() == null ? other.getPayableCreditCost() == null : this.getPayableCreditCost().equals(other.getPayableCreditCost()))
            && (this.getReceiptsOrderCount() == null ? other.getReceiptsOrderCount() == null : this.getReceiptsOrderCount().equals(other.getReceiptsOrderCount()))
            && (this.getReceiptsPrincipal() == null ? other.getReceiptsPrincipal() == null : this.getReceiptsPrincipal().equals(other.getReceiptsPrincipal()))
            && (this.getReceiptsCreditCost() == null ? other.getReceiptsCreditCost() == null : this.getReceiptsCreditCost().equals(other.getReceiptsCreditCost()))
            && (this.getReceiptsInterest() == null ? other.getReceiptsInterest() == null : this.getReceiptsInterest().equals(other.getReceiptsInterest()))
            && (this.getReceiptsInterestPenalty() == null ? other.getReceiptsInterestPenalty() == null : this.getReceiptsInterestPenalty().equals(other.getReceiptsInterestPenalty()))
            && (this.getPaymentOrderCount() == null ? other.getPaymentOrderCount() == null : this.getPaymentOrderCount().equals(other.getPaymentOrderCount()))
            && (this.getPaymentPrincipal() == null ? other.getPaymentPrincipal() == null : this.getPaymentPrincipal().equals(other.getPaymentPrincipal()))
            && (this.getPaymentCreditCost() == null ? other.getPaymentCreditCost() == null : this.getPaymentCreditCost().equals(other.getPaymentCreditCost()))
            && (this.getOverdueOrderCount() == null ? other.getOverdueOrderCount() == null : this.getOverdueOrderCount().equals(other.getOverdueOrderCount()))
            && (this.getOverduePrincipal() == null ? other.getOverduePrincipal() == null : this.getOverduePrincipal().equals(other.getOverduePrincipal()))
            && (this.getOverdueCreditCost() == null ? other.getOverdueCreditCost() == null : this.getOverdueCreditCost().equals(other.getOverdueCreditCost()))
            && (this.getOverdueInterest() == null ? other.getOverdueInterest() == null : this.getOverdueInterest().equals(other.getOverdueInterest()))
            && (this.getOverdueInterestPenalty() == null ? other.getOverdueInterestPenalty() == null : this.getOverdueInterestPenalty().equals(other.getOverdueInterestPenalty()))
            && (this.getUnexpiredOrderCount() == null ? other.getUnexpiredOrderCount() == null : this.getUnexpiredOrderCount().equals(other.getUnexpiredOrderCount()))
            && (this.getUnexpiredPrincipal() == null ? other.getUnexpiredPrincipal() == null : this.getUnexpiredPrincipal().equals(other.getUnexpiredPrincipal()))
            && (this.getUnexpiredCreditCost() == null ? other.getUnexpiredCreditCost() == null : this.getUnexpiredCreditCost().equals(other.getUnexpiredCreditCost()))
            && (this.getUnexpiredInterest() == null ? other.getUnexpiredInterest() == null : this.getUnexpiredInterest().equals(other.getUnexpiredInterest()))
            && (this.getBalanceAmount() == null ? other.getBalanceAmount() == null : this.getBalanceAmount().equals(other.getBalanceAmount()))
            && (this.getRolloverNumber() == null ? other.getRolloverNumber() == null : this.getRolloverNumber().equals(other.getRolloverNumber()))
            && (this.getRolloverFee() == null ? other.getRolloverFee() == null : this.getRolloverFee().equals(other.getRolloverFee()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getUtime() == null) ? 0 : getUtime().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getReceivableOrderCount() == null) ? 0 : getReceivableOrderCount().hashCode());
        result = prime * result + ((getReceivablePrincipal() == null) ? 0 : getReceivablePrincipal().hashCode());
        result = prime * result + ((getReceivableCreditCost() == null) ? 0 : getReceivableCreditCost().hashCode());
        result = prime * result + ((getReceivableInterest() == null) ? 0 : getReceivableInterest().hashCode());
        result = prime * result + ((getReceivableInterestPenalty() == null) ? 0 : getReceivableInterestPenalty().hashCode());
        result = prime * result + ((getPayableOrderCount() == null) ? 0 : getPayableOrderCount().hashCode());
        result = prime * result + ((getPayablePrincipal() == null) ? 0 : getPayablePrincipal().hashCode());
        result = prime * result + ((getPayableCreditCost() == null) ? 0 : getPayableCreditCost().hashCode());
        result = prime * result + ((getReceiptsOrderCount() == null) ? 0 : getReceiptsOrderCount().hashCode());
        result = prime * result + ((getReceiptsPrincipal() == null) ? 0 : getReceiptsPrincipal().hashCode());
        result = prime * result + ((getReceiptsCreditCost() == null) ? 0 : getReceiptsCreditCost().hashCode());
        result = prime * result + ((getReceiptsInterest() == null) ? 0 : getReceiptsInterest().hashCode());
        result = prime * result + ((getReceiptsInterestPenalty() == null) ? 0 : getReceiptsInterestPenalty().hashCode());
        result = prime * result + ((getPaymentOrderCount() == null) ? 0 : getPaymentOrderCount().hashCode());
        result = prime * result + ((getPaymentPrincipal() == null) ? 0 : getPaymentPrincipal().hashCode());
        result = prime * result + ((getPaymentCreditCost() == null) ? 0 : getPaymentCreditCost().hashCode());
        result = prime * result + ((getOverdueOrderCount() == null) ? 0 : getOverdueOrderCount().hashCode());
        result = prime * result + ((getOverduePrincipal() == null) ? 0 : getOverduePrincipal().hashCode());
        result = prime * result + ((getOverdueCreditCost() == null) ? 0 : getOverdueCreditCost().hashCode());
        result = prime * result + ((getOverdueInterest() == null) ? 0 : getOverdueInterest().hashCode());
        result = prime * result + ((getOverdueInterestPenalty() == null) ? 0 : getOverdueInterestPenalty().hashCode());
        result = prime * result + ((getUnexpiredOrderCount() == null) ? 0 : getUnexpiredOrderCount().hashCode());
        result = prime * result + ((getUnexpiredPrincipal() == null) ? 0 : getUnexpiredPrincipal().hashCode());
        result = prime * result + ((getUnexpiredCreditCost() == null) ? 0 : getUnexpiredCreditCost().hashCode());
        result = prime * result + ((getUnexpiredInterest() == null) ? 0 : getUnexpiredInterest().hashCode());
        result = prime * result + ((getBalanceAmount() == null) ? 0 : getBalanceAmount().hashCode());
        result = prime * result + ((getRolloverNumber() == null) ? 0 : getRolloverNumber().hashCode());
        result = prime * result + ((getRolloverFee() == null) ? 0 : getRolloverFee().hashCode());
        return result;
    }
}