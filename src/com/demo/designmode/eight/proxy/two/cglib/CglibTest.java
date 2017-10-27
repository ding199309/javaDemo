package com.demo.designmode.eight.proxy.two.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/9/4 11:32
 * @parameter
 * @return
 */
public class CglibTest {

    public static void main(String[] args) {
        CglibProxy cglibProxy=new CglibProxy();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(cglibProxy);

        UserService o= (UserService) enhancer.create();
        o.getName(1);
//        o.getAge(1);
    }
}
