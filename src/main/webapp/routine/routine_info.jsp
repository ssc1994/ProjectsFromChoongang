<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<section>
	<div>
		<h3 align="center">운동루틴 정보</h3>
		<form align="center" action="routineForm.routine" method="post">
			<input type="radio" name="routine" value="3"
				${sessionScope.rno == 3?'checked':''}>3분할 <input
				type="radio" name="routine" value="4"
				${sessionScope.rno == 4?'checked':''}>4분할 <input
				type="radio" name="routine" value="5"
				${sessionScope.rno == 5?'checked':''}>5분할 <input
				type="radio" name="routine" value="0"
				${sessionScope.rno == 0?'checked':''}
				${sessionScope.rno == null? 'checked':'' }>무분할 <input
				type="submit" value="확인">
		</form>
	</div>
</section>
<%--무분할 페이지가 홈페이지 --%>
<section>
	<c:choose>
		<c:when test="${sessionScope.rno==0}">
			<%@ include file="rInclude/routine0_info.jsp"%>
		</c:when>

		<%--3분할 --%>
		<c:when test="${sessionScope.rno==3}">
			<%@ include file="rInclude/routine3_info.jsp"%>
		</c:when>
		<%--4분할 --%>
		<c:when test="${sessionScope.rno==4}">
			<%@ include file="rInclude/routine4_info.jsp"%>
		</c:when>

		<%--5분할 --%>
		<c:when test="${sessionScope.rno==5}">
			<%@ include file="rInclude/routine5_info.jsp"%>
		</c:when>

		<c:otherwise>
			<%@ include file="rInclude/routine0_info.jsp"%>
		</c:otherwise>
	</c:choose>

</section>
<%@ include file="../include/footer.jsp"%>