package com.xusen.springcloudbase.config;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.Map;

/**
 * @Author : JCccc
 * @CreateTime : 2019/9/3
 * @Description :
 **/

@Component
public class TopicTotalReceiver2 {

    @RabbitListener(bindings = {
            @QueueBinding(value = @Queue(value = "iot-to-090f8f123993b0283483e072589ada2caddIdentifyRecord-single-channel", durable = "true",autoDelete = "false"),
                    exchange = @Exchange(value = "090f8f123993b0283483e072589ada2c",type = ExchangeTypes.TOPIC),
                    key = "#")})
    public void singleListener(String message) {
        /*byte[] body = message.getBody();
        String a = new String(body, Charset.forName("utf-8"));*/
        System.out.println(message);
    }
}