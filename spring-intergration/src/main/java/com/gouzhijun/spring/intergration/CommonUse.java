package com.gouzhijun.spring.intergration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

import com.google.common.collect.Lists;

/**
 * Created by gouzhijun
 * on 2018/8/30
 */
public class CommonUse {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-intergration.xml");
        MessageChannel channel = ctx.getBean("numberChannel", MessageChannel.class);
        channel.send(new GenericMessage<String>("4"));
    }
}
