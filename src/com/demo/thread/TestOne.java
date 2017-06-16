package com.demo.thread;

import java.util.*;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 9:48  2017/6/7
 * @return
 */
public class TestOne  implements Runnable{

   public  static  int i=0;

    @Override
    public void run() {
        while (i<100) {
            System.out.println(Thread.currentThread() + "::::" + ++i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestOne testOne = new TestOne();
        Thread t1 = new Thread(testOne);
        Thread t2 = new Thread(testOne);
        t1.start();
        t2.start();
    }
}
