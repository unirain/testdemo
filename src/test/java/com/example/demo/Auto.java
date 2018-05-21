package com.example.demo;

import com.example.domain.entity.User;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/5/17
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class Auto {
    public static void main(String[] args) {

        //无顺序
        Set<Long> set=new HashSet<>();
        for (int a=100;a>0;a--){
            set.add((long)a);

        }
        Set<Long> trSet=new TreeSet<>();
        for (int a=100;a>0;a--){
            trSet.add((long)a);

        }

        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(Arrays.toString(trSet.toArray()));


    }
}
