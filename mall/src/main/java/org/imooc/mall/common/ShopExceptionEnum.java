package org.imooc.mall.common;

public enum ShopExceptionEnum implements ServiceExceptionEnum {

    /**
     *
     */
    FIELD_CHECK_FAILED(114, "参数校验失败"),

    /**
     * 登录
     */
    NOT_LOGIN(100, "请登录在访问"),
    FAIL_LOGIN(101, "登录失败,用户名不存在或密码错误"),


    /**
     * 秒杀商品
     */
    SKILL_GOODS_NOT_EXIST(120, "秒杀商品不存在"),
    SKILL_GOODS_INVENTORY_SHORTAGE(121, "秒杀商品库存不足"),
    SKILL_GOODS_NOT_START(122, "秒杀还未开始"),
    SKILL_GOODS_IS_END(123, "秒杀已经结束"),

    /**
     * 商品
     */
    GOODS_NOT_EXIST(130, "商品不存在"),

    /**
     * 文件上传
     */
    FILE_READING_ERROR(400, "FILE_READING_ERROR!"),
    FILE_NOT_FOUND(400, "FILE_NOT_FOUND!"),

    /**
     * 错误的请求
     */
    REQUEST_NULL(400, "请求有错误"),
    SERVER_ERROR(500, "服务器异常"),
    /**
     * 登录token异常, 700
     */
    TOKEN_EXPIRED(501, "授权过期或请求头无携带授权信息"),
    SIGN_ERROR(502, "签名验证失败")
    /**
     * 其他
     */
    , WRITE_ERROR(503, "渲染界面错误"), ENCRYPT_ERROR(504, "加解密错误");


    private Integer code;
    private String message;

    ShopExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
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

    @Override
    public String getExceptionStr() {
        return "";
    }
}
