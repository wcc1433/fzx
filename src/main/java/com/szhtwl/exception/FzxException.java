package com.szhtwl.exception;

import com.szhtwl.enums.ExceptionEnum;

/**
 * Created by Administrator on 2018/3/26.
 */
public class FzxException extends RuntimeException{
    private String code;

    private String msg;//

    public FzxException() {
        super();
    }

    public FzxException(ExceptionEnum exceptionEnum){
        super(exceptionEnum.getMsg());
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
