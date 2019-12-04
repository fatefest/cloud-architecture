//package com.fest.gateway.filter;
//
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//
///**
// * @Author: yesitao
// * @Date: 2019/12/4 16:57
// * @Description:
// */
//public class PerAuthGatewayFilterFactory extends AbstractGatewayFilterFactory<PerAuthGatewayFilterFactory.Config> {
//
//    public PerAuthGatewayFilterFactory() {
//        super(Config.class);
//    }
//
//    @Override
//    public GatewayFilter apply(Config config) {
//        // grab configuration from Config object
//        return (exchange, chain) -> {
//            //If you want to build a "pre" filter you need to manipulate the
//            //request before calling chain.filter
//            ServerHttpRequest.Builder builder = exchange.getRequest().mutate();
//            //use builder to manipulate the request
//            return chain.filter(exchange.mutate().request(request).build());
//        };
//    }
//
//    public static class Config {
//        //Put the configuration properties for your filter here
//    }
//
//}
