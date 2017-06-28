package com.boot.service.impl;

import com.boot.dao.AccountDao;
import com.boot.dao.AccountMapper;
import com.boot.dao.AccountMapper2;
import com.boot.entity.Account;
import com.boot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by wl on 2017/6/13.
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDao.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAccountList();
    }

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int addAccount(String name, double money) {
        return accountMapper.add(name, money);
    }

    @Override
    public int updateAccount(String name, double money, int id) {
        return accountMapper.update(name, money, id);
    }

    @Override
    public int deleteAccount(int id) {
        return accountMapper.delete(id);
    }

    @Override
    public Account findAccount(int id) {
        return accountMapper.findAccount(id);
    }

    @Override
    public List<Account> getAccountList() {
        return accountMapper.findAccountList();
    }

    //mybatis使用xml 并声明事务
    @Autowired
    private AccountMapper2 accountMapper2;

    @Override
    @Transactional
    public void transfer() throws RuntimeException {
        accountMapper2.update(90, 1);//用户1减10块 用户2加10块
        int i = 1 / 0;
        accountMapper2.update(110, 2);
    }
}
