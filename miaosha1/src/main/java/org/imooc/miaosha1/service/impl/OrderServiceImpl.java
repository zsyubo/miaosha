package org.imooc.miaosha1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.miaosha1.entity.Order;
import org.imooc.miaosha1.mapper.OrderMapper;
import org.imooc.miaosha1.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表  服务实现类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
