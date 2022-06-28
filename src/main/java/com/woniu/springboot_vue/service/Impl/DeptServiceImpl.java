package com.woniu.springboot_vue.service.Impl;

import com.woniu.springboot_vue.entity.SysDept;
import com.woniu.springboot_vue.mapper.SysDeptMapper;
import com.woniu.springboot_vue.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private SysDeptMapper deptMapper;

    @Override
    public List<SysDept> queryAll() {
        return deptMapper.queryAll();
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return deptMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysDept record) {
        return deptMapper.insert(record);
    }

    @Override
    public int insertSelective(SysDept record) {
        return deptMapper.insertSelective(record);
    }

    @Override
    public SysDept selectByPrimaryKey(Long id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysDept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysDept record) {
        return deptMapper.updateByPrimaryKey(record);
    }
}
