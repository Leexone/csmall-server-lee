package com.lee.csmall.product.serviceTest;

import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.param.CategoryAddNewParam;
import com.lee.csmall.product.service.ICategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@SpringBootTest
public class CategoryServiceTest {

    @Autowired
    ICategoryService service;

    @Test
    void addNew() {
        CategoryAddNewParam param = new CategoryAddNewParam();
        param.setName("test002 name");
        param.setKeywords("key1, key2");
        param.setSort(125);
        param.setIcon("icon");
        param.setIsDisplay(1);
        param.setParentId(2L);
        param.setEnable(1);
        try {
            service.addNew(param);
        }catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
