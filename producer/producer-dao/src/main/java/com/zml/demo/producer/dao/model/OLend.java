package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OLend implements Serializable {
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
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 产品id
     *
     * @mbg.generated
     */
    private String productId;

    /**
     * 订单状态 
10初始化
11手动取消
15信用报告支付中  
20机审中  
30初审中  
40终审中 
50打款中 
60还款中 
70还款完成
80审核拒绝
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 放款状态
10初始状态 20待打款 30取消 70打款成功 80打款失败
     *
     * @mbg.generated
     */
    private Byte withdrawStatus;

    /**
     * 审核状态
10初始状态；
20待机审；
21机审中；
27机审通过；
28机审拒绝；
30待初审；
31初审中；
37初审通过；
38初审拒绝；
40待终审；
41终审中；
47终审通过；
48终审拒绝；
51财务退回
52财务关闭
67前置黑名单通过;
68前置黑名单拒绝;
77后置黑名单通过;
78后置黑名单拒绝;
     *
     * @mbg.generated
     */
    private Byte reviewStatus;

    /**
     * 还款状态
10初始状态 20待还款 30取消 50部分还款 70还款成功
     *
     * @mbg.generated
     */
    private Byte repayStatus;

    /**
     * 信用报告支付状态
10初始状态 20待支付 30取消 70支付成功 80支付失败
     *
     * @mbg.generated
     */
    private Byte extPayStatus;

    /**
     * 挂单状态 1挂单 0未挂单
     *
     * @mbg.generated
     */
    private Boolean pauseStatus;

    /**
     * 用户补充信息状态10 初始 20待补充
     *
     * @mbg.generated
     */
    private Byte supplementStatus;

    /**
     * 稽核状态10初始状态 20待稽核 70稽核成功 80稽核失败
     *
     * @mbg.generated
     */
    private Byte checkStatus;

    /**
     * 银行卡审核状态  0未审核  1审核通过  2审核拒绝
     *
     * @mbg.generated
     */
    private Byte bankReviewStatus;

    /**
     * 利率
     *
     * @mbg.generated
     */
    private BigDecimal interestRatio;

    /**
     * 日罚息
     *
     * @mbg.generated
     */
    private BigDecimal overdueRatio;

    /**
     * 最高罚息
     *
     * @mbg.generated
     */
    private BigDecimal overdueMaxRatio;

    /**
     * 借款周期
     *
     * @mbg.generated
     */
    private Integer loanDays;

    /**
     * 申请借款时间
     *
     * @mbg.generated
     */
    private LocalDateTime applyTime;

    /**
     * 平台放款时间，财务打款时间
     *
     * @mbg.generated
     */
    private LocalDateTime withdrawTime;

    /**
     * 应还日期
     *
     * @mbg.generated
     */
    private LocalDate shouldReturnDate;

    /**
     * 展期应还日期
     *
     * @mbg.generated
     */
    private LocalDate delayReturnDate;

    /**
     * 结清时间
     *
     * @mbg.generated
     */
    private LocalDateTime repaidOverTime;

    /**
     * 是否首借（0：复贷；1：新贷）
     *
     * @mbg.generated
     */
    private Byte first;

    /**
     * 借贷模式，1,2,3
     *
     * @mbg.generated
     */
    private Byte loanModel;

    /**
     * 借款金额
     *
     * @mbg.generated
     */
    private BigDecimal loanAmount;

    /**
     * 信用报告费
     *
     * @mbg.generated
     */
    private BigDecimal extFeeAmount;

    /**
     * 借款利息
     *
     * @mbg.generated
     */
    private BigDecimal interestAmount;

    /**
     * 到手金额
     *
     * @mbg.generated
     */
    private BigDecimal inHandAmount;

    /**
     * 打款金额
     *
     * @mbg.generated
     */
    private BigDecimal withdrawAmount;

    /**
     * 已还金额
     *
     * @mbg.generated
     */
    private BigDecimal repaidAmount;

    /**
     * 减免金额
     *
     * @mbg.generated
     */
    private BigDecimal reductionAmount;

    /**
     * 已还本金
     *
     * @mbg.generated
     */
    private BigDecimal repaidPrincipalAmount;

    /**
     * 已还逾期金额
     *
     * @mbg.generated
     */
    private BigDecimal repaidOverdueAmount;

    /**
     * 已还利息
     *
     * @mbg.generated
     */
    private BigDecimal repaidInterestAmount;

    /**
     * 已还报告费
     *
     * @mbg.generated
     */
    private BigDecimal repaidExtfeeAmount;

    /**
     * 其他回款
     *
     * @mbg.generated
     */
    private BigDecimal repaidOtherAmount;

    /**
     * 用户银行卡ID
     *
     * @mbg.generated
     */
    private Integer bankCardId;

    /**
     * 收款银行ID
     *
     * @mbg.generated
     */
    private Integer bankId;

    /**
     * 挂单时间
     *
     * @mbg.generated
     */
    private LocalDateTime pauseTime;

    /**
     * 审核时间;(每次审核,更新该时间)
     *
     * @mbg.generated
     */
    private LocalDateTime reviewTime;

    /**
     * 分配初审人员状态0未分配 1已分配
     *
     * @mbg.generated
     */
    private Boolean firstAllotStatus;

    /**
     * 分配终审人员状态0未分配 1已分配
     *
     * @mbg.generated
     */
    private Boolean lastAllotStatus;

    /**
     * 分配稽核人员状态0未分配 1已分配
     *
     * @mbg.generated
     */
    private Boolean checkAllotStatus;

    /**
     * 初审人员
     *
     * @mbg.generated
     */
    private String firstReviewer;

    /**
     * 终审人员
     *
     * @mbg.generated
     */
    private String lastReviewer;

    /**
     * 稽核人员
     *
     * @mbg.generated
     */
    private String checker;

    /**
     * 稽核时间
     *
     * @mbg.generated
     */
    private LocalDateTime checkTime;

    /**
     * 退单标记（退单时该标记置为1，当再次审核提交时，该标记置为0）默认0退单为1
     *
     * @mbg.generated
     */
    private Byte backLabel;

    /**
     * 提醒标记（当客户提交补充信息时，该标记为1，当查看订单详情时，该标记置为0）默认0 提醒1
     *
     * @mbg.generated
     */
    private Byte remindLabel;

    /**
     * 借款用途
     *
     * @mbg.generated
     */
    private String loanUsage;

    /**
     * 用户姓名
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 用户手机号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 区域码
     *
     * @mbg.generated
     */
    private String areaCode;

    /**
     * 待财务结算（用户提交还款，等待财务审核，此时不计算逾期）
     *
     * @mbg.generated
     */
    private Boolean waitSettle;

    /**
     * 待财务结算时间（用户提交还款，等待财务审核，此时不计算逾期）
     *
     * @mbg.generated
     */
    private LocalDateTime waitSettleTime;

    /**
     * 是否展期  0未展期 1展期
     *
     * @mbg.generated
     */
    private Boolean delay;

    /**
     * 是否逾期 0未逾期 1逾期
     *
     * @mbg.generated
     */
    private Boolean overdue;

    /**
     * 渠道id
     *
     * @mbg.generated
     */
    private String platform;

    /**
     * 拒绝编码b_check_reject_reason.reject_code
     *
     * @mbg.generated
     */
    private String rejectCode;

    /**
     * 拒绝编码b_check_reject_reason.reject_code
     *
     * @mbg.generated
     */
    private String pauseCode;

    /**
     * 还款审核状态 10 初始化 20等待用户上传 30用户上传成功,待审核   40催收退回  50 提交财务，待财务审核  70财务审核通过  80 财务退回
     *
     * @mbg.generated
     */
    private Byte repayReviewStatus;

    /**
     * 打款审核状态 10 初始化 20 待审核 50 审核中  70 财务审核通过  80 财务退回 90 关闭订单
     *
     * @mbg.generated
     */
    private Byte withdrawReviewStatus;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 展期次数
     *
     * @mbg.generated
     */
    private Integer delayTimes;

    /**
     * 推广渠道
     *
     * @mbg.generated
     */
    private String channel;

    /**
     * 展期状态 10 初始化 20待上传凭证 30 待后台审核  40 退回用户 50 待财务审核 70财务通过  80财务拒绝
     *
     * @mbg.generated
     */
    private Byte delayStatus;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getWithdrawStatus() {
        return withdrawStatus;
    }

    public void setWithdrawStatus(Byte withdrawStatus) {
        this.withdrawStatus = withdrawStatus;
    }

    public Byte getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Byte reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Byte getRepayStatus() {
        return repayStatus;
    }

    public void setRepayStatus(Byte repayStatus) {
        this.repayStatus = repayStatus;
    }

    public Byte getExtPayStatus() {
        return extPayStatus;
    }

    public void setExtPayStatus(Byte extPayStatus) {
        this.extPayStatus = extPayStatus;
    }

    public Boolean getPauseStatus() {
        return pauseStatus;
    }

    public void setPauseStatus(Boolean pauseStatus) {
        this.pauseStatus = pauseStatus;
    }

    public Byte getSupplementStatus() {
        return supplementStatus;
    }

    public void setSupplementStatus(Byte supplementStatus) {
        this.supplementStatus = supplementStatus;
    }

    public Byte getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Byte checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Byte getBankReviewStatus() {
        return bankReviewStatus;
    }

    public void setBankReviewStatus(Byte bankReviewStatus) {
        this.bankReviewStatus = bankReviewStatus;
    }

    public BigDecimal getInterestRatio() {
        return interestRatio;
    }

    public void setInterestRatio(BigDecimal interestRatio) {
        this.interestRatio = interestRatio;
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

    public Integer getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(Integer loanDays) {
        this.loanDays = loanDays;
    }

    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
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

    public LocalDate getDelayReturnDate() {
        return delayReturnDate;
    }

    public void setDelayReturnDate(LocalDate delayReturnDate) {
        this.delayReturnDate = delayReturnDate;
    }

    public LocalDateTime getRepaidOverTime() {
        return repaidOverTime;
    }

    public void setRepaidOverTime(LocalDateTime repaidOverTime) {
        this.repaidOverTime = repaidOverTime;
    }

    public Byte getFirst() {
        return first;
    }

    public void setFirst(Byte first) {
        this.first = first;
    }

    public Byte getLoanModel() {
        return loanModel;
    }

    public void setLoanModel(Byte loanModel) {
        this.loanModel = loanModel;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getExtFeeAmount() {
        return extFeeAmount;
    }

    public void setExtFeeAmount(BigDecimal extFeeAmount) {
        this.extFeeAmount = extFeeAmount;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    public BigDecimal getInHandAmount() {
        return inHandAmount;
    }

    public void setInHandAmount(BigDecimal inHandAmount) {
        this.inHandAmount = inHandAmount;
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public BigDecimal getRepaidAmount() {
        return repaidAmount;
    }

    public void setRepaidAmount(BigDecimal repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public BigDecimal getRepaidPrincipalAmount() {
        return repaidPrincipalAmount;
    }

    public void setRepaidPrincipalAmount(BigDecimal repaidPrincipalAmount) {
        this.repaidPrincipalAmount = repaidPrincipalAmount;
    }

    public BigDecimal getRepaidOverdueAmount() {
        return repaidOverdueAmount;
    }

    public void setRepaidOverdueAmount(BigDecimal repaidOverdueAmount) {
        this.repaidOverdueAmount = repaidOverdueAmount;
    }

    public BigDecimal getRepaidInterestAmount() {
        return repaidInterestAmount;
    }

    public void setRepaidInterestAmount(BigDecimal repaidInterestAmount) {
        this.repaidInterestAmount = repaidInterestAmount;
    }

    public BigDecimal getRepaidExtfeeAmount() {
        return repaidExtfeeAmount;
    }

    public void setRepaidExtfeeAmount(BigDecimal repaidExtfeeAmount) {
        this.repaidExtfeeAmount = repaidExtfeeAmount;
    }

    public BigDecimal getRepaidOtherAmount() {
        return repaidOtherAmount;
    }

    public void setRepaidOtherAmount(BigDecimal repaidOtherAmount) {
        this.repaidOtherAmount = repaidOtherAmount;
    }

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public LocalDateTime getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(LocalDateTime pauseTime) {
        this.pauseTime = pauseTime;
    }

    public LocalDateTime getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(LocalDateTime reviewTime) {
        this.reviewTime = reviewTime;
    }

    public Boolean getFirstAllotStatus() {
        return firstAllotStatus;
    }

    public void setFirstAllotStatus(Boolean firstAllotStatus) {
        this.firstAllotStatus = firstAllotStatus;
    }

    public Boolean getLastAllotStatus() {
        return lastAllotStatus;
    }

    public void setLastAllotStatus(Boolean lastAllotStatus) {
        this.lastAllotStatus = lastAllotStatus;
    }

    public Boolean getCheckAllotStatus() {
        return checkAllotStatus;
    }

    public void setCheckAllotStatus(Boolean checkAllotStatus) {
        this.checkAllotStatus = checkAllotStatus;
    }

    public String getFirstReviewer() {
        return firstReviewer;
    }

    public void setFirstReviewer(String firstReviewer) {
        this.firstReviewer = firstReviewer;
    }

    public String getLastReviewer() {
        return lastReviewer;
    }

    public void setLastReviewer(String lastReviewer) {
        this.lastReviewer = lastReviewer;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public Byte getBackLabel() {
        return backLabel;
    }

    public void setBackLabel(Byte backLabel) {
        this.backLabel = backLabel;
    }

    public Byte getRemindLabel() {
        return remindLabel;
    }

    public void setRemindLabel(Byte remindLabel) {
        this.remindLabel = remindLabel;
    }

    public String getLoanUsage() {
        return loanUsage;
    }

    public void setLoanUsage(String loanUsage) {
        this.loanUsage = loanUsage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Boolean getWaitSettle() {
        return waitSettle;
    }

    public void setWaitSettle(Boolean waitSettle) {
        this.waitSettle = waitSettle;
    }

    public LocalDateTime getWaitSettleTime() {
        return waitSettleTime;
    }

    public void setWaitSettleTime(LocalDateTime waitSettleTime) {
        this.waitSettleTime = waitSettleTime;
    }

    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public Boolean getOverdue() {
        return overdue;
    }

    public void setOverdue(Boolean overdue) {
        this.overdue = overdue;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }

    public String getPauseCode() {
        return pauseCode;
    }

    public void setPauseCode(String pauseCode) {
        this.pauseCode = pauseCode;
    }

    public Byte getRepayReviewStatus() {
        return repayReviewStatus;
    }

    public void setRepayReviewStatus(Byte repayReviewStatus) {
        this.repayReviewStatus = repayReviewStatus;
    }

    public Byte getWithdrawReviewStatus() {
        return withdrawReviewStatus;
    }

    public void setWithdrawReviewStatus(Byte withdrawReviewStatus) {
        this.withdrawReviewStatus = withdrawReviewStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDelayTimes() {
        return delayTimes;
    }

    public void setDelayTimes(Integer delayTimes) {
        this.delayTimes = delayTimes;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Byte getDelayStatus() {
        return delayStatus;
    }

    public void setDelayStatus(Byte delayStatus) {
        this.delayStatus = delayStatus;
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
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", status=").append(status);
        sb.append(", withdrawStatus=").append(withdrawStatus);
        sb.append(", reviewStatus=").append(reviewStatus);
        sb.append(", repayStatus=").append(repayStatus);
        sb.append(", extPayStatus=").append(extPayStatus);
        sb.append(", pauseStatus=").append(pauseStatus);
        sb.append(", supplementStatus=").append(supplementStatus);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", bankReviewStatus=").append(bankReviewStatus);
        sb.append(", interestRatio=").append(interestRatio);
        sb.append(", overdueRatio=").append(overdueRatio);
        sb.append(", overdueMaxRatio=").append(overdueMaxRatio);
        sb.append(", loanDays=").append(loanDays);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", withdrawTime=").append(withdrawTime);
        sb.append(", shouldReturnDate=").append(shouldReturnDate);
        sb.append(", delayReturnDate=").append(delayReturnDate);
        sb.append(", repaidOverTime=").append(repaidOverTime);
        sb.append(", first=").append(first);
        sb.append(", loanModel=").append(loanModel);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", extFeeAmount=").append(extFeeAmount);
        sb.append(", interestAmount=").append(interestAmount);
        sb.append(", inHandAmount=").append(inHandAmount);
        sb.append(", withdrawAmount=").append(withdrawAmount);
        sb.append(", repaidAmount=").append(repaidAmount);
        sb.append(", reductionAmount=").append(reductionAmount);
        sb.append(", repaidPrincipalAmount=").append(repaidPrincipalAmount);
        sb.append(", repaidOverdueAmount=").append(repaidOverdueAmount);
        sb.append(", repaidInterestAmount=").append(repaidInterestAmount);
        sb.append(", repaidExtfeeAmount=").append(repaidExtfeeAmount);
        sb.append(", repaidOtherAmount=").append(repaidOtherAmount);
        sb.append(", bankCardId=").append(bankCardId);
        sb.append(", bankId=").append(bankId);
        sb.append(", pauseTime=").append(pauseTime);
        sb.append(", reviewTime=").append(reviewTime);
        sb.append(", firstAllotStatus=").append(firstAllotStatus);
        sb.append(", lastAllotStatus=").append(lastAllotStatus);
        sb.append(", checkAllotStatus=").append(checkAllotStatus);
        sb.append(", firstReviewer=").append(firstReviewer);
        sb.append(", lastReviewer=").append(lastReviewer);
        sb.append(", checker=").append(checker);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", backLabel=").append(backLabel);
        sb.append(", remindLabel=").append(remindLabel);
        sb.append(", loanUsage=").append(loanUsage);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", waitSettle=").append(waitSettle);
        sb.append(", waitSettleTime=").append(waitSettleTime);
        sb.append(", delay=").append(delay);
        sb.append(", overdue=").append(overdue);
        sb.append(", platform=").append(platform);
        sb.append(", rejectCode=").append(rejectCode);
        sb.append(", pauseCode=").append(pauseCode);
        sb.append(", repayReviewStatus=").append(repayReviewStatus);
        sb.append(", withdrawReviewStatus=").append(withdrawReviewStatus);
        sb.append(", remark=").append(remark);
        sb.append(", delayTimes=").append(delayTimes);
        sb.append(", channel=").append(channel);
        sb.append(", delayStatus=").append(delayStatus);
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
        OLend other = (OLend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWithdrawStatus() == null ? other.getWithdrawStatus() == null : this.getWithdrawStatus().equals(other.getWithdrawStatus()))
            && (this.getReviewStatus() == null ? other.getReviewStatus() == null : this.getReviewStatus().equals(other.getReviewStatus()))
            && (this.getRepayStatus() == null ? other.getRepayStatus() == null : this.getRepayStatus().equals(other.getRepayStatus()))
            && (this.getExtPayStatus() == null ? other.getExtPayStatus() == null : this.getExtPayStatus().equals(other.getExtPayStatus()))
            && (this.getPauseStatus() == null ? other.getPauseStatus() == null : this.getPauseStatus().equals(other.getPauseStatus()))
            && (this.getSupplementStatus() == null ? other.getSupplementStatus() == null : this.getSupplementStatus().equals(other.getSupplementStatus()))
            && (this.getCheckStatus() == null ? other.getCheckStatus() == null : this.getCheckStatus().equals(other.getCheckStatus()))
            && (this.getBankReviewStatus() == null ? other.getBankReviewStatus() == null : this.getBankReviewStatus().equals(other.getBankReviewStatus()))
            && (this.getInterestRatio() == null ? other.getInterestRatio() == null : this.getInterestRatio().equals(other.getInterestRatio()))
            && (this.getOverdueRatio() == null ? other.getOverdueRatio() == null : this.getOverdueRatio().equals(other.getOverdueRatio()))
            && (this.getOverdueMaxRatio() == null ? other.getOverdueMaxRatio() == null : this.getOverdueMaxRatio().equals(other.getOverdueMaxRatio()))
            && (this.getLoanDays() == null ? other.getLoanDays() == null : this.getLoanDays().equals(other.getLoanDays()))
            && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
            && (this.getWithdrawTime() == null ? other.getWithdrawTime() == null : this.getWithdrawTime().equals(other.getWithdrawTime()))
            && (this.getShouldReturnDate() == null ? other.getShouldReturnDate() == null : this.getShouldReturnDate().equals(other.getShouldReturnDate()))
            && (this.getDelayReturnDate() == null ? other.getDelayReturnDate() == null : this.getDelayReturnDate().equals(other.getDelayReturnDate()))
            && (this.getRepaidOverTime() == null ? other.getRepaidOverTime() == null : this.getRepaidOverTime().equals(other.getRepaidOverTime()))
            && (this.getFirst() == null ? other.getFirst() == null : this.getFirst().equals(other.getFirst()))
            && (this.getLoanModel() == null ? other.getLoanModel() == null : this.getLoanModel().equals(other.getLoanModel()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getExtFeeAmount() == null ? other.getExtFeeAmount() == null : this.getExtFeeAmount().equals(other.getExtFeeAmount()))
            && (this.getInterestAmount() == null ? other.getInterestAmount() == null : this.getInterestAmount().equals(other.getInterestAmount()))
            && (this.getInHandAmount() == null ? other.getInHandAmount() == null : this.getInHandAmount().equals(other.getInHandAmount()))
            && (this.getWithdrawAmount() == null ? other.getWithdrawAmount() == null : this.getWithdrawAmount().equals(other.getWithdrawAmount()))
            && (this.getRepaidAmount() == null ? other.getRepaidAmount() == null : this.getRepaidAmount().equals(other.getRepaidAmount()))
            && (this.getReductionAmount() == null ? other.getReductionAmount() == null : this.getReductionAmount().equals(other.getReductionAmount()))
            && (this.getRepaidPrincipalAmount() == null ? other.getRepaidPrincipalAmount() == null : this.getRepaidPrincipalAmount().equals(other.getRepaidPrincipalAmount()))
            && (this.getRepaidOverdueAmount() == null ? other.getRepaidOverdueAmount() == null : this.getRepaidOverdueAmount().equals(other.getRepaidOverdueAmount()))
            && (this.getRepaidInterestAmount() == null ? other.getRepaidInterestAmount() == null : this.getRepaidInterestAmount().equals(other.getRepaidInterestAmount()))
            && (this.getRepaidExtfeeAmount() == null ? other.getRepaidExtfeeAmount() == null : this.getRepaidExtfeeAmount().equals(other.getRepaidExtfeeAmount()))
            && (this.getRepaidOtherAmount() == null ? other.getRepaidOtherAmount() == null : this.getRepaidOtherAmount().equals(other.getRepaidOtherAmount()))
            && (this.getBankCardId() == null ? other.getBankCardId() == null : this.getBankCardId().equals(other.getBankCardId()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getPauseTime() == null ? other.getPauseTime() == null : this.getPauseTime().equals(other.getPauseTime()))
            && (this.getReviewTime() == null ? other.getReviewTime() == null : this.getReviewTime().equals(other.getReviewTime()))
            && (this.getFirstAllotStatus() == null ? other.getFirstAllotStatus() == null : this.getFirstAllotStatus().equals(other.getFirstAllotStatus()))
            && (this.getLastAllotStatus() == null ? other.getLastAllotStatus() == null : this.getLastAllotStatus().equals(other.getLastAllotStatus()))
            && (this.getCheckAllotStatus() == null ? other.getCheckAllotStatus() == null : this.getCheckAllotStatus().equals(other.getCheckAllotStatus()))
            && (this.getFirstReviewer() == null ? other.getFirstReviewer() == null : this.getFirstReviewer().equals(other.getFirstReviewer()))
            && (this.getLastReviewer() == null ? other.getLastReviewer() == null : this.getLastReviewer().equals(other.getLastReviewer()))
            && (this.getChecker() == null ? other.getChecker() == null : this.getChecker().equals(other.getChecker()))
            && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()))
            && (this.getBackLabel() == null ? other.getBackLabel() == null : this.getBackLabel().equals(other.getBackLabel()))
            && (this.getRemindLabel() == null ? other.getRemindLabel() == null : this.getRemindLabel().equals(other.getRemindLabel()))
            && (this.getLoanUsage() == null ? other.getLoanUsage() == null : this.getLoanUsage().equals(other.getLoanUsage()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getWaitSettle() == null ? other.getWaitSettle() == null : this.getWaitSettle().equals(other.getWaitSettle()))
            && (this.getWaitSettleTime() == null ? other.getWaitSettleTime() == null : this.getWaitSettleTime().equals(other.getWaitSettleTime()))
            && (this.getDelay() == null ? other.getDelay() == null : this.getDelay().equals(other.getDelay()))
            && (this.getOverdue() == null ? other.getOverdue() == null : this.getOverdue().equals(other.getOverdue()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getRejectCode() == null ? other.getRejectCode() == null : this.getRejectCode().equals(other.getRejectCode()))
            && (this.getPauseCode() == null ? other.getPauseCode() == null : this.getPauseCode().equals(other.getPauseCode()))
            && (this.getRepayReviewStatus() == null ? other.getRepayReviewStatus() == null : this.getRepayReviewStatus().equals(other.getRepayReviewStatus()))
            && (this.getWithdrawReviewStatus() == null ? other.getWithdrawReviewStatus() == null : this.getWithdrawReviewStatus().equals(other.getWithdrawReviewStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDelayTimes() == null ? other.getDelayTimes() == null : this.getDelayTimes().equals(other.getDelayTimes()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getDelayStatus() == null ? other.getDelayStatus() == null : this.getDelayStatus().equals(other.getDelayStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getWithdrawStatus() == null) ? 0 : getWithdrawStatus().hashCode());
        result = prime * result + ((getReviewStatus() == null) ? 0 : getReviewStatus().hashCode());
        result = prime * result + ((getRepayStatus() == null) ? 0 : getRepayStatus().hashCode());
        result = prime * result + ((getExtPayStatus() == null) ? 0 : getExtPayStatus().hashCode());
        result = prime * result + ((getPauseStatus() == null) ? 0 : getPauseStatus().hashCode());
        result = prime * result + ((getSupplementStatus() == null) ? 0 : getSupplementStatus().hashCode());
        result = prime * result + ((getCheckStatus() == null) ? 0 : getCheckStatus().hashCode());
        result = prime * result + ((getBankReviewStatus() == null) ? 0 : getBankReviewStatus().hashCode());
        result = prime * result + ((getInterestRatio() == null) ? 0 : getInterestRatio().hashCode());
        result = prime * result + ((getOverdueRatio() == null) ? 0 : getOverdueRatio().hashCode());
        result = prime * result + ((getOverdueMaxRatio() == null) ? 0 : getOverdueMaxRatio().hashCode());
        result = prime * result + ((getLoanDays() == null) ? 0 : getLoanDays().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getWithdrawTime() == null) ? 0 : getWithdrawTime().hashCode());
        result = prime * result + ((getShouldReturnDate() == null) ? 0 : getShouldReturnDate().hashCode());
        result = prime * result + ((getDelayReturnDate() == null) ? 0 : getDelayReturnDate().hashCode());
        result = prime * result + ((getRepaidOverTime() == null) ? 0 : getRepaidOverTime().hashCode());
        result = prime * result + ((getFirst() == null) ? 0 : getFirst().hashCode());
        result = prime * result + ((getLoanModel() == null) ? 0 : getLoanModel().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getExtFeeAmount() == null) ? 0 : getExtFeeAmount().hashCode());
        result = prime * result + ((getInterestAmount() == null) ? 0 : getInterestAmount().hashCode());
        result = prime * result + ((getInHandAmount() == null) ? 0 : getInHandAmount().hashCode());
        result = prime * result + ((getWithdrawAmount() == null) ? 0 : getWithdrawAmount().hashCode());
        result = prime * result + ((getRepaidAmount() == null) ? 0 : getRepaidAmount().hashCode());
        result = prime * result + ((getReductionAmount() == null) ? 0 : getReductionAmount().hashCode());
        result = prime * result + ((getRepaidPrincipalAmount() == null) ? 0 : getRepaidPrincipalAmount().hashCode());
        result = prime * result + ((getRepaidOverdueAmount() == null) ? 0 : getRepaidOverdueAmount().hashCode());
        result = prime * result + ((getRepaidInterestAmount() == null) ? 0 : getRepaidInterestAmount().hashCode());
        result = prime * result + ((getRepaidExtfeeAmount() == null) ? 0 : getRepaidExtfeeAmount().hashCode());
        result = prime * result + ((getRepaidOtherAmount() == null) ? 0 : getRepaidOtherAmount().hashCode());
        result = prime * result + ((getBankCardId() == null) ? 0 : getBankCardId().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getPauseTime() == null) ? 0 : getPauseTime().hashCode());
        result = prime * result + ((getReviewTime() == null) ? 0 : getReviewTime().hashCode());
        result = prime * result + ((getFirstAllotStatus() == null) ? 0 : getFirstAllotStatus().hashCode());
        result = prime * result + ((getLastAllotStatus() == null) ? 0 : getLastAllotStatus().hashCode());
        result = prime * result + ((getCheckAllotStatus() == null) ? 0 : getCheckAllotStatus().hashCode());
        result = prime * result + ((getFirstReviewer() == null) ? 0 : getFirstReviewer().hashCode());
        result = prime * result + ((getLastReviewer() == null) ? 0 : getLastReviewer().hashCode());
        result = prime * result + ((getChecker() == null) ? 0 : getChecker().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        result = prime * result + ((getBackLabel() == null) ? 0 : getBackLabel().hashCode());
        result = prime * result + ((getRemindLabel() == null) ? 0 : getRemindLabel().hashCode());
        result = prime * result + ((getLoanUsage() == null) ? 0 : getLoanUsage().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getWaitSettle() == null) ? 0 : getWaitSettle().hashCode());
        result = prime * result + ((getWaitSettleTime() == null) ? 0 : getWaitSettleTime().hashCode());
        result = prime * result + ((getDelay() == null) ? 0 : getDelay().hashCode());
        result = prime * result + ((getOverdue() == null) ? 0 : getOverdue().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getRejectCode() == null) ? 0 : getRejectCode().hashCode());
        result = prime * result + ((getPauseCode() == null) ? 0 : getPauseCode().hashCode());
        result = prime * result + ((getRepayReviewStatus() == null) ? 0 : getRepayReviewStatus().hashCode());
        result = prime * result + ((getWithdrawReviewStatus() == null) ? 0 : getWithdrawReviewStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDelayTimes() == null) ? 0 : getDelayTimes().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getDelayStatus() == null) ? 0 : getDelayStatus().hashCode());
        return result;
    }
}