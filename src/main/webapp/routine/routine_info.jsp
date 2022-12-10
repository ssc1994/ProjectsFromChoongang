<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<section>
	<div>
		<h3 align="center">운동루틴 정보</h3>
		<form align="center" action="routine_info.routine" method="post">
			<input type="radio" name="routine" value="3">3분할 <input
				type="radio" name="routine" value="4">4분할 <input
				type="radio" name="routine" value="5">5분할 <input
				type="radio" name="routine" value="0" checked>무분할 <input
				type="submit" value="확인">
		</form>
	</div>

	<c:if test="${sessionScope.chooseroutine == 0}">
		<div>
			<form align="center">
				<h6>무분할</h6>
				<tr>
					<td>내용</td>
				</tr>
			</form>
		</div>
	</c:if>
	
</section>
<%@ include file="../include/footer.jsp"%>