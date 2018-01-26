package com.ek.spring.ch2.model4;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
// 国际化
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext_ch2.xml");
		// 第一个参数  资源文件key值 , 第二个占位符 , 第三个默认信息 , 第四个本地的
		System.out.println(context.getMessage("wenzi", null, "My Message", Locale.CHINA));
		System.out.println(context.getMessage("wenzi", null, "My Message", Locale.ENGLISH));
	}

}