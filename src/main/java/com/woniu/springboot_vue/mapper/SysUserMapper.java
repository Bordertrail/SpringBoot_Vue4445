package com.woniu.springboot_vue.mapper;

import com.woniu.springboot_vue.entity.SysUser;

import java.util.List;

/**
* @author zheng'du'niao
* @description 针对表【sys_user】的数据库操作Mapper
* @createDate 2022-06-23 17:47:24
* @Entity com.woniu.springboot_vue.entity.SysUser
*/
public interface SysUserMapper {

    SysUser login(String telephone, String password);

    List<SysUser> queryAll(String realname);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

}
