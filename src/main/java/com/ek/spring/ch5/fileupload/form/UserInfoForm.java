package com.ek.spring.ch5.fileupload.form;

import java.util.Date;

public class UserInfoForm {
	private String username;
	private String sex;
	private String age;
	private Date birthday;
	private byte[] myfile;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public byte[] getMyfile() {
		return myfile;
	}
	public void setMyfile(byte[] myfile) {
		this.myfile = myfile;
	}
}
