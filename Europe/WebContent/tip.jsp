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
<input type="button" class="btn btn-primary" value="�۾���" onclick="location='tipwrite.jsp'">
<br><br>
<jsp:include page="list.jsp" flush="false"></jsp:include>
</td>
</tr>
</table>
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
</body>
</html>