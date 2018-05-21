package com.example.demo;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

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
public class Emp {
    public static final String a="";
    class a implements Callable{
        private int i;
        public  a(int i){
            this.i=i;
        }
        @Override
        public Object call() throws Exception {
            System.out.println(i+"哈哈哈");
            if (i==3){
                throw new Exception("错误");
            }
            return i;
        }
    }
    private  String ab;

    public String getAb() {
        return ab;
    }

    public void setAb(String ab) {
        this.ab = ab;
    }

    public Emp(){
        System.out.println("hha");

    }
    @Test
    public void test(){
//        FutureTask task=new FutureTask(new a());
//        Thread o=new Thread(task);
//        o.start();
//        try{
//            System.out.println(task.get().toString());
//        }catch(Exception e){
//            e.printStackTrace();
//
//        }





    }
    @Test
    public  void test2(){
        ExecutorService service = Executors.newCachedThreadPool();
        List<Future> list=new ArrayList<Future>();
        for (int i=0;i<10;i++){
            list.add(service.submit(new a(i)));
        }
        service.shutdown();
//        for (Future future : list) {
//            try{
//                System.out.println(future.get());
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }
    }
    @Test
    public  void test3(){
        Target apdatee=new Adapter();
        apdatee.print();
        apdatee.input();






    }
    @Test
    public void test99(){

//        Double a=new Double(0.9);
//        Double b=new Double(0.9);
        Double a=0.8;
        Double b=0.8;
//        Long a=9L;
//        Long b=9L;




        System.out.println(a==b);
    }



}

