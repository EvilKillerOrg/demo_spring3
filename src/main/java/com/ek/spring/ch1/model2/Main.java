package com.ek.spring.ch1.model2;

import com.ek.spring.ch1.model2.dao.UserInfoDAOImpl;
import com.ek.spring.ch1.model2.service.UserManagerService;

public class Main {

	public static void main(String[] arg){
		// 对dao具体实现类的依赖转移到了这里(使用者) 构造方法传递dao实现类
		UserManagerService userService = new UserManagerService(new UserInfoDAOImpl());
		userService.addUserInfo();
	}
}