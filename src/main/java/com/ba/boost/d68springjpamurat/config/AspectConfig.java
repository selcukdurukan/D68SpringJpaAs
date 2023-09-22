package com.ba.boost.d68springjpamurat.config;

import com.ba.boost.d68springjpamurat.exception.GlobalException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ResponseStatusException;

@Aspect
@Configuration
public class AspectConfig {

    private final Logger logger = LoggerFactory.getLogger(AspectConfig.class);

    @Around(value = "execution(* com.ba.boost.d68springjpamurat.service.impl.*.*(..))")
    public Object taskHandler(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();

        try {
            Object obj = joinPoint.proceed();
            long timeTaken = System.currentTimeMillis() - startTime;
            logger.info("Time taken by {} is {}", joinPoint, timeTaken);
            return obj;
        } catch (GlobalException e) {
            logger.error("Exception Message {}", e.getMessage());
            logger.error("Exception status {}", e.getStatus());
            throw new ResponseStatusException(e.getStatus(), e.getMessage());
        }
    }
}
