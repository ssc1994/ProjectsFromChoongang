<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<section>
	<div align="center" style="color: white">
		 
		 <h2 style="color: red">야 너도 몸짱 될 수 있어</h2>
		 <br>
		 <h2 style="color: fuchsia">한계에 도전해 봐</h2>
		 <br>
		 
		<b>${sessionScope.name }</b>님 환영합니다.
		
		<div>
			<a href="user_logout.user" style="color: white"> |로그아웃| </a>
			<a href="user_modify.user" style="color: white"> |정보수정| </a>
			<a href="user_confirm.user" style="color: white"> |회원탈퇴| </a>
		</div>
		
	</div>
</section>

<%@ include file="../include/footer.jsp"%>