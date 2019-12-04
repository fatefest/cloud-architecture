package com.fest.business.service;


import com.fest.business.domain.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @Author: yesitao
 * @Date: 2019/11/14 16:23
 * @Description:
 */
@FeignClient(value = "user-service", path = "/user")
public interface RestUserService {

    @PostMapping
    void saveUser(UserVO user);

    @PutMapping
    void updateUser(UserVO user);
}
