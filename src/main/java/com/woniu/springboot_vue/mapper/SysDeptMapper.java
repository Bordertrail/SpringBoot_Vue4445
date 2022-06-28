package com.woniu.springboot_vue.mapper;

import com.woniu.springboot_vue.entity.SysDept;

import java.util.List;

/**
* @author zheng'du'niao
* @description 针对表【sys_dept】的数据库操作Mapper
* @createDate 2022-06-23 19:00:57
* @Entity com.woniu.springboot_vue.entity.SysDept
*/
public interface SysDeptMapper {

    List<SysDept> queryAll();

    int deleteByPrimaryKey(Long id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);

}
