package com.gouzhijun.spring.aop;

import java.io.Serializable;

import javax.annotation.Resource;

import org.testng.annotations.Test;

import com.gouzhijun.spring.BaseTestNG;
import com.gouzhijun.spring.spring.ApplicationContextHolder;

/**
 * Created by gouzhijun
 * on 2018/4/24
 */
public class BaseTest extends BaseTestNG {

    @Resource
    private ITestBean testBean;

    @Resource
    private AopService aopService;

    @Resource
    private AopServiceB aopServiceB;

    @Test
    public void testAopJ() {
        testBean.testAop();
        System.out.println("testBean class : " + testBean.getClass());
        ITestBean acTestBean = ApplicationContextHolder.getBean("testBean", ITestBean.class);
        System.out.println("ac testBean : " + acTestBean.getClass());
    }

    @Test
    public void testdAopService() {
        Person person = new Person();
//        aopService.methodA();
        aopService.methodB(person);
//        aopService.methodC(person);
    }

    @Test
    public void testAopBService() {
        System.out.println("aopService B class : " + aopServiceB.getClass());
    }

    @Test
    public void testAdviceParam() {
        Person person = new Person();
        person.setName("gouzhijun");
//        aopService.methodA();
//        aopService.returnRuntimePerson(person);
//        aopService.returnStaticPerson(person);
        aopService.returnRuntimePerson(person);
    }

    @Test
    public void testAroundArgs() {
        String context = "context";
        Person person = new Person();
        person.setName("gouzhijun");
        aopServiceB.methodArgs(context, person, "");
    }

    @Test
    public void testIntruction() {
        Person person = new Person();
        person.setName("gouzhijun");
        if (aopService instanceof IVerifier) {
            IVerifier verifier = (IVerifier) aopService;
            verifier.validate(person);
        }
    }
}
