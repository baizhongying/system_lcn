package com.bai.system.login.login.controller;

import com.alibaba.fastjson.JSON;
import com.bai.system.common.entity.CurrentUser;
import com.bai.system.common.entity.ParamValid;
import com.bai.system.common.entity.ResultData;
import com.bai.system.common.entity.UserEnum;
import com.bai.system.login.login.request.LoginRequest;
import com.bai.system.login.login.response.LoginResponse;
import com.bai.system.login.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.net.URLEncoder;

@Controller
@RequestMapping("login/")
public class LoginController {


    @Autowired
    private LoginService loginService;


    @ParamValid
    @RequestMapping(value = "up", method = RequestMethod.POST)
    @ResponseBody
    public ResultData loginUp(HttpServletRequest request, HttpServletResponse response, @RequestBody @Valid LoginRequest loginRequest, BindingResult bindingResult) throws Exception {

        LoginResponse loginResponse = loginService.loginUp(loginRequest);

        HttpSession session = request.getSession();
        session.setAttribute(UserEnum.USER_MESSAGE.name(), JSON.toJSONString(loginResponse));

        Cookie cookie = new Cookie(UserEnum.USER_MESSAGE.name(), URLEncoder.encode(JSON.toJSONString(loginRequest), "UTF-8"));
        cookie.setMaxAge(-1);
        cookie.setPath("/");
        response.addCookie(cookie);

        ResultData resultData = new ResultData();
        resultData.setStatus("SUCCESS");
        resultData.setData(loginResponse);
        return resultData;
    }


    @CurrentUser
    @ParamValid
    @RequestMapping(value = "down", method = RequestMethod.GET)
    @ResponseBody
    public ResultData loginDown(HttpServletRequest request, HttpServletResponse response, @Valid LoginRequest loginRequest, BindingResult bindingResult) {
        HttpSession session = request.getSession();
        session.removeAttribute(UserEnum.USER_MESSAGE.name());
        ResultData resultData = new ResultData();

        return resultData;
    }


}
