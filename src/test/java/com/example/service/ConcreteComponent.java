package com.example.service;

/********************************************************************************
 *
 * Title: 原始对象
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/5
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class ConcreteComponent extends Component {
    @Override
    public void doit() {
        System.out.println("我是原始对象");
    }
}
