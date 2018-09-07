package com.gouzhijun.spring.intergration;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by gouzhijun
 * on 2018/8/31
 */
@Component("routerConsumer")
public class RouterConsumer {
    private static final Logger LOGGER = Logger.getLogger(RouterConsumer.class);

    public void consumer(Object message) {
        LOGGER.info("router consumer message : " + message);
    }


}
