package com.lee.csmall.product.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * category persistent
 */
@Data
@TableName("pms_category")
public class Category implements Serializable {
    private static final long serialVersionUID =8L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Long parentId;
    private Integer depth;
    private String keywords;
    private Integer sort;
    private String icon;
    private Integer enable;
    private Integer isParent;
    private Integer isDisplay;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
