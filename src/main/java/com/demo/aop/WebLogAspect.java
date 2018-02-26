/*
 * #{copyright}#
 */
package com.demo.aop;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 日志.
 *
 * @author chenjingxiong
 */
@Aspect
@Component
public class WebLogAspect {

    @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
    public void webLog() {
    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());

        // 记录下请求内容
        if (logger.isDebugEnabled()) {
            logger.debug("===========Request============");
            logger.debug("URL : " + request.getRequestURL().toString());
            logger.debug("HTTP_METHOD : " + request.getMethod());
            logger.debug("IP : " + request.getRemoteAddr());
            logger.debug("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
            logger.debug("ARGS : " + Arrays.toString(joinPoint.getArgs()));
            logger.debug("===========Request============");
        }

    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(JoinPoint joinPoint, Object ret) throws Throwable {
        // 处理完请求，返回内容
        Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
        if (logger.isDebugEnabled()) {
            logger.debug("===========Response============");
            logger.debug("RESPONSE : " + JSONObject.toJSONString(ret));
            logger.debug("===========Response============");
        }
    }
}
