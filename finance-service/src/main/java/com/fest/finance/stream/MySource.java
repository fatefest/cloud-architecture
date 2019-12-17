package com.fest.finance.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author: yesitao
 * @Date: 2019/12/17 14:29
 * @Description: 自定义source,配合配置bindings下对应output_1...配置使用,自定义发送到不同的topic
 */
public interface MySource {
    String OUTPUT1 = "output_1";

    String OUTPUT2 = "output_2";

    @Output(MySource.OUTPUT1)
    MessageChannel output1();


    @Output(MySource.OUTPUT2)
    MessageChannel output2();
}
