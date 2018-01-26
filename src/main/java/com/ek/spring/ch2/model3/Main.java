package com.ek.spring.ch2.model3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ek.spring.ch2.model3.dao.UserInfoDAO;

public class Main {

	public static void main(String[] args) {
		 ApplicationContext cxt = new FileSystemXmlApplicationContext("classpath:applicationContext_ch2.xml");
		 UserInfoDAO userInfoDAO = (UserInfoDAO)cxt.getBean("userdao");
		 System.out.println("userInfoDAO"+userInfoDAO);
		 
		 AbstractApplicationContext abCxt = (AbstractApplicationContext)cxt;
		 abCxt.registerShutdownHook();
	}

}
