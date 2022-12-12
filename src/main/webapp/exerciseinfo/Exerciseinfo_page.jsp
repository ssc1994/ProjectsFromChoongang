<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<section>
	<div>
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
			
	<div>
			<h3>무분할</h3>
			<table class="table table-bordered">

				<thead>
					<tr>
						<th>운동명</th>
						<th>세트</th>
						<th>기본무게</th>
						<th>체크</th>
					</tr>
				</thead>


				<tbody>
				<c:forEach var = "vo" items="${list }" >
					<tr>
										<tr>
											<td>${vo.ename }</td>
											<td>${vo.sets }</td>
											<td>${vo.base }</td>
											<td><input type="checkbox" name="exeno" value="1" }></td>
										</tr>
				</c:forEach>
				</tbody>
			</table>
	</div>
	

</section>
<%@ include file="../include/footer.jsp"%>