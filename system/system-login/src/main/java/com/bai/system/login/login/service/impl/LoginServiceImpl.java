package com.bai.system.login.login.service.impl;

import com.alibaba.fastjson.JSON;
import com.bai.system.login.bo.User;
import com.bai.system.common.exception.ServiceException;
import com.bai.system.login.dao.UserDao;
import com.bai.system.login.login.clients.service.UserClient;
import com.bai.system.login.login.request.LoginRequest;
import com.bai.system.login.login.response.LoginResponse;
import com.bai.system.login.login.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 9:14 2018/11/2
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserClient userClient;
    @Override
//    @TxTransaction(isStart = true)
    @Transactional()
//    @LcnTransaction
    public LoginResponse loginUp(LoginRequest loginRequest) throws ServiceException {
        User user = userDao.fetchByUserNameAndPassword(loginRequest.getUsername(),loginRequest.getPassword());
        if(!ObjectUtils.allNotNull(user)){
            throw new ServiceException("username.or.password.is.incorrect");
        }
        LoginResponse loginResponse = JSON.parseObject(JSON.toJSONString(user),LoginResponse.class);
        loginResponse.setLoginTime(System.currentTimeMillis());
        log.info("=========================================测试分布式事务 TCN 开始================================================");
        User user1 = new User();
        user1.setUserId(System.currentTimeMillis()+"");
        user1.setUserName("11111111111111");
        user1.setPassword("11111111111111");
        userDao.insert(user1);

//        LoginRequest loginRequest1 = new LoginRequest();
//        loginRequest1.setUsername("22222222222222");
//        loginRequest1.setPassword("22222222222222");
//        userClient.createUser(loginRequest1);

        log.info("=========================================测试分布式事务 TCN 结束================================================");
        return loginResponse;
    }
}
