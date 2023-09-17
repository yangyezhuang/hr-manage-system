package com.yyz.hrms.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解（用于标记是否登录）
 *
 * @author YZ.YANG
 * @date 2023-09-10 9:53
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface LoginRequired {
}
