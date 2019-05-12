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
 * 订单表
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("yh_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 支付类型
     */
    private String payType;

    /**
     * 支付状态
     */
    private Integer payStatus;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 总价格
     */
    private BigDecimal totalPrice;

    /**
     * 商品总价格
     */
    private BigDecimal totalGoodsPrice;

    /**
     * 总运费
     */
    private BigDecimal freightPrice;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 发货时间
     */
    private LocalDateTime deliveryTime;

    /**
     * 订单完成时间
     */
    private LocalDateTime completeTime;

    /**
     * 交易关闭时间
     */
    private LocalDateTime closeTime;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 买家名称
     */
    private String userName;

    /**
     * 留言
     */
    private String message;

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
