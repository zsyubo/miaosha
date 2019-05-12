package org.imooc.mall.controller;

import lombok.extern.slf4j.Slf4j;
import org.imooc.mall.common.ServerResponse;
import org.imooc.mall.service.IMallUserService;
import org.imooc.mall.vo.request.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    IMallUserService mallUserService;

    /**
     * 跳转到登录页面
     *
     * @return java.lang.String
     * @author hyf
     * @date 2019-05-12
     */
    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/error")
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
    @RequestMapping("/do_login")
    @ResponseBody
    public ServerResponse<Boolean> doLogin(@Valid LoginVo loginVo) {
        log.info(loginVo.toString());
        //登录
        mallUserService.login(loginVo);
        return ServerResponse.creatBySuccess(true);
    }
}
