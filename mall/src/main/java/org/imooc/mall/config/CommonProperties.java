package org.imooc.mall.config;

import java.util.ArrayList;
import java.util.List;

public class CommonProperties {

    /**
     * 无需登录就可以访问的网址
     *
     * @author hyf
     * @date 2018-07-10
     */
    public List<String> notCertification = new ArrayList<String>();

    {
        notCertification.add("/validateToken/*");
        notCertification.add("/upload/img");
        notCertification.add("/login/*");
        // 首页
        notCertification.add("/home/*");
        // 商品
        notCertification.add("/goods/goods_detail");
        notCertification.add("/goods/list");
        // 用户
        notCertification.add("/player/*");

        notCertification.add("/common/*");

        // 支付回调接口
        notCertification.add("/pay/allinpay_wx_notify");
        notCertification.add("/order/tttttttt");

        // 分类
        notCertification.add("/category/*");
        // 非必须授权 路径过滤
        notCertification.add("/*/no_auth/*");
    }


    private static CommonProperties commonProperties = new CommonProperties();

    private CommonProperties() {

    }

    public static CommonProperties getInstance() {
        return commonProperties;
    }


}
