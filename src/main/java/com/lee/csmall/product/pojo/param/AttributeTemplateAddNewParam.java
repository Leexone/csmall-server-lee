package com.lee.csmall.product.pojo.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@Data
public class AttributeTemplateAddNewParam implements Serializable {
    private static final long serialVersionUID =7L;
    private String name;
    private String pinyin;
    private String keywords;
    private Integer sort;
}
