package com.demo.conn.c020;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ReentrantLock1 {



    public  synchronized void  test1(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void test2(){
        System.out.println("test2");
    }

    public static void main(String[] args) {
        ReentrantLock1 reentrantLock1=new ReentrantLock1();

        new Thread(reentrantLock1 ::test1).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(reentrantLock1 ::test2).start();

    }






}
