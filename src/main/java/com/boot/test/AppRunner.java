package com.boot.test;

import com.boot.dao.AccountDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by wl on 2017/6/28.
 */
@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Autowired
    private AccountDao accountDao;

    @Override
    public void run(String... args) throws Exception {
//        for (int i = 0; i < 5; i++) {
//            logger.info(accountDao.findAccountById(1).toString());
//        }
    }
}
