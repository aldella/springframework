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
<title>POST 테스트 - 객체 전송</title>
</head>
<body>
	<h2>POST 테스트 - @객체 전송</h2>
	<hr>
	<div class="test">
		<p>샘플번호 : ${sample.num }</p>
		<p>샘플제목 : ${sample.title }</p>
		<p>샘플날짜 : ${sample.res }</p>
	</div>
	<hr><br>
	<a href="${path0 }">홈으로</a><br>
</body>
</html>