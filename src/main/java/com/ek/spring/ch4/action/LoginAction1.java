package com.ek.spring.ch4.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


//继承 Controller(顶级接口) 的例子
public class LoginAction1 implements Controller {

	//在配置文件注入页面
	private String success;
	private String login;
	public void setSuccess(String success) {
		this.success = success;
	}
	public void setLogin(String login) {
		this.login = login;
	}


	//这个相当于action的execute
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if("ek".equals(username)&&"123".equals(password)){
			//return new ModelAndView("/WEB-INF/jsp/success.jsp");  //页面在配置文件注入
			return new ModelAndView(success);
		}
		//return new ModelAndView("/WEB-INF/jsp/login.jsp");
		return new ModelAndView(login);
	}
	
 
}