package com.ek.spring.ch2.model5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext_ch2.xml");
		Resource  resource = (Resource)context.getBean("resource");
		
		System.out.println(resource.getFilename());
	}

}
