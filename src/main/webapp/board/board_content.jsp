<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    

<%@ include file="../include/header.jsp" %>

<div>
	<h3> 게시글 상세 페이지</h3>
	<hr/>
	 <table>
	 	<tr>
	 		<td>
	 			글번호
	 		</td>
	 		<td>
	 			${vo.bno }
	 		</td>
	 	</tr>
	 	
	 </table>	
 
</div>





<%@ include file="../include/footer.jsp" %>