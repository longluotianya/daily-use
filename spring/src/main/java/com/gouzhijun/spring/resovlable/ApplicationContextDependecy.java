package com.gouzhijun.spring.resovlable;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * AbstractApplicationContext#prepareBeanFactory中定义registerResolvableDependency
 * 定义
 * Created by gouzhijun
 * on 2018/4/20
 */

@Component(value = "applicationContextDependency")
public class ApplicationContextDependecy {
    @Resource
    private ApplicationContext ac;

    public ApplicationContext getApplicationContext() {
        return ac;
    }
}
