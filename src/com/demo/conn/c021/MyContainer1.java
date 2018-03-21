package com.demo.conn.c021;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2018/1/2
 * To change this template use File | Settings | File Templates.
 * Description:
 */

// * 面试题：写一个固定容量同步容器，拥有put和get方法，以及getCount方法，
//         * 能够支持2个生产者线程以及10个消费者线程的阻塞调用
//         *
//         * 使用wait和notify/notifyAll来实现
public class MyContainer1<T> {

    private  final LinkedList<T> linkedList=new LinkedList<T>();
    private  final int Max=10;
    private  int count;

    public  synchronized  T   get(){
            T t=null;
            while (linkedList.size()==0){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            t=linkedList.removeFirst();
            count--;
            this.notifyAll();

            return  t;
    }

    public  synchronized  void set(T t){
        while (linkedList.size()==Max){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        linkedList.add(t);
        count++;
        this.notifyAll();
    }

    public static void main(String[] args) {
        MyContainer1 myContainer1=new MyContainer1();

        for (int i = 0; i <10 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0; j<5; j++)
                    System.out.println(myContainer1.get());
                }
            },"c"+i).start();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //启动生产者线程
        for(int i=0; i<2; i++) {
            new Thread(()->{
                for(int j=0; j<25; j++) myContainer1.set(Thread.currentThread().getName() + " " + j);
            }, "p" + i).start();
        }

    }






}
