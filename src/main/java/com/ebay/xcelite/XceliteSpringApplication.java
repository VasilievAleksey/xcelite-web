package com.ebay.xcelite;

import com.ebay.xcelite.resolver.RequestXlsBeanMethodArgumentResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@SpringBootApplication
public class XceliteSpringApplication implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new RequestXlsBeanMethodArgumentResolver());
    }

    public static void main(String[] args) {
        SpringApplication.run(XceliteSpringApplication.class, args);
    }

}
