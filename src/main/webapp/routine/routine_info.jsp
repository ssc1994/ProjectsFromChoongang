<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<section>
	<div>
		<h3 align="center">운동루틴 정보</h3>
		<form align="center" action="routineForm.routine" method="post">
			<input type="radio" name="routine" value="3" ${sessionScope.rno == 3?'checked':''}>3분할
			 <input type="radio" name="routine" value="4" ${sessionScope.rno == 4?'checked':''}>4분할 
			 <input type="radio" name="routine" value="5" ${sessionScope.rno == 5?'checked':''}>5분할 
			 <input type="radio" name="routine" value="0" checked>무분할 
			 <input type="submit" value="확인">
		</form>
	</div>

	<%--무분할 페이지가 홈페이지 --%>
	<div>
		<c:if test="${sessionScope.rno == null or sessionScope.rno == 0}">
			<h3>무분할</h3>
			<table class="table table-bordered">

				<thead>
					<tr>
						<th>DAY</th>
						<th>운동명</th>
						<th>세트</th>
						<th>운동설명</th>
						<th>기본무게</th>
					</tr>
				</thead>


				<tbody>
					<tr>
						<c:forEach var="vo" items="${sessionScope.exerciselist }">
									<c:if test="${vo.rno eq 0 or vo.rno == null}">
										<tr>
											<td>day${vo.rdayno}</td>
											<td>${vo.ename }</td>
											<td>${vo.sets }</td>
											<td>${vo.econtent }</td>
											<td>${vo.base }</td>
										</tr>
									</c:if>
						</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
	<%--3분할 --%>
	<div>
		<c:if test="${sessionScope.rno == 3}">
			<h3>3분할</h3>
			<table class="table table-bordered">

				<thead>
					<tr>
						<th>DAY</th>
						<th>운동명</th>
						<th>세트</th>
						<th>운동설명</th>
						<th>기본무게</th>
					</tr>
				</thead>


				<tbody>
					<tr>
						<c:forEach var="vo" items="${sessionScope.exerciselist }">
							<c:forEach var="i" begin="1" end="${vo.rdayno }">
									<c:if test="${vo.rno eq 3 and vo.rdayno eq i}">
										<tr>
											<td>day${vo.rdayno}</td>
											<td>${vo.ename }</td>
											<td>${vo.sets }</td>
											<td>${vo.econtent }</td>
											<td>${vo.base }</td>
										</tr>
									</c:if>
								</c:forEach>
						</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
	
	<%--4분할 --%>
	<div>
		<c:if test="${sessionScope.rno == 4}">
			<h3>4분할</h3>
			<table class="table table-bordered">

				<thead>
					<tr>
						<th>DAY</th>
						<th>운동명</th>
						<th>세트</th>
						<th>운동설명</th>
						<th>기본무게</th>
					</tr>
				</thead>


				<tbody>
					<tr>
						<c:forEach var="vo" items="${sessionScope.exerciselist }">
							<c:forEach var="i" begin="1" end="${vo.rdayno }">
									<c:if test="${vo.rno eq 4 and vo.rdayno eq i}">
										<tr>
											<td>day${vo.rdayno}</td>
											<td>${vo.ename }</td>
											<td>${vo.sets }</td>
											<td>${vo.econtent }</td>
											<td>${vo.base }</td>
										</tr>
									</c:if>
								</c:forEach>
						</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
	
	<%--5분할 --%>
	<div>
		<c:if test="${sessionScope.rno == 5}">
			<h3>5분할</h3>
			<table class="table table-bordered">

				<thead>
					<tr>
						<th>DAY</th>
						<th>운동명</th>
						<th>세트</th>
						<th>운동설명</th>
						<th>기본무게</th>
					</tr>
				</thead>


				<tbody>
					<tr>
						<c:forEach var="vo" items="${sessionScope.exerciselist }">
							<c:forEach var="i" begin="1" end="${vo.rdayno }">
									<c:if test="${vo.rno eq 5 and vo.rdayno eq i}">
										<tr>
											<td>day${vo.rdayno}</td>
											<td>${vo.ename }</td>
											<td>${vo.sets }</td>
											<td>${vo.econtent }</td>
											<td>${vo.base }</td>
										</tr>
									</c:if>
								</c:forEach>
						</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>

</section>
<%@ include file="../include/footer.jsp"%>