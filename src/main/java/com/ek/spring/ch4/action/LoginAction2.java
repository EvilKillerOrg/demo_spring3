package com.ek.spring.ch4.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.BaseCommandController;

import com.ek.spring.ch4.form.LoginForm;


//继承BaseCommandController 这个有表单数据绑定功能  一般用SimpleFormController 在LoginAction3展示
public class LoginAction2 extends BaseCommandController {

	private String success;
	private String login;
	public void setSuccess(String success) {
		this.success = success;
	}
	public void setLogin(String login) {
		this.login = login;
	}


	

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//SimpleFormController 就不需要在这里手动绑定了
		LoginForm loginForm = (LoginForm)super.getCommand(request); //取的绑定的表单对象
		super.bindAndValidate(request, loginForm); //绑定值
		
		if("ek".equals(loginForm.getUsername())&&"123".equals(loginForm.getPassword())){
			
			return new ModelAndView(success);
		}
		
		return new ModelAndView(login);
	}

}