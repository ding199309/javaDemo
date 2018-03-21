package com.demo.conn.c019;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Demo2 {

    List<Object> list=new ArrayList<>();

    public  void  add(Object o){
        list.add(o);
    }
    public  int  size(){
        return list.size();
    }

    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
        Object o=new Object();

        new Thread(()->{
            synchronized (o){
                System.out.println("t2启动");
                if (demo2.size()!=5){
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("=====t2结束");
                o.notify();
            }

        },"t2").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }


        new Thread(()->{
            synchronized (o){
                for (int i = 0; i <10 ; i++) {
                    demo2.add(i);
                    System.out.println("add"+i);
                    if (demo2.size()==5){
                        o.notify();
                        //释放锁，让t2得以执行
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"mt1").start();
    }

}
