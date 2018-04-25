package com.gouzhijun.spring.resovlable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by gouzhijun
 * on 2018/4/20
 */
public class ResolvableTest {

    @Test
    public void testResolvableApplicationContext() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
        ApplicationContextDependecy temp = ac.getBean("applicationContextDependency", ApplicationContextDependecy
                .class);
        Assert.assertNotNull(temp.getApplicationContext());
    }
}
