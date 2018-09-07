package com.gouzhijun.spring.transaction.declarative;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.gouzhijun.spring.event.EventPublisher;
import com.gouzhijun.spring.spring.ApplicationContextHolder;
import com.gouzhijun.spring.transaction.event.MyTransactionEvent;

/**
 * FooService implements
 * Created by gouzhijun
 * on 2018/5/29
 */
@Service("fooService")
public class FooServiceImpl implements FooService {

    private static final Logger LOGGER = Logger.getLogger(FooServiceImpl.class);

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
        LOGGER.info("[fooService] start insert foo");
        ApplicationEventPublisher eventPublisher = EventPublisher.getApplicationEventPublisher();
        if (null != eventPublisher) {
            eventPublisher.publishEvent(new MyTransactionEvent("gouzhijun", this));
        }
        FooService fooService = ApplicationContextHolder.getBean("fooService", FooService.class);
        fooService.deleteFoo(foo);
        LOGGER.info("[fooServive] finish insert foo");
    }

    @Override
    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteFoo(Foo foo) {
        LOGGER.info("[fooService] deleteFoo");
    }
}
