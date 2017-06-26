package com.demo.designmode.one.singleton;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:10  2017/6/19
 * @return
 */
public class Demo1 {

    private Demo1(){

    }

    private static  Demo1 demo=null;

    public static Demo1  getInstance(){
        if(null==demo){
            synchronized(Demo1.class){
                if(null==demo){
                    demo=new Demo1();
                }
            }
        }
        return  demo;
    }
}
