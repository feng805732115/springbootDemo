package com.example.demo.service;

import com.example.demo.dao.RepliesMapper;
import com.example.demo.pojo.Repiles;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RepliesServiceImpl implements RepliesService {

   @Resource
   private RepliesMapper repliesMapper;
    @Override
    public List<Repiles> getRepiles(Integer infoId) {
        return repliesMapper.getRepiles(infoId);
    }

    @Override
    public boolean addReliles(Repiles repiles) {
        return repliesMapper.addReliles(repiles);
    }
}
