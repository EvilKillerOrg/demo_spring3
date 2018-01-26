package com.ek.spring.ch1.model7;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		BeanFactory factory1 = new ClassPathXmlApplicationContext("applicationContext_ch1.xml");
		ComplexObject co = (ComplexObject)factory1.getBean("moreComplexObject");
	
		System.out.println(co.getAdminEmails());
		System.out.println(co.getSomeList());
		System.out.println(co.getSomeMap());
		System.out.println(co.getSomeSet());
	}

}
