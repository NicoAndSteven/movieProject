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
 * @TableName t_discounts
 */
@TableName(value ="t_discounts")
@Data
public class Discount implements Serializable {
    /**
     * 折扣ID，主键
     */
    @TableId(type = IdType.AUTO)
    private Integer discountId;

    /**
     * 折扣码
     */
    private String discountCode;

    /**
     * 折扣描述
     */
    private String description;

    /**
     * 折扣百分比（如10.00代表10%）
     */
    private BigDecimal discountPercentage;

    /**
     * 折扣开始日期
     */
    private Date validFrom;

    /**
     * 折扣截止日期
     */
    private Date validTo;

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
        Discount other = (Discount) that;
        return (this.getDiscountId() == null ? other.getDiscountId() == null : this.getDiscountId().equals(other.getDiscountId()))
            && (this.getDiscountCode() == null ? other.getDiscountCode() == null : this.getDiscountCode().equals(other.getDiscountCode()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDiscountPercentage() == null ? other.getDiscountPercentage() == null : this.getDiscountPercentage().equals(other.getDiscountPercentage()))
            && (this.getValidFrom() == null ? other.getValidFrom() == null : this.getValidFrom().equals(other.getValidFrom()))
            && (this.getValidTo() == null ? other.getValidTo() == null : this.getValidTo().equals(other.getValidTo()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDiscountId() == null) ? 0 : getDiscountId().hashCode());
        result = prime * result + ((getDiscountCode() == null) ? 0 : getDiscountCode().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDiscountPercentage() == null) ? 0 : getDiscountPercentage().hashCode());
        result = prime * result + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        result = prime * result + ((getValidTo() == null) ? 0 : getValidTo().hashCode());
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
        sb.append(", discountId=").append(discountId);
        sb.append(", discountCode=").append(discountCode);
        sb.append(", description=").append(description);
        sb.append(", discountPercentage=").append(discountPercentage);
        sb.append(", validFrom=").append(validFrom);
        sb.append(", validTo=").append(validTo);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}