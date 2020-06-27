<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function lcDeleteConfirm(number){
	if(confirm("정말로 이 장소를 삭제하시겠습니까? 삭제하면 되돌릴 수 없습니다.")==true)
		location.href = "DeleteLocationAction.do?number=" + number;
	else
		return;	
}

</script>
</head>
<body>
<br><br>
<table border="0" style="width:70%; margin:auto;">
	<c:forEach var="l" items="${lList}">
		<tr>
			<td style="text-align:center;width:300px; height:300px; background-size:200px 200px; background-repeat:no-repeat; background-position:center center;">
				<h2>${l.getLocation()}</h2><a href="lcDeleteConfirm(${l.getNumber()})">[삭제]</a>
			</td>
		<tr>
	</c:forEach>
</table>
</body>
</html>