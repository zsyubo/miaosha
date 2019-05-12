package org.imooc.mall.common.auth;


import lombok.extern.slf4j.Slf4j;
import org.imooc.mall.common.ServerResponse;
import org.imooc.mall.common.ShopExceptionEnum;
import org.imooc.mall.config.properties.JwtProperties;
import org.imooc.mall.util.JwtTokenUtil;
import org.imooc.mall.util.RenderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 对客户端请求的token验证过滤器
 *
 * @author fengshuonan
 * @Date 2017/8/24 14:04
 */
@Slf4j
public class AuthFilter extends OncePerRequestFilter {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtProperties jwtProperties;

    private String authToken;
    private static AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 试试
        request.setCharacterEncoding("UTF-8");//只对post提交有效
        System.out.println("请求的URL：" + request.getRequestURL());

        System.err.println("进入过滤器" + request.getServletPath());
        Enumeration enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String paraName = (String) enu.nextElement();
            System.err.println(request.getServletPath() + "参数：" + paraName + ": " + request.getParameter(paraName));
        }
        String path = request.getServletPath();
        final String header = request.getHeader(jwtProperties.getHeader());
        if (AuthFilter.macth(path)) {
            //会被放过的请求
            chain.doFilter(request, response);
            return;
        } else {
            //判断用户的请求头是否有效
            if (!validateToken(header, response)) {
                RenderUtil.renderJson(response, ServerResponse.creatByErrorEnum(ShopExceptionEnum.TOKEN_EXPIRED));
                return;
            }
//            //判断用户是否已登录
//            if(PlayerKit.isLogin(authToken)){
//                log.info("用户已在别处登录");
//                PlayerKit.removePlayer(authToken);
//                RenderUtil.renderJson(response, new ErrorTip(BizExceptionEnum.PlAYER_LOGIN_OTHER_WHERE.getCode(), BizExceptionEnum.PlAYER_LOGIN_OTHER_WHERE.getMessage()));
//            }

            chain.doFilter(request, response);
            return;
        }
    }

    /**
     * token验证
     *
     * @param header
     * @return
     */
    private boolean validateToken(String header, HttpServletResponse response) {
        System.err.println(header);
        String prefix = jwtProperties.getPrefix();
        //判断请求头的内容
        if (ToolUtil.isEmpty(header) || !header.startsWith(prefix)) {
            log.info("请求头异常");
            //RenderUtil.renderJson(response, new ErrorTip(BizExceptionEnum.TOKEN_ERROR.getCode(), BizExceptionEnum.TOKEN_ERROR.getMessage()));
            return false;
        }
        authToken = header.substring(prefix.length());
        log.info("用户的请求头:{}", authToken);
        if (ToolUtil.isEmpty(authToken)) {
            return false;
        }
        //验证token是否过期
        boolean flag = jwtTokenUtil.isTokenExpired(authToken);
        if (flag) {
            log.info("token过期");
            return false;
        }

        //判断token是有实际用户存在
//      sachetPlayer sachetPlayer = PlayerKit.getsachetPlayer(authToken);
//      if(ToolUtil.isEmpty(sachetPlayer)){
//          log.info("token无效");
//          return false;
//      }
        return true;

    }

    /**
     * 请求的过滤
     *
     * @param path
     * @return
     */
    private static boolean macth(String path) {
        for (String patten : CommonProperties.getInstance().notCertification) {
            if (patten.indexOf("*") > 0) {
                if (antPathMatcher.match(patten, path)) {
                    return true;
                }
            } else {
                if (patten.equals(path)) {
                    return true;
                }
            }
        }
        return false;
    }


}