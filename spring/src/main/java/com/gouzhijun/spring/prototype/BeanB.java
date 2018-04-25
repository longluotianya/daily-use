package com.gouzhijun.spring.prototype;

/**
 * Created by gouzhijun
 * on 2018/4/19
 */
public class BeanB {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMsg() {
        System.out.println("[BeanB] name = " + name);
    }
}
