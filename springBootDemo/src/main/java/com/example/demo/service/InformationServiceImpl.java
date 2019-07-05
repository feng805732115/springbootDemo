package com.example.demo.service;

import com.example.demo.dao.InformationMapper;
import com.example.demo.pojo.Informations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class InformationServiceImpl implements InformationService {

    @Resource
    private InformationMapper informationMapper;
    @Override
    public List<Informations> getInformationList() {
        return  informationMapper.getInformationList();
    }

    @Override
    public boolean updateViewCount(Integer num,Integer id) {
        return informationMapper.updateViewCount(num,id);
    }

    @Override
    public boolean updateReplyCount(Integer replyCount, Integer id) {
        return  informationMapper.updateReplyCount(replyCount, new Date(),id);
    }
}
