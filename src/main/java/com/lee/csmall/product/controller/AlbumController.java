package com.lee.csmall.product.controller;


import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.param.AlbumAddNewParam;
import com.lee.csmall.product.service.IAlbumService;
import com.lee.csmall.product.web.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * control Album request
 */
@Valid
@Slf4j
@RestController
@RequestMapping("/album/")
@RequiredArgsConstructor
@Api(tags = "1 album management")
public class AlbumController {
    private final IAlbumService iAlbumService;


    /**
     * resolve addAlbum
     */
    @ApiOperation("add Album")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addAlbum(@Valid AlbumAddNewParam albumAddNewParam) {
        iAlbumService.addNew(albumAddNewParam);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setState(2);
        jsonResult.setMessage("success");
        return jsonResult;
    }


    /**
     * delete album
     */
    @ApiOperation("delete album")
    @ApiOperationSupport(order = 200)
    @PostMapping("deleteAlbum")
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "id", value = "albumID", required = true),
                    @ApiImplicitParam(name = "owo", value = "owo", required = true)}
    )
    public JsonResult deleteAlbum(@Range(min = 1L) @NotNull @RequestParam Long id, Integer owo) {

        log.warn("dont worry just do it");
        throw new ServiceException("oh no");
    }


}
