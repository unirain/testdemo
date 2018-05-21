package com.example.demo;

import com.example.service.Component;

/********************************************************************************
 *
 * Title: 装饰者
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/5
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public abstract  class Decorator extends Component {
    private Component component;
    public Decorator(Component component){
        this.component=component;
    }
    //转发。。。
    public void doit(){
        component.doit();
    }


}
