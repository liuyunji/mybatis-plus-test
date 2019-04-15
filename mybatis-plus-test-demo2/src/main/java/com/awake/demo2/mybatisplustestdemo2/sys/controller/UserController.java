package com.awake.demo2.mybatisplustestdemo2.sys.controller;


import com.awake.demo2.mybatisplustestdemo2.sys.entity.User;
import com.awake.demo2.mybatisplustestdemo2.sys.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author awake
 * @since 2019-04-10
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {
    @Autowired
    protected IUserService iUserService;

    @RequestMapping("/save")
    public String saveUser(){
        User user = new User();
        user.setAge(18);
        user.setPassword("123456");
        user.setUserName("awake");
        user.setSex(1);
        if (iUserService.save(user)){
            return "插进去了";
        }
        return "插入失败";
    }

    @RequestMapping("findAll")
    public List<User> findAll(){
        List<User> userList = iUserService.list(
                new QueryWrapper<User>().eq("sex", 1)
        );
        return userList;
    }
}
