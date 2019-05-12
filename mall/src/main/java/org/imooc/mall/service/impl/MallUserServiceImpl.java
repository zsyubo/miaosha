package org.imooc.mall.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.mall.common.MallException;
import org.imooc.mall.common.ShopExceptionEnum;
import org.imooc.mall.common.enumconstant.AccountTypeEnum;
import org.imooc.mall.common.enumconstant.RecordStatusEnum;
import org.imooc.mall.entity.MallUser;
import org.imooc.mall.mapper.MallUserMapper;
import org.imooc.mall.service.IMallUserService;
import org.imooc.mall.util.MD5Util;
import org.imooc.mall.vo.request.LoginVo;
import org.imooc.mall.vo.response.MallUserVo;
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
    public MallUserVo login(LoginVo loginVo) {
        // 查询数据库
        LambdaQueryWrapper<MallUser> wrapper = new QueryWrapper<MallUser>().lambda();

        wrapper.eq(MallUser::getUserName, loginVo.getUserName())
                .eq(MallUser::getAccountType, AccountTypeEnum.NORMAL.getStatus())
                .eq(MallUser::getRecordStatus, RecordStatusEnum.NORMAL.getStatus());

        MallUser mallUser = this.getOne(wrapper);
        if (mallUser == null) {
            throw new MallException(ShopExceptionEnum.FAIL_LOGIN);
        }
        String md5Pass = MD5Util.inputPassToDBPass(loginVo.getPassword(), mallUser.getSalt());
        if (!mallUser.getPassword().equals(md5Pass)) {
            throw new MallException(ShopExceptionEnum.FAIL_LOGIN);
        }
        MallUserVo mallUserVo = new MallUserVo();
        BeanUtil.copyProperties(mallUser, mallUserVo);

        return mallUserVo;
    }


}
