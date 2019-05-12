package org.imooc.mall.common.enumconstant;

/**
 * 账户类型
 *
 * @author hyf
 * @date 2019-05-12
 **/
public enum AccountTypeEnum {

    /**
     *
     */
    NORMAL(0, "普通"),
    WeChat(1, "微信"),
    AliPay(2, "支付宝");

    private int status;
    private String msg;


    AccountTypeEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
