package com.gouzhijun.spring.intergration;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

/**
 * Created by gouzhijun
 * on 2018/8/31
 */
public class SimpleMessageSelector implements MessageSelector {
    @Override
    public boolean accept(Message<?> message) {
        return message.getPayload().equals("foo");
    }
}
