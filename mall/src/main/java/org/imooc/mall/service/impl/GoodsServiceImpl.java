package org.imooc.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.mall.entity.Goods;
import org.imooc.mall.mapper.GoodsMapper;
import org.imooc.mall.service.IGoodsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表  服务实现类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Override
    public Goods getHello() {
        LambdaQueryWrapper<Goods> wrapper = new QueryWrapper<Goods>().lambda();
        wrapper.eq(Goods::getId, 1);
        return this.getOne(wrapper);
    }
}
