package com.lee.csmall.product.controller;

import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.param.AttributeTemplateAddNewParam;
import com.lee.csmall.product.service.IAttributeTemplateService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * control attributeTemplate request
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@Api(tags = "6 AttributeTemplateManager")
@RequestMapping("/Attribute-template/")
public class AttributeTemplateController {
    final IAttributeTemplateService service;


    /**
     * resolve addAttributeTemplate*/
    @PostMapping("addAttribute-template")
    public void addAlbum(AttributeTemplateAddNewParam param) {
        try {
            service.addNew(param);
        } catch (ServiceException e) {
            e.printStackTrace();
            log.debug(e.getMessage());
        } catch (RuntimeException e) {
           log.debug("other Exception");
        }
    }

}
