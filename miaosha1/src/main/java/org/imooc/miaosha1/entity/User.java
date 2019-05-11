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
 * 用户表 用户信息表
 * </p>
 *
 * @author zsyubo
 * @since 2019-05-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("yh_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户uid
     */
    private String uid;

    /**
     * 可用积分
     */
    private BigDecimal integral;

    /**
     * 总积分
     */
    private BigDecimal integralTotal;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 账户类型 0：无，1：微信账户
     */
    private Integer accountType;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 头像url
     */
    private String headSculptureUrl;

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
     * 状态 1正常,0禁用,2:已注销
     */
    private Integer recordStatus;


}
