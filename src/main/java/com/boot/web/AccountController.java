package com.boot.web;

import com.boot.entity.Account;
import com.boot.service.AccountService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wl on 2017/6/13.
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t = accountService.update(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        int t = accountService.add(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

    //以下是mybatis的接口
    @RequestMapping(value = "/mybatis/list", method = RequestMethod.GET)
    public List<Account> getAccountsList() {
        return accountService.getAccountList();
    }

    @RequestMapping(value = "/mybatis/{id}", method = RequestMethod.GET)
    public Account findAccount(@PathVariable("id") int id) {
        return accountService.findAccount(id);
    }

    @RequestMapping(value = "/mybatis/{id}", method = RequestMethod.PUT)
    public String editAccount(@PathVariable("id") int id, @RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        int t = accountService.updateAccount(name, money, id);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "/mybatis/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") int id) {
        int t = accountService.deleteAccount(id);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }

    }

    @RequestMapping(value = "mybatis/add", method = RequestMethod.POST)
    public String insertAccount(@RequestParam(value = "name") String name,
                                @RequestParam(value = "money") double money) {
        int t = accountService.addAccount(name, money);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    //以下是mybatis开启事务接口，模拟转账
    @RequestMapping(value = "mybatis/transfer", method = RequestMethod.GET)
    public String transfer() {
        try {
            accountService.transfer();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
