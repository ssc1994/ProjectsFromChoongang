<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<section>
	<div align="center" style="color: white">
		<h3 >정보수정</h3>
		
		<form action="updateForm.user" method="post">
		
		<span style="color: red;"> ${msg }</span>
		
			<table>
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" name="id" value="${id }" required="required" readonly style="color: black">
					</td>
				</tr>
	
				
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="password" name="pw" value="${pw }" required="required" style="color: black">
					</td>
				</tr>
				
				<tr>
					<td>이름</td>
					<td>
						<input type="text" name="name" value="${name }" pattern="[가-힣]{3,}" required="required" readonly style="color: black">
					</td>
				</tr>
	
				<tr>
					<td>키</td>
					<td>
						<input type="text" name="cm" placeholder="소수점 부분은 생략" value="${cm }" pattern="\w{3,}" required="required" style="color: black">
					</td>
				</tr>
				
				<tr>
					<td>무게</td>
					<td>
						<input type="text" name="kg" placeholder="소수점 부분은 생략" value="${kg }" pattern="\w{2,3}" required="required" style="color: black">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>
						<input type="email" name="email" value="${email }" required="required" style="color: black">
					</td>
				</tr>
				
				<tr>
					<td>루틴 선택</td>
					<td>
						<input type="radio" name="rno" required="required" style="color: black" value="3" ${rno == 3 ? 'checked' : '' }>3분할
						<input type="radio" name="rno" required="required" style="color: black" value="4" ${rno == 4 ? 'checked' : '' }>4분할
						<input type="radio" name="rno" required="required" style="color: black" value="5" ${rno == 5 ? 'checked' : '' }>5분할
						<input type="radio" name="rno" required="required" style="color: black" value="0" ${rno == 0 ? 'checked' : '' }>무분할
					</td>
				</tr>
				
			</table>
	
			<input type="submit" value="정보수정" style="color: black">
			<input type="button" value="마이페이지" onclick="location.href='user_mypage.user'" style="color: black">
		
		</form>
		
		
	</div>
</section>

<%@ include file="../include/footer.jsp"%>