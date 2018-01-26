<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/userInfo.do"  method="post"  name="userInfoForm" enctype="multipart/form-data" commandName="userInfoForm">
		UserName: <form:input path="username"/> <br>
		Sex: <form:radiobutton path="sex" value="0"/>FeMale	
				<form:radiobutton path="sex" value="1"/>Male<br>
		Age: <form:input path="age"/><br>
		Birthday: <form:input path="birthday"/> yyyy-MM-dd<br>
		MyFile <input type="file" name="myfile"><br>
		<input type="submit">
	</form:form>
</body>
</html>