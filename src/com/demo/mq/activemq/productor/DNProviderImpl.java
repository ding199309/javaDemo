package com.demo.mq.activemq.productor;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class DNProviderImpl  implements DNProvider{

    private static final String USERNAME= ActiveMQConnection.DEFAULT_USER;
    private static final String PASSWORD=ActiveMQConnection.DEFAULT_PASSWORD;
    private static final String BROKURL=ActiveMQConnection.DEFAULT_BROKER_URL;
    ConnectionFactory connectionFactory;
    Connection  connection;
    Session     session;

    public void init() {
        connectionFactory=new ActiveMQConnectionFactory(USERNAME,PASSWORD,BROKURL);
        try {
            connection=connectionFactory.createConnection();
            connection.start();
            session=connection.createSession(true, Session.SESSION_TRANSACTED);//事务模式
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
    public void sendMessage(String disname) {
        try {
            Queue queue=session.createQueue(disname);

            MessageProducer messageProduce=session.createProducer(queue);

            for(int i=0;i<100;i++){
                TextMessage message=session.createTextMessage(" provider:我是xxxx=内容");
                System.out.println("provider:我是xxxx=内容");
                messageProduce.send(message);
                session.commit();
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }



}