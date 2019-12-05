package com.fest.gateway.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.server.ServerWebExchange;

import javax.annotation.Resource;

/**
 * @Author: yesitao
 * @Date: 2019/12/5 14:54
 * @Description:
 */
public class DefaultAuthenticator implements Authenticator {

    private static Logger logger = LoggerFactory.getLogger(DefaultAuthenticator.class);

    @Resource
    private ApplicationContext context;
    @Override
    public AuthResult auth(ServerWebExchange exchange) {
        Object o = context.getBean("jwtAuthenticator");
        logger.info("默认验证规则，不做验证");
        return AuthResult.ofSeccess("认证通过");
    }
}
