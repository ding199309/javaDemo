package com.demo.conn.c011;

import java.util.concurrent.TimeUnit;

/**
 *  程序在执行过程中，如果出现异常，默认情况锁会被释放
 * 所以，在并发处理的过程中，有异常要多加小心，不然可能会发生不一致的情况。
 * 比如，在一个web app处理过程中，多个servlet线程共同访问同一个资源，这时如果异常处理不合适，
 * 在第一个线程中抛出异常，其他线程就会进入同步代码区，有可能会访问到异常产生时的数据。
 * 因此要非常小心的处理同步业务逻辑中的异常
 * User: woting
 * Date: 2017/12/14
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test11 {

    int count=0;

    public synchronized  void test(){
        while (true){
            count++;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"=="+count);
            if(count==5){
               int a= count/0;
            }
        }
    }

    public static void main(String[] args) {
        Test11 test11=new Test11();

       new Thread(()->test11.test(),"t1").start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->test11.test(),"t2").start();

    }

}
