package com.ek.spring.ch1.model4.service;

import com.ek.spring.ch1.model4.dao.IUserInfoDAO;

public class UserManagerServiceImpl implements IUserManagerService{
	// set 注入
	private IUserInfoDAO userdao1 = null;
 
	public void setUserdao1(IUserInfoDAO userdao1) {
		this.userdao1 = userdao1;
	}

	
	
	
	




	public void addUserInfo() {
		 this.userdao1.addUserInfo();
	}
}