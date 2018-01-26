package com.ek.spring.ch2.model1.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;
//初始化回调
public class UserInfoService implements InitializingBean {



	
	private String myName; //注入一个值
	public void setMyName(String myName) {
		this.myName = myName;
	}


	//这个方法就是检测需要注入的 是否被注入了
	@Override
	public void afterPropertiesSet() throws Exception {
		//Spring断言
		//Assert.notNull(this.myName); //打印系统错误信息
		Assert.notNull(this.myName, "myName 必须有值!"); //打印自定义错误信息

	}
	
	
	//执行这个如果没有注入myName的话 会NullPointerException
	public void printLengthOfMyName(){
		System.out.println(this.myName.length());
	}

}