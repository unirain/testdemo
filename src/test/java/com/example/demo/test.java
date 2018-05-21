package com.example.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/1/12
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class test {


    public static void main(String[] args) {
        try{

            Class<?>[] parameterTypes=null;
            Method selethod=null;
            String method="com.example.demo.test1.set66";
            String pack=method.substring(0,method.lastIndexOf("."));
            String methodName=method.substring(method.lastIndexOf(".")+1,method.length());
            System.out.println("包："+pack);
            System.out.println("方法："+methodName);
            Class c=Class.forName(pack);
            Method[] methods = c.getMethods();
            for (Method temp : methods) {
                if(temp.getName().equals(methodName)){
                    parameterTypes=temp.getParameterTypes();

                    selethod=temp;
                    System.out.println(selethod);
                    break;
                }
            }

//            List<Object> list=new ArrayList<>();
//            for (Class<?> type : parameterTypes) {
//                System.out.println(type.getName().equals("int"));
//
//            }
//            list.add(1);
//            list.add("155");
//            selethod.invoke(c.newInstance(),list.toArray());
//
//            System.out.println(selethod.toGenericString());


            Field[] fields=c.getDeclaredFields();
            for(Field field:fields){
                System.out.println("获取所有的public及继承的字段"+field.getName());
            }




        }catch(Exception e){
            e.printStackTrace();


        }



    }

}
