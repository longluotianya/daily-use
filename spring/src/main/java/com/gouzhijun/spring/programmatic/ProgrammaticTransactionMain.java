package com.gouzhijun.spring.programmatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 编程式事务的入口
 * Created by gouzhijun
 * on 2018/5/30
 */
public class ProgrammaticTransactionMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
        ProgrammaticService programmaticService = ac.getBean("programmaticService", ProgrammaticService.class);
//        programmaticService.someServiceMethod();
//        programmaticService.someExceptionServiceMethod();
        programmaticService.someExceptionServiceMethod();
    }
}
