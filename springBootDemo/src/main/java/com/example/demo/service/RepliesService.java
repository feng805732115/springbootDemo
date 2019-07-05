package com.example.demo.service;

import com.example.demo.pojo.Repiles;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepliesService {
    public List<Repiles> getRepiles(@Param("infoId")Integer infoId);

    public boolean addReliles(Repiles repiles);
}
