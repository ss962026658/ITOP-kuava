package com.itop.kuava.entity;

public class HttpWrapper<T> {
    public static final int SUCCESS_CODE = 200;
    public static final int ERROR_CODE = 201;
    public static <T> HttpWrapper<T> success(T data){
        HttpWrapper<T> wrapper = new HttpWrapper<>();
        wrapper.code = SUCCESS_CODE;
        wrapper.data = data;
        wrapper.msg = "success";
        return wrapper;
    }

    public static <T> HttpWrapper<T> error(String msg){
        HttpWrapper<T> wrapper = new HttpWrapper<>();
        wrapper.code = ERROR_CODE;
        wrapper.msg = msg;
        return wrapper;
    }

    public static <T> HttpWrapper<T> error(String msg,int code){
        HttpWrapper<T> wrapper = error(msg);
        wrapper.code = code;
        return wrapper;
    }

    private String msg;
    private int code;
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
