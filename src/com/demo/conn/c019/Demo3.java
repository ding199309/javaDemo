package com.demo.conn.c019;

import com.demo.designmode.seven.adapter.test.D;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Demo3 {

    volatile  List<Object> list=new ArrayList<>();

    public  void  add(Object o){
        list.add(o);
    }
    public  int  size(){
        return list.size();
    }

    public static void main(String[] args) throws InterruptedException {
        Demo3 c=new Demo3();
        CountDownLatch countDownLatch=new CountDownLatch(1);
        new Thread(()->{
            System.out.println("t2启动");
            if(c.size()!=5){
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("t2结束");
        },"t2").start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                c.add(i);
                System.out.println("add="+i);
                if(c.size()==5){
                    //打开门闩，让t2得以执行
                    countDownLatch.countDown();
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }

}
