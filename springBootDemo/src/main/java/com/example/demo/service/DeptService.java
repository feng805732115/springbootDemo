package com.example.demo.service;

import com.example.demo.pojo.Dept;

import java.util.List;

public interface DeptService {
    public List<Dept> deptList(Integer pageNum,Integer pageSize);
    public int count();
}
