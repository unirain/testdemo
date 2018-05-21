package com.example.service;

/********************************************************************************
 *
 * Title:责任链模式
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/2
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public abstract class Approver {
    protected  Approver sucessor;

    //设置下一个转发者
    public void setSucessor(Approver sucessor) {
        this.sucessor = sucessor;
    }
    //具体处理方法
    public abstract  void doit(int money);
}
