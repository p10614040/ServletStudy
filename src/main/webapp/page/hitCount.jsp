<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" errorPage="errorPage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>记录访问人数</title>
</head>
<body>

	<p>访问次数
	<%! int hitCount = 0; %>
	<%= ++hitCount%></p>
	
	<p>ContextServlet访问测试：<%=application.getAttribute("count") %></p>
	
	<h2>Cookie</h2>
	<%
	Cookie[] cookies = request.getCookies();
	for(int i=0; i<cookies.length; i++){
	%>
	<p>
		<b>CookieName:</b><%=cookies[i].getName() %>
		_<b>CookieValue：</b><%=cookies[i].getValue() %>
	</p>
	<%} %>
</body>
</html>