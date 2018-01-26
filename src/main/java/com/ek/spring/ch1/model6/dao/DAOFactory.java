package com.ek.spring.ch1.model6.dao;

public class DAOFactory {
	
	//看配置文件 通过实例工厂实例化 
	public IUserInfoDAO getUserDAO(){
		return new UserInfoDAOImpl();
	}
 
}