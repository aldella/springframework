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
<title>Get 테스트 - @RequestParam</title>
</head>
<body>
	<h2>Get 테스트 - @RequestParam</h2>
	<hr>
	<div class="test">
		<p>번호 : ${samplesa.num }</p>
		<p>제목 : ${samplesa.title }</p>
	</div>
	<hr><br>
	<a href="${path0 }">홈으로</a><br>
</body>
</html>