package com.demo.conn.c008;

/**
 * 对业务写加锁，对业务员读不加锁，容易产生脏读
 * User: woting
 * Date: 2017/12/14
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test8 {

    String name;
    int   account;

    public  synchronized  void write(String name,int account){
        this.name=name;
        this.account=account;
    }

    public /*synchronized*/  void read(){
        System.out.println(name+"=="+account);
    }

    public static void main(String[] args) {
        Test8 test8=new Test8();

        new Thread(()->test8.write("jim",1)).start();

        new Thread(()->test8.read()).start();
    }

}
