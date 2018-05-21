package com.example.demo;

import com.example.controller.UserController;
import com.example.domain.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private User user;
    MockMvc mockMvc;

    /**
     * 设置
     * @param a 一个入参
     * @throws Exception
     */
    public void setup(int a,String b) throws Exception {
        System.out.println("被调用了"+a+"和"+b);
//        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();

    }

    @Test
    public void contextLoads() throws Exception{
        RequestBuilder requestBuilder=null;
        requestBuilder=get("/user/");
        mockMvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));


        requestBuilder = post("/user/")
                .param("id", "1")
                .param("name", "测试大师")
                .param("pwd", "20");
        mockMvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("success")));


    }
    @Test
    public  void test1()throws Exception{
        System.out.println(user.getUsername());
        System.out.println(user.getPwd());


    }

}
