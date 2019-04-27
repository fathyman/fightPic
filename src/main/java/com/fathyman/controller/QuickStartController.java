package com.fathyman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fathyman
 * @description
 * @date 2019/4/24
 */
@Controller
public class QuickStartController {
    @RequestMapping("/quick")
    @ResponseBody

    public String quick(){
        return "springboot成功启动11111111111";
    }
}
