package com.demo.conn.c001;

/**
 * 对某个对象加锁
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-06 10:09
 * @see [相关类/方法]（可选）
 * @since 1.0
 * @deprecated （可选）
 */
public class Test {

    private  int count=10;
    private Object o=new Object();

    public void m(){
        synchronized(o){
            count--;
            System.out.println(Thread.currentThread().getName()+" count="+count);
        }
    }

}
