<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 목록 페이지</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

nav {
display : flex;
justify-content : space-between;
align-items : center
}
nav a {
margin-right: 10px
}
</style>
</head>
<body>
<nav>
	<h1>영화 목록 페이지</h1>
	<%@ include file="/nav.jsp" %>
	</nav>
	<a href="${pageContext.request.contextPath}">메인 화면으로</a>
	<a href="${pageContext.request.contextPath}/movie?action=goRegistPage">등록하기</a>
	<table>
		<thead>
			<tr>
				<th>영화 코드</th>
				<th>영화 제목</th>
				<th>영화 장르</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="movie" items="${list}">
				<tr>
					<td><a href="#">${movie.code}</a></td>
					<td>${movie.title }</td>
					<td>${movie.genre }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>