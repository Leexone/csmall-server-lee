package com.lee.csmall.product.mapperTests;

import com.lee.csmall.product.dao.mapper.BrandMapper;
import com.lee.csmall.product.pojo.entity.Brand;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@SpringBootTest
@Slf4j
public class BrandTest {

    @Autowired
    BrandMapper mapper;
    @Test
    void insert() {
        Brand entity = new Brand();
        log.debug("id{}", entity.getId());
        entity.setName("test01name");
        entity.setEnable(1);
        entity.setGmtCreate(LocalDateTime.now());
        entity.setGmtModified(LocalDateTime.now());
        entity.setKeywords("key1,key2,key3");
        entity.setSort(101);
        mapper.insert(entity);
        log.debug("id{}", entity.getId());
    }

    @Test
    void selectByID() {
        Brand byId = mapper.selectById(5L);
        log.info("{}", byId);
    }

    @Test
    void t0() {

    }


}
