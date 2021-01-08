package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OUrgeTransformLog implements Serializable {
    private Integer id;

    private String urgeId;

    private String orderId;

    private String userId;

    private String stagePre;

    private String stagePost;

    private String operatorPre;

    private String operatorPost;

    private LocalDateTime createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStagePre() {
        return stagePre;
    }

    public void setStagePre(String stagePre) {
        this.stagePre = stagePre;
    }

    public String getStagePost() {
        return stagePost;
    }

    public void setStagePost(String stagePost) {
        this.stagePost = stagePost;
    }

    public String getOperatorPre() {
        return operatorPre;
    }

    public void setOperatorPre(String operatorPre) {
        this.operatorPre = operatorPre;
    }

    public String getOperatorPost() {
        return operatorPost;
    }

    public void setOperatorPost(String operatorPost) {
        this.operatorPost = operatorPost;
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
        sb.append(", urgeId=").append(urgeId);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", stagePre=").append(stagePre);
        sb.append(", stagePost=").append(stagePost);
        sb.append(", operatorPre=").append(operatorPre);
        sb.append(", operatorPost=").append(operatorPost);
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
        OUrgeTransformLog other = (OUrgeTransformLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUrgeId() == null ? other.getUrgeId() == null : this.getUrgeId().equals(other.getUrgeId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getStagePre() == null ? other.getStagePre() == null : this.getStagePre().equals(other.getStagePre()))
            && (this.getStagePost() == null ? other.getStagePost() == null : this.getStagePost().equals(other.getStagePost()))
            && (this.getOperatorPre() == null ? other.getOperatorPre() == null : this.getOperatorPre().equals(other.getOperatorPre()))
            && (this.getOperatorPost() == null ? other.getOperatorPost() == null : this.getOperatorPost().equals(other.getOperatorPost()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrgeId() == null) ? 0 : getUrgeId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getStagePre() == null) ? 0 : getStagePre().hashCode());
        result = prime * result + ((getStagePost() == null) ? 0 : getStagePost().hashCode());
        result = prime * result + ((getOperatorPre() == null) ? 0 : getOperatorPre().hashCode());
        result = prime * result + ((getOperatorPost() == null) ? 0 : getOperatorPost().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}