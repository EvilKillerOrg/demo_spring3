package com.ek.spring.ch1.vo;

public class UserInfoVO {
	
	public void myInit(){
		System.out.println("myInit ... 初始化方法");
	}
	
	
	private String username;
	private Integer age;
	private boolean sex;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	public void myDestroy(){
		System.out.println("myDestroy ... 销毁方法");
	}
}