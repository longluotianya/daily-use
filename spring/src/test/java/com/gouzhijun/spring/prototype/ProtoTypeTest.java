package com.gouzhijun.spring.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by gouzhijun
 * on 2018/4/20
 */
public class ProtoTypeTest {

    @Test
    public void testEqual() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
        BeanA a1 = ac.getBean("beanA", BeanA.class);
        BeanA a2 = ac.getBean("beanA", BeanA.class);
        System.out.println("a1.beanB == a2.beanB : " + (a1.getBeanB() == a2.getBeanB()));

        BeanB b1 = ac.getBean("beanB", BeanB.class);
        BeanB b2 = ac.getBean("beanB", BeanB.class);
        System.out.println("b1 == b2 : " + (b1 == b2));
    }
}
