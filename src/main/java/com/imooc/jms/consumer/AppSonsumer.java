package com.imooc.jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/12/15.
 */
public class AppSonsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    }


}
