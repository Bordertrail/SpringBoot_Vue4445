package com.woniu.springboot_vue.mapper;

import com.woniu.springboot_vue.entity.Account;

import java.util.List;

/**
* @author zheng'du'niao
* @description 针对表【account】的数据库操作Mapper
* @createDate 2022-06-24 14:20:47
* @Entity com.woniu.springboot_vue.entity.Account
*/
public interface AccountMapper {

    List<Account> queryAll(String accountName);

    int deleteByPrimaryKey(Long id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

}
