package com.bai.system.login.service.service;

import com.bai.system.login.login.request.LoginRequest;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 9:13 2018/11/2
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
public interface UserService {


    void createUser(LoginRequest loginRequest) throws Exception;
}
