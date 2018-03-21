package com.demo.conn.c013;

import com.demo.conn.c012.Test012;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/19
 * To change this template use File | Settings | File Templates.
 * Description:
 *
 *    volatile    只保证可见内操作，   不能原子性
 *
 *    synchronized  原子性
 *     AtomXXX类本身方法都是原子性的，但不能保证多个方法连续调用是原子性的
 *
 *
 */
public class Test013 {

    int count=0;
    AtomicInteger atomicInteger=new AtomicInteger(0);

     synchronized  void  add(){
        for (int i = 0; i <10000 ; i++) {
            count++;
//            atomicInteger.incrementAndGet();
        }
    }


    public static void main(String[] args) {
        Test013 test013=new Test013();
//        for (int i = 0; i <10 ; i++) {
//            new Thread(test013::add,Thread.currentThread().getName()).start();
//        }
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(test013.count);

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(test013::add, "thread-" + i));
        }

        threads.forEach((o) -> o.start());

        threads.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        System.out.println(test013.count);
//        System.out.println(test013.atomicInteger.get());
    }


}
