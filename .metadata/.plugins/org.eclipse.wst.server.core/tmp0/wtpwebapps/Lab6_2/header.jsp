<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="lab3.css" type="text/css" />
<title>header</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("id");
	String password = (String)session.getAttribute("password");
%>
<nav id="header" >
	<ul>
	<li class="active"><strong>DANKOOK MUSICIAN</strong></li>
	<li><a class="link" href="index.jsp">Home</a></li>
		<% if (id == null && password == null){ %>
			 <li><a class="link" href="login.jsp">LOGIN &raquo;</a></li>
		<% } else{ %>
			<li><a class="link" href="">${id}</a></li>
			<li><a class="link" href="LogoutAction.do">LOGOUT &raquo;</a></li>
			<li><a class="link" href="register.jsp">Register  &raquo;</a></li>
		<% } %>
			<li><a class="link" href="#">NOTICE &raquo;</a></li>
            <li><a class="link" href="#">Q & A &raquo;</a></li>
                  
       </ul>      
</nav>
</body>
</html>