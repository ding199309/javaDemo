package com.demo.concurrent;

import sun.java2d.SurfaceDataProxy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyContainer<T> {

    final private LinkedList<T> lists=new LinkedList<>();
    final private int MAX=10;
    private int count=0;

    public  synchronized  void put(T t){
        while(lists.size()==MAX){
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
        while (lists.size()==0){
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
        MyContainer<String> c=new MyContainer<>();
        //启动消费者现场
        for (int i = 0; i <10 ; i++) {
            new Thread(()->{
                for (int j = 0; j <5 ; j++) {
                    System.out.println(Thread.currentThread().getName()+"====="+c.get());
                }
            },"c"+i).start();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //启动生产者线程
        for (int i = 0; i <2 ; i++) {
            new Thread(()->{
                for (int j = 0; j <25 ; j++) {
                    c.put(Thread.currentThread().getName()+"=="+j);
                }
            },"p"+i).start();
        }
    }
}
