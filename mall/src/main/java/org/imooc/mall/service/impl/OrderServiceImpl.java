package org.imooc.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.mall.entity.Order;
import org.imooc.mall.mapper.OrderMapper;
import org.imooc.mall.service.IOrderService;
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
