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
	<form name="ins">
		<input type="number" name="stdNum" id="stdNum" placeholder="학생 번호 입력" /><br>
		<input type="text" name="stdName" id="stdName" placeholder="학생 이름 입력" /><br>
		<input type="number" name="stdAge" id="stdAge" placeholder="학생 나이 입력" /><br>
		<button type="button" id="btn1">전송</button>
	</form>
	<table>
		<thead></thead>
		<tbody id="tbody"></tbody>
	</table>

	<script>
		$(document).ready(function() {
			$("#btn1").click( function() {
				var store = {
						stdNumber:parseInt($("#stdNum").val()),
						name:$("#stdName").val(),
						age:parseInt($("#stdAge").val())
						};
				$.ajax({
					type:"post", 
					url:"${path0}/api/api10.do", 
					data:JSON.stringify(store), 
					dataType:"json",
					contentType: 'application/json; charset=utf-8',
					success:function(data){console.log(data);
						
						var tbody=$("#tbody").html();
						
						var conData="<tr><td>"+ data.stdNumber +"</td><td>"+ data.name +"</td></td>" + data.age+"</tr>";
						$("#tbody").html(tbody+conData);
						
						//console.log(data.stdNumber);
						//console.log(data.name);
						//console.log(data.age);
						}
					//, error:function(res){console.log(store);}
				});
			}); 
		});
	</script>
</body>
</html>