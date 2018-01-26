package com.ek.spring.ch5.excel.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.Controller;

public class ExcelViewAction implements Controller{

	private View successView; //这个路径注入进来的是一个 View 不是页面
	public void setSuccessView(View successView) {
		this.successView = successView;
	}




	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<String> wordList = new ArrayList<String>();
		wordList.add("ek1");
		wordList.add("ek2");
		wordList.add("ek3");
		wordList.add("hehe");
		
		// ModelAndView 可以携带request范围 参数1路径 参数2放入request中对象的名称 参数3放入的对象
		return new ModelAndView(successView ,"wordList",wordList);
	}

}