package com.lee.csmall.product.pojo.param;


import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@Data
public class CategoryAddNewParam implements Serializable {
    private static final long serialVersionUID =9L;
    @NotEmpty(message = "need name")
    private String name;
    @NotNull(message = "parentId must >={max}")
    @Range(max = 1L)
    private Long parentId;
    private String keywords;
    @NotNull(message = "sort must in {min}-{max}")
    @Range(max = 99L)
    private Integer sort;
    private String icon;
    @NotNull(message = "enable must in {min}-{max}")
    @Range(max = 1)
    private Integer enable;
    @NotNull(message = "isDisplay must in{min}-{max}")
    @Range(max = 1)
    private Integer isDisplay;
}
