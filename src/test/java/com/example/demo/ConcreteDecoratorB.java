package com.example.demo;

import com.example.service.Component;

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
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component){
        super(component);
    }

    @Override
    public void doit() {
        input();
        super.doit();

    }
    private void input(){
        System.out.println("输入...........");
    }
}
