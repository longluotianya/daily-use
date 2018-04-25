package com.gouzhijun.spring.aop;

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

    @Test
    public void testAopJ() {
        testBean.testAop();
        System.out.println("testBean class : " + testBean.getClass());
        ITestBean acTestBean = ApplicationContextHolder.getBean("testBean", ITestBean.class);
        System.out.println("ac testBean : " + acTestBean.getClass());
    }

}
