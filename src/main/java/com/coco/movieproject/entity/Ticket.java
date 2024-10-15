package com.coco.movieproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_tickets
 */
@TableName(value ="t_tickets")
@Data
public class Ticket implements Serializable {
    /**
     * 票的ID，主键
     */
    @TableId(type = IdType.AUTO)
    private Integer ticketId;

    /**
     * 电影名称
     */
    private String movieName;

    /**
     * 电影放映时间
     */
    private Date showTime;

    /**
     * 影院名称
     */
    private String cinemaName;

    /**
     * 影厅编号
     */
    private Integer hallNumber;

    /**
     * 座位号
     */
    private String seatNumber;

    /**
     * 票价
     */
    private BigDecimal price;

    /**
     * 是否可用
     */
    private Integer available;

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
        Ticket other = (Ticket) that;
        return (this.getTicketId() == null ? other.getTicketId() == null : this.getTicketId().equals(other.getTicketId()))
            && (this.getMovieName() == null ? other.getMovieName() == null : this.getMovieName().equals(other.getMovieName()))
            && (this.getShowTime() == null ? other.getShowTime() == null : this.getShowTime().equals(other.getShowTime()))
            && (this.getCinemaName() == null ? other.getCinemaName() == null : this.getCinemaName().equals(other.getCinemaName()))
            && (this.getHallNumber() == null ? other.getHallNumber() == null : this.getHallNumber().equals(other.getHallNumber()))
            && (this.getSeatNumber() == null ? other.getSeatNumber() == null : this.getSeatNumber().equals(other.getSeatNumber()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAvailable() == null ? other.getAvailable() == null : this.getAvailable().equals(other.getAvailable()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTicketId() == null) ? 0 : getTicketId().hashCode());
        result = prime * result + ((getMovieName() == null) ? 0 : getMovieName().hashCode());
        result = prime * result + ((getShowTime() == null) ? 0 : getShowTime().hashCode());
        result = prime * result + ((getCinemaName() == null) ? 0 : getCinemaName().hashCode());
        result = prime * result + ((getHallNumber() == null) ? 0 : getHallNumber().hashCode());
        result = prime * result + ((getSeatNumber() == null) ? 0 : getSeatNumber().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAvailable() == null) ? 0 : getAvailable().hashCode());
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
        sb.append(", ticketId=").append(ticketId);
        sb.append(", movieName=").append(movieName);
        sb.append(", showTime=").append(showTime);
        sb.append(", cinemaName=").append(cinemaName);
        sb.append(", hallNumber=").append(hallNumber);
        sb.append(", seatNumber=").append(seatNumber);
        sb.append(", price=").append(price);
        sb.append(", available=").append(available);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}