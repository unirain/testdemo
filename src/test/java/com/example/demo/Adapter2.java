package com.example.demo;

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
public class Adapter2 {
    private  Apdatee apdatee;
    public Adapter2(Apdatee apdatee){
        this.apdatee=apdatee;

    }
    public  void print(){
        apdatee.print();
    }
    public  void input(){
        System.out.println();
    }
}
