package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OExtfee implements Serializable {
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
     * 服务费编号
     *
     * @mbg.generated
     */
    private String extfeeId;

    /**
     * 信用报告支付ID
     *
     * @mbg.generated
     */
    private String extfeePayId;

    /**
     * 用户Id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 产品Id
     *
     * @mbg.generated
     */
    private String productId;

    /**
     * 状态(none: 默认状态; not_used未使用; apply;已使用)
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 借贷模式 1,2,3
     *
     * @mbg.generated
     */
    private Byte loanModel;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 信用报告分数
     *
     * @mbg.generated
     */
    private String creditScore;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    private LocalDateTime registerTime;

    /**
     * 真实姓名
     *
     * @mbg.generated
     */
    private String fullName;

    /**
     * 是否实名认证
     *
     * @mbg.generated
     */
    private Byte isRealname;

    /**
     * 性别
     *
     * @mbg.generated
     */
    private String gender;

    /**
     * 年龄
     *
     * @mbg.generated
     */
    private Integer age;

    /**
     * 省份
     *
     * @mbg.generated
     */
    private String province;

    /**
     * 联系人一命中逾期情况
     *
     * @mbg.generated
     */
    private Byte isContactRelativeOverdue;

    /**
     * 联系人一联系人数
     *
     * @mbg.generated
     */
    private Integer contactRelativeContactCount;

    /**
     * 联系人二命中逾期情况
     *
     * @mbg.generated
     */
    private Byte isContactFriendOverdue;

    /**
     * 联系人二联系人数
     *
     * @mbg.generated
     */
    private Integer contactFriendContactCount;

    /**
     * 敏感联系人数
     *
     * @mbg.generated
     */
    private Integer contactSensitiveCount;

    /**
     * 身份证命中黑名单情况
     *
     * @mbg.generated
     */
    private Byte isIdcardBlack;

    /**
     * 本人申请次数
     *
     * @mbg.generated
     */
    private Integer loanCount;

    /**
     * 身份证逾期次数
     *
     * @mbg.generated
     */
    private Integer idcardOverdueCount;

    /**
     * 活体分数
     *
     * @mbg.generated
     */
    private String livingScore;

    /**
     * 人脸比对分数
     *
     * @mbg.generated
     */
    private String faceComparisonSimilarity;

    /**
     * OCR校验是否异常
     *
     * @mbg.generated
     */
    private Byte isOcr;

    /**
     * 身份证最近一笔逾期天数
     *
     * @mbg.generated
     */
    private Integer idcardRecentOverdueDays;

    /**
     * 身份证历史逾期天数
     *
     * @mbg.generated
     */
    private Integer idcardHistoryOverdueDays;

    /**
     * 身份证180天内关联联系人数
     *
     * @mbg.generated
     */
    private Integer idcardAboutContactCount180Days;

    /**
     * 银行卡号180天内关联身份证个数
     *
     * @mbg.generated
     */
    private Integer bankAccountAboutIdcardCount180Days;

    /**
     * 手机号作为紧急联系人次数
     *
     * @mbg.generated
     */
    private Integer phoneAboutEmergencyCount;

    /**
     * 联系人有效人数
     *
     * @mbg.generated
     */
    private Integer contactValidCount;

    /**
     * 通讯录中逾期中订单个数
     *
     * @mbg.generated
     */
    private Integer contactAboutOverdueCount;

    /**
     * 通讯录中恶意逾期订单个数
     *
     * @mbg.generated
     */
    private Integer contactAboutBadOverdueCount;

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

    public String getExtfeeId() {
        return extfeeId;
    }

    public void setExtfeeId(String extfeeId) {
        this.extfeeId = extfeeId;
    }

    public String getExtfeePayId() {
        return extfeePayId;
    }

    public void setExtfeePayId(String extfeePayId) {
        this.extfeePayId = extfeePayId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Byte getLoanModel() {
        return loanModel;
    }

    public void setLoanModel(Byte loanModel) {
        this.loanModel = loanModel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public LocalDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(LocalDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Byte getIsRealname() {
        return isRealname;
    }

    public void setIsRealname(Byte isRealname) {
        this.isRealname = isRealname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Byte getIsContactRelativeOverdue() {
        return isContactRelativeOverdue;
    }

    public void setIsContactRelativeOverdue(Byte isContactRelativeOverdue) {
        this.isContactRelativeOverdue = isContactRelativeOverdue;
    }

    public Integer getContactRelativeContactCount() {
        return contactRelativeContactCount;
    }

    public void setContactRelativeContactCount(Integer contactRelativeContactCount) {
        this.contactRelativeContactCount = contactRelativeContactCount;
    }

    public Byte getIsContactFriendOverdue() {
        return isContactFriendOverdue;
    }

    public void setIsContactFriendOverdue(Byte isContactFriendOverdue) {
        this.isContactFriendOverdue = isContactFriendOverdue;
    }

    public Integer getContactFriendContactCount() {
        return contactFriendContactCount;
    }

    public void setContactFriendContactCount(Integer contactFriendContactCount) {
        this.contactFriendContactCount = contactFriendContactCount;
    }

    public Integer getContactSensitiveCount() {
        return contactSensitiveCount;
    }

    public void setContactSensitiveCount(Integer contactSensitiveCount) {
        this.contactSensitiveCount = contactSensitiveCount;
    }

    public Byte getIsIdcardBlack() {
        return isIdcardBlack;
    }

    public void setIsIdcardBlack(Byte isIdcardBlack) {
        this.isIdcardBlack = isIdcardBlack;
    }

    public Integer getLoanCount() {
        return loanCount;
    }

    public void setLoanCount(Integer loanCount) {
        this.loanCount = loanCount;
    }

    public Integer getIdcardOverdueCount() {
        return idcardOverdueCount;
    }

    public void setIdcardOverdueCount(Integer idcardOverdueCount) {
        this.idcardOverdueCount = idcardOverdueCount;
    }

    public String getLivingScore() {
        return livingScore;
    }

    public void setLivingScore(String livingScore) {
        this.livingScore = livingScore;
    }

    public String getFaceComparisonSimilarity() {
        return faceComparisonSimilarity;
    }

    public void setFaceComparisonSimilarity(String faceComparisonSimilarity) {
        this.faceComparisonSimilarity = faceComparisonSimilarity;
    }

    public Byte getIsOcr() {
        return isOcr;
    }

    public void setIsOcr(Byte isOcr) {
        this.isOcr = isOcr;
    }

    public Integer getIdcardRecentOverdueDays() {
        return idcardRecentOverdueDays;
    }

    public void setIdcardRecentOverdueDays(Integer idcardRecentOverdueDays) {
        this.idcardRecentOverdueDays = idcardRecentOverdueDays;
    }

    public Integer getIdcardHistoryOverdueDays() {
        return idcardHistoryOverdueDays;
    }

    public void setIdcardHistoryOverdueDays(Integer idcardHistoryOverdueDays) {
        this.idcardHistoryOverdueDays = idcardHistoryOverdueDays;
    }

    public Integer getIdcardAboutContactCount180Days() {
        return idcardAboutContactCount180Days;
    }

    public void setIdcardAboutContactCount180Days(Integer idcardAboutContactCount180Days) {
        this.idcardAboutContactCount180Days = idcardAboutContactCount180Days;
    }

    public Integer getBankAccountAboutIdcardCount180Days() {
        return bankAccountAboutIdcardCount180Days;
    }

    public void setBankAccountAboutIdcardCount180Days(Integer bankAccountAboutIdcardCount180Days) {
        this.bankAccountAboutIdcardCount180Days = bankAccountAboutIdcardCount180Days;
    }

    public Integer getPhoneAboutEmergencyCount() {
        return phoneAboutEmergencyCount;
    }

    public void setPhoneAboutEmergencyCount(Integer phoneAboutEmergencyCount) {
        this.phoneAboutEmergencyCount = phoneAboutEmergencyCount;
    }

    public Integer getContactValidCount() {
        return contactValidCount;
    }

    public void setContactValidCount(Integer contactValidCount) {
        this.contactValidCount = contactValidCount;
    }

    public Integer getContactAboutOverdueCount() {
        return contactAboutOverdueCount;
    }

    public void setContactAboutOverdueCount(Integer contactAboutOverdueCount) {
        this.contactAboutOverdueCount = contactAboutOverdueCount;
    }

    public Integer getContactAboutBadOverdueCount() {
        return contactAboutBadOverdueCount;
    }

    public void setContactAboutBadOverdueCount(Integer contactAboutBadOverdueCount) {
        this.contactAboutBadOverdueCount = contactAboutBadOverdueCount;
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
        sb.append(", extfeeId=").append(extfeeId);
        sb.append(", extfeePayId=").append(extfeePayId);
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", status=").append(status);
        sb.append(", loanModel=").append(loanModel);
        sb.append(", mobile=").append(mobile);
        sb.append(", creditScore=").append(creditScore);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", fullName=").append(fullName);
        sb.append(", isRealname=").append(isRealname);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", province=").append(province);
        sb.append(", isContactRelativeOverdue=").append(isContactRelativeOverdue);
        sb.append(", contactRelativeContactCount=").append(contactRelativeContactCount);
        sb.append(", isContactFriendOverdue=").append(isContactFriendOverdue);
        sb.append(", contactFriendContactCount=").append(contactFriendContactCount);
        sb.append(", contactSensitiveCount=").append(contactSensitiveCount);
        sb.append(", isIdcardBlack=").append(isIdcardBlack);
        sb.append(", loanCount=").append(loanCount);
        sb.append(", idcardOverdueCount=").append(idcardOverdueCount);
        sb.append(", livingScore=").append(livingScore);
        sb.append(", faceComparisonSimilarity=").append(faceComparisonSimilarity);
        sb.append(", isOcr=").append(isOcr);
        sb.append(", idcardRecentOverdueDays=").append(idcardRecentOverdueDays);
        sb.append(", idcardHistoryOverdueDays=").append(idcardHistoryOverdueDays);
        sb.append(", idcardAboutContactCount180Days=").append(idcardAboutContactCount180Days);
        sb.append(", bankAccountAboutIdcardCount180Days=").append(bankAccountAboutIdcardCount180Days);
        sb.append(", phoneAboutEmergencyCount=").append(phoneAboutEmergencyCount);
        sb.append(", contactValidCount=").append(contactValidCount);
        sb.append(", contactAboutOverdueCount=").append(contactAboutOverdueCount);
        sb.append(", contactAboutBadOverdueCount=").append(contactAboutBadOverdueCount);
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
        OExtfee other = (OExtfee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getExtfeeId() == null ? other.getExtfeeId() == null : this.getExtfeeId().equals(other.getExtfeeId()))
            && (this.getExtfeePayId() == null ? other.getExtfeePayId() == null : this.getExtfeePayId().equals(other.getExtfeePayId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLoanModel() == null ? other.getLoanModel() == null : this.getLoanModel().equals(other.getLoanModel()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getCreditScore() == null ? other.getCreditScore() == null : this.getCreditScore().equals(other.getCreditScore()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
            && (this.getFullName() == null ? other.getFullName() == null : this.getFullName().equals(other.getFullName()))
            && (this.getIsRealname() == null ? other.getIsRealname() == null : this.getIsRealname().equals(other.getIsRealname()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getIsContactRelativeOverdue() == null ? other.getIsContactRelativeOverdue() == null : this.getIsContactRelativeOverdue().equals(other.getIsContactRelativeOverdue()))
            && (this.getContactRelativeContactCount() == null ? other.getContactRelativeContactCount() == null : this.getContactRelativeContactCount().equals(other.getContactRelativeContactCount()))
            && (this.getIsContactFriendOverdue() == null ? other.getIsContactFriendOverdue() == null : this.getIsContactFriendOverdue().equals(other.getIsContactFriendOverdue()))
            && (this.getContactFriendContactCount() == null ? other.getContactFriendContactCount() == null : this.getContactFriendContactCount().equals(other.getContactFriendContactCount()))
            && (this.getContactSensitiveCount() == null ? other.getContactSensitiveCount() == null : this.getContactSensitiveCount().equals(other.getContactSensitiveCount()))
            && (this.getIsIdcardBlack() == null ? other.getIsIdcardBlack() == null : this.getIsIdcardBlack().equals(other.getIsIdcardBlack()))
            && (this.getLoanCount() == null ? other.getLoanCount() == null : this.getLoanCount().equals(other.getLoanCount()))
            && (this.getIdcardOverdueCount() == null ? other.getIdcardOverdueCount() == null : this.getIdcardOverdueCount().equals(other.getIdcardOverdueCount()))
            && (this.getLivingScore() == null ? other.getLivingScore() == null : this.getLivingScore().equals(other.getLivingScore()))
            && (this.getFaceComparisonSimilarity() == null ? other.getFaceComparisonSimilarity() == null : this.getFaceComparisonSimilarity().equals(other.getFaceComparisonSimilarity()))
            && (this.getIsOcr() == null ? other.getIsOcr() == null : this.getIsOcr().equals(other.getIsOcr()))
            && (this.getIdcardRecentOverdueDays() == null ? other.getIdcardRecentOverdueDays() == null : this.getIdcardRecentOverdueDays().equals(other.getIdcardRecentOverdueDays()))
            && (this.getIdcardHistoryOverdueDays() == null ? other.getIdcardHistoryOverdueDays() == null : this.getIdcardHistoryOverdueDays().equals(other.getIdcardHistoryOverdueDays()))
            && (this.getIdcardAboutContactCount180Days() == null ? other.getIdcardAboutContactCount180Days() == null : this.getIdcardAboutContactCount180Days().equals(other.getIdcardAboutContactCount180Days()))
            && (this.getBankAccountAboutIdcardCount180Days() == null ? other.getBankAccountAboutIdcardCount180Days() == null : this.getBankAccountAboutIdcardCount180Days().equals(other.getBankAccountAboutIdcardCount180Days()))
            && (this.getPhoneAboutEmergencyCount() == null ? other.getPhoneAboutEmergencyCount() == null : this.getPhoneAboutEmergencyCount().equals(other.getPhoneAboutEmergencyCount()))
            && (this.getContactValidCount() == null ? other.getContactValidCount() == null : this.getContactValidCount().equals(other.getContactValidCount()))
            && (this.getContactAboutOverdueCount() == null ? other.getContactAboutOverdueCount() == null : this.getContactAboutOverdueCount().equals(other.getContactAboutOverdueCount()))
            && (this.getContactAboutBadOverdueCount() == null ? other.getContactAboutBadOverdueCount() == null : this.getContactAboutBadOverdueCount().equals(other.getContactAboutBadOverdueCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getExtfeeId() == null) ? 0 : getExtfeeId().hashCode());
        result = prime * result + ((getExtfeePayId() == null) ? 0 : getExtfeePayId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLoanModel() == null) ? 0 : getLoanModel().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getCreditScore() == null) ? 0 : getCreditScore().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getFullName() == null) ? 0 : getFullName().hashCode());
        result = prime * result + ((getIsRealname() == null) ? 0 : getIsRealname().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getIsContactRelativeOverdue() == null) ? 0 : getIsContactRelativeOverdue().hashCode());
        result = prime * result + ((getContactRelativeContactCount() == null) ? 0 : getContactRelativeContactCount().hashCode());
        result = prime * result + ((getIsContactFriendOverdue() == null) ? 0 : getIsContactFriendOverdue().hashCode());
        result = prime * result + ((getContactFriendContactCount() == null) ? 0 : getContactFriendContactCount().hashCode());
        result = prime * result + ((getContactSensitiveCount() == null) ? 0 : getContactSensitiveCount().hashCode());
        result = prime * result + ((getIsIdcardBlack() == null) ? 0 : getIsIdcardBlack().hashCode());
        result = prime * result + ((getLoanCount() == null) ? 0 : getLoanCount().hashCode());
        result = prime * result + ((getIdcardOverdueCount() == null) ? 0 : getIdcardOverdueCount().hashCode());
        result = prime * result + ((getLivingScore() == null) ? 0 : getLivingScore().hashCode());
        result = prime * result + ((getFaceComparisonSimilarity() == null) ? 0 : getFaceComparisonSimilarity().hashCode());
        result = prime * result + ((getIsOcr() == null) ? 0 : getIsOcr().hashCode());
        result = prime * result + ((getIdcardRecentOverdueDays() == null) ? 0 : getIdcardRecentOverdueDays().hashCode());
        result = prime * result + ((getIdcardHistoryOverdueDays() == null) ? 0 : getIdcardHistoryOverdueDays().hashCode());
        result = prime * result + ((getIdcardAboutContactCount180Days() == null) ? 0 : getIdcardAboutContactCount180Days().hashCode());
        result = prime * result + ((getBankAccountAboutIdcardCount180Days() == null) ? 0 : getBankAccountAboutIdcardCount180Days().hashCode());
        result = prime * result + ((getPhoneAboutEmergencyCount() == null) ? 0 : getPhoneAboutEmergencyCount().hashCode());
        result = prime * result + ((getContactValidCount() == null) ? 0 : getContactValidCount().hashCode());
        result = prime * result + ((getContactAboutOverdueCount() == null) ? 0 : getContactAboutOverdueCount().hashCode());
        result = prime * result + ((getContactAboutBadOverdueCount() == null) ? 0 : getContactAboutBadOverdueCount().hashCode());
        return result;
    }
}