package com.ek.spring.ch2.model3.dao;

import javax.sql.DataSource;

public class UserInfoDAO {
	
	private DataSource dataSource;
	private String username;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
