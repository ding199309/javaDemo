package com.demo.conn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class C implements InvocationHandler {

    private  Object object;

    public  C(){

    }
    public  C(Object o){
        object=o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method method1=object.getClass().getDeclaredMethod(method.getName(),method.getParameterTypes());
        method1.setAccessible(true);
        method1.invoke(object,args);

//        method.invoke(object,args);

        return null;
    }
}
