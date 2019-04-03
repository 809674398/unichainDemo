package com.unichain.demo.controller.interceptor;

import com.alibaba.fastjson.JSON;
import com.unichain.demo.pojo.error.ErrorCode;
import com.unichain.framework.mvc.annotation.Access;
import com.unichain.framework.mvc.controller.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @program: SessionInterceptor
 * @description: 对请求校验token
 * @author: Chonzi.xiao
 * @create: 2019-04-01 11:16
 **/
@Slf4j
public class SessionInterceptor implements HandlerInterceptor {

    private static final String TOKEN = "Token";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            Access access = method.getAnnotation(Access.class);
            if (access!=null && access.ignoreToken()){
                return true;
            }

            try{
                String token = request.getHeader(TOKEN);
                if (!StringUtils.isBlank(token)){
                    throw new Exception();
                }
                ResponseMessage responseMessage = null;
                // todo 校验用户TOKEN
                if (responseMessage==null || 200!=responseMessage.getStatus()){
                    throw new Exception();
                }else{
                    return true;
                }
            }catch (Exception e){
                response.reset();
                response.reset();
                response.setHeader("Access-Control-Allow-Origin", "*");
                response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
                response.setHeader("Access-Control-Max-Age", "3600");
                response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type");
                response.setHeader("Access-Control-Allow-Credentials", "true");
                response.setContentType("application/json;charset=UTF-8");
                response.addHeader(TOKEN,"-1");
                ServletOutputStream servletOutputStream = response.getOutputStream();
                servletOutputStream.write(JSON.toJSONString(ResponseMessage.error(ErrorCode.TOKEN_EXPIRE.getCode())).getBytes("utf-8"));
                servletOutputStream.flush();
                servletOutputStream.close();
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
