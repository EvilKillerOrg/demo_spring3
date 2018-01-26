package com.ek.spring.ch1.model3;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.ek.spring.ch1.model3.service.IUserManagerService;
import com.ek.spring.ch1.model5.service.UserManagerServiceImpl;

public class Main {

	public static void main(String[] args) {
		// 读取配置文件的方法A
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext_ch1.xml");
		Date date = (Date)context.getBean("today"); // 获得配置文件中实例化的对象
		System.out.println("date: "+date);
		
		// 读取配置文件的方法B
		Resource resource1 = new FileSystemResource("target/classes/applicationContext_ch1.xml");
		BeanFactory factory1 = new XmlBeanFactory(resource1);
		Date date1 = (Date)factory1.getBean("today");
		System.out.println("date1: "+date1);
	
		//读取配置文件的方法B 的替代方法
//		BeanFactory factory1 = new ClassPathXmlApplicationContext("applicationContext_ch1.xml");  
//		Date date1 = (Date)factory1.getBean("today");
//		System.out.println("date1: "+date1);
		
		// 读取配置文件的方法C
		ClassPathResource resource2 = new ClassPathResource("applicationContext_ch1.xml"); 
		BeanFactory factory2 = new XmlBeanFactory(resource2);
		Date date2 = (Date)factory2.getBean("today");
		System.out.println("date2: "+date2);
		
		
		
		
		
		// 这样,调用者Main对dao的具体实现依赖就转移到了配置文件中, 但这时Main对UserManagerService的具体实现还是有依赖
		// UserManagerServiceImpl userService = (UserManagerServiceImpl)context.getBean("userService");
		// 再把service改成接口 main调用者对Service的依赖就成了对 接口的依赖了
		// 50行 相当于	IUserManagerService userService = new UserManagerServiceImpl();
		IUserManagerService userService = (IUserManagerService)context.getBean("userService");
		userService.addUserInfo();
	}

}