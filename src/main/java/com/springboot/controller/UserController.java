package com.springboot.controller;

import com.springboot.pojo.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //查询所有
    @RequestMapping("/list")
    public  String users(Model model){
        List<User> users = userService.users();
        model.addAttribute("lists",users);
        return "users";
    }
    //跳转到添加页面
    @RequestMapping("/go")
    public  String goAdd(){
        return "userAdd";
    }
    //添加
    @RequestMapping("/add")
    public  String add(User user){
        userService.add(user);
        return "redirect:/user/list";
    }
    //删除
    @RequestMapping("/dell/{id}")
    public String dell(@PathVariable("id") Integer id){
        int i = userService.delete(id);
        return "redirect:/user/list";
    }
    //修改前的查询
    @RequestMapping("findByid/{id}")
    public  String findByid(@PathVariable("id") Integer id,Model model){
        User user = userService.findByid(id);
        model.addAttribute("user",user);
        return "userUpdate";
    }
    //修改
    @RequestMapping("/update")
    public  String update(User user){
        int i = userService.update(user);
        return "redirect:/user/list";
    }
}
