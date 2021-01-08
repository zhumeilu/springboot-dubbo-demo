package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OUrgeStage implements Serializable {
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
     * 修改时间
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * 催收阶段名称
     *
     * @mbg.generated
     */
    private String stage;

    /**
     * 阶段最小天数
     *
     * @mbg.generated
     */
    private Integer minOverdueDays;

    /**
     * 阶段最大天数
     *
     * @mbg.generated
     */
    private Integer maxOverdueDays;

    /**
     * 0:不使用 1:使用中
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 提成比例
     *
     * @mbg.generated
     */
    private String royal;

    /**
     * 单点登录中心所属组织名
     *
     * @mbg.generated
     */
    private String organizationName;

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

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Integer getMinOverdueDays() {
        return minOverdueDays;
    }

    public void setMinOverdueDays(Integer minOverdueDays) {
        this.minOverdueDays = minOverdueDays;
    }

    public Integer getMaxOverdueDays() {
        return maxOverdueDays;
    }

    public void setMaxOverdueDays(Integer maxOverdueDays) {
        this.maxOverdueDays = maxOverdueDays;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRoyal() {
        return royal;
    }

    public void setRoyal(String royal) {
        this.royal = royal;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
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
        sb.append(", stage=").append(stage);
        sb.append(", minOverdueDays=").append(minOverdueDays);
        sb.append(", maxOverdueDays=").append(maxOverdueDays);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", royal=").append(royal);
        sb.append(", organizationName=").append(organizationName);
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
        OUrgeStage other = (OUrgeStage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getStage() == null ? other.getStage() == null : this.getStage().equals(other.getStage()))
            && (this.getMinOverdueDays() == null ? other.getMinOverdueDays() == null : this.getMinOverdueDays().equals(other.getMinOverdueDays()))
            && (this.getMaxOverdueDays() == null ? other.getMaxOverdueDays() == null : this.getMaxOverdueDays().equals(other.getMaxOverdueDays()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRoyal() == null ? other.getRoyal() == null : this.getRoyal().equals(other.getRoyal()))
            && (this.getOrganizationName() == null ? other.getOrganizationName() == null : this.getOrganizationName().equals(other.getOrganizationName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getStage() == null) ? 0 : getStage().hashCode());
        result = prime * result + ((getMinOverdueDays() == null) ? 0 : getMinOverdueDays().hashCode());
        result = prime * result + ((getMaxOverdueDays() == null) ? 0 : getMaxOverdueDays().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRoyal() == null) ? 0 : getRoyal().hashCode());
        result = prime * result + ((getOrganizationName() == null) ? 0 : getOrganizationName().hashCode());
        return result;
    }
}