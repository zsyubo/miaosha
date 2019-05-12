package org.imooc.mall.common.enumconstant;

public enum RecordStatusEnum {
    /**
     *
     */
    NORMAL(1, "正常"),
    DELETE(0, "删除");

    private int status;
    private String msg;


    RecordStatusEnum(int status, String msg) {
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
