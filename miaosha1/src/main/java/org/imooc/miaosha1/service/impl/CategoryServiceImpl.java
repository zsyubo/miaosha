package org.imooc.miaosha1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.imooc.miaosha1.entity.Category;
import org.imooc.miaosha1.mapper.CategoryMapper;
import org.imooc.miaosha1.service.ICategoryService;
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
