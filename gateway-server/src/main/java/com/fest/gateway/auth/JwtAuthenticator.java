package com.fest.gateway.auth;

import org.springframework.web.server.ServerWebExchange;

/**
 * @Author: yesitao
 * @Date: 2019/12/5 15:26
 * @Description:
 */
public class JwtAuthenticator implements Authenticator {

    @Override
    public AuthResult auth(ServerWebExchange exchange) {
        String jwtToken = exchange.getRequest().getHeaders().getFirst("token");
        //TODO 校验jwtToken的合法性
        if (jwtToken == null) {
            return AuthResult.ofFailed("token不存在");
        }
        return AuthResult.ofSeccess("成功");
    }
}
