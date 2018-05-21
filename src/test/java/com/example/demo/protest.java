package com.example.demo;

import com.example.service.MyInvo;
import com.example.service.UserServiceImpl;
import com.example.service.Userservice;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/2/27
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class protest {
    @Test
    public  void test(){
        Userservice userservice=new UserServiceImpl();
        Emp emp=new Emp();
        InvocationHandler handler=new MyInvo(userservice);
        Userservice prouserservice= (Userservice)Proxy.newProxyInstance(emp.getClass().getClassLoader(),userservice.getClass().getInterfaces(),handler);
        prouserservice.add();


    }

}
