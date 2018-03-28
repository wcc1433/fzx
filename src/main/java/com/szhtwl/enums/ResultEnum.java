package com.szhtwl.enums;


/**
 * Created by Administrator on 2018/3/27.
 */
public enum ResultEnum {
    HTTP_CODE_SUCCESS("200","OK"),
    HTTP_CODE_BAD("400","Bad Request"),
    HTTP_CODE_NOT_FOUND("404","NOT FOUND"),
    HTTP_CODE_ERROR("500","Internal Server Error"),
    HTTP_CODE_FIND_ERROR("500","服务器查询失败，请求数据不存在或请求参数出错"),
    HTTP_CODE_DELETE_ERROR("500","服务器删除失败，删除数据不存在或请求参数出错"),
    HTTP_CODE_UPDATE_ERROR("500","服务器修改失败，修改数据不存在或请求参数出错"),
    HTTP_CODE_INSERT_ERROR("500","服务器添加失败，请求参数出错"),
    HTTP_CODE_NOT_CONTENT("204","No Content"),
    HTTP_CODE_UNAUTHORIZED("401","Unauthorized"),
    ;
    private String code;

    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    ResultEnum() {
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
