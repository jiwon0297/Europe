<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Home</title>
<style>
div.button{
	margin: auto;
	width : 10%;
}
</style>
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
	String userID = (String)session.getAttribute("userID");
	String userPW = (String)session.getAttribute("userPW");
   
  if (userID == null && userPW == null){%> 
  	<br><br>
  	<div class="button">
    <input type='button' value='�α���' class="btn btn-primary"
           onclick="location.href='login.jsp?login=no'" >
    </div>
  <% 
  }else{%> 
  	<a class="nav-link" style="text-align:center;">�ȳ��ϼ���! ${userID}��! </a>
    <input type='button' value='�α׾ƿ�'  class="btn btn-primary"
           onclick="location.href=LogoutAction.do"> 
  <% 
  }%> 
</body>
</html>