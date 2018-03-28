package com.szhtwl.vo;

import com.szhtwl.enums.ResultEnum;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/27.
 */
public class ResultVO<T> implements Serializable{

    private static final long serialVersionUID = 8655113212986512465L;

    private T data;

    private String code;

    private String msg;

    public ResultVO(T data, String code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
    public ResultVO(T data,ResultEnum resultEnum){
        this.data = data;
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public ResultVO() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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
