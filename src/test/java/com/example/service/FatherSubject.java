package com.example.service;

import java.util.ArrayList;
import java.util.List;

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
public class FatherSubject implements Subject {
    private List<Observer> obList=new ArrayList();
    @Override
    public void addOb(Observer observer) {
        obList.add(observer);

    }

    @Override
    public void deleteOb(Observer observer) {
        int i=obList.indexOf(observer);
        if (i>=0){
            obList.remove(observer);
        }

    }

    @Override
    public void notifyObserver() {
        for (Observer o : obList) {
            o.dosamething();
        }

    }

    @Override
    public void doit() {
        System.out.println("准备发起通知了、、");
        notifyObserver();
    }

}
