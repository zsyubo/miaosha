package org.imooc.mall.vo.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 用户返回包装类
 *
 * @author hyf
 * @date 2019-05-12
 **/
@Data
public class MallUserVo {

    /**
     * id 主键
     */
    private Integer id;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户uid
     */
    private String uid;

    /**
     * 可用积分
     */
    private BigDecimal integral;

    /**
     * 总积分
     */
    private BigDecimal integralTotal;

    /**
     * 密码
     */
    private String password;


    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 头像url
     */
    private String headSculptureUrl;

}
