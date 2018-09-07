package com.gzouhijun.spring.intergration;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.testng.annotations.Test;

/**
 * Created by gouzhijun
 * on 2018/8/31
 */
public class RouterTest extends BaseTestNG {

    @Resource(name = "routingChannel")
    private MessageChannel routerChannel;

    @Resource(name = "input")
    private MessageChannel inputChannel;

    @Test
    public void testRouter() {
        routerChannel.send(new GenericMessage<Object>("foo"));
    }

    @Test
    public void testFilter1() {
        inputChannel.send(new GenericMessage<Object>("dsad"));
    }

    @Test
    public void testFilter2() {
        inputChannel.send(new GenericMessage<Object>("foo"));
    }

}
