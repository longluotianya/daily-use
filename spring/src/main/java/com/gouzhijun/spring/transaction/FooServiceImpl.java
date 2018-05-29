package com.gouzhijun.spring.transaction;

import org.springframework.stereotype.Service;

/**
 * FooService implements
 * Created by gouzhijun
 * on 2018/5/29
 */
@Service
public class FooServiceImpl implements FooService {
    @Override
    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Foo getFoo(String fooName, String barName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void insertFoo(Foo foo) throws MyTransactionException {
        throw new MyTransactionException();
    }

    @Override
    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }
}
