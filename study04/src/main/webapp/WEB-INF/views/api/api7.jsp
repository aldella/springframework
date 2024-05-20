<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path0" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<meta charset="UTF-8">
<title>학생</title>

</head>
<body>
	<h1>Student클래스입력</h1>
	<div class="form">
		<input type="number" name="stdNum" id="stdNum1" class="num" placeholder="학생1 번호 입력" /><br>
		<input type="text" name="stdName" id="stdName1" class="name" placeholder="학생1 이름 입력" /><br>
		<input type="number" name="stdAge" id="stdAge1" class="age" placeholder="학생1 나이 입력" /><br>
	</div>
	
	<div class="form">
		<input type="number" name="stdNum" id="stdNum2" class="num" placeholder="학생2 번호 입력" /><br>
		<input type="text" name="stdName" id="stdName2" class="name" placeholder="학생2 이름 입력" /><br>
		<input type="number" name="stdAge" id="stdAge2" class="age" placeholder="학생2 나이 입력" /><br>
	</div>
		
	<div class="form">
		<input type="number" name="stdNum" id="stdNum3" class="num" placeholder="학생3 번호 입력" /><br>
		<input type="text" name="stdName" id="stdName3" class="name" placeholder="학생3 이름 입력" /><br>
		<input type="number" name="stdAge" id="stdAge3" class="age" placeholder="학생3 나이 입력" /><br>
		<button type="button" id="btn1">전송</button>
	</div>
	<table>
		<thead></thead>
		<tbody id="tbody"></tbody>
	</table>

	<script>
		$(document).ready(function() {
			$("#btn1").click( function() {
				var student = {stdNumber:0, name:"가가가", age:0};
				var stds = [student, student, student];
				$.each( $(".form"), function(index, value) {
					var num = parseInt($(this).find(".num").val());
					var name = $(this).find(".name").val();
					var age = parseInt($(this).find(".age").val());
					
					student = {stdNumber:num, name:name, age:age};
					stds[index] = student;
				}		
				);
				
				$.ajax({
					type:"post", 
					url:"${path0}/api/api7.do", 
					data:JSON.stringify(stds), 
					dataType:"json",
					contentType: 'application/json; charset=utf-8',
					success:function(data){console.log(data);}
				});
			}); 
		});
	</script>
</body>
</html>