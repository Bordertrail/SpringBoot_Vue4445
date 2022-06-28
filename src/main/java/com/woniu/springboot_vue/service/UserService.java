package com.woniu.springboot_vue.service;

import com.woniu.springboot_vue.entity.SysUser;

import java.util.List;

public interface UserService {

    SysUser login(String telephone , String password);

    List<SysUser> queryAll(String realname);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}
