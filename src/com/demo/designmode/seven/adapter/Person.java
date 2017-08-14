package com.demo.designmode.seven.adapter;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 9:48  2017/8/11
 * @return
 */
public  class Person {


    private   String name;

    public Person(String name){
        this.name= name;
    }
    public Person(){

    }

    public void test(){
        System.out.println("姓名："+name);
    }
}
