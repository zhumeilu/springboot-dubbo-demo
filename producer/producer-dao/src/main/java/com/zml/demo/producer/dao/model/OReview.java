package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OReview implements Serializable {
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

    private LocalDateTime updateTime;

    /**
     * 订单唯一编号
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 用户Id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 审核人员，rbac_account表里的account字段
     *
     * @mbg.generated
     */
    private String firstReviewer;

    private String lastReviewer;

    /**
     * 稽核人员
     *
     * @mbg.generated
     */
    private String checker;

    /**
     * 初审时间
     *
     * @mbg.generated
     */
    private LocalDateTime firstReviewTime;

    /**
     * 终审时间
     *
     * @mbg.generated
     */
    private LocalDateTime lastReviewTime;

    /**
     * 机审时间
     *
     * @mbg.generated
     */
    private LocalDateTime machineReviewTime;

    private LocalDateTime rearBlacklistReviewTime;

    private LocalDateTime frontBlacklistReviewTime;

    /**
     * 稽核时间
     *
     * @mbg.generated
     */
    private LocalDateTime checkTime;

    /**
     * 机审状态 10 初始化  20 待审核 70成功  80失败
     *
     * @mbg.generated
     */
    private Byte machineReviewStatus;

    /**
     * 初审状态 10 初始化  20 待审核 70成功  80失败
     *
     * @mbg.generated
     */
    private Byte firstReviewStatus;

    /**
     * 终审状态 10 初始化  20 待审核 70成功  80失败
     *
     * @mbg.generated
     */
    private Byte lastReviewStatus;

    /**
     * 前置黑名单状态 10 初始化  20 待审核 70成功  80失败
     *
     * @mbg.generated
     */
    private Byte frontBlacklistStatus;

    /**
     * 后置黑名单状态 10 初始化  20 待审核 70成功  80失败
     *
     * @mbg.generated
     */
    private Byte rearBlacklistStatus;

    /**
     * 初审分配状态 0未分配 1已分配
     *
     * @mbg.generated
     */
    private Boolean firstAllotStatus;

    /**
     * 终审分配状态 0未分配 1已分配
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
     * 拒绝类型
     *
     * @mbg.generated
     */
    private String rejectCode;

    /**
     * 挂单类型
     *
     * @mbg.generated
     */
    private String pauseCode;

    /**
     * 黑名单等级
     *
     * @mbg.generated
     */
    private String blackLevel;

    /**
     * 黑名单类型
     *
     * @mbg.generated
     */
    private String blackType;

    /**
     * 是否命中外部黑名单 1命中 0未命中
     *
     * @mbg.generated
     */
    private Boolean blackHitStatus;

    /**
     * 审核备注
     *
     * @mbg.generated
     */
    private String reviewRemark;

    /**
     * 挂单备注
     *
     * @mbg.generated
     */
    private String pauseRemark;

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

    public LocalDateTime getFirstReviewTime() {
        return firstReviewTime;
    }

    public void setFirstReviewTime(LocalDateTime firstReviewTime) {
        this.firstReviewTime = firstReviewTime;
    }

    public LocalDateTime getLastReviewTime() {
        return lastReviewTime;
    }

    public void setLastReviewTime(LocalDateTime lastReviewTime) {
        this.lastReviewTime = lastReviewTime;
    }

    public LocalDateTime getMachineReviewTime() {
        return machineReviewTime;
    }

    public void setMachineReviewTime(LocalDateTime machineReviewTime) {
        this.machineReviewTime = machineReviewTime;
    }

    public LocalDateTime getRearBlacklistReviewTime() {
        return rearBlacklistReviewTime;
    }

    public void setRearBlacklistReviewTime(LocalDateTime rearBlacklistReviewTime) {
        this.rearBlacklistReviewTime = rearBlacklistReviewTime;
    }

    public LocalDateTime getFrontBlacklistReviewTime() {
        return frontBlacklistReviewTime;
    }

    public void setFrontBlacklistReviewTime(LocalDateTime frontBlacklistReviewTime) {
        this.frontBlacklistReviewTime = frontBlacklistReviewTime;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public Byte getMachineReviewStatus() {
        return machineReviewStatus;
    }

    public void setMachineReviewStatus(Byte machineReviewStatus) {
        this.machineReviewStatus = machineReviewStatus;
    }

    public Byte getFirstReviewStatus() {
        return firstReviewStatus;
    }

    public void setFirstReviewStatus(Byte firstReviewStatus) {
        this.firstReviewStatus = firstReviewStatus;
    }

    public Byte getLastReviewStatus() {
        return lastReviewStatus;
    }

    public void setLastReviewStatus(Byte lastReviewStatus) {
        this.lastReviewStatus = lastReviewStatus;
    }

    public Byte getFrontBlacklistStatus() {
        return frontBlacklistStatus;
    }

    public void setFrontBlacklistStatus(Byte frontBlacklistStatus) {
        this.frontBlacklistStatus = frontBlacklistStatus;
    }

    public Byte getRearBlacklistStatus() {
        return rearBlacklistStatus;
    }

    public void setRearBlacklistStatus(Byte rearBlacklistStatus) {
        this.rearBlacklistStatus = rearBlacklistStatus;
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

    public String getBlackLevel() {
        return blackLevel;
    }

    public void setBlackLevel(String blackLevel) {
        this.blackLevel = blackLevel;
    }

    public String getBlackType() {
        return blackType;
    }

    public void setBlackType(String blackType) {
        this.blackType = blackType;
    }

    public Boolean getBlackHitStatus() {
        return blackHitStatus;
    }

    public void setBlackHitStatus(Boolean blackHitStatus) {
        this.blackHitStatus = blackHitStatus;
    }

    public String getReviewRemark() {
        return reviewRemark;
    }

    public void setReviewRemark(String reviewRemark) {
        this.reviewRemark = reviewRemark;
    }

    public String getPauseRemark() {
        return pauseRemark;
    }

    public void setPauseRemark(String pauseRemark) {
        this.pauseRemark = pauseRemark;
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
        sb.append(", firstReviewer=").append(firstReviewer);
        sb.append(", lastReviewer=").append(lastReviewer);
        sb.append(", checker=").append(checker);
        sb.append(", firstReviewTime=").append(firstReviewTime);
        sb.append(", lastReviewTime=").append(lastReviewTime);
        sb.append(", machineReviewTime=").append(machineReviewTime);
        sb.append(", rearBlacklistReviewTime=").append(rearBlacklistReviewTime);
        sb.append(", frontBlacklistReviewTime=").append(frontBlacklistReviewTime);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", machineReviewStatus=").append(machineReviewStatus);
        sb.append(", firstReviewStatus=").append(firstReviewStatus);
        sb.append(", lastReviewStatus=").append(lastReviewStatus);
        sb.append(", frontBlacklistStatus=").append(frontBlacklistStatus);
        sb.append(", rearBlacklistStatus=").append(rearBlacklistStatus);
        sb.append(", firstAllotStatus=").append(firstAllotStatus);
        sb.append(", lastAllotStatus=").append(lastAllotStatus);
        sb.append(", checkAllotStatus=").append(checkAllotStatus);
        sb.append(", rejectCode=").append(rejectCode);
        sb.append(", pauseCode=").append(pauseCode);
        sb.append(", blackLevel=").append(blackLevel);
        sb.append(", blackType=").append(blackType);
        sb.append(", blackHitStatus=").append(blackHitStatus);
        sb.append(", reviewRemark=").append(reviewRemark);
        sb.append(", pauseRemark=").append(pauseRemark);
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
        OReview other = (OReview) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getFirstReviewer() == null ? other.getFirstReviewer() == null : this.getFirstReviewer().equals(other.getFirstReviewer()))
            && (this.getLastReviewer() == null ? other.getLastReviewer() == null : this.getLastReviewer().equals(other.getLastReviewer()))
            && (this.getChecker() == null ? other.getChecker() == null : this.getChecker().equals(other.getChecker()))
            && (this.getFirstReviewTime() == null ? other.getFirstReviewTime() == null : this.getFirstReviewTime().equals(other.getFirstReviewTime()))
            && (this.getLastReviewTime() == null ? other.getLastReviewTime() == null : this.getLastReviewTime().equals(other.getLastReviewTime()))
            && (this.getMachineReviewTime() == null ? other.getMachineReviewTime() == null : this.getMachineReviewTime().equals(other.getMachineReviewTime()))
            && (this.getRearBlacklistReviewTime() == null ? other.getRearBlacklistReviewTime() == null : this.getRearBlacklistReviewTime().equals(other.getRearBlacklistReviewTime()))
            && (this.getFrontBlacklistReviewTime() == null ? other.getFrontBlacklistReviewTime() == null : this.getFrontBlacklistReviewTime().equals(other.getFrontBlacklistReviewTime()))
            && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()))
            && (this.getMachineReviewStatus() == null ? other.getMachineReviewStatus() == null : this.getMachineReviewStatus().equals(other.getMachineReviewStatus()))
            && (this.getFirstReviewStatus() == null ? other.getFirstReviewStatus() == null : this.getFirstReviewStatus().equals(other.getFirstReviewStatus()))
            && (this.getLastReviewStatus() == null ? other.getLastReviewStatus() == null : this.getLastReviewStatus().equals(other.getLastReviewStatus()))
            && (this.getFrontBlacklistStatus() == null ? other.getFrontBlacklistStatus() == null : this.getFrontBlacklistStatus().equals(other.getFrontBlacklistStatus()))
            && (this.getRearBlacklistStatus() == null ? other.getRearBlacklistStatus() == null : this.getRearBlacklistStatus().equals(other.getRearBlacklistStatus()))
            && (this.getFirstAllotStatus() == null ? other.getFirstAllotStatus() == null : this.getFirstAllotStatus().equals(other.getFirstAllotStatus()))
            && (this.getLastAllotStatus() == null ? other.getLastAllotStatus() == null : this.getLastAllotStatus().equals(other.getLastAllotStatus()))
            && (this.getCheckAllotStatus() == null ? other.getCheckAllotStatus() == null : this.getCheckAllotStatus().equals(other.getCheckAllotStatus()))
            && (this.getRejectCode() == null ? other.getRejectCode() == null : this.getRejectCode().equals(other.getRejectCode()))
            && (this.getPauseCode() == null ? other.getPauseCode() == null : this.getPauseCode().equals(other.getPauseCode()))
            && (this.getBlackLevel() == null ? other.getBlackLevel() == null : this.getBlackLevel().equals(other.getBlackLevel()))
            && (this.getBlackType() == null ? other.getBlackType() == null : this.getBlackType().equals(other.getBlackType()))
            && (this.getBlackHitStatus() == null ? other.getBlackHitStatus() == null : this.getBlackHitStatus().equals(other.getBlackHitStatus()))
            && (this.getReviewRemark() == null ? other.getReviewRemark() == null : this.getReviewRemark().equals(other.getReviewRemark()))
            && (this.getPauseRemark() == null ? other.getPauseRemark() == null : this.getPauseRemark().equals(other.getPauseRemark()));
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
        result = prime * result + ((getFirstReviewer() == null) ? 0 : getFirstReviewer().hashCode());
        result = prime * result + ((getLastReviewer() == null) ? 0 : getLastReviewer().hashCode());
        result = prime * result + ((getChecker() == null) ? 0 : getChecker().hashCode());
        result = prime * result + ((getFirstReviewTime() == null) ? 0 : getFirstReviewTime().hashCode());
        result = prime * result + ((getLastReviewTime() == null) ? 0 : getLastReviewTime().hashCode());
        result = prime * result + ((getMachineReviewTime() == null) ? 0 : getMachineReviewTime().hashCode());
        result = prime * result + ((getRearBlacklistReviewTime() == null) ? 0 : getRearBlacklistReviewTime().hashCode());
        result = prime * result + ((getFrontBlacklistReviewTime() == null) ? 0 : getFrontBlacklistReviewTime().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        result = prime * result + ((getMachineReviewStatus() == null) ? 0 : getMachineReviewStatus().hashCode());
        result = prime * result + ((getFirstReviewStatus() == null) ? 0 : getFirstReviewStatus().hashCode());
        result = prime * result + ((getLastReviewStatus() == null) ? 0 : getLastReviewStatus().hashCode());
        result = prime * result + ((getFrontBlacklistStatus() == null) ? 0 : getFrontBlacklistStatus().hashCode());
        result = prime * result + ((getRearBlacklistStatus() == null) ? 0 : getRearBlacklistStatus().hashCode());
        result = prime * result + ((getFirstAllotStatus() == null) ? 0 : getFirstAllotStatus().hashCode());
        result = prime * result + ((getLastAllotStatus() == null) ? 0 : getLastAllotStatus().hashCode());
        result = prime * result + ((getCheckAllotStatus() == null) ? 0 : getCheckAllotStatus().hashCode());
        result = prime * result + ((getRejectCode() == null) ? 0 : getRejectCode().hashCode());
        result = prime * result + ((getPauseCode() == null) ? 0 : getPauseCode().hashCode());
        result = prime * result + ((getBlackLevel() == null) ? 0 : getBlackLevel().hashCode());
        result = prime * result + ((getBlackType() == null) ? 0 : getBlackType().hashCode());
        result = prime * result + ((getBlackHitStatus() == null) ? 0 : getBlackHitStatus().hashCode());
        result = prime * result + ((getReviewRemark() == null) ? 0 : getReviewRemark().hashCode());
        result = prime * result + ((getPauseRemark() == null) ? 0 : getPauseRemark().hashCode());
        return result;
    }
}