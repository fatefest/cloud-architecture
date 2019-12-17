package com.fest.finance.controller;

import com.fest.common.domain.vo.ResultResponse;
import com.fest.finance.stream.SourceProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Author: yesitao
 * @Date: 2019/12/11 17:30
 * @Description:
 */
@RestController
@RequestMapping("/stream")
public class StreamController {

    @Resource
    SourceProducer sourceProducer;


    @PostMapping("/send1")
    public ResultResponse sendMsg1(@RequestBody String msg){
        sourceProducer.sendMessages1(msg);
        return ResultResponse.ofSuccess("发送消息"+msg+"成功");
    }

    @PostMapping("/send2")
    public ResultResponse sendMsg2(@RequestBody String msg){
        sourceProducer.sendMessages2(msg);
        return ResultResponse.ofSuccess("发送消息"+msg+"成功");
    }

}
