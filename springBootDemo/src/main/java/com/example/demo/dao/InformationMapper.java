package com.example.demo.dao;

import com.example.demo.pojo.Informations;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

@Mapper
public interface InformationMapper {
     @Select("select * from \"informations\" order by \"reportTime\" desc")
    public List<Informations>getInformationList();

     @Update("update \"informations\" set \"viewCount\"=#{num} where \"infoId\"=#{id}")
    public boolean updateViewCount(@Param("num") Integer num,@Param("id") Integer id);

    @Update("update \"informations\" set \"replyCount\"=#{replyCount},\"reportTime\"=#{reportTime} where \"infoId\"=#{id}")
    public boolean updateReplyCount(@Param("replyCount") Integer replyCount,@Param("reportTime") Date reportTime,@Param("id") Integer id);

}
