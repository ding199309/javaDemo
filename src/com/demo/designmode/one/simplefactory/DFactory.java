package com.demo.designmode.one.simplefactory;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 16:12  2017/6/26
 * @return
 */
public class DFactory {

    private  DFactory(){}

    public  static  A  getProduct(String name){
        if(name==null){
            return null;
        }else if(name.equals("B")){
            return new B();
        }else{
            return  new C();
        }
    }
}
