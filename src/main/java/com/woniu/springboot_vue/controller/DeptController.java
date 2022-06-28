package com.woniu.springboot_vue.controller;

import com.woniu.springboot_vue.entity.SysDept;
import com.woniu.springboot_vue.entity.SysUser;
import com.woniu.springboot_vue.service.DeptService;
import com.woniu.springboot_vue.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("")
    public Result queryAll(){
        List<SysDept> list = deptService.queryAll();
        return Result.ok().data("deptList",list);
    }

    @PostMapping("")
    public Result add(@RequestBody SysDept dept){
        deptService.insertSelective(dept);
        return Result.ok();
    }

    @GetMapping("{id}")
    public Result queryById(@PathVariable("id") Long id){
        SysDept dept = deptService.selectByPrimaryKey(id);
        return Result.ok().data("dept",dept);
    }

    @PutMapping("")
    public Result update(@RequestBody SysDept dept){
        int i = deptService.updateByPrimaryKeySelective(dept);
        if (i>0){
            return Result.ok();
        }else {
            return Result.error();
        }
    }

    @DeleteMapping("{id}")
    public Result del(@PathVariable("id") Long id){
        int i = deptService.deleteByPrimaryKey(id);
        if (i>0){
            return Result.ok();
        }else {
            return Result.error();
        }
    }
}
