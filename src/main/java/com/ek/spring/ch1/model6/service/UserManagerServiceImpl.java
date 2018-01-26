package com.ek.spring.ch1.model6.service;

import com.ek.spring.ch1.model6.dao.IUserInfoDAO;

public class UserManagerServiceImpl implements IUserManagerService{
 
	
	private IUserInfoDAO myUserDaoSer;
	public void setMyUserDaoSer(IUserInfoDAO myUserDaoSer) {
		this.myUserDaoSer = myUserDaoSer;
	}




	@Override
	public void addUserInfo() {
		myUserDaoSer.addUserInfo();
	}
 
	
	
	
	 








}
