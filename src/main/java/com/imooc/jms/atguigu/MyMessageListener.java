package com.imooc.jms.atguigu;

import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Component
public class MyMessageListener implements MessageListener{
    public void onMessage(Message message) {
        if(null != message && message instanceof TextMessage){
            TextMessage textMessage = (TextMessage)message;
            try {
                System.out.println(textMessage.getText());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
