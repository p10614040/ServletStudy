<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆成功</title>
</head>
<body>

	<p>WelCome：<%=request.getAttribute("userName") %></p>
	<p><%=request.getParameter("passWord") %></p>
	
</body>
</html>