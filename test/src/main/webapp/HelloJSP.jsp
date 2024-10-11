<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page errorPage="errorPage.jsp" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%!
String str1 = "JSP";
String str2 = "안녕하세요!!";
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>처음 만들어보는 <%= str1 %></h2>
	<p>
		<%
		out.println(str1 + str2 + "안녕하세요 ^^*");
		%>
	</p>
	
	<%
	Date today = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String todayStr = dateFormat.format(today);
	out.println(" 오늘 날짜 : " + todayStr);
	%>
	
</body>
</html>