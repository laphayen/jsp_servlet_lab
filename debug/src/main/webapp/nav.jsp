<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<c:choose>
	<c:when test="${empty userInfo }">
		<a href="${pageContext.request.contextPath}/member?action=goLoginPage">로그인</a>
	</c:when>
	<c:otherwise>
		<div>
			<span>${userInfo.id}님 로그인 중</span> 
			<a href="${pageContext.request.contextPath}/member?action=logout">로그아웃</a>
		</div>
	</c:otherwise>
</c:choose>