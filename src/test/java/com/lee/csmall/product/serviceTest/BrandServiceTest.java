package com.lee.csmall.product.serviceTest;

import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.param.BrandAddNewParam;
import com.lee.csmall.product.service.IBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@SpringBootTest
public class BrandServiceTest {

    @Autowired
    IBrandService service;

    @Test
    void addNew() {
        BrandAddNewParam param = new BrandAddNewParam();
        param.setName("test003 name");
        param.setKeywords("key1, key2");
        param.setSort(98);
        param.setPinyin("test002 pinyin");
        param.setLogo("logo");
        param.setDescription("test002setDescription");
        param.setKeywords("test002setKeywords");
        param.setSort(99);
        param.setEnable(1);
        try {
            service.addNew(param);
        }catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
