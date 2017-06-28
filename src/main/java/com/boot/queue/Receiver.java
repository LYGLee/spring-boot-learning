package com.boot.queue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * Created by wl on 2017/6/21.
 * 消息接收者，用于响应发送的消息
 */

@Component
@RabbitListener(queues = "test-queue")
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }

}
