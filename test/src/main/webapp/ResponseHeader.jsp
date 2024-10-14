<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.Collection" %>
<%@ page import="java.text.SimpleDateFormat" %> 

<%
SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm");
long add_date = s.parse(request.getParameter("add_date")).getTime();
int add_int = Integer.parseInt(request.getParameter("add_int"));
String add_str = request.getParameter("add_str");

response.addDateHeader("myBirthday", add_date);
response.addIntHeader("MyNumber", add_int);
response.addIntHeader("myNumber", 1004);
response.addHeader("myName", add_str);
response.setHeader("myName", "이름");
%>   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	Collection<String> headerNames = response.getHeaderNames();
	for (String hName : headerNames) {
		String hValue = response.getHeader(hName);
	%>
		<li><%= hName %> : <%= hValue %> </li>
	<%
	}
	%>
	
	<h2> myNumber만 출력 </h2>
	<%
	Collection<String> myNumber = response.getHeaders("myNumber");
	for(String myNum : myNumber) {
	%>
	}
		<li>myNumber : <%= myNum %> </li>
	<%
	}
	%>
	
	
</body>
</html>