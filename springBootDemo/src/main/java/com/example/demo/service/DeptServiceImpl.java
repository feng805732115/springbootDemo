package com.example.demo.service;

import com.example.demo.dao.DeptMapper;
import com.example.demo.pojo.Dept;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
    @Autowired

    private RedisTemplate<String, String> redisTemplate;


    @Cacheable(value = "deptCache", key = "'dept.deptList'")
    @Override
    public List<Dept> deptList(Integer pageNum,Integer pageSize) {
        PageHelper.startPage( pageNum, pageSize);
        List<Dept>deptList=deptMapper.deptList();
        // 保存数据
        this.redisTemplate.boundValueOps("redis").set("Hello redis !");
      // 设置有效时间为100秒
        this.redisTemplate.boundValueOps("redis").expire(100l, TimeUnit.SECONDS);
      // 给value每次执行加一操作
        this.redisTemplate.boundValueOps("count").increment(1l);
        return deptList;
    }

    @Override
    public int count() {
        int num=deptMapper.count();
        return num;
    }
}
