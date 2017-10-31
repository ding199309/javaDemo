package com.demo.mq.activemq.productor;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/10/31 9:50
 * @parameter
 * @return
 */
public interface DnProductor {


    public  void init();

    public void  sendMessage(String disname);
}
