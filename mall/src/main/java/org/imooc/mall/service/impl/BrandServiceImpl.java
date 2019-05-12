package org.imooc.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.mall.entity.Brand;
import org.imooc.mall.mapper.BrandMapper;
import org.imooc.mall.service.IBrandService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品品牌表  服务实现类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
