<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<section>
	<div align="center" style="color: white">
		<h3>회원가입</h3>
		
		<form action="joinForm.user" method="post">
		
		<span style="color: red;"> ${msg }</span>
		
			<table style="color: white">
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" name="id" required="required" style="color: black">
					</td>
				</tr>
	
				
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="password" name="pw" required="required" style="color: black">
					</td>
				</tr>
				
				<tr>
					<td>이름</td>
					<td>
						<input type="text" name="name" pattern="[가-힣]{3,}" required="required" style="color: black">
					</td>
				</tr>
	
				<tr>
					<td>키</td>
					<td>
						<input type="text" name="cm" placeholder="소수점 부분은 생략" pattern="\w{3,}" required="required" style="color: black">
					</td>
				</tr>
				
				<tr>
					<td>무게</td>
					<td>
						<input type="text" name="kg" placeholder="소수점 부분은 생략" pattern="\w{2,3}" required="required" style="color: black">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>
						<input type="email" name="email" required="required" style="color: black">
					</td>
				</tr>
				
				<tr>
					<td>루틴 선택</td>
					<td>
						<input type="radio" name="rno" required="required" value="3" style="color: black" ${sessionScope.rno == 3?'checked':''}>3분할
						<input type="radio" name="rno" required="required" value="4" style="color: black" ${sessionScope.rno == 4?'checked':''}>4분할
						<input type="radio" name="rno" required="required" value="5" style="color: black" ${sessionScope.rno == 5?'checked':''}>5분할
						<input type="radio" name="rno" required="required" value="0" style="color: black" ${sessionScope.rno == 0?'checked':''} ${sessionScope.rno == null? 'checked':'' }>무분할
					</td>
				</tr>
				
			</table>
	
			<input type="submit" value="가입" class="btn btn-success" style="color: black">
			<input type="button" value="로그인하기" onclick="location.href='user_login.user'" class="btn btn-success" style="color: black">
		
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