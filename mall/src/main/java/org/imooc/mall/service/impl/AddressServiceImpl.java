package org.imooc.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.mall.entity.Address;
import org.imooc.mall.mapper.AddressMapper;
import org.imooc.mall.service.IAddressService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 收货地址表  服务实现类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
