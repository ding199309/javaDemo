package com.demo.java8;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 15:39  2017/6/26
 * @return
 */
public class LambdaTest {



    public static void main(String[] args) {
        //lambda  表达式
        new Thread(()->{
            System.out.println("111111111");
        }).start();
    }
}
