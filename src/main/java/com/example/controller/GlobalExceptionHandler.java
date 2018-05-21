package com.example.controller;

import com.example.domain.entity.ReturnBody;
import com.example.domain.exception.RequstException;
import com.example.domain.exception.TestException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/********************************************************************************
 *
 * Title: 全局异常处理
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/1/12
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {RequstException.class,TestException.class})
    @ResponseBody
    public ReturnBody requstException(Exception e,HttpServletRequest request) {
        ReturnBody returnBody = new ReturnBody();
        returnBody.setCode(999);
        returnBody.setMessage(e.getMessage());
        returnBody.setUrl(request.getRequestURI());
        return returnBody;
    }
}
