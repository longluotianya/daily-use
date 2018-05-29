package com.gouzhijun.spring.aop;

import java.io.Serializable;

import org.springframework.stereotype.Service;

/**
 * Created by gouzhijun
 * on 2018/4/26
 */
@Service("aopService")
public class AopService {
    public void methodA() {
        System.out.println("[AopService] execute method A");
    }

    // 测试execution
    public void methodB(Serializable o) {
        System.out.println("[AopService] execute methodB Serializable args");
    }

    // 测试args
    public void methodC(Object o) {
        System.out.println("[AopService] execute method C Runtime Serializable args");
    }

    public Object returnRuntimePerson(Object person) {
        return person;
    }

    public Person returnStaticPerson(Person person) {
        return person;
    }
}
