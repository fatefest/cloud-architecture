package com.fest.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.reactive.WebSocketReactiveAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketMessagingAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        JndiDataSourceAutoConfiguration.class,
        JmxAutoConfiguration.class,
        SpringApplicationAdminJmxAutoConfiguration.class,
        WebSocketServletAutoConfiguration.class,
        WebSocketMessagingAutoConfiguration.class,
        WebSocketReactiveAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
})
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.fest.user.mapper")
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}

