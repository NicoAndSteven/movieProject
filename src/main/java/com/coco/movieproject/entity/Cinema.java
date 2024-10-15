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
 * @TableName t_cinemas
 */
@TableName(value ="t_cinemas")
@Data
public class Cinema implements Serializable {
    /**
     * 影院ID，主键
     */
    @TableId(type = IdType.AUTO)
    private Integer cinemaId;

    /**
     * 影院名称
     */
    private String cinemaName;

    /**
     * 影院地址
     */
    private String cinemaAddress;

    /**
     * 联系电话
     */
    private String cinemaTel;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

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
        Cinema other = (Cinema) that;
        return (this.getCinemaId() == null ? other.getCinemaId() == null : this.getCinemaId().equals(other.getCinemaId()))
            && (this.getCinemaName() == null ? other.getCinemaName() == null : this.getCinemaName().equals(other.getCinemaName()))
            && (this.getCinemaAddress() == null ? other.getCinemaAddress() == null : this.getCinemaAddress().equals(other.getCinemaAddress()))
            && (this.getCinemaTel() == null ? other.getCinemaTel() == null : this.getCinemaTel().equals(other.getCinemaTel()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCinemaId() == null) ? 0 : getCinemaId().hashCode());
        result = prime * result + ((getCinemaName() == null) ? 0 : getCinemaName().hashCode());
        result = prime * result + ((getCinemaAddress() == null) ? 0 : getCinemaAddress().hashCode());
        result = prime * result + ((getCinemaTel() == null) ? 0 : getCinemaTel().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cinemaId=").append(cinemaId);
        sb.append(", cinemaName=").append(cinemaName);
        sb.append(", cinemaAddress=").append(cinemaAddress);
        sb.append(", cinemaTel=").append(cinemaTel);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}