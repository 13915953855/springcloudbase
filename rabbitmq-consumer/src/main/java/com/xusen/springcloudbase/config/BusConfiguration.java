package com.xusen.springcloudbase.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.minivision.bus.BusListener;
import com.minivision.bus.MessageDeliver;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 
 * <Description> <br> 
 * @author shaokangwei<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年7月12日 <br>
 */
@Configuration
@EnableAsync
//@RemoteApplicationEventScan("com.minivision.bus.event")
public class BusConfiguration {

    /**
     * 消息发送bean for Gateway
     *
     * @return MessageDeliver
     */
    @Bean
    public MessageDeliver messageDeliver() {
        return new MessageDeliver();
    }

    /**
     * 消息监听bean for Gateway
     *
     * @return BusListener
     */
    @Bean
    public BusListener busListener() {
        return new BusListener();
    }

    @Bean
    Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
