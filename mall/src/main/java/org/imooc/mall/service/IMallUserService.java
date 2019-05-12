package org.imooc.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.imooc.mall.entity.MallUser;
import org.imooc.mall.vo.request.LoginVo;
import org.imooc.mall.vo.response.MallUserVo;

/**
 * <p>
 * 用户表 用户信息表 服务类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
public interface IMallUserService extends IService<MallUser> {

    /**
     * 登录信息校验
     *
     * @param loginVo 登录参数
     * @return org.imooc.mall.vo.response.MallUserVo
     * @author hyf
     * @date 2019-05-12
     */
    MallUserVo login(LoginVo loginVo);
}
