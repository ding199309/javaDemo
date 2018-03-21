package com.demo.conn.c020;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * reentrantlock用于替代synchronized
 * 本例中由于m1锁定this,只有m1执行完毕的时候,m2才能执行
 * 这里是复习synchronized最原始的语义
 * @author dfz
 */
public class ReentrantLock2 {

    Lock lock=new ReentrantLock();

    public  void  test1(){
        try {
            lock.lock();

            for (int i = 0; i <10 ; i++) {
                System.out.println(i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public  void test2(){
        try {
            lock.lock();
            System.out.println("=======m2");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        ReentrantLock2 reentrantLock2=new ReentrantLock2();
        new Thread(reentrantLock2 ::test1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(reentrantLock2 ::test2).start();
    }
}
