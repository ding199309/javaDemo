package com.demo.designmode.two.proxy.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:01  2017/6/21
 * @return
 */
public class DynamicSubject implements InvocationHandler{

    private Object sub;
    public  DynamicSubject(){

    }
    public DynamicSubject(Object sub){

        this.sub=sub;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("----before-----");
        method.invoke(sub,args);
        System.out.println("----after-----");
        return null;
    }
}
