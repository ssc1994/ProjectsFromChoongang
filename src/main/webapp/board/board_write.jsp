<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp"%>

<section>

	<div align="center" class="div_center">
		<h3>게시글 작성</h3>
		<form action="writeForm.board" method=post">
			<table border=1 width=700 class ="tabstyle">
				<tr>
					<td>작성자</td>
					<td><input type="text" name="bid" value="${sessionScope.id }" size=10
						required readonly /></td>
				</tr>

				<tr>
					<td>글 제목</td>
					<td><input type="text" name="btitle" style="width: 70%;"
						required /></td>
				</tr>

				<tr>
					<td>글 내용</td>
					<td><textarea rows=7 name="bcontent" style="width: 90%;"></textarea></td>
				</tr>

				<tr align ="center">
					<td colspan="2">
						<input type="submit" value="작성완료">
						<input type="button" value="목록" onclick="location.href='board_list.board'">
					</td>
				</tr>


			</table>
		</form>
	</div>
</section>

<%@ include file="../include/footer.jsp"%>