<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>


	<div align = "center">
		<h3>오늘의 운동 체크화면</h3>
		
		<form action="ExInsert.ExerciseInfo" method="post">
		
			<span style="color: red;">${msg }</span>
			<table>
				<tr>
					<td>오늘의운동1</td>
					<td><input type="checkbox" name="exeno1" value = 1></td>
				<tr>
				<tr>
					<td>오늘의운동2</td>
					<td><input type="checkbox" name="exeno2" value = 1></td>
				<tr>
				<tr>
					<td>오늘의운동3</td>
					<td><input type="checkbox" name="exeno3" vaule = 1></td>
				<tr>
				<tr>
					<td>오늘의운동4</td>
					<td><input type="checkbox" name="exeno4" vaule = 1></td>
				<tr>
				<tr>
					<td>오늘의운동5</td>
					<td><input type="checkbox" name="exeno5" vaule = 1></td>
				<tr>
				<tr>
					<td>오늘의운동6</td>
					<td><input type="checkbox" name="exeno6" vaule = 1></td>
				<tr>
			</table>
				<td>
					<input type = "submit" value = "확인">
					<input type = "button" value = "로그인하기" onclick = "location.href = '초기화면' ">
				</td>
			</tr>
			</form>	
	</div>
</section>


<%@ include file="../include/footer.jsp"%>

