<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    

<%@ include file="../include/header.jsp" %>


<div align="center" class="div_center" style="color: white">
	<h3>게시판 글 수정 페이지</h3>
	<hr>
	
	<form action="board_modifyForm.board" method="post">
		
		<table border=1 width="500" class ="tabstyle">
			
			<tr>
				<td>글 번호</td>
				<td>${vo.bno }	
					<input type="hidden" name="bno" value="${vo.bno }">
				</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="bid" value="${vo.bid }" readonly></td>
			</tr>
			<tr>
				<td>글 제목</td>
				<td>
					<input type="text" name="btitle" value="${vo.btitle }">
				</td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td>
					<textarea rows="10" style="width: 90%;" name="bcontent"> ${vo.bcontent }
					</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정 하기">&nbsp;&nbsp;
					<input type="button" value="목록" onclick="location.href='board_list.board'">        
				</td>
			</tr>
			
		</table>
	</form>
	
</div>


<%@ include file="../include/footer.jsp" %>