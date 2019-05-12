package org.imooc.miaosha1.common;


public interface ServiceExceptionEnum {
    /**
     * 获取异常编码
     */
    Integer getCode();

    /**
     * 获取异常信息
     */
    String getMessage();

    /**
     * 特定的错误日志
     */
    String getExceptionStr();

}