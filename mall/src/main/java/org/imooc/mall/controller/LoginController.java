package org.imooc.mall.controller;

import lombok.extern.slf4j.Slf4j;
import org.imooc.mall.common.ServerResponse;
import org.imooc.mall.common.auth.AuthResponse;
import org.imooc.mall.service.IMallUserService;
import org.imooc.mall.util.JwtTokenUtil;
import org.imooc.mall.vo.request.LoginVo;
import org.imooc.mall.vo.response.MallUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * 登录注册实现
 *
 * @author hyf
 * @date 2019-05-12
 **/
@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    IMallUserService mallUserService;

    /**
     * 跳转到登录页面
     *
     * @return java.lang.String
     * @author hyf
     * @date 2019-05-12
     */
    @GetMapping("/no_auth/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/no_auth/error")
    @ResponseBody
    public ServerResponse<String> error() {
        return ServerResponse.creatByErrorMsg("失败");
    }

    /**
     * 登录实现 接口
     *
     * @param loginVo 登录信息
     * @return org.imooc.mall.common.ServerResponse<java.lang.Boolean>
     * @author hyf
     * @date 2019-05-12
     */
    @PostMapping("/no_auth/do_login")
    @ResponseBody
    public ServerResponse<AuthResponse> doLogin(@Valid LoginVo loginVo) {
        log.info(loginVo.toString());
        //登录
        MallUserVo mallUserVo = mallUserService.login(loginVo);
        return this.getLoginResponseData(mallUserVo);
    }

    /**
     * 返回登录信息
     *
     * @param mallUserVo 用户vo
     * @return cn.stylefeng.roses.core.reqres.response.ResponseData
     * @author hyf
     * @date 2019-03-11
     */
    private ServerResponse<AuthResponse> getLoginResponseData(MallUserVo mallUserVo) {
        final String randomKey = jwtTokenUtil.getRandomKey();
        final String token = jwtTokenUtil.generateToken(mallUserVo.getId() + "", randomKey);

        mallUserVo.setId(null);
        return ServerResponse.creatBySuccess(new AuthResponse(token, randomKey, mallUserVo));
    }

}
