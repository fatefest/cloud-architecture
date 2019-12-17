package com.fest.finance.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: yesitao
 * @Date: 2019/12/17 14:29
 * @Description: 自定义sink,配合配置bindings下对应input_1...配置使用,监听不同的topic内容
 */
public interface MySink {

    String INPUT1 = "input_1";

    String INPUT2 = "input_2";

    @Input(MySink.INPUT1)
    SubscribableChannel input1();

    @Input(MySink.INPUT2)
    SubscribableChannel input2();
}
