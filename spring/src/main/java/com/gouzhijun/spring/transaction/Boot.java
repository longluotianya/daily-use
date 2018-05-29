package com.gouzhijun.spring.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * transaction启动的类
 * Created by gouzhijun
 * on 2018/5/29
 */
public class Boot {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
        FooService fooService = (FooService) ctx.getBean("fooService");
        try {
            fooService.insertFoo(new Foo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
