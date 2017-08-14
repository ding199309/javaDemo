package com.demo.designmode.seven.adapter;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 9:56  2017/8/11
 * @return
 */
public class AdapterTest {

    public static void main(String[] args) {
        Person person=new Person("jim");

        M m=new M();
        N n=new N();

        //装饰
        m.Decorate(person);
        n.Decorate(m);

        n.test();
    }
}
