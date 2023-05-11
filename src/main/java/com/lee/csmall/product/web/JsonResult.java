package com.lee.csmall.product.web;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * 自定义枚举类
 */
@Data
public class JsonResult implements Serializable {
    private static final long serialVersionUID =10L;

    private Integer state;
    private String message;



}
