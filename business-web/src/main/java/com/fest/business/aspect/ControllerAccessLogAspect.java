package com.fest.business.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.fest.common.util.RequestUtil.getIpAddress;

/**
 * @Author: yesitao
 * @Date: 2019/12/3 15:48
 * @Description: 访问日志
 */
@Aspect
@Component
public class ControllerAccessLogAspect {

    private final static Logger logger = LoggerFactory.getLogger(ControllerAccessLogAspect.class);

    @Around(value = "execution(* com.fest.*.controller..*.*(..))")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {

        long startTime = System.currentTimeMillis();
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        // 日志记录
        log(pjp, request);

        // exec
        Object result = pjp.proceed();

        // 统计时间
        long totalTime = System.currentTimeMillis() - startTime;
        logger.info("[{}] totalTime : {}ms", request.getServletPath(), totalTime);

        return result;
    }

    /**
     * 记录日志
     *
     * @param pjp
     * @param request
     */
    private void log(ProceedingJoinPoint pjp, HttpServletRequest request) {

        Object[] args = pjp.getArgs();

        List<Object> argList = Arrays.stream(args)
                .filter(arg -> !(arg instanceof HttpServletRequest) && !(arg instanceof HttpServletResponse))
                .collect(Collectors.toList());

        if (CollectionUtils.isEmpty(argList)) {
            logger.info(Stream.of(request.getMethod().toUpperCase(), request.getServletPath(), getIpAddress(request)).collect(Collectors.joining(" ")));
        } else {
            logger.info(Stream.of(request.getMethod().toUpperCase(), request.getServletPath(), getIpAddress(request), JSON.toJSONString(argList)).collect(Collectors.joining(" ")));
        }

    }
}
