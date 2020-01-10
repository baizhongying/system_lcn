package com.bai.system.common.cookie;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 15:26 2018/11/16
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
public class CookieUtil {

    public static String getValue(Cookie[] cookies,String name){
        if (ArrayUtils.isNotEmpty(cookies)&& StringUtils.isNotEmpty(name)) {
            for (Cookie cookie : cookies) {
                if(name.equals(cookie.getName())){
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

}
