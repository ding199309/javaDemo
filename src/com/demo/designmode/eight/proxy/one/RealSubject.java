package com.demo.designmode.eight.proxy.one;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:03  2017/6/20
 * @return
 */

/**
 * 真实对象
 */
public class RealSubject implements  Subject {
    @Override
    public void test() {

        System.out.println("这是真实的,自己写的subject");
    }
}
