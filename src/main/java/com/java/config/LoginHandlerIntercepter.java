package com.java.config;
import com.java.pojo.MyUser;
import com.java.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerIntercepter implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取登录用户的session
        Object loginUser = request.getSession().getAttribute("loginUser");
        //session不存在，即用户尚未登录
        if (loginUser == null) {
            request.setAttribute("msg", "请先登录");
            //返回首页
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        }else {
            return true;
        }
    }
}
