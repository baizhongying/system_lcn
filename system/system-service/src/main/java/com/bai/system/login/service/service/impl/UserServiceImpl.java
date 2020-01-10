package com.bai.system.login.service.service.impl;

import com.bai.system.login.bo.User;
import com.bai.system.login.dao.UserDao;
import com.bai.system.login.login.request.LoginRequest;
import com.bai.system.login.service.service.UserService;
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
public class UserServiceImpl implements UserService {



    @Autowired
    private UserDao userDao;

    @Override
//    @TxTransaction(isStart = false)
    @Transactional
//    @LcnTransaction
    public void createUser(LoginRequest loginRequest) throws Exception {
        User user = new User();
        user.setUserId(System.currentTimeMillis() + "");
        user.setUserName(loginRequest.getPassword());
        user.setPassword(loginRequest.getPassword());
        userDao.insert(user);
    }
}
