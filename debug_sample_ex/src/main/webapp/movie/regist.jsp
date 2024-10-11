<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 등록 페이지</title>
<style>
nav {
	display: flex;
	justify-content: space-between;
	align-items: center
}

nav a {
	margin-right: 10px
}
</style>
</head>
<body>
	<nav>
		<h1>영화 등록 페이지</h1>
		<%@ include file="/nav.jsp"%>
	</nav>
	<form action="${pageContext.request.contextPath}/movie" method="post">
		<fieldset>
			<input type="hidden" name="action" value="regist"> <br>
			<label> 영화 코드 <input type="text" ></label> <br>
			<label> 영화 제목 <input type="text" name="title"></label> <br>
			<label> 영화 시간  <input type="number" name="time"></label> <br>
			<label> 영화 감독  <input type="text" name="director"></label> <br>
			<label> 영화 장르 <select name="genre">
					<option value="판타지">판타지</option>
					<option value="액션">액션</option>
					<option value="로맨스">로맨스</option>
			</select>
			</label> <br> <input type="submit" value="등록"> <br> <a
				href="${pageContext.request.contextPath}/movie?action=list">목록으로</a>
		</fieldset>
	</form>
</body>
</html>