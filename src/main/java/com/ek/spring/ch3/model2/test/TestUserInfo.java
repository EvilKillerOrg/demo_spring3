package com.ek.spring.ch3.model2.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ek.spring.ch3.model2.service.IUserInfoService;
import com.ek.spring.ch3.vo.UserInfoVO;

/**
 * 继承这个类不带事务 AbstractJUnit4SpringContextTests
 * 这个带事务 AbstractTransactionalJUnit4SpringContextTests
 */

@RunWith(SpringJUnit4ClassRunner.class) //让测试运行于Spring测试环境 , 使用Spring-Test框架
//@WebAppConfiguration //表明该类会使用web应用程序的默认根目录来载入ApplicationContext需要更改这个更目录可以修改该注释的value值
@ContextConfiguration(locations="classpath:applicationContext_ch3_2.xml") //加载配置文件
public class TestUserInfo extends AbstractTransactionalJUnit4SpringContextTests {
	
	 @Resource (name="userInfoServiceImpl") //自动把下面的实例注入到这个测试方法 , 默认ByName( name id )  
	 private IUserInfoService userInfoServiceImpl;
	 
	 
	//测试事务(声明事务)
	 @Transactional //标注这里需使用事务  (注意配置文件中要配置事务实现)
	 @Rollback(false) //是否回滚 这个回滚是指测试之后把数据库回滚到测试之前的状态 true是回滚
	 @Test
	 public void testAddUser(){
		 UserInfoVO[] users = new UserInfoVO[2];
		 UserInfoVO user1 = new UserInfoVO();
		 UserInfoVO user2 = new UserInfoVO();
		 
		 user1.setUsername("ek1");
		 user1.setSex("1");
		 user1.setBirthday("2000-01-01");
		 
		 user2.setUsername("ek2");
		 user2.setSex("000001"); //数据库字段长度为1 让这里插不进去
		 user2.setBirthday("1999-09-09");
		 
		 users[0]= user1;
		 users[1]= user2;
		 
		 this.userInfoServiceImpl.addUser(users);
	 }
	 
}