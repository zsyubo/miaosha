package org.imooc.mall.entity;

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
 * 商品规格表
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("yh_goods_specification")
public class GoodsSpecification implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品属性(json)
     */
    private String goodsSpecs;

    /**
     * 排序
     */
    private Integer specsSeq;

    /**
     * 库存
     */
    private Integer goodsStock;

    /**
     * 销量
     */
    private Integer salesVolume;

    /**
     * 价格
     */
    private BigDecimal goodsPrice;

    /**
     * 原价格
     */
    private BigDecimal originalPrice;

    /**
     * 店铺id
     */
    private Integer storeId;

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
