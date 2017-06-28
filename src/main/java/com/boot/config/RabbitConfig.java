package com.boot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * Created by wl on 2017/6/21.
 */

@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("test-queue");
    }

}
