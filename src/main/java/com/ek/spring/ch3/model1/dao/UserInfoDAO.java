package com.ek.spring.ch3.model1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

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
	
	
	
	
	
	// RowMapper是一个接口 不能直接new 这里是使用了动态的实现这个接口的方式
	// 是类就是动态的继承 接口 抽象类就是动态的实现
	@SuppressWarnings("unchecked")
	public List<UserInfoVO> queryUserList1(){
		String select = " select * from user_info ";
		
		return myJdbcTemplate.query(select , new RowMapper(){
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
					UserInfoVO user = new UserInfoVO();
					user.setUsername(rs.getString("username"));
					user.setSex(rs.getString("sex"));
					user.setBirthday(rs.getString("birthday"));
				return user;
			}
		});
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	public List<UserInfoVO> queryUserList2(){
		String select = " select * from user_info ";
		
		return  (List<UserInfoVO>)myJdbcTemplate.query(select , new ResultSetExtractor(){
			@Override
			public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<UserInfoVO> userList = new ArrayList<UserInfoVO>();
				while(rs.next()){
					UserInfoVO user = new UserInfoVO();
					user.setUsername(rs.getString("username"));
					user.setSex(rs.getString("sex"));
					user.setBirthday(rs.getString("birthday"));
					userList.add(user);
				}
				return userList;
			}
		 
		});
	}
}