package com.demo.conn.c007;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-06 15:08
 * @see [相关类/方法]（可选）
 * @since 1.0
 */
public class Test7 {


    public  synchronized void   test1(){
        System.out.println(Thread.currentThread().getName()+"==1   is  begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"==1   is   end");
    }
    public  void   test2(){
        System.out.println(Thread.currentThread().getName()+"==2   is  begin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"==2   is   end");
    }

    public static void main(String[] args) {
        Test7 test7=new Test7();
        new Thread(test7::test1,"thread1").start();
        new Thread(test7::test2,"thread2").start();
    }
}
