package com.demo.reflect.demo;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:21  2017/6/5
 * @return
 */

//定义真实角色
public class RealSubject implements Subject {

    @Override
    public void Request() {
        System.out.println("=============RealSubject============");
    }
}