package com.gouzhijun.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by gouzhijun
 * on 2018/4/23
 */
public class QuestionEvent extends ApplicationEvent {

    private String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QuestionEvent(String question) {
        super(question);
        this.question = question;
    }

}
