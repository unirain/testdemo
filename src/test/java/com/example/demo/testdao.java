package com.example.demo;

import com.example.dao.Ac01Mapper;
import com.example.dao.UserMapper;
import com.example.domain.entity.AC01;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/20
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
@RunWith(SpringRunner.class)
@SpringBootTest
public class testdao {
    @Autowired
    private Ac01Mapper ac01Mapper;

    @Test
    public void qu() {
//        AC01 ac01=ac01Mapper.getAc01(7683337L);
//        System.out.println(ac01.getAac002());



    }
}
