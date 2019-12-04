package com.fest.business.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.fest.business.domain.vo.UserVO;
import com.fest.business.service.RestUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: yesitao
 * @Date: 2019/10/12 16:51
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private RestUserService userService;

    @PostMapping
    public void saveUser(@RequestBody UserVO user){
        userService.saveUser(user);
    }

    @PutMapping
    public void update(@RequestBody UserVO user){
        userService.updateUser(user);
    }

    @GetMapping("/mo")
    @SentinelResource("/user/limit")
    public String limitRequest(){
        return "hi";
    }

}