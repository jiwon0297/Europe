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
<a href="�۾���">write</a>
<%
String mode = request.getParameter("mode");
if(mode == null || mode.isEmpty()) mode = "All";
else if (mode == "internal") mode = "internal";			// ����
else if (mode == "UK") mode = "UK";						// ����
else if (mode == "France") mode = "France";				// ������
else if (mode == "Switzerland") mode = "Switzerland";	// ������
else if (mode == "Germany") mode = "Germany";			// ����
else if (mode == "Czech") mode = "Czech";				// ü��
else if (mode == "Hungary") mode = "Hungary";			// �밡��
else if (mode == "Austria") mode = "Austria";			// ����Ʈ����
else if (mode == "Italy") mode = "Italy";				// ��Ż����
%>
marketlist
</body>
</html>