package com.neusoft.spring_boot.t_user.controller;/**
 * $
 *
 * @author wjw
 * $
 * $
 * @date $
 */

import com.neusoft.spring_boot.t_user.entity.UserEntity;
import com.neusoft.spring_boot.t_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 *
 * @Author: wwb
 * @Date: 2020/5/4 08:36
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer uid){
        userService.delById(uid);
        return "redirect:/index.html";
    }

    //新增用户接口
    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestBody UserEntity userEntity){

        System.out.println("新增用户"+userEntity.toString());
        userService.add(userEntity);
        return "success";
    }
}