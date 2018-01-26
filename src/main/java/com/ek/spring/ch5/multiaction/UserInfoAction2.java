package com.ek.spring.ch5.multiaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


// MultiActionController 相当于 struts1.x 的DispatcherAction 用method=xxx的方式实现 一个action多个方法
public class UserInfoAction2 extends MultiActionController {
	 

	    public ModelAndView retrieveIndex(HttpServletRequest request, HttpServletResponse response) {
	    	//这样配置就可以用到父类的一些方法 可以用来表单数据绑定
	    	//super.initBinder(request, binder);
	    	
	        return new ModelAndView("multi", "date", new Long(System.currentTimeMillis()));
	    }
	 
}