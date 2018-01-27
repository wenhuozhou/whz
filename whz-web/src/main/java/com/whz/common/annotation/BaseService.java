package com.whz.common.annotation;

import java.lang.annotation.*;

/**
 * 初始化继承BaseService的service
 * @author wenhz
 * @date 2018-1-27 下午06:52:29
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseService {
}
