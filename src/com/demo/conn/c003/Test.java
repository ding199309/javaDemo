package com.demo.conn.c003;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-06 10:25
 * @see [相关类/方法]（可选）
 * @since 1.0
 * @deprecated （可选）
 */
public class Test {

    private int count=10;

    public synchronized void  test(){
        count++;
        System.out.println(Thread.currentThread().getName()+" count="+count);
    }

}
