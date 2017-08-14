package com.demo.designmode.eight.proxy.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:05  2017/6/21
 * @return
 */
public class Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        RealSubject rs=new RealSubject(); //在这里指定被代理类
        InvocationHandler ds=new DynamicSubject(rs);  //初始化代理类

        Class cls=rs.getClass();

//        分解步骤
//        Class c= Proxy.getProxyClass(cls.getClassLoader(),cls.getInterfaces());
//        Constructor ct=c.getConstructor(new Class[]{InvocationHandler.class});
//        Subject subject= (Subject) ct.newInstance(new Object[]{ds});

//         一次性步骤
        Subject subject= (Subject) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),ds);


        subject.request();


    }

}
