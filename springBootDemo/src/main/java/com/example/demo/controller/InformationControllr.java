package com.example.demo.controller;

import com.example.demo.dao.InformationMapper;
import com.example.demo.pojo.Informations;
import com.example.demo.pojo.Repiles;
import com.example.demo.service.InformationService;
import com.example.demo.service.RepliesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class InformationControllr {
    @Resource
    private InformationService informationService;
    @Resource
    private RepliesService repliesService;

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/index")
    public String index(Model model){
        List<Informations>informationList=informationService.getInformationList();
        model.addAttribute("informations",informationList);
        return "index";
    }

    @RequestMapping("/showInfo")
    public String showInfo(Model model,String count,String id,String title,String content,String reportTime){
        int num=Integer.parseInt(count.split("/")[1]);
        int replyCount=Integer.parseInt(count.split("/")[0]);
        int id1=Integer.parseInt(id);
        informationService.updateViewCount((num+1),id1);
        List<Repiles>repliesList=repliesService.getRepiles(id1);
        model.addAttribute("replyCount",replyCount);
        model.addAttribute("content",content);
        model.addAttribute("title",title);
        model.addAttribute("infoId",id1);
        model.addAttribute("content",content);
        model.addAttribute("reportTime",reportTime);
        model.addAttribute("repliesList",repliesList);
        return "showInfo";
    }
}
