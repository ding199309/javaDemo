package com.demo.mq.activemq.customer;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class DNConsumerImpl  implements DNConsumer{


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

            session=connection.createSession(false, Session.AUTO_ACKNOWLEDGE);//不自动提交，手动提交

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
    public void getMessage(String disname) {
        try {
            Queue queue=session.createQueue(disname);

            MessageConsumer messageConsumer=session.createConsumer(queue);

            while(true){

                TextMessage message=(TextMessage) messageConsumer.receive();

                message.acknowledge();//给生产者应答

                Thread.sleep(1000);

                if(message!=null){
                    System.out.println("consumer：我是消费者，我接收到的内容："
                            +message.getText());
                }else{
                    break;
                }
            }


        } catch (JMSException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }



}