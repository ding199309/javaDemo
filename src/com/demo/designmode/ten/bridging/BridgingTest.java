package com.demo.designmode.ten.bridging;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 9:32  2017/8/16
 * @return
 */
public class BridgingTest {


    public static void main(String[] args) {
        Product x=new ProductA();
        x.setMessage(new MessageA());
        x.productTest();
    }
}
