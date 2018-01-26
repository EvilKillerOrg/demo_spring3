package com.ek.spring.ch3.model2.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ek.spring.ch3.vo.UserInfoVO;

public class UserInfoDAO {
	
	private JdbcTemplate myJdbcTemplate;
	public void setMyJdbcTemplate(JdbcTemplate myJdbcTemplate) {
		this.myJdbcTemplate = myJdbcTemplate;
	}




	public void addUser(UserInfoVO user){
		 // JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource); 这个实例化转移到配置文件 注入进来
		Object[] objs= new Object[]{ user.getUsername() , user.getSex() , user.getBirthday() };
		this.myJdbcTemplate.update("insert into user_info (username , sex , birthday) values (? , ? , ?)", objs);	
	}
	
	
	
	
}