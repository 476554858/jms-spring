package com.imooc.jms.atguigu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@Service
public class SpringMQ_Consumer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("atguigu-context.xml");
        SpringMQ_Consumer consumer = (SpringMQ_Consumer)ctx.getBean("springMQ_Consumer");
        String msg = (String)consumer.jmsTemplate.receiveAndConvert();
        System.out.println(msg);
    }
}
