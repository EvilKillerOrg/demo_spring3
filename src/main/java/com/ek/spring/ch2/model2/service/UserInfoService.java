package com.ek.spring.ch2.model2.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

//实现BeanFactoryAware接口 可以获得 配置文件中实例化的bean

public class UserInfoService implements BeanFactoryAware {

	private BeanFactory beanFactory;
	
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.println(this.beanFactory);
	}


 
	
 


	 

}