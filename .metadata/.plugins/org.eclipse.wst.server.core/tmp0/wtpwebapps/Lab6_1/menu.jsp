<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String userID = (String)session.getAttribute("userID");
	String userPW = (String)session.getAttribute("userPW");
%>

<nav class="navbar navbar-expand navbar-dark bg-dark">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.jsp">Home</a>
		</div>
		<% if (userID == null && userPW == null){ %>
			<p><a href="login.jsp" class="btn btn-secondary" role="button">Login &raquo;</a>
		<% } else{ %>
		<font color="#fffffff">${userID }</font><a href="LogoutAction.do" class="btn btn-secondary" role="button">Logout &raquo;</a>
		<p><a href="AddViewAction.do" class="btn btn-secondary" role="button">Add &raquo;</a>
		<p><a href="ListViewAction.do?mode=edit" class="btn btn-secondary" role="button">Edit &raquo;</a>	
		<p><a href="ListViewAction.do?mode=delete" class="btn btn-secondary" role="button">Delete &raquo;</a>
		<% } %>
	</div>
</nav>
</body>
</html>