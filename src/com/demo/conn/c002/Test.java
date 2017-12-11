package com.demo.conn.c002;

import org.omg.CORBA.Environment;

/**
 * 对某个对象进行加锁
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-06 10:10
 * @see [相关类/方法]（可选）
 * @since 1.0
 * @deprecated （可选）
 */
public class Test {


    private  int  count=10;

    public  void test(){
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+" coun="+count);
        }
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
