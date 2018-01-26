package com.ek.spring.ch1.model2.service;

import com.ek.spring.ch1.model2.dao.IUserInfoDAO;

public class UserManagerService {
	
	private IUserInfoDAO userdao = null;
	
	// 使用者(Main)实例化这个Service的时候 把具体实现类的实例传进来 依赖转移到使用者Main , 
	// 这个时候就可以用spring了 spring就是集中管理这些依赖的 把依赖放在spring配置文件中 ,代码里全是接口
	// 从这个Service的角度来看 是完全没有对具体实现类的依赖 只依赖接口 这就是面向接口
	public UserManagerService(IUserInfoDAO userdao){
		this.userdao = userdao;
	}
	
	
	public void addUserInfo() {
		this.userdao.addUserInfo();
	}

}