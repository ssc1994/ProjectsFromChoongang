<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<form align="center" action="myexercise.myExercise" method="post">
 	<div class="container">
		<h3>운동 내역게시판</h3>

		<table class="table table-bordered" style = "color:white">
			<thead>
				<tr>
					<th>순서</th>
					<th>날짜</th>
					<th>운동순서</th>
					<th>운동내역</th>
					<th>날짜의결과</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var = "vo" items="${list2 }" varStatus="num" >
				<tr>
					
					<td>${num.count }</td>
					<td>${vo.edate }</td>
					<td>${vo.rdayno }</td>
					<td>${vo.ename }</td>
					<td>${vo.sets }</td>
				</tr>
				</c:forEach>
			</tbody>
			
		
		</table>
		</div>
		</form>


<%@ include file="../include/footer.jsp"%>