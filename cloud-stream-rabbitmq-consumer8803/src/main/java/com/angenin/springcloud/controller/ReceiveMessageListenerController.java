package com.angenin.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

/**
 * @author ：m
 * @date ：Created in 2022/4/8 23:41
 */
@EnableBinding(Sink.class)
@Controller
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT) // 监听
    public void input(Message<String> message){
        System.out.println(" 消费者2号------>收到的消息：" + message.getPayload() + "\t port：" + serverPort);
    }

}

