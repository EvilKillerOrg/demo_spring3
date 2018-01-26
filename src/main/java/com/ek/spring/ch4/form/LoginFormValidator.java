package com.ek.spring.ch4.form;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginFormValidator implements Validator {
// 用来效验的
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		
		//判断被效验对象和指定对象(LoginForm)是否是一致的
		
		return LoginForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// 一致的话 就可以强制类型装换 传进来的对象
		LoginForm loginForm = (LoginForm)target;
		
		
		if(loginForm.getUsername()==null || "".equals(loginForm.getUsername())){
			errors.rejectValue("username", "username.empty" , "UserName is not empty");
		}
		//ValidationUtils.rejectIfEmpty(errors, "username", "username.empty" , "UserName is not empty"); //与上面的方式是等价的
		
		
		if(loginForm.getPassword()==null || "".equals(loginForm.getPassword())){
			errors.rejectValue("password","password.empty" , "Password is not empty");
		}
		
		
	}
	
	
}