package com.bai.system.login.login.clients.service;

import com.bai.system.common.entity.ResultData;
import com.bai.system.login.login.request.LoginRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 14:08 2018/11/1
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@FeignClient(name = "system-service")
public interface UserClient {


    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    @ResponseBody
    ResultData createUser(LoginRequest loginRequest);

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    @ResponseBody
    ResultData deleteUser(LoginRequest loginRequest);

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    @ResponseBody
    ResultData updateUser(LoginRequest loginRequest);

    @RequestMapping(value = "selects", method = RequestMethod.GET)
    @ResponseBody
    ResultData selectUsers(LoginRequest loginRequest);

    @RequestMapping(value = "select", method = RequestMethod.GET)
    @ResponseBody
    ResultData selectUser(LoginRequest loginRequest);


}
