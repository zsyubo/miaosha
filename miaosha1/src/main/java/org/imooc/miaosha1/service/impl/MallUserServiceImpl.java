package org.imooc.miaosha1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.miaosha1.entity.MallUser;
import org.imooc.miaosha1.mapper.MallUserMapper;
import org.imooc.miaosha1.service.IMallUserService;
import org.imooc.miaosha1.vo.request.LoginVo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 用户信息表 服务实现类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Service
public class MallUserServiceImpl extends ServiceImpl<MallUserMapper, MallUser> implements IMallUserService {

    @Override
    public void login(LoginVo loginVo) {

    }


}
