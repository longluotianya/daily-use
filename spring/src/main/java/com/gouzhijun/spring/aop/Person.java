package com.gouzhijun.spring.aop;

import java.io.Serializable;

import org.springframework.aop.framework.AopContext;

/**
 * Created by gouzhijun
 * on 2018/4/26
 */
public class Person implements Serializable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        AopContext.currentProxy();
    }
}
