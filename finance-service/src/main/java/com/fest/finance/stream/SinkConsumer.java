package com.fest.finance.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

/**
 * @Author: yesitao
 * @Date: 2019/12/11 17:35
 * @Description: kafka消费者
 */
@EnableBinding(Sink.class)
public class SinkConsumer {

    @StreamListener(Sink.INPUT)
    public void inputConsumer(Message<String> message) {
        String payload = message.getPayload();
        MessageHeaders headers = message.getHeaders();
        System.out.println("从Binding-"+Sink.INPUT+"收到信息-"+payload+"， headers："+headers);
    }
}
