package com.fest.gateway.config;

import com.fest.gateway.auth.Authenticator;
import com.fest.gateway.auth.JwtAuthenticator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yesitao
 * @Date: 2019/12/5 14:58
 * @Description:
 */
@Configuration
public class AuthenticatorConfig {

    @Bean
    @ConditionalOnMissingBean
    public Authenticator authenticator(){
        return new JwtAuthenticator();
    }
}
