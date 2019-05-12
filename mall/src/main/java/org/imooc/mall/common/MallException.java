package org.imooc.mall.common;

/**
 * 业务异常
 *
 * @author hyf
 * @date 2019-05-12
 **/
public class MallException extends RuntimeException {

    private Integer code;

    private String message;

    public MallException(ServiceExceptionEnum serviceExceptionEnum) {
        this.code = serviceExceptionEnum.getCode();
        this.message = serviceExceptionEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
