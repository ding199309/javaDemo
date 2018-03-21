package com.demo.conn.c021;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2018/1/2
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyContainer2<T> {


    private  final LinkedList<T>  linkedList=new LinkedList<>();
    private  final int   MAX=10;
    private  int count=0;

    Lock lock=new ReentrantLock();
    Condition pro=lock.newCondition();
    Condition cu=lock.newCondition();

    public T  get(){
        T t=null;
        try {
            lock.lock();
            while (linkedList.size()==0){
                cu.await();
            }
            count--;
            t=linkedList.removeFirst();
            pro.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return t;
    }

    public void put(T t){
        try {
            lock.lock();
            while (linkedList.size()==MAX){
                pro.await();
            }
            count++;
            linkedList.add(t);
            cu.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        MyContainer2 myContainer2=new MyContainer2();

        for (int i = 0; i <10 ; i++) {
            new Thread(myContainer2 ::get,"c"+i).start();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <2 ; i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int j = 0; j <25 ; j++) {
                            System.out.println(Thread.currentThread().getName() + "==" +j);
                        }
                    }
                },"P"+i).start();
            }
    }

}
