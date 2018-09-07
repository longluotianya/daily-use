package com.gouzhijun.spring.transaction.event;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * Transaction bound event
 * 绑定事务事件
 * Created by gouzhijun
 * on 2018/6/1
 */
@Component
public class MyTransactionListener {

    private static final Logger LOGGER = Logger.getLogger(MyTransactionListener.class);

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void hanldeOrderCreatedEvent(MyTransactionEvent event) {
        LOGGER.info("transactionEventListener start");
//        do transaction event
        LOGGER.info("event : " + event.getName());
//        finish transaction event
        LOGGER.info("transactionEventListener finish");
    }

}
