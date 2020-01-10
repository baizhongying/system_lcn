package com.bai.system.login.login.service;

import com.bai.system.common.exception.ServiceException;
import com.bai.system.login.login.request.LoginRequest;
import com.bai.system.login.login.response.LoginResponse;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 9:12 2018/11/2
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
public interface LoginService {


    /**
     * 用户登录
     *
     * @param loginRequest
     * @return
     */
    LoginResponse loginUp(LoginRequest loginRequest) throws ServiceException;

}
