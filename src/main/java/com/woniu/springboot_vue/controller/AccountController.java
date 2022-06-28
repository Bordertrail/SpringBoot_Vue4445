package com.woniu.springboot_vue.controller;

import com.woniu.springboot_vue.entity.Account;
import com.woniu.springboot_vue.entity.SysUser;
import com.woniu.springboot_vue.service.AccountService;
import com.woniu.springboot_vue.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;


    @GetMapping("")
    public Result queryAll(@RequestParam(value = "accountName" , required = false) String accountName){
        List<Account> accounts = accountService.queryAll(accountName);
        return Result.ok().data("accountList",accounts);
    }

    @PostMapping("")
    public Result add(@RequestBody Account account){
        accountService.insertSelective(account);
        return Result.ok();
    }

    @GetMapping("{id}")
    public Result queryById(@PathVariable("id") Long id){
        Account account = accountService.selectByPrimaryKey(id);
        return Result.ok().data("account",account);
    }

    @PutMapping("")
    public Result update(@RequestBody Account account){
        int i = accountService.updateByPrimaryKeySelective(account);
        if (i>0){
            return Result.ok();
        }else {
            return Result.error();
        }
    }

    @DeleteMapping("{id}")
    public Result del(@PathVariable("id") Long id){
        int i = accountService.deleteByPrimaryKey(id);
        if (i>0){
            return Result.ok();
        }else {
            return Result.error();
        }
    }
}
