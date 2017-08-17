package com.demo.designmode.seven.adapter.test;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 13:58  2017/8/14
 * @return
 */
public class Test {
    public static void main(String[] args) {

        A a=new A("jim");

        C c=new C();
        D d=new D();

        c.depart(a);
        d.depart(c);
        d.show();
    }
}
