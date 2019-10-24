<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>"> 
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Get提交</h1>
	<form action="/login" method="get">
		用户名：<input name="username">
		<input type="submit">
	</form>
	<h1>Post提交</h1>
	<form action="/login" method="post">
		用户名：<input name="username">
		<input type="submit">
	</form>
</body>
</html>