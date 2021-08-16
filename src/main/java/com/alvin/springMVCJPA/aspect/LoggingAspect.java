package com.alvin.springMVCJPA.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(public * com.alvin.springMVCJPA.controller.AlienController.getAliens())")
    public void logBefore(){
        logger.info("getAliens func is called");
    }

    @AfterReturning("execution(public * com.alvin.springMVCJPA.controller.AlienController.getAliens())")
    public void logAfter(){
        logger.info("getAliens func is executed");
    }
}
