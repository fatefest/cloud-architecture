package com.fest.finance.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @Author: yesitao
 * @Date: 2019/12/11 17:33
 * @Description:消息生产者
 */
@EnableBinding(MySource.class)
public class SourceProducer {

    @Resource
    private MySource mySource;

    public void sendMessages1(String msg) {
        Message<String> message = MessageBuilder.withPayload(msg).build();
        System.out.println("发送了topic_1一条消息-: "+ msg);
        this.mySource.output1().send(message);
    }


    public void sendMessages2(String msg) {
        Message<String> message = MessageBuilder.withPayload(msg).build();
        System.out.println("发送了topic_2一条消息-: "+ msg);
        this.mySource.output2().send(message);
    }

}
