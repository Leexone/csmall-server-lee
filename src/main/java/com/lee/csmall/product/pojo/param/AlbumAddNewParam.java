package com.lee.csmall.product.pojo.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * add album param
 */
@Data
public class AlbumAddNewParam implements Serializable {
    private static final long serialVersionUID = 5L;
    @NotNull(message = "need album name")
    @ApiModelProperty(value = "相册名称", required = true)
    private String name;
    @NotNull(message = "need album description")
    @ApiModelProperty(value = "相册简介")
    private String description;
    @NotNull(message = "need album sort")
    @Range(min = 1, max = 99, message = "sort in {min}-{max}")
    @ApiModelProperty(value = "相册排序序号", required = true)
    private Integer sort;

}
