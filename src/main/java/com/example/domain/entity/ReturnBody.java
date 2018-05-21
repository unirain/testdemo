package com.example.domain.entity;

/********************************************************************************
 *
 * Title: 返回实体
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/1/12
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class ReturnBody {
    private Integer code;
    private String message;
    private String url;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
