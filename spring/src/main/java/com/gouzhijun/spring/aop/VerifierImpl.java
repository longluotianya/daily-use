package com.gouzhijun.spring.aop;

/**
 * Created by gouzhijun
 * on 2018/4/26
 */
public class VerifierImpl implements IVerifier {
    @Override
    public void validate(Person person) {
        System.out.println("validate person : " + person.getName());
    }
}
