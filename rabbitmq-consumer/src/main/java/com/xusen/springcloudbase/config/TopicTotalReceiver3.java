package com.xusen.springcloudbase.config;

import com.minivision.bus.MessageHandler;
import com.minivision.bus.MessageType;
import com.minivision.bus.event.RemoteBusEvent;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;

/**
 * @Author : JCccc
 * @CreateTime : 2019/9/3
 * @Description :
 **/
@Component
public class TopicTotalReceiver3 {

    /*@EventListener
    public void onUserRemoteApplicationEvent(RemoteBusEvent event) {

        System.out.printf("UserRemoteApplicationEvent - " +
                        " Source : %s , originService : %s , destinationService : %s \n",
                event.getSource(),
                event.getOriginService(),
                event.getDestinationService());
    }*/

    /*@EventListener
    public void onUserRemoteApplicationEvent2(UserRemoteApplicationEvent event) {

        System.out.printf("UserRemoteApplicationEvent - " +
                        " Source : %s , originService : %s , destinationService : %s \n",
                event.getSource(),
                event.getOriginService(),
                event.getDestinationService());
    }*/
}