package com.demo.designmode.eight.proxy.one;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:04  2017/6/20
 * @return
 */

/**
 * 代理对象
 */
public class ProxySubject implements  Subject {

    private RealSubject realSubject;

    @Override
    public void test() {
            if(realSubject==null){
                realSubject=new RealSubject();
            }
            realSubject.test();
    }
}
