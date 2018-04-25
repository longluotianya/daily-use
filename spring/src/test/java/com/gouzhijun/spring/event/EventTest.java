package com.gouzhijun.spring.event;

import javax.annotation.Resource;

import org.springframework.context.ApplicationEventPublisher;
import org.testng.annotations.Test;

import com.gouzhijun.spring.BaseTestNG;

/**
 * Created by gouzhijun
 * on 2018/4/23
 */
public class EventTest extends BaseTestNG {

    @Resource
    private ApplicationEventPublisher applicationEventPublisher;

    @Test
    public void testEvent() {
        String question = "这是一个问题";
        applicationEventPublisher.publishEvent(new QuestionEvent(question));
    }
}
