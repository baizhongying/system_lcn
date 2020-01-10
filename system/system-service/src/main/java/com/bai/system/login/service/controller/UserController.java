package com.bai.system.login.service.controller;

import com.bai.system.common.entity.CurrentUser;
import com.bai.system.common.entity.ParamValid;
import com.bai.system.common.entity.ResultData;
import com.bai.system.login.login.request.LoginRequest;
import com.bai.system.login.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 14:08 2018/11/1
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Controller
@RequestMapping("user/")
public class UserController {

    @Autowired
    private UserService userService;

    @CurrentUser
    @ParamValid
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public @ResponseBody
    ResultData createUser(HttpServletRequest request, HttpServletResponse response, @RequestBody @Valid LoginRequest loginRequest, BindingResult bindingResult) throws Exception {
        ResultData resultData = new ResultData();
        userService.createUser(loginRequest);
        return resultData;
    }

    @CurrentUser
    @ParamValid
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    @ResponseBody
    public ResultData deleteUser(HttpServletRequest request, HttpServletResponse response, @Valid LoginRequest loginRequest, BindingResult bindingResult) {
        ResultData resultData = new ResultData();
        return resultData;
    }

    @CurrentUser
    @ParamValid
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    @ResponseBody
    public ResultData updateUser(HttpServletRequest request, HttpServletResponse response, @Valid LoginRequest loginRequest, BindingResult bindingResult) {
        ResultData resultData = new ResultData();
        return resultData;
    }


    @CurrentUser
    @ParamValid
    @RequestMapping(value = "selects", method = RequestMethod.GET)
    @ResponseBody
    public ResultData selectUsers(HttpServletRequest request, HttpServletResponse response, @Valid LoginRequest loginRequest, BindingResult bindingResult) {
        ResultData resultData = new ResultData();
        return resultData;
    }

    @CurrentUser
    @ParamValid
    @RequestMapping(value = "select", method = RequestMethod.GET)
    @ResponseBody
    public ResultData selectUser(HttpServletRequest request, HttpServletResponse response, @Valid LoginRequest loginRequest, BindingResult bindingResult) {
        ResultData resultData = new ResultData();
        return resultData;
    }


}
