package com.ek.spring.ch1.model4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ek.spring.ch1.model4.service.IUserManagerService;
import com.ek.spring.ch1.vo.UserInfoVO;

public class Main {
	
	// bean的行为: 
	// bean创建模式 默认是单根模式singleton , scope=prototype每次实例化产生新的实例
	public static void main(String[] args){
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext_ch1.xml");
		UserInfoVO userinfo = (UserInfoVO)context.getBean("userinfo");
		UserInfoVO userinfo2 = (UserInfoVO)context.getBean("userinfo");
		if(userinfo == userinfo2){
			System.out.println("userinfo == userinfo2");
		}else{
			System.out.println("scope=prototype");
		}
		
		
		
		IUserManagerService userService1 = (IUserManagerService)context.getBean("userService1");
		userService1.addUserInfo();
	}
}