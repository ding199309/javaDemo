package com.demo.conn.c019;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/25
 * To change this template use File | Settings | File Templates.
 * Description:
 *
 * 曾经的面试题：（淘宝？）
 * 实现一个容器，提供两个方法，add，size
 * 写两个线程，线程1添加10个元素到容器中，线程2实现监控元素的个数，当个数到5个时，线程2给出提示并结束
 */
public class Demo1 {

   volatile List<Object> list=new ArrayList<>();

    public void add(Object o){
        list.add(o);
    }
    public  int size(){
        return  list.size();
    }

    public   void test1(){
        for (int i = 0; i <10 ; i++) {
            this.add(i);
            System.out.println("add " + i);
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public   void  test2(){
        while(true){
            if(list.size()==5){
                System.out.println("test2结束");
                break;
            }
        }
    }



    public static void main(String[] args) {
        Demo1 c=new Demo1();

        new Thread(c ::test2,"test2").start();
        new Thread(c ::test1,"test1").start();


//        new Thread(()->{
//            for (int i = 0; i <10 ; i++) {
//                c.add(i);
//                System.out.println("add"+i);
//
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//
//        new Thread(()->{
//            while(true){
//                if(c.size()==5){
//                    break;
//                }
//            }
//            System.out.println("结束");
//        }).start();








        //老师的
//        new Thread(() -> {
//            for(int i=0; i<10; i++) {
//                c.add(new Object());
//                System.out.println("add " + i);
//
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "t1").start();
//
//        new Thread(() -> {
//            while(true) {
//                if(c.size() == 5) {
//                    break;
//                }
//            }
//            System.out.println("t2 结束");
//        }, "t2").start();
//
    }


}
