<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>tip</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">TIP</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<br>
<table>
<tr><td width="100" valign="top">
<jsp:include page="category.jsp" flush="false"></jsp:include>
</td>
<td width="300" valign="top">
<input type="button" class="btn btn-primary" value="글쓰기" onclick="location='tipwrite.jsp'">
<br><br>
<jsp:include page="list.jsp" flush="false"></jsp:include>
</td>
</tr>
</table>
<%
String mode = request.getParameter("mode");
if(mode == null || mode.isEmpty()) mode = "All";
else if (mode == "internal") mode = "internal";			// 국내
else if (mode == "UK") mode = "UK";						// 영국
else if (mode == "France") mode = "France";				// 프랑스
else if (mode == "Switzerland") mode = "Switzerland";	// 스위스
else if (mode == "Germany") mode = "Germany";			// 독일
else if (mode == "Czech") mode = "Czech";				// 체코
else if (mode == "Hungary") mode = "Hungary";			// 헝가리
else if (mode == "Austria") mode = "Austria";			// 오스트리아
else if (mode == "Italy") mode = "Italy";				// 이탈리아
%>
</body>
</html>