<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Index</title>
</head>
<body>
<jsp:include page="home.jsp" />
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