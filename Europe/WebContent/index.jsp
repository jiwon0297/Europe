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
    <input type='button' value='�α���' 
           onclick="location.href='login.jsp?login=no'">   
  <% 
  }else{%> 
  	<h1>�ȳ��ϼ���! <%=id %>��!</h1>
    <input type='button' value='�α׾ƿ�' 
           onclick="location.href='logout.jsp'"> 
  <% 
  }%> 
</body>
</html>