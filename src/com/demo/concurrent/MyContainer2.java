package com.demo.concurrent;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/11/13 11:34
 * @parameter
 * @return
 */
public class MyContainer2<T> {

    final LinkedList<T> lists=new LinkedList<T>();
    final int  MAX=10;
    private int count=0;

    private Lock lock=new ReentrantLock();
    private Condition producter=lock.newCondition();
    private Condition customer=lock.newCondition();

    public  void put(T t){
        try {
            lock.lock();
            while(lists.size()==MAX){
                producter.await();
            }
            lists.add(t);
            count++;
            customer.signalAll();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }

    public T get(){
        T t=null;

        try {
            lock.lock();
            while(lists.size()==0){
                customer.await();
            }
            t=lists.removeFirst();
            count--;
            producter.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


        return t;
    }


    public static void main(String[] args) {
        MyContainer2<String> myContainer2=new MyContainer2<>();

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j <5 ; j++) {
                    System.out.println(Thread.currentThread().getName()+"=="+myContainer2.get());
                }
            },"c"+i).start();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <2 ; i++) {
            new Thread(()->{
                for (int j = 0; j <25 ; j++) {
                    myContainer2.put(Thread.currentThread().getName()+""+String.valueOf(j));
                }
            },"p"+i).start();
        }
    }
}
