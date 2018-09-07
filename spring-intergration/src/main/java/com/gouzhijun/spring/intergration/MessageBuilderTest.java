package com.gouzhijun.spring.intergration;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

/**
 * Created by gouzhijun
 * on 2018/8/31
 */
public class MessageBuilderTest {
    public static void main(String[] args) {
        Message<String> message1 = MessageBuilder.withPayload("test")
                .setHeader("foo", "bar")
                .build();

        Message<String> message2 = MessageBuilder.fromMessage(message1).build();
        Object result = message2.getHeaders().get("foo");
        System.out.println("result : " + result);

    }
}
