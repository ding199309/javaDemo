package com.demo.mq.activemq.productor;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/10/31 9:51
 * @parameter
 * @return
 */
public class DnProductorImpl implements  DnProductor {

    private static  final String USERNAME= ActiveMQConnection.DEFAULT_USER;
    private static  final String PASSWORD=ActiveMQConnection.DEFAULT_PASSWORD;
    private static  final String BROKURL=ActiveMQConnection.DEFAULT_BROKER_URL;

    ConnectionFactory connectionFactory;
    Connection connection;
    Session session;

    @Override
    public void init() {
        connectionFactory=new ActiveMQConnectionFactory(USERNAME,PASSWORD,BROKURL);
        try {
            connection=connectionFactory.createConnection();
            connection.start();
            /*事务模式*/
            session=connection.createSession(true,Session.SESSION_TRANSACTED);
        } catch (JMSException e) {
            e.printStackTrace();
        }


    }
    @Override
    public void sendMessage(String disname) {
        try {
            Queue queue=session.createQueue(disname);
            MessageProducer messageProducer=session.createProducer(queue);
            for (int i = 0; i <100 ; i++) {
                    TextMessage message=session.createTextMessage("productor:我是xxxx=内容");
                    messageProducer.send(message);
                    session.commit();
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }


    public   void test(String name){
        connectionFactory= new ActiveMQConnectionFactory(USERNAME,PASSWORD,BROKURL);
        try {
            connection=connectionFactory.createConnection();
            connection.start();
            /*事务模式*/
            session=connection.createSession(true,Session.SESSION_TRANSACTED);
        } catch (JMSException e) {
            e.printStackTrace();
        }

        try {
            Queue queue=session.createQueue(name);
            MessageProducer messageProducer=session.createProducer(queue);
            for (int i = 0; i <100 ; i++) {
                TextMessage message=session.createTextMessage("hehe");
                messageProducer.send(message);
                session.commit();
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }


    }
}
