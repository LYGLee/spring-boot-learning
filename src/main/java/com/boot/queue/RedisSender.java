package com.boot.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;


/**
 * Created by wl on 2017/6/28.
 */
//@Component
public class RedisSender implements CommandLineRunner{

//    @Autowired
//    StringRedisTemplate stringRedisTemplate;

//    @Autowired
//    CountDownLatch latch;

    private StringRedisTemplate stringRedisTemplate;
    private CountDownLatch latch;
    //不直接注入，在配置类中将RedisSender注入Spring,此时RedisSender不用加@Component注解
    @Autowired
    public RedisSender(CountDownLatch latch,StringRedisTemplate stringRedisTemplate) {
        this.latch = latch;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        stringRedisTemplate.convertAndSend("chat","Hello from Redis!");
        latch.await();
        System.exit(0);
    }
}
