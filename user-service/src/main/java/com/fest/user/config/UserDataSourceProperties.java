package com.fest.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 数据源属性配置
 */
@RefreshScope
@ConfigurationProperties(prefix = "user.jdbc")
@Data
public class UserDataSourceProperties {

    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private Integer maxWait;
    private Integer initialSize;
    private String minIdle;
    private Integer maxActive;
    private Boolean testOnBorrow;

}
