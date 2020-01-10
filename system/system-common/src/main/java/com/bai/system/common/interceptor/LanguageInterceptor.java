package com.bai.system.common.interceptor;

import com.bai.system.common.cookie.CookieUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

import static com.bai.system.common.staticfinal.CommonStaticFinal.LANGUAGE;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 15:16 2018/11/16
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Component
public class LanguageInterceptor implements HandlerInterceptor {

    @Autowired
    private LocaleResolver localeResolver;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies = request.getCookies();
        String value = CookieUtil.getValue(cookies,LANGUAGE);
        if(StringUtils.isNotEmpty(value)){
            localeResolver.setLocale(request, response,new Locale(value));
        }
        localeResolver.setLocale(request, response,request.getLocale());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
