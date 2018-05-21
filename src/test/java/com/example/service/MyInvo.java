package com.example.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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
public class MyInvo implements InvocationHandler {
    private Object target;

    public MyInvo(Object target){
        this.target=target;

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是代理对象");
        Object o=method.invoke(target,args);

        return o;
    }

}
