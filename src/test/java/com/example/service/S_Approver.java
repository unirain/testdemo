package com.example.service;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/2
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class S_Approver extends Approver {
    @Override
    public void doit(int money) {
        if (money>=50&&money<100){
            System.out.println("我可以处理50-100的");
        }else{
            this.sucessor.doit(money);
        }
    }
}
