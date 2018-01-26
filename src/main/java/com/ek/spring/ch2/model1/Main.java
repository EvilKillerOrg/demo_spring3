package com.ek.spring.ch2.model1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ek.spring.ch2.model1.service.UserInfoService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext_ch2.xml");
		UserInfoService userService = (UserInfoService) context.getBean("userInfoService");
		userService.printLengthOfMyName();
	}

}
