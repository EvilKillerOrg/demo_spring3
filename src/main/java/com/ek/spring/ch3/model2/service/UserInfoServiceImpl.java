package com.ek.spring.ch3.model2.service;

import com.ek.spring.ch3.model2.dao.UserInfoDAO;
import com.ek.spring.ch3.vo.UserInfoVO;

public class UserInfoServiceImpl implements IUserInfoService{

	private UserInfoDAO myUserInfoDAO;

	public void setMyUserInfoDAO(UserInfoDAO myUserInfoDAO) {
		this.myUserInfoDAO = myUserInfoDAO;
	}

	@Override
	public void addUser(UserInfoVO... user) {
		for (UserInfoVO userInfoVO : user) {
			myUserInfoDAO.addUser(userInfoVO);
		}
	}
}
