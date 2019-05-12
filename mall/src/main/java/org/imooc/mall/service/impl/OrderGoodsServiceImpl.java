package org.imooc.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.mall.entity.OrderGoods;
import org.imooc.mall.mapper.OrderGoodsMapper;
import org.imooc.mall.service.IOrderGoodsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单商品表  服务实现类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Service
public class OrderGoodsServiceImpl extends ServiceImpl<OrderGoodsMapper, OrderGoods> implements IOrderGoodsService {

}
