package org.imooc.mall.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerResponse<T> implements Serializable {


    @Getter
    @Setter
    private int code;

    @Getter
    @Setter
    private String msg;

    @Getter
    @Setter
    private T data;


    private ServerResponse() {
    }

    private ServerResponse(int code) {
        this.code = code;
    }

    private ServerResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ServerResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private ServerResponse(int code, T data) {
        this.code = code;
        this.data = data;
    }


    //使之不在Json序列化结果之中 @JsonIgnore
    @JsonIgnore
    public boolean isSuccess() {
        return this.code == ResponseCode.SUCCESS.getCode();
    }


    public static <T> ServerResponse<T> creatBySuccess() {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> creatBySuccessMessage(String msg) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ServerResponse<T> creatBySuccess(T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), data);
    }

    public static <T> ServerResponse<T> creatBySuccess(String msg, T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ServerResponse<T> creatByError() {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode());
    }

    public static <T> ServerResponse<T> creatByErrorMsg(String errorMsg) {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), errorMsg);
    }

    public static <T> ServerResponse<T> creatByErrorCodeMsg(int errorCode, String errorMsg) {
        return new ServerResponse<T>(errorCode, errorMsg);
    }

    public static <T> ServerResponse<T> creatByErrorEnum(ServiceExceptionEnum exceptionEnum) {
        return new ServerResponse<T>(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static <T> ServerResponse<T> creatByErrorException(MallException mmallException) {
        return new ServerResponse<T>(mmallException.getCode(), mmallException.getMessage());
    }
}