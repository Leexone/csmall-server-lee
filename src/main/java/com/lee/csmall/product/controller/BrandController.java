package com.lee.csmall.product.controller;

import com.lee.csmall.product.pojo.param.BrandAddNewParam;
import com.lee.csmall.product.service.IBrandService;
import com.lee.csmall.product.web.JsonResult;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * control Brand request
 */
@Slf4j
@Api(tags = "4 Brand management")
@RestController
@RequestMapping("/Brand/")
@RequiredArgsConstructor
public class BrandController {
    final IBrandService service;

    @PostMapping("addNew-Brand")
    public JsonResult addNew( @Valid BrandAddNewParam param) {
        service.addNew(param);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setMessage("add success");
        jsonResult.setState(1);
        return jsonResult;
    }

}
