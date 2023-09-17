package com.yyz.hrms.config;

import com.yyz.hrms.interceptor.LoginRequiredInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.filter.OrderedHiddenHttpMethodFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * LoginRequiredInterceptor
 *
 * @author: YZ.YANG
 * @date: 2023-09-17 13:02
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private LoginRequiredInterceptor loginRequiredInterceptor;


    //配置OrderedHiddenHttpMethodFilter
    @Bean
    public OrderedHiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new OrderedHiddenHttpMethodFilter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginRequiredInterceptor)
                .excludePathPatterns("/**/*.css", "/**/*.js", "/**/*.jpg", "/**/*.png", "/**/*.jpeg" );
    }

}