package com.example.domain.exception;

/********************************************************************************
 *
 * Title: 请求错误
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/1/12
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class RequstException extends  Exception {
    public RequstException(String message) {
        super(message);
    }
    public RequstException(){
        super();
    }
}
