package com.demo;

import java.util.concurrent.CountDownLatch;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/11/2 15:39
 * @parameter
 * @return   在计时测试中使用CountDownLatch来启动和停止线程
 */
public class TestHarness {

    public long timeTasks(int nThreads,final Runnable task) throws InterruptedException {

        final CountDownLatch startGate=new CountDownLatch(1);
        final CountDownLatch endGate=new CountDownLatch(nThreads);

        for (int i = 0; i <nThreads ; i++) {
            Thread t=new Thread(){
                public  void run(){
                    try {
                            startGate.await();
                        try {
                            task.run();
                        }finally {
                            endGate.countDown();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
        }
        long start=System.currentTimeMillis();
        startGate.countDown();
        endGate.await();
        long end=System.currentTimeMillis();


        System.out.println(end-start);
        return  end-start;

    }

    public static void main(String[] args) throws InterruptedException {

        new TestHarness().timeTasks(10,() -> System.out.println(1));
    }

}
