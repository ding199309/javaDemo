package com.demo.mq.activemq.demo;

import com.demo.mq.activemq.customer.DNConsumer;
import com.demo.mq.activemq.customer.DNConsumerImpl;

public class ConsumerTest {

    public static void main(String[] args) {
        DNConsumer dnConsumer=new DNConsumerImpl();
        dnConsumer.init();
        dnConsumer.getMessage("DN-TEST-1");
    }

}
