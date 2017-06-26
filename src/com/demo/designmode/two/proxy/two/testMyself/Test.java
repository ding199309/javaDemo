package com.demo.designmode.two.proxy.two.testMyself;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 11:24  2017/6/22
 * @return
 */
public class Test {

    public static void main(String[] args) {
        B b=new B();
        Class t=b.getClass();
        InvocationHandler  is=new C(b);

        /* 第一个参数指定哪个 ClassLoader对象来加载我们的代理对象
         * 第二个参数 为代理对象提供的接口是真实对象所实现的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 第三个参数handler， 这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上，这样，当执行下条实际方法调用语句时，
         * 就可以知道委托的是哪个InvocationHandler 了，进程就会自动执行该 InvocationHandler 的 invoke方法
         */

//      A  a= (A) Proxy.newProxyInstance(t.getClassLoader(),t.getInterfaces(),is);
        A  a= (A) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{A.class},new C(b));
        a.test("hehe");
        a.test2();
    }
}
