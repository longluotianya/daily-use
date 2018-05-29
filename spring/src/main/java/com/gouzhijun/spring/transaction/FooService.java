package com.gouzhijun.spring.transaction;

/**
 * Spring-data的例子，相应链接地址
 * https://docs.spring.io/spring/docs/5.0.6.RELEASE/spring-framework-reference/data-access.html#spring-data-tier
 * Created by gouzhijun
 * on 2018/5/29
 */
public interface FooService {

    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo) throws MyTransactionException;

    void updateFoo(Foo foo);
}
