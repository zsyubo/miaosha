package org.imooc.miaosha1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.miaosha1.entity.User;
import org.imooc.miaosha1.mapper.UserMapper;
import org.imooc.miaosha1.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
