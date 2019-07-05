package com.example.demo.controller;

import com.example.demo.pojo.StudentProperties;
import org.hibernate.validator.constraints.SafeHtml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//@RestController
@Controller
public class HelloController {
   @Resource
   private StudentProperties student;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name","李四");
       return "hello";
        //return "名字是："+student.getName();
    }
}
