package com.demo.reflect.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:30  2017/6/5
 * @return
 */
public class Test {

    public static void main(String[] args) {
        RealSubject realSub = new RealSubject();
        InvocationHandler handler = new DynamicSubject(realSub);

        Class c = handler.getClass();

        Subject sub = (Subject)
                Proxy.newProxyInstance(
                    c.getClassLoader(),
                    realSub.getClass().getInterfaces(),
                    handler);

        System.out.println("------------");

        System.out.println("sub.getClass()=="+sub.getClass());

        sub.Request();
    }

}
