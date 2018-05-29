package com.gouzhijun.spring.transaction;

/**
 * 用于检测Spring的事务管理默认的回滚是不是只是针对RuntimeException，而checked Exception是不会引起异常的。
 * Created by gouzhijun
 * on 2018/5/29
 */
public class MyTransactionException extends Exception {
}
