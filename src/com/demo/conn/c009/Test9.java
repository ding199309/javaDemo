package com.demo.conn.c009;

/**
 * 锁的重入性
 * User: woting
 * Date: 2017/12/14
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test9 {

    public  synchronized  void  test1(){
        System.out.println(1);
        test2();
    }
    public synchronized void test2(){
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test9 test9=new Test9();
        new Thread(()->test9.test1()).start();
    }

}
