package com.fest.finance.stream;

import com.fest.finance.domain.entity.CloudAsset;
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
@EnableBinding(MySink.class)
public class SinkConsumer {

    /**
     * 监听配置中 bindings -> input 下destination 配置的topic
     * 可自行拓展这个分类，配合配置文件
     * @param message
     */
    @StreamListener(MySink.INPUT1)
    public void inputConsumer(Message<String> message) {
        String payload = message.getPayload();
        MessageHeaders headers = message.getHeaders();
        System.out.println("从Binding-"+Sink.INPUT+"收到信息-"+payload+"， headers："+headers);
    }

    @StreamListener(MySink.INPUT2)
    public void inputConsumer2(Message<CloudAsset> message) {
        CloudAsset payload = message.getPayload();
        MessageHeaders headers = message.getHeaders();
        System.out.println("从Binding-"+Sink.INPUT+"收到信息-"+payload+"， headers："+headers);
    }
}
