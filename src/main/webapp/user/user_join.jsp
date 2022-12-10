<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<section>
	<div align="center">
		<h3>회원가입</h3>
		
		<form action="joinForm.user" method="post"></form>
		
		<table>
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="id" required="required">
				</td>
			</tr>

			
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="pw" required="required">
				</td>
			</tr>
			
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="name" pattern="[가-힣]{3,}" required="required">
				</td>
			</tr>

			<tr>
				<td>키</td>
				<td>
					<input type="text" name="cm" pattern="[가-힣]{3,}" required="required">
				</td>
			</tr>
			
			<tr>
				<td>무게</td>
				<td>
					<input type="text" name="name" pattern="[가-힣]{3,}" required="required">
				</td>
			</tr>
			
		</table>
		
	</div>
</section>

</body>
</html>