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
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component){
        super(component);
    }
    @Override
    public void doit() {
        print();
        super.doit();
    }
    private   void print(){
        System.out.println("打印....");
    }

}
