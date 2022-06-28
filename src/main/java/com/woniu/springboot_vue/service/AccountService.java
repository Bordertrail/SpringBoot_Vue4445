package com.woniu.springboot_vue.service;

import com.woniu.springboot_vue.entity.Account;
import com.woniu.springboot_vue.entity.SysUser;

import java.util.List;

public interface AccountService {

    List<Account> queryAll(String accountName);

    int deleteByPrimaryKey(Long id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}
