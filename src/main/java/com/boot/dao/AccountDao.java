package com.boot.dao;

import com.boot.entity.Account;


import java.util.List;

/**
 * Created by wl on 2017/6/13.
 */

public interface AccountDao {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}
