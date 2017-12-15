package com.demo.designmode.test;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        IFamily iFamily=new ChinaFamily();
        IFather iFather=iFamily.getTestFather();
        IMother iMother=iFamily.getTestMother();
        iFather.test();
        iMother.test();
        System.out.println("============");
        IFamily iFamily1=new AmericanFamily();
        IFather iFather1=iFamily1.getTestFather();
        IMother iMother1=iFamily1.getTestMother();
        iFather1.test();
        iMother1.test();

    }
}
