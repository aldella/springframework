<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path0" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-1.11.0.js"></script>
<meta charset="UTF-8">
<title>POST테스트</title>
</head>
<body>
<div class="wrap">
	<h2>POST1테스트-@RequestParam</h2>
	<hr>
	<div class="test">
		<form name="post1" action="${path0 }/test2/post1.do" method="post">
			<input type="number" name="num" id="num1" placeholder="num 입력"/><br>
			<input type="text" name="title" id="title1" placeholder="name 입력"/>
			<button type="submit">post1전송</button>
		</form>
	</div>
	<hr><br>
</div>
<div class="wrap">
	<h2>POST2테스트-객체 전송</h2>
	<hr>
	<div class="test">
		<form name="post2" action="${path0 }/test2/post2.do" method="post">
			<input type="number" name="num" id="num2" placeholder="num 입력"/><br>
			<input type="text" name="title" id="title2" placeholder="name 입력"/>
			<button type="submit">post2전송</button>
		</form>
	</div>
	<hr><br>
</div>
<div class="wrap">
	<h2>POST3테스트-@ModelAttribute</h2>
	<hr>
	<div class="test">
		<form name="post3" action="${path0 }/test2/post3.do" method="post">
			<input type="number" name="num" id="num3" placeholder="num 입력"/><br>
			<input type="text" name="title" id="title3" placeholder="name 입력"/>
			<button type="submit">post3전송</button>
		</form>
	</div>
	<hr><br>
</div>
<div class="wrap">
	<h2>POST4테스트-@PathVariable</h2>
	<hr>
	<div class="test">
		<form name="post4" action="${path0 }/test2/post4.do">
			<input type="number" name="num" id="num4" placeholder="num 입력" required/><br>
			<input type="text" name="title" id="title4" placeholder="name 입력" required/>
			<button type="button" onclick="func1()">post4전송</button>
		</form>
			<script>
	function func1() {
		if( $("#num4").val()=="" || $("#title4").val()=="" ) {
			alert("값이 비어 있습니다");
			return;
		}
		var num = parseInt( $("#num4").val() );
		var title = $("#title4").val();
		location.href="${path0}/test2/post4.do/"+num+"/"+title;
	}
	</script>
	</div>

	<hr><br>
</div>
<div class="wrap">
	<h2>POST5테스트-@RequestParam</h2>
	<hr>
	<div class="test">
		<form name="post5" action="${path0 }/test2/post5.do" method="post">
			<input type="number" name="num" id="num5" placeholder="num 입력"/><br>
			<input type="text" name="title" id="title5" placeholder="name 입력"/>
			<button type="submit">post5전송</button>
		</form>
	</div>
	<hr><br>
</div>
<a href="${path0 }">홈으로</a><br>
</body>
</html>