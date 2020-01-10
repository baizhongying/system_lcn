package com.bai.system.common.aop;

import com.alibaba.fastjson.JSON;
import com.bai.system.common.entity.ParamValid;
import com.bai.system.common.exception.RequestException;
import org.apache.commons.collections.CollectionUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 17:39 2018/10/26
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Aspect
@Component
public class ParamValidAspect {

    @Before("@annotation(paramValid)")
    public void paramValid(JoinPoint point, ParamValid paramValid) throws RequestException {
        Object[] paramObj = point.getArgs();
        if (paramObj.length > 0) {
            for (int i = 0; i < paramObj.length; i++) {
                if (paramObj[i] instanceof BindingResult) {
                    BindingResult result = (BindingResult) paramObj[i];
                    if (result.hasErrors()) {
                        List<ObjectError> allErrors = result.getAllErrors();
                        if (CollectionUtils.isNotEmpty(allErrors)) {
                            throw new RequestException(JSON.toJSONString(allErrors));
                        }
                    }
                }
            }
        }
    }

}
