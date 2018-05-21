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
public class O_Approver extends Approver {
    @Override
    public void doit(int money) {
        if (money<50&&0<money){
            System.out.println("我可以处理50块以内的");
        }else{
            //传递
            this.sucessor.doit(money);
        }
    }
}
