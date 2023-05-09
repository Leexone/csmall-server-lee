package com.lee.csmall.product.pojo.param;

import com.lee.csmall.product.service.IAlbumService;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * add album param
 */
@Data
public class AlbumAddNewParam implements Serializable {
    private static final long serialVersionUID = 5L;
    private String name;
    private String description;
    private Integer sort;

}
