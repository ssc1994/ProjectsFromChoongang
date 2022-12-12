<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    

<%@ include file="../include/header.jsp" %>

<div align="center" class="div_center">
	<h3> 게시글 상세 페이지</h3>
	<hr/>
	 <table width="550" border =1 >
	 	<tr align="center">
	 		<td width ="20%">
	 			 글번호
	 		</td>
	 		<td width ="20%">
	 			 ${vo.bno }
	 		</td>
	 		<td width ="20%">
	 			 조회수
	 		</td>
	 		<td width ="40%">
	 			 ${vo.hit }
	 		</td>
	 	</tr>
	 	<tr align="center">
	 		<td>
	 			작성자
	 		</td>
	 		<td>
	 			${vo.bid }
	 		</td>
	 		<td>
	 			작성일
	 		</td>
	 		<td>
	 			<fmt:formatDate value ="${vo.regdate }" pattern="yyyy-MM-dd HH시 mm분 ss초"/>
	 		</td>
	 	<tr>
			<td width="20%">&nbsp;글제목</td>
			<td colspan="3">&nbsp;${vo.btitle }</td>
		</tr>
		<tr>
		 	<td width="20%">&nbsp;글내용</td>
			<td colspan="3" height="120px">&nbsp; ${vo.bcontent }</td>
	 	</tr>
	 	
	 	<tr>
			<td colspan="4" align="center">
				<input type="button" value="목록" onclick="location.href='board_list.board'">&nbsp;&nbsp;
				<input type="button" value="수정" onclick="location.href='board_modify.board?bno=${vo.bno}&bid=${vo.bid}'">&nbsp;&nbsp;
				<input type="button" value="삭제" onclick="location.href='board_delete.board?bno=${vo.bno}&bid=${vo.bid}'">&nbsp;&nbsp;
			</td>
		</tr>
	 	
	 	
	 	
	 </table>	
 
</div>





<%@ include file="../include/footer.jsp" %>