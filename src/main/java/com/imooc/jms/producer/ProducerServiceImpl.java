package com.imooc.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created by Administrator on 2018/12/14.
 */
@Service("producerService")
public class ProducerServiceImpl implements ProducerService{

    @Autowired
    JmsTemplate jmsTemplate;

    @Resource(name="topicDestionation")
    Destination destination;

    public void sendMessage(final String message) {
     //使用JmsTemplate发送消息
    jmsTemplate.send(destination, new MessageCreator() {
         //创建一个消息
        public Message createMessage(Session session) throws JMSException {
            TextMessage textMessage = session.createTextMessage(message);

            return  textMessage;
        }
    });
        System.out.println("发送消息："+message);
    }
}
