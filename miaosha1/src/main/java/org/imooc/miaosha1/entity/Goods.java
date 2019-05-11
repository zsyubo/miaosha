package org.imooc.miaosha1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("yh_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类id
     */
    private Integer categoryId;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品主图
     */
    private String mainImage;

    /**
     * 商品详情
     */
    private String detail;

    /**
     * 属性列表(json)
     */
    private String attributeList;

    /**
     * 价格范围(~)
     */
    private String priceRange;

    /**
     * 总库存量
     */
    private Integer stock;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 最小价格
     */
    private BigDecimal minPrice;

    /**
     * 最大价格
     */
    private BigDecimal maxPrice;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 乐观锁
     */
    @TableField("REVISION")
    private Integer revision;

    /**
     * 创建人
     */
    @TableField("CREATED_BY")
    private Integer createdBy;

    /**
     * 创建时间
     */
    @TableField("CREATED_TIME")
    private LocalDateTime createdTime;

    /**
     * 更新人
     */
    @TableField("UPDATED_BY")
    private Integer updatedBy;

    /**
     * 更新时间
     */
    @TableField("UPDATED_TIME")
    private LocalDateTime updatedTime;

    /**
     * 数据状态
     */
    private Integer recordStatus;


}
