package com.woniu.springboot_vue.controller;

import com.woniu.springboot_vue.entity.SysUser;
import com.woniu.springboot_vue.service.UserService;

import com.woniu.springboot_vue.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody SysUser user1){
        SysUser user = userService.login(user1.getTelephone(),user1.getPassword());
        return Result.ok().data("user",user);
    }

    @GetMapping("")
    public Result queryAll(@RequestParam(value = "realname" , required = false) String realname){
        List<SysUser> users = userService.queryAll(realname);
        return Result.ok().data("userList",users);
    }

    @PostMapping("")
    public Result add(@RequestBody SysUser user){
        userService.insertSelective(user);
        return Result.ok();
    }

    @GetMapping("{id}")
    public Result queryById(@PathVariable("id") Long id){
        SysUser user = userService.selectByPrimaryKey(id);
        return Result.ok().data("user",user);
    }

    @PutMapping("")
    public Result update(@RequestBody SysUser user){
        int i = userService.updateByPrimaryKeySelective(user);
        if (i>0){
            return Result.ok();
        }else {
            return Result.error();
        }
    }

    @DeleteMapping("{id}")
    public Result del(@PathVariable("id") Long id){
        int i = userService.deleteByPrimaryKey(id);
        if (i>0){
            return Result.ok();
        }else {
            return Result.error();
        }
    }
}
