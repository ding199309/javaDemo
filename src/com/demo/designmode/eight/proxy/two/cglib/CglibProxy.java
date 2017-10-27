package com.demo.designmode.eight.proxy.two.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/9/4 11:25
 * @parameter
 * @return
 */
public class CglibProxy  implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("===开始");
        Object o1=methodProxy.invokeSuper(o,objects);
        System.out.println("===结束");
        return o1;
    }
}
