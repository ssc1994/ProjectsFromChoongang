<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<section>
	<div align="center" style="color: white">
		<form action="loginForm.user" method="post">
			<span style="color: red;"> ${msg }</span>
			<h3 style="color: white">로그인</h3>
			<input type="text" name="id" placeholder="아이디" style="color: black"><br>
			<input type="password" name="pw" placeholder="비밀번호" style="color: black"><br>
			
			<input type="submit" value="로그인" style="color: black">
			<input type="button" value="회원가입" onclick="location.href='user_join.user'" style="color: black">
		</form>
	</div>
</section>

<script>
	var msg = '${msg}';
	if(msg != ''){
		alert(msg);
	}
</script>

<%@ include file="../include/footer.jsp"%>