package com.gouzhijun.spring.prototype;

/**
 * Created by gouzhijun
 * on 2018/4/19
 */
public class BeanA {

    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    public void printMsg() {
        System.out.println("[BeanA] beanB:" + beanB);
    }
}
