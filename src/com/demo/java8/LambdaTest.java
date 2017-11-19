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

        Runnable r1=() -> System.out.println("hello world 1");

        Runnable r2=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world 2");
            }
        };
        process(r1);
        process(r2);
        process(() -> System.out.println("hello world 3"));

    }
    public  static  void process(Runnable r){
        r.run();
    }

}
