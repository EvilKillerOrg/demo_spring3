package com.ek.spring.ch5.multiaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;


// 1. 第一种配置 代理一下Action (这样配置不能绑定表单提交的数据) 
public class UserInfoAction1{
	 

	    public ModelAndView retrieveIndex(HttpServletRequest request, HttpServletResponse response) {

	        return new ModelAndView("multi", "date", new Long(System.currentTimeMillis()));
	    }
	 
}