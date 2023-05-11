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
public class BrandAddNewParam implements Serializable {
    private static final long serialVersionUID =13L;
    @NotEmpty(message = "need name")
    private String name;
    @NotEmpty(message = "need pinyin")
    private String pinyin;
    private String logo;
    private String description;
    private String keywords;
    @NotNull(message = "need sort")
    @Range(max = 99L, message = "sort must in 0-{max}")
    private Integer sort;
    @NotNull(message = "need sort")
    @Range(max = 1L, message = "enable must in 0-{max}")
    private Integer enable;

}
