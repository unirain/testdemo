package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.dao.Ac01Mapper;
import com.example.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/********************************************************************************
 *
 * Title: 用户控制  restful
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
@RequestMapping("/user")
public class UserController {
    @Value("${myName}")
    private String usernmae;
    static Map<Long,User> userMap= Collections.synchronizedMap(new HashMap<Long, User>());
    static {
        User user=new User();
        user.setPwd("123");
        user.setUsername("chenlm");
        user.setAge("25");
        User user2=new User();
        user2.setPwd("123");
        user2.setUsername("haha");
        user2.setAge("20");
        userMap.put(1L,user);
        userMap.put(2l,user2);
    }

    /**
     * 显示所有人员
     * @return
     */
    @RequestMapping(value = "/all",method= RequestMethod.GET)
    public List<User> getUserList(){

        List<User> users=new ArrayList<>(userMap.values());
        return users;
    }

    /**
     * 添加人员
     * @param user
     * @return
     */
    @RequestMapping(value = "/",method= RequestMethod.POST)
    public String addUser(@ModelAttribute User user){
        userMap.put(user.getId(),user);
        return "success";
    }

    /**
     * 查看人员
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return userMap.get(id);
    }
    /**
     * 查看特殊人员
     * @param user
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getUserBYMore(@RequestParam String user){

        User userDemo=  JSON.parseObject(user,User.class);
        System.out.println(userDemo);
        return userDemo;

    }

    /**
     * 修改
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String modifyUser(@PathVariable Long id ,@ModelAttribute User user){
        User data=userMap.get(id);
        if (data==null){
            return  "fail";
        }
        data.setUsername(user.getUsername());
        data.setPwd(user.getPwd());
        userMap.put(id,data);
        return  "success";
    }
//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
//    public ReturnBody getException(@PathVariable Long id, HttpServletRequest request )throws Exception{
//        User data=userMap.get(id);
//        ReturnBody returnBody=new ReturnBody();
//        if (data==null){
//          throw new TestException("找不到值");
//
//        }else{
//            returnBody.setCode(200);
//            returnBody.setMessage(data.toString());
//            returnBody.setUrl(request.getRequestURI());
//
//        }
//        return returnBody;
//
//    }



}
