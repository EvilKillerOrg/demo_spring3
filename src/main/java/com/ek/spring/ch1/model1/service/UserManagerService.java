package com.ek.spring.ch1.model1.service;

import com.ek.spring.ch1.model1.dao.UserInfoDAO;

public class UserManagerService {

	private UserInfoDAO userDAO = new UserInfoDAO();
	
	
	public void addUserInfo(){
		this.userDAO.addUserInfo();
	}
	
}
