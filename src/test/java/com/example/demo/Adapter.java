package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/5
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class Adapter extends Apdatee implements  Target{
    private JdbcTemplate jdbcTemplate;
    @Override
    public void input() {
        System.out.println("我是适配器添加的方法");


    }
}
