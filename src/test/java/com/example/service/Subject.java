package com.example.service;

/********************************************************************************
 *
 * Title: 观察模式：主题 管理类
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/1
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public interface Subject {
    void addOb(Observer observer);
    void deleteOb(Observer observer);
    void notifyObserver();
    void doit();

}
