package com.example.demo.user_text.controller;

import com.example.demo.user_text.entity.UserEntity;
import com.example.demo.user_text.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: gjy
 * @Date: 2020/5/2 11:28
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

//    显示数据
    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
    }

//    硬删除
    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }

//    保存用户
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){

        System.out.println("用户注册-"+ userEntity.toString());

        userService.save(userEntity);
        return "success";
    }
}
