package com.demo.test;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/10/20 10:39
 * @parameter
 * @return
 */
public class Program {

    public static void main(String[] args) {
        TestBean tb=new TestBean();
        tb.setAa("sss");
        ChangeBean(tb);
        System.out.println(tb.getAa());
        ChangeValue(tb);
        System.out.println(tb.getAa());
    }

    public static void ChangeValue(TestBean tb) {
             tb=new TestBean();
            tb.setAa("xxx");
            System.out.println(tb.getAa());
    }
    public static void ChangeBean(TestBean tb) {
            tb=new TestBean();
            tb.setAa("yyy");
        System.out.println(tb.getAa());
    }
}
