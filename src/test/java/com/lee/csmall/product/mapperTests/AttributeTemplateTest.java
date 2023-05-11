package com.lee.csmall.product.mapperTests;

import com.lee.csmall.product.dao.mapper.AttributeTemplateMapper;

import com.lee.csmall.product.pojo.entity.AttributeTemplate;
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
public class AttributeTemplateTest {

    @Autowired
    AttributeTemplateMapper mapper;
    @Test
    void insert() {
        AttributeTemplate entity = new AttributeTemplate();
        log.debug("id{}", entity.getId());
        entity.setGmtCreate(LocalDateTime.now());
        entity.setPinyin("test006");
        mapper.insert(entity);
        log.debug("id{}", entity.getId());

    }

    @Test
    void selectByID() {
        AttributeTemplate byId = mapper.selectById(5L);

    }

    @Test
    void t0() {

    }


}
