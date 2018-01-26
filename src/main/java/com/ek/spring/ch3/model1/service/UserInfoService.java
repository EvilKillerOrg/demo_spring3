package com.ek.spring.ch3.model1.service;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ek.spring.ch3.model1.dao.UserInfoDAO;
import com.ek.spring.ch3.vo.UserInfoVO;

public class UserInfoService {
	
	
	private TransactionTemplate myTransactionTemplate;
	public void setMyTransactionTemplate(TransactionTemplate myTransactionTemplate) {
		this.myTransactionTemplate = myTransactionTemplate;
	}



	//final 类型必须在定义变量的时候赋值 (set方法不能用了 可以用构造方法传值)
	private  final UserInfoDAO myUserInfoDAO;
		
//	public void setMyUserInfoDAO(UserInfoDAO myUserInfoDAO) {
//			this.myUserInfoDAO = myUserInfoDAO;
//		}
	
	public UserInfoService(UserInfoDAO myUserInfoDAO){
		this.myUserInfoDAO = myUserInfoDAO;
	}
	
	
	
	

	public void addUser1(UserInfoVO user){
		this.myUserInfoDAO.addUser(user);
	}
	
	public List<UserInfoVO> queryUserList1(){
		return this.myUserInfoDAO.queryUserList1();
	}
	
	public List<UserInfoVO> queryUserList2(){
		return this.myUserInfoDAO.queryUserList2();
	}
	
	
	
	
	//测试事务的 (编程式事务) 麻烦而且service对TransactionTemplate形成了依赖
	@SuppressWarnings("unchecked")
	public void addUser2(UserInfoVO... user){
		this.myTransactionTemplate.execute(new TransactionCallback(){
			@Override
			public Object doInTransaction(TransactionStatus status) {
				
				//在外部定义的参数 在内部使用的话 必须定义为final
				for (UserInfoVO userInfoVO : user) {
					myUserInfoDAO.addUser(userInfoVO);
				}
				
				return null;
			}
		});
		
		
	}
}