<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    

<%@ include file="../include/header.jsp" %>

<div>
	<h3> 게시글 목록</h3>
	<table class="table table-bordered" align="center" style="width: 80%;" >
	<thead>
		<tr>
			<th>글 번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="vo" items="${list }" varStatus="num">
		<tr>
			<td>${num.count }</td>
			<td>${vo.bid }</td>
			<td><a href="board_content.board?bno=${vo.bno }&num=${num.count}">${vo.btitle }</a></td>
			<td><fmt:formatDate value ="${vo.regdate }" pattern="yyyy-MM-dd HH시mm분"/></td>
			<td>${vo.hit }</td>
		</tr>
		</c:forEach>
	</tbody>
	
	<tbody>
		<tr>
			<td colspan="6" align="right">
				<form action="" class="form-inline" >
					<div class="form-group">
						<input type="text" name="search" placeholder="제목검색" class="form-control" >
						<input type="submit" value="검색" class="btn btn-default">
						<input type="button" value="글 작성" class="btn btn-success" onclick="location.href='board_write.board'">
					</div>
				</form> 
			</td>	
		</tr>
	</tbody>
	
	
	</table>	
</div>

<%@ include file="../include/footer.jsp" %>