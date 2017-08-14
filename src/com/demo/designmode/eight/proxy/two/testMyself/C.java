package com.demo.designmode.eight.proxy.two.testMyself;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 11:23  2017/6/22
 * @return
 */
public class C  implements  InvocationHandler {

    private  Object obj;

    public  C(){}

    public  C(Object obj){
        this.obj=obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

       // method.invoke(obj,args);

        Method sourceMethod = obj.getClass().getDeclaredMethod(method.getName(), method.getParameterTypes());
        sourceMethod.setAccessible(true);
        Object result = sourceMethod.invoke(obj, args);


        return result;
    }


    public static void main(String[] args) {
        A a= (A) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{A.class},new C(new B()));
        a.test("aaa");
        a.test2();
    }
}
