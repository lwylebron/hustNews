package com.lwy.hust.Config;

import com.lwy.hust.interceptor.LoginRequiredInterceptor;
import com.lwy.hust.interceptor.PassportInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class toutiaowebconfig  implements WebMvcConfigurer {
    @Autowired
    private PassportInterceptor passportInterceptor;
    @Autowired
    private LoginRequiredInterceptor loginRequiredInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(passportInterceptor).addPathPatterns("/**");
        registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("/msg/**");
    }
}
