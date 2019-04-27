package com.fathyman.controller;

import com.fathyman.domain.User;
import com.fathyman.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author fathyman
 * @description
 * @date 2019/4/24
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/findAll")
    public @ResponseBody List<User> findAll(){
        List<User> users = userMapper.findAll();
        System.out.println(users);
        return users;
    }
}
