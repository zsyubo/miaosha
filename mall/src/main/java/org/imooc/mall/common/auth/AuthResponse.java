package org.imooc.mall.common.auth;

import org.imooc.mall.vo.response.MallUserVo;

import java.io.Serializable;

/**
 * 认证的响应结果
 *
 * @author fengshuonan
 * @Date 2017/8/24 13:58
 */
public class AuthResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    /**
     * jwt token
     */
    private final String token;

    /**
     * 用于客户端混淆md5加密
     */
    private final String randomKey;

    private MallUserVo mallUserVo;

    public AuthResponse(String token, String randomKey) {
        this.token = token;
        this.randomKey = randomKey;
    }

    public AuthResponse(String token, String randomKey, MallUserVo mallUserVo) {
        this.token = token;
        this.randomKey = randomKey;
        this.mallUserVo = mallUserVo;
    }

    public String getToken() {
        return this.token;
    }

    public String getRandomKey() {
        return randomKey;
    }

    public MallUserVo getMallUserVo() {
        return mallUserVo;
    }

    public void setMallUserVo(MallUserVo mallUserVo) {
        this.mallUserVo = mallUserVo;
    }
}
