package com.woniu.springboot_vue.service;

import com.woniu.springboot_vue.entity.SysDept;
import com.woniu.springboot_vue.entity.SysUser;

import java.util.List;

public interface DeptService {

    List<SysDept> queryAll();

    int deleteByPrimaryKey(Long id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);
}
