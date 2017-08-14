package com.demo.designmode.three.singleton;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:30  2017/6/19
 * @return
 */
public class Demo2 {



    private  Demo2(){}

    public static  Demo2 getInstance(){

        return Demo2Instance.demo2;
    }


    private static  class Demo2Instance{
        static  Demo2 demo2=new Demo2();
    }
}
