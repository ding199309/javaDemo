package com.demo.designmode.eight.proxy.two.testMyself;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 11:21  2017/6/22
 * @return
 */
public class  B implements  A{

    @Override
    public void test(String name) {
        System.out.println("name====="+name);
    }

    @Override
    public void test2() {
        System.out.println("hehe");
    }

}
