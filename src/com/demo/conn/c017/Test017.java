package com.demo.conn.c017;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/19
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test017 {


    Object o=new Object();

    public  void  test(){
        synchronized (o){
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        Test017 test017=new Test017();

        new Thread(test017::test,"t1").start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread=new Thread(test017::test,"t2");
        test017.o=new Object();//   从新引用，  则test2可以进行   锁对象发生改变，所以t2线程得以执行，如果注释掉这句话，线程2将永远得不到执行机会
        thread.start();

    }
}
