package com.ek.spring.ch1.model5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ek.spring.ch1.model5.service.IUserManagerService;

public class Main {

	
	public static void main(String[] args){
			ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext_ch1.xml");
			IUserManagerService userservice = (IUserManagerService) context.getBean("userService2"); 
			userservice.addUserInfo();
			
			
	}
}
