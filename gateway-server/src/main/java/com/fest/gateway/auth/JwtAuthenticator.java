package com.fest.gateway.auth;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.server.ServerWebExchange;

import javax.annotation.Resource;

/**
 * @Author: yesitao
 * @Date: 2019/12/5 15:26
 * @Description:
 */
public class JwtAuthenticator implements Authenticator {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public AuthResult auth(ServerWebExchange exchange) {
        String jwtToken = exchange.getRequest().getHeaders().getFirst("token");
        //TODO 校验jwtToken的合法性
//        if (jwtToken == null) {
//            return AuthResult.ofFailed("token不存在");
//        }
//        String token = (String) redisTemplate.opsForValue().get("token");
        return AuthResult.ofSeccess("成功");
    }
}
