package com.fest.user.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: yesitao
 * @Date: 2019/11/28 16:50
 * @Description: 数据源druid配置
 */
@Configuration
@EnableConfigurationProperties({UserDataSourceProperties.class, MybatisProperties.class})
public class DataSourceConfig {

    @Bean
    public DataSource druidDataSource(UserDataSourceProperties dataSourceProperties){
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(dataSourceProperties.getUrl());
        datasource.setUsername(dataSourceProperties.getUsername());
        datasource.setPassword(dataSourceProperties.getPassword());
        datasource.setDriverClassName(dataSourceProperties.getDriverClassName());
        datasource.setMaxWait(dataSourceProperties.getMaxWait());
        datasource.setInitialSize(dataSourceProperties.getInitialSize());
        datasource.setMaxActive(dataSourceProperties.getMaxActive());
        datasource.setTestOnBorrow(dataSourceProperties.getTestOnBorrow());
        datasource.setValidationQuery("SELECT 1");
        return datasource;
    }

}
