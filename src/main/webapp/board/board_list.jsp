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
			<td>${vo.btitle }</td>
			<td><fmt:formatDate value ="${vo.regdate }" pattern="yyyy-MM-dd HH시mm분"/></td>
			<td>${vo.hit }</td>
		</tr>
		</c:forEach>
		
		<tr>
		
		</tr>
	</tbody>
	
	
	</table>	
</div>

<%@ include file="../include/footer.jsp" %>