package com.demo.designmode.seven.adapter.test;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 13:53  2017/8/14
 * @return
 */
public class A {

    private  String name;
    public A(){}
    public A(String name){
        this.name=name;
    }
    public void show(){
        System.out.println("我的名字是:"+name);
    }
}
