package org.imooc.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.imooc.mall.entity.Goods;

/**
 * <p>
 * 商品表  服务类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
public interface IGoodsService extends IService<Goods> {

    Goods getHello();
}
