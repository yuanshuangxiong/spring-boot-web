package com.yuan.config;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

@Configuration
public class MyMVCConfig implements WebMvcConfigurer {
//    //自定义视图解析器
//    @Bean
//    public ViewResolver myViewSolver(){
//        return new MyViewResolver();
//    }
//
//    //自定义视图解析器
//    public static class MyViewResolver implements  ViewResolver{
//        @Override
//        public View resolveViewName(String s, Locale locale) throws Exception {
//            return null;
//        }
//    }
//
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index.html").setViewName("index");//当访问kuang的时候会访问test页面
    }
}
