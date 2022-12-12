<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<section>
	<div style="color: white">
		<h3 align="center">오늘의 운동 정보</h3>
		<form align="center" action="ExInsert.ExerciseInfo" method="post">
			<input type="radio" name="day" value="1" }>1일차
			 <input type="radio" name="day" value="2"}>2일차 
			 <input type="radio" name="day" value="3"}>3일차 
			 <input type="radio" name="day" value="4">4일차
			  <input type="radio" name="day" value="5"}>5일차 
			 <input type="radio" name="day" value="6">6일차
			 <input type="submit" value="확인">
		</form>
	</div>
			
	<div style="color: white">
			<form action="ExDB.ExerciseInfo" method="post">
			<c:forEach var="vo" begin="0" end="0" items="${list }">
			<h4 align = center>${vo.rno}분할</h4>
			<h3 align = center>${vo.rdayno}일차</h3>
			</c:forEach>
			<table class="table table-bordered" style="color: white">
			
			

				<thead>
					<tr>
						<th>운동명</th>
						<th>세트</th>
						<th>기본무게</th>
						<th>체크</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var = "vo" varStatus="num" items="${list }" >
					<tr>
					
					<td><input type = "hidden" name = "rno" value="${vo.rno}"></td>
					<td><input type = "hidden" name = "rdayno" value="${vo.rdayno}"></td>
										<tr>
											<td>${vo.ename }</td>
											<td>${vo.sets }</td>
											<td>${vo.base }</td>
										<td><input type="checkbox" name="exeno${num.count}" value="1" }></td>
										</tr>
				</c:forEach>
				</tbody>
				
				<tr>
				<td colspan="4" align = center>
					<input type="submit" value="입력 완료" >
					&nbsp;&nbsp;
				</td>
			</tr>
			</table>
			
			
			</form>
	</div>
	

</section>
<%@ include file="../include/footer.jsp"%>