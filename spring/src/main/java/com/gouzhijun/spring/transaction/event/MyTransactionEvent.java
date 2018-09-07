package com.gouzhijun.spring.transaction.event;

import java.util.EventObject;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义的Event事件
 * Created by gouzhijun
 * on 2018/6/1
 */
public class MyTransactionEvent extends ApplicationEvent {

    private String name;

    public MyTransactionEvent(String name, Object source) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
