package com.gouzhijun.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by gouzhijun
 * on 2018/4/26
 */

@Component
@Aspect
public class InductionAspect {

    @DeclareParents(value = "com.gouzhijun.spring.aop.AopService", defaultImpl = VerifierImpl.class)
    public IVerifier verifier;
}
