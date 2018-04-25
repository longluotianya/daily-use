package com.gouzhijun.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by gouzhijun
 * on 2018/4/24
 */
@Component("testBean")
public class TestBean implements ITestBean {
    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public void testAop() {
        System.out.println("test aop str : " + testStr);
        // 输出this对应的类，为了确认指定的是生成的代理类还是原始类
        System.out.println("this : getClass " + this.getClass());
        innerMethod();
    }

    public void innerMethod() {
        System.out.println("innerMethod class " + this.getClass());
    }
}
