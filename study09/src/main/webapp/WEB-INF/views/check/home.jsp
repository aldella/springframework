<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<h1>Form 검증</h1>
	<ul>
		<li><a href="${path2 }/check/check1.do">check1 테스트</a></li>
		<li><a href="${path2 }/check/check2.do">check2 테스트</a></li>
		<li><a href="${path2 }/check/check3.do">check3 테스트</a></li>
		<li><a href="${path2 }/check/check4.do">check4 테스트</a></li>
		<li><a href="${path2 }/check/check5.do">check5 테스트</a></li>
		<li><a href="${path2 }/check/check6.do">check6 테스트</a></li>
	</ul>
	<hr>
</body>
</html>