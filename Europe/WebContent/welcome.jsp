<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">������, ���</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<%
	String id=(String)session.getAttribute("id");
%>
<h1>�ȳ��ϼ���! <%=id %>��!</h1>
<input type="button" value="Logout" onclick="location.href='login.jsp?logout=yes'" />
</body>
</html>