package com.lee.csmall.product.serviceTest;

import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.param.AlbumAddNewParam;
import com.lee.csmall.product.pojo.param.AttributeTemplateAddNewParam;
import com.lee.csmall.product.service.IAttributeTemplateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@SpringBootTest
public class AttributeTemplateServiceTest {

    @Autowired
    IAttributeTemplateService service;

    @Test
    void addNew() {
        AttributeTemplateAddNewParam param = new AttributeTemplateAddNewParam();
        param.setPinyin("test007 setPinyin");
        param.setName("test007 name");
        param.setKeywords("key1, key2");
        param.setSort(125);
        try {
            service.addNew(param);
        }catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
