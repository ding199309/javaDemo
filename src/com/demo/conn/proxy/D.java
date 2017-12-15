package com.demo.conn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class D {

    private InvocationHandler invocationHandler;

    public static void main(String[] args) {

        B b=new B();
        InvocationHandler i=new C(b);
        A a= (A) Proxy.newProxyInstance(D.class.getClassLoader(),new B().getClass().getInterfaces(),i);
        a.call();
    }
}
