package com.bai.system.common.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 10:32 2018/11/1
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CurrentUser {
}
