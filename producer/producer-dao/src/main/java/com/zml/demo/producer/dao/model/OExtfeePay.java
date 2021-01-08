package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OExtfeePay implements Serializable {
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
     * 借款订单ID
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 服务费支付编号
     *
     * @mbg.generated
     */
    private String extfeePayId;

    /**
     * 支付模块编号
     *
     * @mbg.generated
     */
    private String paymentId;

    /**
     * 三方流水号（支付模块三方流水号）
     *
     * @mbg.generated
     */
    private String thirdOrderId;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 用户账号(手机号)
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 支付金额
     *
     * @mbg.generated
     */
    private BigDecimal payAmount;

    /**
     * 支付时间
     *
     * @mbg.generated
     */
    private LocalDateTime payTime;

    /**
     * 用户付款时间
     *
     * @mbg.generated
     */
    private LocalDateTime userPayTime;

    /**
     * 确认时间(财务确认/三方确认)
     *
     * @mbg.generated
     */
    private LocalDateTime confirmTime;

    /**
     * 支付状态
10初始状态
20待支付
30支付取消
70支付成功
80支付失败
     *
     * @mbg.generated
     */
    private Byte payStatus;

    /**
     * 支付方式 online线上 offline线下
     *
     * @mbg.generated
     */
    private String payWay;

    /**
     * 支付渠道（对应支付模块waycode）
     *
     * @mbg.generated
     */
    private String payChannel;

    /**
     * 第三方支付渠道
     *
     * @mbg.generated
     */
    private String payThirdPartyChannel;

    /**
     * 第三方返回支付结果FPS
     *
     * @mbg.generated
     */
    private String payResult;

    /**
     * 支付凭证
     *
     * @mbg.generated
     */
    private String payProofUrl;

    /**
     * 用户上传凭证状态 0待上传  1上传成功
     *
     * @mbg.generated
     */
    private Byte payProofStatus;

    /**
     * 上传凭证时间
     *
     * @mbg.generated
     */
    private LocalDateTime uploadTime;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 借贷模式 1,2,3
     *
     * @mbg.generated
     */
    private Byte loanModel;

    /**
     * 付款方
     *
     * @mbg.generated
     */
    private String payer;

    /**
     * 收款方
     *
     * @mbg.generated
     */
    private String payee;

    /**
     * 二维码
     *
     * @mbg.generated
     */
    private String qrCode;

    /**
     * 线下还款银行
     *
     * @mbg.generated
     */
    private Integer bankId;

    private String bankName;

    /**
     * 线下还款银行
     *
     * @mbg.generated
     */
    private String bankBranch;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String accountNo;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String bankCardFirstNameTh;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String bankCardLastNameTh;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String bankCardFirstNameEn;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String bankCardLastNameEn;

    /**
     * 平台收款银行信息
     *
     * @mbg.generated
     */
    private String companyBankName;

    /**
     * 平台收款银行信息
     *
     * @mbg.generated
     */
    private String companyAccountNo;

    /**
     * 平台收款银行信息
     *
     * @mbg.generated
     */
    private String companyName;

    /**
     * 平台收款银行信息
     *
     * @mbg.generated
     */
    private String companyBankBranch;

    /**
     * 二维码图片源
     *
     * @mbg.generated
     */
    private String qrCodeData;

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

    public String getExtfeePayId() {
        return extfeePayId;
    }

    public void setExtfeePayId(String extfeePayId) {
        this.extfeePayId = extfeePayId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getThirdOrderId() {
        return thirdOrderId;
    }

    public void setThirdOrderId(String thirdOrderId) {
        this.thirdOrderId = thirdOrderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public LocalDateTime getUserPayTime() {
        return userPayTime;
    }

    public void setUserPayTime(LocalDateTime userPayTime) {
        this.userPayTime = userPayTime;
    }

    public LocalDateTime getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(LocalDateTime confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayThirdPartyChannel() {
        return payThirdPartyChannel;
    }

    public void setPayThirdPartyChannel(String payThirdPartyChannel) {
        this.payThirdPartyChannel = payThirdPartyChannel;
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult;
    }

    public String getPayProofUrl() {
        return payProofUrl;
    }

    public void setPayProofUrl(String payProofUrl) {
        this.payProofUrl = payProofUrl;
    }

    public Byte getPayProofStatus() {
        return payProofStatus;
    }

    public void setPayProofStatus(Byte payProofStatus) {
        this.payProofStatus = payProofStatus;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getLoanModel() {
        return loanModel;
    }

    public void setLoanModel(Byte loanModel) {
        this.loanModel = loanModel;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankCardFirstNameTh() {
        return bankCardFirstNameTh;
    }

    public void setBankCardFirstNameTh(String bankCardFirstNameTh) {
        this.bankCardFirstNameTh = bankCardFirstNameTh;
    }

    public String getBankCardLastNameTh() {
        return bankCardLastNameTh;
    }

    public void setBankCardLastNameTh(String bankCardLastNameTh) {
        this.bankCardLastNameTh = bankCardLastNameTh;
    }

    public String getBankCardFirstNameEn() {
        return bankCardFirstNameEn;
    }

    public void setBankCardFirstNameEn(String bankCardFirstNameEn) {
        this.bankCardFirstNameEn = bankCardFirstNameEn;
    }

    public String getBankCardLastNameEn() {
        return bankCardLastNameEn;
    }

    public void setBankCardLastNameEn(String bankCardLastNameEn) {
        this.bankCardLastNameEn = bankCardLastNameEn;
    }

    public String getCompanyBankName() {
        return companyBankName;
    }

    public void setCompanyBankName(String companyBankName) {
        this.companyBankName = companyBankName;
    }

    public String getCompanyAccountNo() {
        return companyAccountNo;
    }

    public void setCompanyAccountNo(String companyAccountNo) {
        this.companyAccountNo = companyAccountNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyBankBranch() {
        return companyBankBranch;
    }

    public void setCompanyBankBranch(String companyBankBranch) {
        this.companyBankBranch = companyBankBranch;
    }

    public String getQrCodeData() {
        return qrCodeData;
    }

    public void setQrCodeData(String qrCodeData) {
        this.qrCodeData = qrCodeData;
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
        sb.append(", extfeePayId=").append(extfeePayId);
        sb.append(", paymentId=").append(paymentId);
        sb.append(", thirdOrderId=").append(thirdOrderId);
        sb.append(", userId=").append(userId);
        sb.append(", mobile=").append(mobile);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", payTime=").append(payTime);
        sb.append(", userPayTime=").append(userPayTime);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", payWay=").append(payWay);
        sb.append(", payChannel=").append(payChannel);
        sb.append(", payThirdPartyChannel=").append(payThirdPartyChannel);
        sb.append(", payResult=").append(payResult);
        sb.append(", payProofUrl=").append(payProofUrl);
        sb.append(", payProofStatus=").append(payProofStatus);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", remark=").append(remark);
        sb.append(", loanModel=").append(loanModel);
        sb.append(", payer=").append(payer);
        sb.append(", payee=").append(payee);
        sb.append(", qrCode=").append(qrCode);
        sb.append(", bankId=").append(bankId);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankBranch=").append(bankBranch);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", bankCardFirstNameTh=").append(bankCardFirstNameTh);
        sb.append(", bankCardLastNameTh=").append(bankCardLastNameTh);
        sb.append(", bankCardFirstNameEn=").append(bankCardFirstNameEn);
        sb.append(", bankCardLastNameEn=").append(bankCardLastNameEn);
        sb.append(", companyBankName=").append(companyBankName);
        sb.append(", companyAccountNo=").append(companyAccountNo);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyBankBranch=").append(companyBankBranch);
        sb.append(", qrCodeData=").append(qrCodeData);
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
        OExtfeePay other = (OExtfeePay) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getExtfeePayId() == null ? other.getExtfeePayId() == null : this.getExtfeePayId().equals(other.getExtfeePayId()))
            && (this.getPaymentId() == null ? other.getPaymentId() == null : this.getPaymentId().equals(other.getPaymentId()))
            && (this.getThirdOrderId() == null ? other.getThirdOrderId() == null : this.getThirdOrderId().equals(other.getThirdOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getUserPayTime() == null ? other.getUserPayTime() == null : this.getUserPayTime().equals(other.getUserPayTime()))
            && (this.getConfirmTime() == null ? other.getConfirmTime() == null : this.getConfirmTime().equals(other.getConfirmTime()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getPayChannel() == null ? other.getPayChannel() == null : this.getPayChannel().equals(other.getPayChannel()))
            && (this.getPayThirdPartyChannel() == null ? other.getPayThirdPartyChannel() == null : this.getPayThirdPartyChannel().equals(other.getPayThirdPartyChannel()))
            && (this.getPayResult() == null ? other.getPayResult() == null : this.getPayResult().equals(other.getPayResult()))
            && (this.getPayProofUrl() == null ? other.getPayProofUrl() == null : this.getPayProofUrl().equals(other.getPayProofUrl()))
            && (this.getPayProofStatus() == null ? other.getPayProofStatus() == null : this.getPayProofStatus().equals(other.getPayProofStatus()))
            && (this.getUploadTime() == null ? other.getUploadTime() == null : this.getUploadTime().equals(other.getUploadTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getLoanModel() == null ? other.getLoanModel() == null : this.getLoanModel().equals(other.getLoanModel()))
            && (this.getPayer() == null ? other.getPayer() == null : this.getPayer().equals(other.getPayer()))
            && (this.getPayee() == null ? other.getPayee() == null : this.getPayee().equals(other.getPayee()))
            && (this.getQrCode() == null ? other.getQrCode() == null : this.getQrCode().equals(other.getQrCode()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBankBranch() == null ? other.getBankBranch() == null : this.getBankBranch().equals(other.getBankBranch()))
            && (this.getAccountNo() == null ? other.getAccountNo() == null : this.getAccountNo().equals(other.getAccountNo()))
            && (this.getBankCardFirstNameTh() == null ? other.getBankCardFirstNameTh() == null : this.getBankCardFirstNameTh().equals(other.getBankCardFirstNameTh()))
            && (this.getBankCardLastNameTh() == null ? other.getBankCardLastNameTh() == null : this.getBankCardLastNameTh().equals(other.getBankCardLastNameTh()))
            && (this.getBankCardFirstNameEn() == null ? other.getBankCardFirstNameEn() == null : this.getBankCardFirstNameEn().equals(other.getBankCardFirstNameEn()))
            && (this.getBankCardLastNameEn() == null ? other.getBankCardLastNameEn() == null : this.getBankCardLastNameEn().equals(other.getBankCardLastNameEn()))
            && (this.getCompanyBankName() == null ? other.getCompanyBankName() == null : this.getCompanyBankName().equals(other.getCompanyBankName()))
            && (this.getCompanyAccountNo() == null ? other.getCompanyAccountNo() == null : this.getCompanyAccountNo().equals(other.getCompanyAccountNo()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompanyBankBranch() == null ? other.getCompanyBankBranch() == null : this.getCompanyBankBranch().equals(other.getCompanyBankBranch()))
            && (this.getQrCodeData() == null ? other.getQrCodeData() == null : this.getQrCodeData().equals(other.getQrCodeData()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getExtfeePayId() == null) ? 0 : getExtfeePayId().hashCode());
        result = prime * result + ((getPaymentId() == null) ? 0 : getPaymentId().hashCode());
        result = prime * result + ((getThirdOrderId() == null) ? 0 : getThirdOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getUserPayTime() == null) ? 0 : getUserPayTime().hashCode());
        result = prime * result + ((getConfirmTime() == null) ? 0 : getConfirmTime().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getPayChannel() == null) ? 0 : getPayChannel().hashCode());
        result = prime * result + ((getPayThirdPartyChannel() == null) ? 0 : getPayThirdPartyChannel().hashCode());
        result = prime * result + ((getPayResult() == null) ? 0 : getPayResult().hashCode());
        result = prime * result + ((getPayProofUrl() == null) ? 0 : getPayProofUrl().hashCode());
        result = prime * result + ((getPayProofStatus() == null) ? 0 : getPayProofStatus().hashCode());
        result = prime * result + ((getUploadTime() == null) ? 0 : getUploadTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getLoanModel() == null) ? 0 : getLoanModel().hashCode());
        result = prime * result + ((getPayer() == null) ? 0 : getPayer().hashCode());
        result = prime * result + ((getPayee() == null) ? 0 : getPayee().hashCode());
        result = prime * result + ((getQrCode() == null) ? 0 : getQrCode().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBankBranch() == null) ? 0 : getBankBranch().hashCode());
        result = prime * result + ((getAccountNo() == null) ? 0 : getAccountNo().hashCode());
        result = prime * result + ((getBankCardFirstNameTh() == null) ? 0 : getBankCardFirstNameTh().hashCode());
        result = prime * result + ((getBankCardLastNameTh() == null) ? 0 : getBankCardLastNameTh().hashCode());
        result = prime * result + ((getBankCardFirstNameEn() == null) ? 0 : getBankCardFirstNameEn().hashCode());
        result = prime * result + ((getBankCardLastNameEn() == null) ? 0 : getBankCardLastNameEn().hashCode());
        result = prime * result + ((getCompanyBankName() == null) ? 0 : getCompanyBankName().hashCode());
        result = prime * result + ((getCompanyAccountNo() == null) ? 0 : getCompanyAccountNo().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompanyBankBranch() == null) ? 0 : getCompanyBankBranch().hashCode());
        result = prime * result + ((getQrCodeData() == null) ? 0 : getQrCodeData().hashCode());
        return result;
    }
}