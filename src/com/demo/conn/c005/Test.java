package com.demo.conn.c005;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-06 11:50
 * @see [相关类/方法]（可选）
 * @since 1.0
 * @deprecated （可选）
 */
public class Test  implements  Runnable{

    private  int count=10;

    @Override
    public void run() {
        count--;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Test t=new Test();
        for (int i = 0; i < 5; i++) {
            new Thread(t,"name"+i).start();
        }
    }
}
