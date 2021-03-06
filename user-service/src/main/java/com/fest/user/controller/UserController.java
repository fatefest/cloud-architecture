package com.fest.user.controller;

import com.fest.common.domain.vo.ResultResponse;
import com.fest.user.domain.entity.CloudUser;
import com.fest.user.service.LocalUserService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yesitao
 * @Date: 2019/10/12 16:51
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private LocalUserService localUserService;

    @PostMapping
    public void saveUser(@RequestBody CloudUser user){
        localUserService.saveUser(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody CloudUser user){
        localUserService.updateUser(user);
    }

    @PutMapping("/update1")
    public void update1(@RequestBody CloudUser user){
        localUserService.updateUser1(user);
    }

    @GetMapping
    public ResultResponse getUsers(){
        return ResultResponse.ofSuccess(localUserService.getUsers());
    }

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return "hi "+ name;
    }

}