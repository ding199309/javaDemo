package com.demo.designmode.ten.bridging;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 9:29  2017/8/16
 * @return
 */
public class ProductB extends  Product {

    @Override
    public  void productTest(){
        if(message!=null){
            System.out.println("this is productB");
            message.messageTest();
        }
    }
}
