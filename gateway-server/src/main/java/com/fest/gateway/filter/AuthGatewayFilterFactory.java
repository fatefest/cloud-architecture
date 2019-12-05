package com.fest.gateway.filter;

import com.alibaba.fastjson.JSON;
import com.fest.common.domain.vo.ResultResponse;
import com.fest.gateway.auth.AuthResult;
import com.fest.gateway.auth.Authenticator;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpResponse;
import reactor.core.publisher.Mono;

/**
 * @Author: yesitao
 * @Date: 2019/12/5 14:42
 * @Description:认证网关过滤器
 */
public class AuthGatewayFilterFactory extends AbstractGatewayFilterFactory<AuthGatewayFilterFactory.Config> {

    private Authenticator authenticator;


    public AuthGatewayFilterFactory(Authenticator authenticator){
        super(Config.class);
        this.authenticator = authenticator;
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {

            AuthResult result = authenticator.auth(exchange);
            if(result.getSuccess()){
                return chain.filter(exchange);
            }else {
                //不合法(响应未登录的异常)
                ServerHttpResponse response = exchange.getResponse();
                return authError(response,result.getMsg());
            }
        };
    }

    private Mono<Void> authError(ServerHttpResponse response,String msg){
        //设置headers
        HttpHeaders httpHeaders = response.getHeaders();
        httpHeaders.add("Content-Type", "application/json; charset=UTF-8");
        httpHeaders.add("Cache-Control", "no-store, no-cache, must-revalidate, max-age=0");
        //设置body
        DataBuffer bodyDataBuffer = response.bufferFactory().wrap(JSON.toJSONString(ResultResponse.ofError(msg)).getBytes());

        return response.writeWith(Mono.just(bodyDataBuffer));
    }

    public static class Config {
        //Put the configuration properties for your filter here

    }
}
