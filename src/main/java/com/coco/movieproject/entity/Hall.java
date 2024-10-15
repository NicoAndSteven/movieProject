package com.coco.movieproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_halls
 */
@TableName(value ="t_halls")
@Data
public class Hall implements Serializable {
    /**
     * 影厅ID，主键
     */
    @TableId(type = IdType.AUTO)
    private Integer hallId;

    /**
     * 影院ID，关联t_cinemas表
     */
    private Integer cinemaId;

    /**
     * 影厅名称（如 "IMAX厅"）
     */
    private String hallName;

    /**
     * 座位数
     */
    private Integer capacity;

    /**
     * 影厅类型
     */
    private Object hallType;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        Hall other = (Hall) that;
        return (this.getHallId() == null ? other.getHallId() == null : this.getHallId().equals(other.getHallId()))
            && (this.getCinemaId() == null ? other.getCinemaId() == null : this.getCinemaId().equals(other.getCinemaId()))
            && (this.getHallName() == null ? other.getHallName() == null : this.getHallName().equals(other.getHallName()))
            && (this.getCapacity() == null ? other.getCapacity() == null : this.getCapacity().equals(other.getCapacity()))
            && (this.getHallType() == null ? other.getHallType() == null : this.getHallType().equals(other.getHallType()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHallId() == null) ? 0 : getHallId().hashCode());
        result = prime * result + ((getCinemaId() == null) ? 0 : getCinemaId().hashCode());
        result = prime * result + ((getHallName() == null) ? 0 : getHallName().hashCode());
        result = prime * result + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        result = prime * result + ((getHallType() == null) ? 0 : getHallType().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hallId=").append(hallId);
        sb.append(", cinemaId=").append(cinemaId);
        sb.append(", hallName=").append(hallName);
        sb.append(", capacity=").append(capacity);
        sb.append(", hallType=").append(hallType);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}