package org.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *@author liangzaiwei
 *@date 2024年12月30日10:25
 */

@Component
@Aspect
@Slf4j
public class MonitorServiceAop {
    @Around("execution(* org.example.biz.impl..*.*(..))")
    public Object doAroundMethod(ProceedingJoinPoint pig) throws Throwable {
        Object result = null;
        try {
            log.info("MonitorServiceAop active");
            result = pig.proceed();
        } catch (Exception e) {
            throw e;
        }
        return result;
    }
}
