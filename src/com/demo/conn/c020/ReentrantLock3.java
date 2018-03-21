package com.demo.conn.c020;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ReentrantLock3 {

    Lock lock=new ReentrantLock();

    public void test1(){
        try {
            lock.lock();
            for (int i = 0; i <10 ; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void  test2(){
//        boolean b=lock.tryLock();
//        System.out.println("m2===="+b);
//        if(b){
//            lock.unlock();
//        }
        boolean b=false;
        try {
           b= lock.tryLock(5,TimeUnit.SECONDS);
            System.out.println("m2==="+b);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(b){
               lock.unlock();
            }
        }

    }


    public static void main(String[] args) {
        ReentrantLock3 r=new ReentrantLock3();
        new Thread(r :: test1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r ::test2).start();

    }


}
