package org.imooc.mall.util;


import cn.hutool.json.JSONUtil;
import org.imooc.mall.common.MallException;
import org.imooc.mall.common.ShopExceptionEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 渲染工具类
 *
 * @author fengshuonan
 * @date 2017-08-25 14:13
 */
public class RenderUtil {

    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSONUtil.toJsonStr(jsonObject));
        } catch (IOException e) {
            throw new MallException(ShopExceptionEnum.WRITE_ERROR);
        }
    }
}
