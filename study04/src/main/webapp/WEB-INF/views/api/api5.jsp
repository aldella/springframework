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
<title>Insert title here</title>

</head>
<body>
	<form name="ins">
		<input type="number" name="storeNum" id="storeNum" placeholder="번호 입력" /><br>
		<input type="text" name="storeName" id="storeName" placeholder="상점이름 입력" /><br>
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
						storeNum:parseInt($("#storeNum").val()),
						storeName:$("#storeName").val()
						};
				$.ajax({
					type:"post", 
					url:"${path0}/api/api5.do", 
					data:JSON.stringify(store), 
					dataType:"json",
					contentType: 'application/json; charset=utf-8',
					success:function(data){console.log(data);
						
						var tbody=$("#tbody").html();
						
						var conData="<tr><td>"+ data.storeNum +"</td><td>"+ data.storeName +"</td></tr>";
						$("#tbody").html(tbody+conData);
						
						console.log(data.storeNum);
						console.log(data.storeName);}
					//, error:function(res){console.log(store);}
				});
			}); 
		});
	</script>
</body>
</html>