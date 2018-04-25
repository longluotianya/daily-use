package com.gouzhijun.spring.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by gouzhijun
 * on 2018/4/25
 */
@Component
public class ApplicationContextHolder implements ApplicationContextAware {
    private static ApplicationContext ac;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ac = applicationContext;
    }

    public static <T> T getBean(String beanName, Class<T> clazz) {
        return  ac.getBean(beanName, clazz);
    }
}
