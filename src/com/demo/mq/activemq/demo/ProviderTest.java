package com.demo.mq.activemq.demo;

import com.demo.mq.activemq.productor.DnProductor;
import com.demo.mq.activemq.productor.DnProductorImpl;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/10/31 10:08
 * @parameter
 * @return
 */
public class ProviderTest {

    public static void main(String[] args) {
//        DnProductor  dnProvider=new DnProductorImpl();
//        dnProvider.init();
//        dnProvider.sendMessage("DN-TEST-1");
        DnProductorImpl productor= new DnProductorImpl();
        productor.test("jim");
    }
}