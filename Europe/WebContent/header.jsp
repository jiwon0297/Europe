<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
</head>
<body>
<%
String userID = (String)session.getAttribute("userID");
String userPW = (String)session.getAttribute("userPW"); 
%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor03" aria-controls="navbarColor03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor03">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
		<% if(userID == null && userPW == null) { %>
			<a class="nav-link" href="login.jsp?login=no" role="button">Login</a>
		<%} else { %>
			<a class="nav-link" href="LogoutAction.do" role="button">Logout</a>
		<%}%>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="mypage.jsp">Mypage</a>
      </li>
      <li class="nav-item">
     	 <form action="MemberDatailViewAction.do" name="myForm" method="POST">
			<input class="nav-link" type="hidden" name="myhidden" value="${userID}">
			<input type="submit" class="nav-link" value="Myinfo">
		 </form>
      </li>
    </ul>
  </div>
 </nav>
</body>
</html>