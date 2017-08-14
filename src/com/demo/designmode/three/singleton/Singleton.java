package com.demo.designmode.three.singleton;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:35  2017/6/19              单例模式最终结果
 * @return
 */
    public class Singleton {

    private Singleton(){}
    public static  Singleton getInstance(){

        return SingletonInstance.singelton;
    }
    private static  class  SingletonInstance{
        static Singleton singelton=new Singleton();
    }
}
