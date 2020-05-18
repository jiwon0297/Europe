<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Home</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">여행의, 기록</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
 <%  
  String id = (String)session.getAttribute("id");  
   
  if (id == null){%> 
    <input type='button' value='로그인' 
           onclick="location.href='login.jsp?login=no'">   
  <% 
  }else{%> 
  	<h1>안녕하세요! <%=id %>님!</h1>
    <input type='button' value='로그아웃' 
           onclick="location.href='logout.jsp'"> 
  <% 
  }%> 
</body>
</html>