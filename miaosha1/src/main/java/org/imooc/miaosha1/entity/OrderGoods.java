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
 * 订单商品表
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("yh_order_goods")
public class OrderGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单完成时间
     */
    private LocalDateTime completeTime;

    /**
     * 子订单号
     */
    private String subOrderNo;

    /**
     * 价格
     */
    private BigDecimal countPrice;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 父订单号
     */
    private String parentOrderNo;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 总运费
     */
    private BigDecimal freightPrice;

    /**
     * 发货时间
     */
    private LocalDateTime deliveryTime;

    /**
     * 物流状态
     */
    private Integer shippingStatus;

    /**
     * 物流单号
     */
    private String shippingCode;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 评价
     */
    private String evaluation;

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
