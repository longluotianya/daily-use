package com.gouzhijun.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by gouzhijun
 * on 2018/4/26
 */
@Service("aopServiceB")
public class AopServiceB {

    public void methodA(Object o1, Object o2) {
        System.out.println("[AopServiceB] execute methodA");
    }

    public void methodArgs(String context, Person person, String context2) {
        System.out.println("[AopServiceB] context : " + context + " person : " + person);
    }

}
