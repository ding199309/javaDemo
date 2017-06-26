package com.demo.designmode.two.proxy.two;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:00  2017/6/21
 * @return
 */


/**
 * 具体真实类
 */
public class RealSubject implements  Subject {
    @Override
    public void request() {

        System.out.println("this is  真实的");
    }
}
