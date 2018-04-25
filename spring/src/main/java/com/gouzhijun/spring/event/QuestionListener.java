package com.gouzhijun.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by gouzhijun
 * on 2018/4/23
 */
@Component("questionListener")
public class QuestionListener implements ApplicationListener<QuestionEvent> {

    public void onApplicationEvent(QuestionEvent questionEvent) {
        System.out.println("index question : " + questionEvent.getQuestion());
    }
}
