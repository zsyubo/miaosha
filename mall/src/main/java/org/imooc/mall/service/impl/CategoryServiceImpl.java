package org.imooc.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.mall.entity.Category;
import org.imooc.mall.mapper.CategoryMapper;
import org.imooc.mall.service.ICategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类表  服务实现类
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
