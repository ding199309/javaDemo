package com.demo.designmode.two.proxy.one;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:06  2017/6/20
 * @return
 */
public class Test {

    public static void main(String[] args) {
        Subject sub=new ProxySubject();
        sub.test();
    }
}
