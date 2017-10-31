package com.demo.mq.activemq.consumer;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/10/31 10:03
 * @parameter
 * @return
 */
public interface DnConsumer {

    public void init();


    public void  getMessage(String disname);

}