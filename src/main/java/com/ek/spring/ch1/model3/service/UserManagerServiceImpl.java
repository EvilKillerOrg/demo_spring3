package com.ek.spring.ch1.model3.service;

import com.ek.spring.ch1.model3.dao.IUserInfoDAO;

public class UserManagerServiceImpl implements IUserManagerService{
	
	private IUserInfoDAO userdao = null;
	
	
	public UserManagerServiceImpl(IUserInfoDAO userdao){
		this.userdao = userdao;
	}


	@Override
	public void addUserInfo() {
		 this.userdao.addUserInfo();
	}
	
	
	

}
