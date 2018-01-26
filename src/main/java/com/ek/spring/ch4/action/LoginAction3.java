package com.ek.spring.ch4.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.ek.spring.ch4.form.LoginForm;


//SimpleFormController 间接继承 BaseCommandController
public class LoginAction3 extends SimpleFormController {
	
 
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
		 
		//SimpleFormController 就不需要在这里手动绑定了 直接转换command就可以了 ( 看看配置文件 )
		LoginForm loginForm = (LoginForm)command;
		
		if("ek".equals(loginForm.getUsername())&&"123".equals(loginForm.getPassword())){
			
			return new ModelAndView(super.getSuccessView());
		}
		
		return new ModelAndView(super.getFormView());
	}

}