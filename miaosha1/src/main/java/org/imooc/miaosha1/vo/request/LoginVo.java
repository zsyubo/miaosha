package org.imooc.miaosha1.vo.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * 登录vo
 *
 * @author hyf
 * @date 2019-05-12
 **/
@Data
public class LoginVo {

    @NotNull
    private String mobile;

    @NotNull
    @Length(min = 32)
    private String password;
}

