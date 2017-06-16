package com.demo.thread;

import org.junit.Test;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Executor框架下的线程池学习
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 14:07  2017/6/15
 * @return
 */
public class TestThreadPool {

    /**
     * 使用newCachedThreadPool 查看源码可知：最大线程Integer.MAX_VALUE
     默认的，最大活跃时间默认60s
     */
//    @Test
    public  void test1() {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new MyThread());
        }
    }

    /**
     * newFixedThreadPool创建固定大小的线程池。每次提交一个任务就创建一个线程，直到线程达到线程池的最大大小。
     * 线程池的大小一旦达到最大值就会保持不变，
     * 如果某个线程因为执行异常而结束，那么线程池会补充一个新线程。
     */
//    @Test
    public void test2(){
        ExecutorService executorService=Executors.newFixedThreadPool(3);
        for (int i=0;i<10;i++){
            executorService.execute(new MyThread());
        }
    }

    /**
     * newSingleThreadExecutor创建一个单线程的线程池，这个线程池只有一个线程在工作，也就相当于单线程串行执行所有的任务，
     * 如果这个唯一的线程因为异常结束，
     * 那么会有一个新的线程来替换它，此线程池保证所有任务的执行顺序按照任务的提交顺序执行
     */
//    @Test
    public void test3(){
        ExecutorService executorService=Executors.newSingleThreadExecutor();
        for (int i = 0; i <10 ; i++) {
            executorService.execute(new MyThread());
        }
    }

    /**
     * newScheduledThreadPool创建一个定长线程池，支持定时及周期性任务执行。
     */
//    @Test
    public void  test4(){
        ScheduledExecutorService scheduledThreadPool=Executors.newScheduledThreadPool(5);
        //scheduledThreadPool.schedule(new MyThread(),0, TimeUnit.SECONDS);
        scheduledThreadPool.scheduleAtFixedRate(new MyThread(),1,1,TimeUnit.SECONDS);
    }

    static class MyThread implements  Runnable{
        private String name;
        MyThread(){

        }

        MyThread(String name){
            this.name=name;
        }
        @Override
        public void run() {
            System.out.println("name="+name+"===========Thread.currentThread().getName()"+"线程正在被调用!");
        }
    }

    public static void main(String[] args) {
      /*
       *  由此可见，ScheduleAtFixedRate 是基于固定时间间隔进行任务调度，
       * ScheduleWithFixedDelay 取决于每次任务执行的时间长短，是基于不固定时间间隔进行任务调度。
       */

        ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(5);

        scheduledExecutorService.scheduleAtFixedRate(
                new MyThread("job1"),1,1,TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(
                new MyThread("job2"), 1,1, TimeUnit.SECONDS);
    }
}


/**
 * 1:   使用newCachedThreadPool 查看源码可知：最大线程Integer.MAX_VALUE默认的，最大活跃时间默认60s
 *
 *
 *2:    newFixedThreadPool创建固定大小的线程池。每次提交一个任务就创建一个线程，直到线程达到线程池的最大大小。
 * 线程池的大小一旦达到最大值就会保持不变，
 * 如果某个线程因为执行异常而结束，那么线程池会补充一个新线程
 *
 *
 *3:    newScheduledThreadPool创建一个定长线程池，支持定时及周期性任务执行。
 *
 *
 *4:   newSingleThreadExecutor创建一个单线程的线程池，这个线程池只有一个线程在工作，也就相当于单线程串行执行所有的任务，
 * 如果这个唯一的线程因为异常结束，
 * 那么会有一个新的线程来替换它，此线程池保证所有任务的执行顺序按照任务的提交顺序执行
 */


//newCachedThreadPool
//newFixedThreadPool
//newSingleThreadExecutor
//newScheduledThreadPool

