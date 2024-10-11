<%@ page isErrorPage="true" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
	<h2> 에러가 발생했습니다. </h2>
	
	<p> 오류 메시지 : <%= exception.getMessage() %> </p>
	<p> 오류 클래스 : <%= exception.getClass().getName() %>
	
	<p> </p>
</body>
</html>