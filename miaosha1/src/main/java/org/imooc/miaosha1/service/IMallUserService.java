package org.imooc.miaosha1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.imooc.miaosha1.entity.MallUser;
import org.imooc.miaosha1.vo.request.LoginVo;

/**
 * <p>
 * 用户表 用户信息表 服务类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
public interface IMallUserService extends IService<MallUser> {

    void login(LoginVo loginVo);
}
