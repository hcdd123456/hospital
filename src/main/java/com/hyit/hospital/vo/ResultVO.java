package com.hyit.hospital.vo;

import java.util.List;

public class ResultVO<T> {

    private String message;

    private Integer status;

    private List<T> Obj;

    private T object;

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ResultVO() {
    }

    public ResultVO(String message, Integer status) {
        this.message = message;
        this.status = status;
    }

    public ResultVO(String message, Integer status, List<T> obj) {
        this.message = message;
        this.status = status;
        Obj = obj;
    }

    public ResultVO(String message, Integer status, T object) {
        this.message = message;
        this.status = status;
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<T> getObj() {
        return Obj;
    }

    public void setObj(List<T> obj) {
        Obj = obj;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String
    toString() {
        return "ResultVO{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", Obj=" + Obj +
                ", object=" + object +
                '}';
    }
}
