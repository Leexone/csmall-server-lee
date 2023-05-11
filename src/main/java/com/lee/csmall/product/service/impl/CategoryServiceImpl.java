package com.lee.csmall.product.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lee.csmall.product.dao.mapper.CategoryMapper;
import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.entity.Category;
import com.lee.csmall.product.pojo.param.CategoryAddNewParam;
import com.lee.csmall.product.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * this class implements ICategoryService
 * handle category services
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class CategoryServiceImpl implements ICategoryService {
    final CategoryMapper mapper;

    @Override
    public void addNew(CategoryAddNewParam param) {
        QueryWrapper<Category> wrapper = new QueryWrapper<>();
        wrapper.eq("name", param.getName());
        int count = mapper.selectCount(wrapper);
        if (count > 0) {
            throw  new ServiceException("categoryName exist");
        }
        Category category = new Category();
        BeanUtils.copyProperties(param, category);
        category.setDepth(1);
        category.setIsParent(0);
        category.setGmtCreate(LocalDateTime.now());
        category.setGmtModified(LocalDateTime.now());
        mapper.insert(category);
    }
}
