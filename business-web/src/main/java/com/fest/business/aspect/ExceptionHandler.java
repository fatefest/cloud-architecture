package com.fest.business.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @Author: yesitao
 * @Date: 2019/12/3 16:38
 * @Description: 异常统一处理
 */
@ControllerAdvice
public class ExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

}
