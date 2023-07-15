package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @className: MyMvcConfig
 * @description: MVC 控制器  借助注解完成控制器而不用手动编写
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * MVC 添加首页控制器
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //这里 “/”和“/index.html”效果一样，因为web项目默认页是index.html
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");

        //添加用户主页
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    /**
     * 将国际化组件放入ioc容器中
     *
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
    /**
     * 添加登录拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerIntercepter()).addPathPatterns("/**")
                .excludePathPatterns("/index.html", "/", "/user/login", "/css/**", "/js/**", "/img/**");
    }

}
