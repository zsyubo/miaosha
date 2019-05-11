package org.imooc.miaosha1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.imooc.miaosha1.entity.Goods;

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
