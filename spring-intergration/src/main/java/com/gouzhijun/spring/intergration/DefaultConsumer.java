package com.gouzhijun.spring.intergration;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by gouzhijun
 * on 2018/8/30
 */
@Component("defaultConsumer")
public class DefaultConsumer {

    private static final Logger LOGGER = Logger.getLogger(DefaultConsumer.class);

    public void consumer(Object message) {
        LOGGER.info("default consumer message : " + message);
    }

}
