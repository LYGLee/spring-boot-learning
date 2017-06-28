package com.boot.queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by wl on 2017/6/21.
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        for (int i = 0; i < 5; i++) {
            String context = "hello " + i;
            System.out.println("Sender : " + context);
            this.rabbitTemplate.convertAndSend("test-queue", context);
        }
    }
}