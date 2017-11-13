package com.demo.concurrent;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/11/13 10:33
 * @parameter
 * @return
 */
public class MyContainer<T> {

    final LinkedList<T> lists=new LinkedList<T>();
    final int  MAX=10;
    private int count=0;

    public  synchronized  void  put(T t){
        while (lists.size()==MAX){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lists.add(t);
        count++;
        this.notifyAll();
    }
    public synchronized T get(){
        T t=null;
        while(lists.size()==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        t=lists.removeFirst();
        count--;
        this.notifyAll();
        return t;
    }

    public static void main(String[] args) {
        MyContainer<String> myContainer=new MyContainer<>();

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j <5 ; j++) {
                    System.out.println(Thread.currentThread().getName()+"=="+myContainer.get());
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
                    myContainer.put(String.valueOf(j));
                }
            },"p"+i).start();
        }


    }


}
