package com.lee.csmall.product.controller;

import com.lee.csmall.product.pojo.param.CategoryAddNewParam;
import com.lee.csmall.product.service.ICategoryService;
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
 * control category request
 */
@Slf4j
@Api(tags = "5 category management")
@RestController
@RequestMapping("/category/")
@RequiredArgsConstructor
public class CategoryController {
    final ICategoryService service;

    @PostMapping("addNew-category")
    public JsonResult addNew( @Valid CategoryAddNewParam param) {
        service.addNew(param);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setMessage("add success");
        jsonResult.setState(1);
        return jsonResult;
    }

}
