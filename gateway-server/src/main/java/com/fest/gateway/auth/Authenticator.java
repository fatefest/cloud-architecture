package com.fest.gateway.auth;

import org.springframework.web.server.ServerWebExchange;

public interface Authenticator {

    AuthResult auth(ServerWebExchange exchange);
}
