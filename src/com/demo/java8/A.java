package com.demo.java8;

import java.util.function.Predicate;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/10/31 16:37
 * @parameter
 * @return
 */
public class A {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;
        boolean test = predicate.test("test");
        System.out.println("字符串长度大于0:" + test);

    }
}
