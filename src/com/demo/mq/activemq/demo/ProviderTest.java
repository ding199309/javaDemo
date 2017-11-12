package com.demo.mq.activemq.demo;

import com.demo.mq.activemq.productor.DNProvider;
import com.demo.mq.activemq.productor.DNProviderImpl;

public class ProviderTest {


    public static void main(String[] args) {
        DNProvider dnProvider=new DNProviderImpl();
        dnProvider.init();
        dnProvider.sendMessage("DN-TEST-1");
    }
}