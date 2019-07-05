package com.example.demo.service;

import com.example.demo.pojo.Informations;

import java.util.Date;
import java.util.List;

public interface InformationService {
    public List<Informations> getInformationList();

    public boolean updateViewCount(Integer num,Integer id);

    public boolean updateReplyCount(Integer replyCount,Integer id);
}
