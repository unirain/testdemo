package com.example.controller;

import com.example.domain.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/********************************************************************************
 *
 * Title: 测试
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/1/11
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/

@RestController
@RequestMapping("/ces")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "helloword";
    }

    @RequestMapping("/user")
    public User getuser() {
        User user = new User();
        user.setPwd("123");
        user.setUsername("wosossdfskjfj");
        return user;
    }

    @RequestMapping("/view")
    public ModelAndView view() {
        ModelAndView oo = new ModelAndView();
        oo.setViewName("index");
        return oo;

    }

}
