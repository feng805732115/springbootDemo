package com.example.demo.dao;

import com.example.demo.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
     @Select("select count(1) from dept")
     public int count();

     @Select("select * from dept order by deptNo desc")
     public List<Dept>deptList();

     @Insert("insert into dept values(#{deptNo},#{deptName},#{deptLoc})")
     public int addDept(@Param("deptNo")Integer deptNo,@Param("deptName")String deptName,@Param("deptLoc")String deptLoc);

}
