<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<section>
	<div align="center" style="color: white">
		 
		<b>${sessionScope.name }</b>님 환영합니다.
		
		<div>
			<a href="user_logout.user" style="color: white"> |로그아웃| </a>
			<a href="user_modify.user" style="color: white"> |정보수정| </a>
			<a href="user_confirm.user" style="color: white"> |회원탈퇴| </a>
		</div>
		
	</div>
</section>

<%@ include file="../include/footer.jsp"%>