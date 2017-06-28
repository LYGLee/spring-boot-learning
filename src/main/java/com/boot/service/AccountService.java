package com.boot.service;

import com.boot.entity.Account;

import java.util.List;

/**
 * Created by wl on 2017/6/13.
 */
public interface AccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

    //以下是测试整合mybatis
    int addAccount(String name, double money);

    int updateAccount(String name, double money, int id);

    int deleteAccount(int id);

    Account findAccount(int id);

    List<Account> getAccountList();

    //mybatis使用xml 并声明事务
    void transfer();

}
