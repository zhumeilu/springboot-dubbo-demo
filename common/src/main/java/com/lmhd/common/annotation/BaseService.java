package com.lmhd.common.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 初始化继承BaseService的service
 * Created LMHD.TEC on 2017/2/11.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface BaseService {
}
