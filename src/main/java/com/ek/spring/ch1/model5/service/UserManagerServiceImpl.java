package com.ek.spring.ch1.model5.service;

 
// 这里测试bean的实例化(静态工厂实例化)没有注入任何其他的
public class UserManagerServiceImpl implements IUserManagerService{
	private UserManagerServiceImpl(){
		//System.out.println("还是会再调用这个构造方法 , 即便是私有的构造方法也还是能走!! , 估计是用反射实现的");
	}
	
	
 

	@Override
	public void addUserInfo() {
		System.out.println("test call static factory instance bean.....");
	}
 
	
	
	
	//通过静态方法实例化 , AoC容器不会调用bean的构造方法去实例化  factory-method="myNewInstance"
	public static IUserManagerService myNewInstance(){
		//System.out.println("先走这里...");
		return new UserManagerServiceImpl();
	}









}