package com.fest.finance.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @Author: yesitao
 * @Date: 2019/12/11 17:33
 * @Description:消息生产者
 */
@EnableBinding(Source.class)
public class SourceProducer {

    @Resource
    private Source source;

    public void sendMessages(String msg) {
        Message<String> message = MessageBuilder.withPayload(msg).build();
        System.out.println("发送了一条消息-: "+ msg);
        this.source.output().send(message);
    }

}
