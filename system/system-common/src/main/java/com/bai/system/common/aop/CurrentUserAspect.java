package com.bai.system.common.aop;

import com.alibaba.fastjson.JSON;
import com.bai.system.common.entity.CurrentUser;
import com.bai.system.common.entity.UserEnum;
import com.bai.system.common.exception.RequestException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 10:33 2018/11/1
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Aspect
@Component
public class CurrentUserAspect {

    @Before("@annotation(currentUser)")
    public void paramValid(JoinPoint joinPoint, CurrentUser currentUser) throws RequestException {
        //获取目标方法的参数信息
        Object[] obj = joinPoint.getArgs();
        //AOP代理类的信息
        joinPoint.getThis();
        //代理的目标对象
        joinPoint.getTarget();
        //用的最多 通知的签名
        Signature signature = joinPoint.getSignature();
        //代理的是哪一个方法
        System.out.println("==> 代理的是哪一个方法 :" + signature.getName());
        //AOP代理类的名字
        System.out.println("==> AOP代理类的名字:" + signature.getDeclaringTypeName());
        //AOP代理类的类（class）信息
        signature.getDeclaringType();
        //获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        System.out.println("==> 请求者的IP：" + request.getRemoteAddr());
        //请求参数
        Enumeration<String> enumeration = request.getParameterNames();
        Map<String, String> parameterMap = new HashMap<String, String>();
        while (enumeration.hasMoreElements()) {
            String parameter = enumeration.nextElement();
            parameterMap.put(parameter, request.getParameter(parameter));
        }
        String str = JSON.toJSONString(parameterMap);
        if (obj.length > 0) {
            System.out.println("==> 请求的参数信息为：" + str);
        }
        //如果要获取Session信息的话，可以这样写：
        HttpSession session = (HttpSession) requestAttributes.resolveReference(RequestAttributes.REFERENCE_SESSION);
        Object attribute = session.getAttribute(UserEnum.USER_MESSAGE.name());
        if (attribute == null) {
            throw new RequestException("login.information.does.not.exist");
        }
    }
}
