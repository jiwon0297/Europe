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
request.setCharacterEncoding("utf-8"); 
session.invalidate();//모든 세션변수 제거
 
response.sendRedirect("index.jsp");
 
%>
</body>
</html>