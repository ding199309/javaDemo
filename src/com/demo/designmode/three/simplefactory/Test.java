package com.demo.designmode.three.simplefactory;

import javax.sound.midi.Soundbank;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 16:32  2017/6/26
 * @return
 */
public class Test {

    public static void main(String[] args) {
        A a=DFactory.getProduct("B");
        a.msg();
    }
}
