package com.gzouhijun.spring.intergration;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * Created by gouzhijun
 * on 2018/8/31
 */
@ContextConfiguration(value = {"classpath:applicationContext-intergration.xml"})
public class BaseTestNG extends AbstractTestNGSpringContextTests {
}
