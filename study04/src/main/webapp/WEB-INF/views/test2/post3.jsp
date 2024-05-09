<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path0" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 테스트 - @ModelAttribute</title>
</head>
<body>
	<h2>POST 테스트 - @ModelAttribute</h2>
	<hr>
	<div class="test">
		<p>번호 : ${num }</p>
		<p>제목 : ${title }</p>
		<p>번호 : ${sam.num }</p>
		<p>제목 : ${sam.title }</p>
	</div>
	<hr><br>
	<a href="${path0 }">홈으로</a><br>
</body>
</html>