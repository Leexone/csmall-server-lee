package com.lee.csmall.product.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * Mybatis Configuation
 */
@Configuration
@MapperScan("com.lee.csmall.product.dao.mapper")
public class MybatisConfig {
}
