package com.gouzhijun.spring.aop;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Created by gouzhijun
 * on 2018/4/25
 */
public class ChineseProxyFactory {
    public static Chinese getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Chinese.class);
        enhancer.setCallback(new AroundAdvice());
        return (Chinese)enhancer.create();
    }

    public static void main(String[] args) {
        Chinese chin = ChineseProxyFactory.getInstance();
        System.out.println(chin.sayHello("孙悟空"));
        chin.eat("西瓜");
        System.out.println(chin.getClass());
    }
}
