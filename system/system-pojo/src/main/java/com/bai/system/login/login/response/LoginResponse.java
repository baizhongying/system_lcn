package com.bai.system.login.login.response;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class LoginResponse {

    /**
     * 用户名称
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;

    /**
     * 登录 时间 UTC
     */
    private Long loginTime;

}
