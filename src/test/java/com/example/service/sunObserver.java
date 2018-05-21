package com.example.service;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/1
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class sunObserver  implements Observer{
    @Override
    public void dosamething() {
        System.out.println("我收到通知了");
        System.out.println("我收到啦");
    }
}
