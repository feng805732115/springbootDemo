package com.example.demo.dao;

import com.example.demo.pojo.Repiles;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RepliesMapper {
    @Select("select *from \"repiles\" where \"infoId\"=#{infoId}")
    public List<Repiles> getRepiles(@Param("infoId")Integer infoId);

    @Insert("insert into \"repiles\" values(#{rid},#{content},#{replyTime},#{infoId})")
    public boolean addReliles(Repiles repiles);

}
