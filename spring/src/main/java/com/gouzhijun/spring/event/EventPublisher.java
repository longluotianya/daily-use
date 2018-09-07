package com.gouzhijun.spring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Created by gouzhijun
 * on 2018/4/23
 */
@Component(value = "eventPublisher")
public class EventPublisher implements ApplicationEventPublisherAware {

    private static ApplicationEventPublisher applicationEventPublisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public static  ApplicationEventPublisher getApplicationEventPublisher() {
        return applicationEventPublisher;
    }
}
