package com.gouzhijun.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by gouzhijun
 * on 2018/4/26
 */
//@Aspect
//@Component
public class SystemArchitecture {
    @Pointcut("bean(*Service)")
    public void businessService() {}

    @Pointcut("execution(* com..*Service.*(java.io.Serializable))")
    public void businessSerializableExecution() {}

    @Pointcut("args(java.io.Serializable)")
    public void businessSerializableArgs() {}

    @Pointcut("execution(* AopServiceB.methodArgs(..))")
    public void businessArgs() {}

    @Before("businessService()")
    public void beforeService() {
        System.out.println("[SystemArchitecture] before service");
    }

    @AfterReturning(value = "businessService()", returning = "person")
    public void afterService(Person person) {
        System.out.println("[SystemArchitecture] after service, bind person");
        System.out.println("return value : " + person.getName());
    }

    @AfterReturning(value = "businessService()", returning = "retVal")
    public void afterSrevice(JoinPoint jp, Object retVal) {
        System.out.println("[SystemArchitecture] after service, bind object");
        System.out.println("this : " + Arrays.toString(jp.getArgs()));
    }

    @Before("businessSerializableExecution()")
    public void beforeSerializableExecution() {
        System.out.println("[SystemArchitecture] before serializableExecution");
    }

    @Before("businessSerializableArgs()")
    public void beforeSerializableArgs() {
        System.out.println("[SystemArchitecture] before serializableArgs");
    }

    @Around(value = "businessArgs() && args(context, person, context2)")
    public void aroundProceed(ProceedingJoinPoint jp, Person person, String context, String context2) throws Throwable {
        System.out.println("aroundProceed aop");
        System.out.println("context : " + context + " person : " + person);
        jp.proceed();
    }
}
