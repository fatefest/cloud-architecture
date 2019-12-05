package com.fest.gateway.config;

import com.fest.gateway.auth.Authenticator;
import com.fest.gateway.filter.AuthGatewayFilterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yesitao
 * @Date: 2019/12/5 14:43
 * @Description: 过滤器自定义配置
 */
@Configuration
public class FilterExtensionConfig {


    @Bean
    public AuthGatewayFilterFactory authGatewayFilterFactory(Authenticator authenticator){
        return new AuthGatewayFilterFactory(authenticator);
    }
}
