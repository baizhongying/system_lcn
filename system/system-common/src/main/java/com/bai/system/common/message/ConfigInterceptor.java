//package com.bai.system.common.message;
//
//import com.bai.system.common.interceptor.LanguageInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class ConfigInterceptor implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(this.getLanguageInterceptor());
//    }
//    @Bean
//    public LanguageInterceptor getLanguageInterceptor(){
//        return new LanguageInterceptor();
//    }
//}
//
