package com.demo.mq.activemq.demo;

import com.demo.mq.activemq.consumer.DnConsumer;
import com.demo.mq.activemq.consumer.DnConsumerImpl;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/10/31 10:07
 * @parameter
 * @return
 */
public class ConsumerTest {

    public static void main(String[] args) {
//        DnConsumer dnConsumer=new DnConsumerImpl();
//        dnConsumer.init();
//        dnConsumer.getMessage("DN-TEST-1");

        DnConsumerImpl dnConsumer = new DnConsumerImpl();
        dnConsumer.test("jim");
    }

}