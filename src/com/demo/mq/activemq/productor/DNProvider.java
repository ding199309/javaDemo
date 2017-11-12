package com.demo.mq.activemq.productor;

public interface DNProvider {

    public void init();

    public void  sendMessage(String disname);

}
