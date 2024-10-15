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
 * @TableName t_movies
 */
@TableName(value ="t_movies")
@Data
public class Movie implements Serializable {
    /**
     * 电影ID，主键
     */
    @TableId(type = IdType.AUTO)
    private Integer movieId;

    /**
     * 电影标题
     */
    private String title;

    /**
     * 电影类型（如动作、喜剧、剧情等）
     */
    private String genre;

    /**
     * 导演
     */
    private String director;

    /**
     * 主要演员列表
     */
    private String cast;

    /**
     * 片长（以分钟为单位）
     */
    private Integer duration;

    /**
     * 上映日期
     */
    private Date releaseDate;

    /**
     * 电影评分（如8.5）
     */
    private BigDecimal rating;

    /**
     * 语言
     */
    private String language;

    /**
     * 简介
     */
    private String description;

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
        Movie other = (Movie) that;
        return (this.getMovieId() == null ? other.getMovieId() == null : this.getMovieId().equals(other.getMovieId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getGenre() == null ? other.getGenre() == null : this.getGenre().equals(other.getGenre()))
            && (this.getDirector() == null ? other.getDirector() == null : this.getDirector().equals(other.getDirector()))
            && (this.getCast() == null ? other.getCast() == null : this.getCast().equals(other.getCast()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getReleaseDate() == null ? other.getReleaseDate() == null : this.getReleaseDate().equals(other.getReleaseDate()))
            && (this.getRating() == null ? other.getRating() == null : this.getRating().equals(other.getRating()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMovieId() == null) ? 0 : getMovieId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getGenre() == null) ? 0 : getGenre().hashCode());
        result = prime * result + ((getDirector() == null) ? 0 : getDirector().hashCode());
        result = prime * result + ((getCast() == null) ? 0 : getCast().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        result = prime * result + ((getRating() == null) ? 0 : getRating().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
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
        sb.append(", movieId=").append(movieId);
        sb.append(", title=").append(title);
        sb.append(", genre=").append(genre);
        sb.append(", director=").append(director);
        sb.append(", cast=").append(cast);
        sb.append(", duration=").append(duration);
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", rating=").append(rating);
        sb.append(", language=").append(language);
        sb.append(", description=").append(description);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}