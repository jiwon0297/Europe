<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>market</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">MARKET</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<br>
<jsp:include page="category.jsp"/>
<a href="글쓰기">write</a>
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
marketlist
</body>
</html>