package com.bai.system.common.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 17:54 2018/10/26
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ParamValid {
}
