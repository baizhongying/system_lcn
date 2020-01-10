package com.bai.system.login.login.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class LoginRequest {

    /**
     * 用户名称
     */
    @NotEmpty(message = "{username.not.null}")
    private String username;
    /**
     * 用户密码
     */
    @NotEmpty(message = "{password.not.null}")
    private String password;

}
