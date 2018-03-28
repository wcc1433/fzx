package com.szhtwl.enums;

/**
 * Created by Administrator on 2018/3/26.
 */
public enum  ExceptionEnum {
    ID_NOT_EXIST("500","此ID不存在"),
    SERVICE_ERROR("500","服务器错误");

    private String code;

    private String msg;

    ExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
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

    @Override
    public String toString() {
        return "code='" + code + '\'' +
                ", msg='" + msg + '\'';
    }
}
