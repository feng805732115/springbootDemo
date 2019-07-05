package com.example.demo.controller;

import com.example.demo.pojo.Repiles;
import com.example.demo.service.InformationService;
import com.example.demo.service.RepliesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RepliesController {
    @Resource
    private RepliesService repliesService;
    @Resource
    private InformationService informationService;
    @RequestMapping("/submitRelies")
    @ResponseBody
    public Object submitRelies(String showText,String replyCount,String infoId){
        int replyNum=Integer.parseInt(replyCount);
        int id=Integer.parseInt(infoId);
        int num=10;
        Repiles repiles=new Repiles();
        repiles.setRid(num);
        repiles.setContent(showText);
        repiles.setInfoId(id);
        repiles.setReplyTime(new Date());
        boolean flag= informationService.updateReplyCount((replyNum+1),id);
        boolean flag1=repliesService.addReliles(repiles);
        Map<String,Object>jsonStr= new HashMap<String,Object>();
        jsonStr.put("success","success");
        String date= new SimpleDateFormat("yyyy-MM-dd").format(repiles.getReplyTime());
        jsonStr.put("replyTime",date);
        jsonStr.put("content",repiles.getContent());
        if (flag&&flag1){
            return jsonStr;
        }
        return "error";
    }

}
