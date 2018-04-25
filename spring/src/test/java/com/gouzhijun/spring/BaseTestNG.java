package com.gouzhijun.spring;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * Created by gouzhijun
 * on 2018/4/23
 */
@ContextConfiguration(locations = {"classpath:conf/applicationContext.xml"})
public class BaseTestNG extends AbstractTestNGSpringContextTests {
}
