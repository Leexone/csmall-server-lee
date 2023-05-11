package com.lee.csmall.product.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lee.csmall.product.dao.mapper.BrandMapper;
import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.entity.Brand;
import com.lee.csmall.product.pojo.param.BrandAddNewParam;
import com.lee.csmall.product.service.IBrandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.time.LocalDateTime;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * this class implements IBrandService
 * handle Brand services
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class BrandServiceImpl implements IBrandService {
    final BrandMapper mapper;


    /**
     * add new brand
     */
    @Override
    public void addNew(@Valid BrandAddNewParam param) {
        QueryWrapper<Brand> wrapper = new QueryWrapper<>();
        wrapper.eq("name", param.getName());
        int count = mapper.selectCount(wrapper);
        if (count > 0) {
            throw new ServiceException("BrandName exist");
        }
        Brand brand = new Brand();
        BeanUtils.copyProperties(param, brand);
        brand.setSales(0);
        brand.setProductCount(0);
        brand.setCommentCount(0);
        brand.setPositiveCommentCount(0);
        brand.setGmtCreate(LocalDateTime.now());
        brand.setGmtModified(LocalDateTime.now());
        mapper.insert(brand);
    }
}
