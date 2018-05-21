package com.example.demo;

import com.example.service.*;
import org.junit.Test;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/1/12
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class test1 {
//    private    String m;
//    public test1(String m1){
//        this.m=m1;
//    }
//    public void  set66(int l){
//
//    }
    @Test
    public void test(){
        Subject subject=new FatherSubject();
        Observer observer=new sunObserver();
        subject.addOb(observer);
        subject.doit();
    }
    @Test
    public void test1(){
        Approver o,s,t;
        o=new O_Approver();
        s=new S_Approver();
        t=new T_Approver();
        o.setSucessor(s);
        s.setSucessor(t);
        o.doit(100);


    }
    @Test
    public void test2(){
        Component concreteComponent=new ConcreteComponent();
        Decorator decoratorA=new ConcreteDecoratorA(concreteComponent);
        decoratorA.doit();
        Decorator decoratorB=new ConcreteDecoratorB(concreteComponent);
        decoratorB.doit();
        System.out.println("*********AB*****");
        Decorator decoratorAB=new ConcreteDecoratorA(decoratorB);
        decoratorAB.doit();



    }
}
