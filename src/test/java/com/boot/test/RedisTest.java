package com.boot.test;

import com.boot.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wl on 2017/6/26.
 */

@RunWith(SpringRunner.class)
@SpringBootTest()
public class RedisTest {
   public static Logger logger =  LoggerFactory.getLogger(RedisTest.class);

   @Autowired
   private RedisDao redisDao;

   @Test
   public void testRedis(){
       redisDao.setKey("name","liyuan");
       redisDao.setKey("age","18");
       logger.info(redisDao.getValue("name"));
       logger.info(redisDao.getValue("age"));
   }

}
