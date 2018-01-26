package com.ek.spring.ch5.fileupload.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.ek.spring.ch5.fileupload.form.UserInfoForm;

public class UserInfoAction extends SimpleFormController {

	
	// 这个方法可以预制一些数据
	@Override
	protected Map referenceData(HttpServletRequest request, Object command, Errors errors) throws Exception {
		UserInfoForm userInfoForm = (UserInfoForm)command;
		userInfoForm.setSex("1"); // 给sex设置默认值
		return super.referenceData(request, command, errors);
	}

	
	// BaseCommandController 中的方法 用来指定由谁来实现上传的数据绑定
	@Override
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor()); //这是对byte[] 做处理的
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-Mm-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf,true)); //这是对Date 做处理的 true允许为空
		super.initBinder(request, binder);
	}



	// 这个方法 只有在表单提交的时候才走
	@Override
	protected ModelAndView onSubmit(Object command, BindException errors) throws Exception {
		
		UserInfoForm userInfoForm = (UserInfoForm)command;
		System.out.println(userInfoForm.getUsername());
		System.out.println(userInfoForm.getSex());
		System.out.println(userInfoForm.getAge());
		System.out.println(userInfoForm.getBirthday());
		System.out.println(userInfoForm.getMyfile());
		
		return new ModelAndView(super.getSuccessView());
	}
	
	
	
}