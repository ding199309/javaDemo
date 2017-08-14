package com.demo.designmode.seven.adapter;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 9:50  2017/8/11
 * @return
 */
public class AtestAdapter extends Person {

    protected  Person person;

    public void  Decorate(Person person){

        this.person=person;
    }

    public void  test(){
        if(person!=null){
            person.test();
        }
    }
}
