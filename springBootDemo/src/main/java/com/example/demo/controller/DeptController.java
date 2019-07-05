package com.example.demo.controller;

import com.example.demo.dao.DeptMapper;
import com.example.demo.pojo.Dept;
import com.example.demo.pojo.User;
import com.example.demo.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DeptController {

   @Resource
   private DeptService deptService;
   @Resource
   private DeptMapper deptMapper;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

   @RequestMapping("/doLogin")
   public String doLogin(HttpSession session,String loginName, String password){
        if(loginName.equals("admin")&&password.equals("admin")) {
            User user=new User();
            user.setLoginName(loginName);
            user.setPassword(password);
            session.setAttribute("loginUser",user);
            return "redirect:/deptList";
        }
        return "login";
    }


   @RequestMapping("/deptList")
    public String deptInfo(Model model,String pageNum){
        if(""==pageNum||null==pageNum)
            pageNum="1";
        List<Dept>deptList=deptService.deptList(Integer.parseInt(pageNum),3);
        int num=deptService.count();
        model.addAttribute("deptList",deptList);
        model.addAttribute("num",(num%3==0)?num/3:num/3+1);
        model.addAttribute("pageNum",pageNum);
        return "views/deptList";
    }
    @RequestMapping("/add")
    public String add(){
       return "views/addInfo";
    }
    @RequestMapping(value = "/addDept",method = RequestMethod.POST)
    @ResponseBody
    public String addDept(@RequestParam("deptNo")String deptNo,
                          @RequestParam("deptName")String deptName,
                          @RequestParam("deptLoc")String deptLoc
                          ){
        int result=deptMapper.addDept(Integer.parseInt(deptNo),deptName,deptLoc);
        if(result>0)
            return "添加信息成功！！";
        return "添加失败，请联系管理员！！";
    }

}
