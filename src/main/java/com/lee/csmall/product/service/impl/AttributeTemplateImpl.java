package com.lee.csmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lee.csmall.product.dao.mapper.AttributeTemplateMapper;
import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.entity.AttributeTemplate;
import com.lee.csmall.product.pojo.param.AttributeTemplateAddNewParam;
import com.lee.csmall.product.service.IAttributeTemplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * this class implements AttributeTemplateService
 * handle AttributeTemplate services
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class AttributeTemplateImpl implements IAttributeTemplateService {
    final AttributeTemplateMapper mapper;


    @Override
    public void addNew(AttributeTemplateAddNewParam attributeTemplateAddNewParam) {
        QueryWrapper<AttributeTemplate> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", attributeTemplateAddNewParam.getName());

        int count = mapper.selectCount(queryWrapper);

        if (count > 0) {
            log.info("owo");
            throw new ServiceException("AttributeTemplate exist");
        }
        AttributeTemplate entity = new AttributeTemplate();
        BeanUtils.copyProperties(attributeTemplateAddNewParam, entity);
        entity.setGmtModified(LocalDateTime.now());
        entity.setGmtCreate(LocalDateTime.now());
        mapper.insert(entity);
        log.info("success");
    }
}
