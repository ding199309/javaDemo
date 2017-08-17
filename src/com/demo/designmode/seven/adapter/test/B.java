package com.demo.designmode.seven.adapter.test;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 13:55  2017/8/14
 * @return
 */
public class B extends A{

    private A a;

    public void  depart(A a){
        this.a=a;
    }
    public void show(){
        if(a!=null){
            a.show();
        }
    }
}
