package com.java.config;


import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @className: MyLocalResolver
 * @description: 国际化解析器配置类
 */
public class MyLocaleResolver implements LocaleResolver {
    /**
     * 解析请求
     *
     * @param httpServletRequest
     * @return
     */
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的语言参数
        String language = request.getParameter("language");
        //如果没有就使用默认的
        Locale locale = Locale.getDefault();
        //请求链接携带了国际化参数
        if (!StringUtils.isEmpty(language)) {
            //格式：zh_CN
            String[] splits = language.split("_");
            //国家 地区
            locale = new Locale(splits[0], splits[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
