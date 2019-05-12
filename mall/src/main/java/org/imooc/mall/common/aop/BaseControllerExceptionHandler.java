package org.imooc.mall.common.aop;

import org.imooc.mall.common.MallException;
import org.imooc.mall.common.ServerResponse;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Order(-1)
public class BaseControllerExceptionHandler {

    /**
     * 拦截参数校验异常
     *
     * @author hyf
     * @date 2019-05-12
     */
    @ExceptionHandler(BindException.class)  // 自拦截BindException
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ServerResponse bindExceptionFount(Exception e) {
        StringBuilder stringBuilder = new StringBuilder();
        BindException bindException = (BindException) e;
        for (ObjectError objectError : bindException.getAllErrors()) { // 获取异常信息
            stringBuilder.append(objectError.getDefaultMessage()).append(" ");// 提取定义的错误信息,并组装返回给前端
        }
        return ServerResponse.creatByErrorCodeMsg(500, stringBuilder.toString());
    }

    /**
     * 拦截业务异常
     */
    @ExceptionHandler(MallException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ServerResponse bussiness(MallException e) {
        return ServerResponse.creatByErrorException(e);
    }
}