package com.gouzhijun.spring.intergration;

import org.springframework.core.annotation.Order;
import org.springframework.integration.annotation.Gateway;

/**
 * Created by gouzhijun
 * on 2018/9/3
 */
public interface Cafe {
    @Gateway()
    void placeOrder(Order order);
}
