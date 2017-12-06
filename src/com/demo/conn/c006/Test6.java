package com.demo.conn.c006;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-06 14:57
 * @see [相关类/方法]（可选）
 * @since 1.0
 * @deprecated （可选）
 */
public class Test6  implements  Runnable{

    private  int count=10;


    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+" count="+count);
    }

    public static void main(String[] args) {
        Test6 test6=new Test6();
        for (int i = 0; i <5 ; i++) {
            new Thread(test6,"thread"+i).start();
        }
    }
}
