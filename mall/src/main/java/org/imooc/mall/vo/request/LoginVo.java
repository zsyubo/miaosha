package org.imooc.mall.vo.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 登录vo
 *
 * @author hyf
 * @date 2019-05-12
 **/
@Data
public class LoginVo {

    @NotEmpty
    private String userName;

    @NotNull
    @Length(min = 5, max = 40)
    private String password;
}

