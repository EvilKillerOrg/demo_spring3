<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p align="center"></p>
	<p align="center">
	
		login1.do login1.do login1.do 需要在web.xml加载 spring-servlet-ch4.xml<br>
		<a href="${pageContext.request.contextPath}/login1.do">login1.do</a><br>
		<a href="${pageContext.request.contextPath}/login2.do">login2.do</a><br>
		<a href="${pageContext.request.contextPath}/login3.do">login3.do</a>
		
	</p>
	
	
	<p align="center">
	
		excelViewAction.do 需要在web.xml加载 spring-servlet-ch5.xml<br>
		<a href="${pageContext.request.contextPath}/excelViewAction.do">excelViewAction.do(请使用IE 测试)</a><br>
		<a href="${pageContext.request.contextPath}/userInfo.do">userInfo.do(file upload)</a><br>
		<a href="${pageContext.request.contextPath}/userInfo1.do?method=retrieveIndex">userInfo1.do(MultiActionController1)</a><br>
		<a href="${pageContext.request.contextPath}/userInfo2.do?method=retrieveIndex">userInfo2.do(MultiActionController2)</a><br>
	</p>
</body>
</html>