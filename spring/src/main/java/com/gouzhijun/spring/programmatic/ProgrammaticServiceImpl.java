package com.gouzhijun.spring.programmatic;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.gouzhijun.spring.transaction.declarative.Foo;
import com.gouzhijun.spring.transaction.declarative.FooService;

/**
 * Programmatic ServiceImpl
 * Created by gouzhijun
 * on 2018/5/30
 */
public class ProgrammaticServiceImpl implements ProgrammaticService {

    private static final Logger LOGGER = Logger.getLogger(ProgrammaticServiceImpl.class);

    @Resource(name = "fooService")
    private FooService fooService;


    private final TransactionTemplate transactionTemplate;

    public ProgrammaticServiceImpl(PlatformTransactionManager transactionManager) {
        this.transactionTemplate = new TransactionTemplate(transactionManager);
    }

    @Override
    public void someServiceMethod() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                commonInnerMethod();
            }
        });
    }

    @Override
    public void someExceptionServiceMethod() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                try {
                    transactionStatus.setRollbackOnly();
//                    exceptionInnerMethod();
                    fooService.updateFoo(new Foo());
                } catch (Exception e) {
                    LOGGER.error("", e);
                }
            }
        });
    }

    private void commonInnerMethod() {
        LOGGER.info("execute common inner method");
    }

    private void exceptionInnerMethod() {
        throw new RuntimeException("this is a inner method exception");
    }
}
