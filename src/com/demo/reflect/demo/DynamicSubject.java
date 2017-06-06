package com.demo.reflect.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:24  2017/6/5
 * @return
 */



public class DynamicSubject implements InvocationHandler {

    private Object sub;

    public DynamicSubject(Object obj)
    {
        this.sub = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method:"+ method + ",Args:" + args);
        method.invoke(sub, args);
        return null;
    }
}
