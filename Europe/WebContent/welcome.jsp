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
		<h1 class="display-3">여행의, 기록</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<%
	Cookie[] cookies = request.getCookies();

	for(int i=0; i<cookies.length; i++){
		String id= cookies[i].getValue();
		if(id.equals("jiwon"))
			out.println(id+"님 안녕하세요." + "<br>");
	}
%>

<a href="logout.jsp">Logout</a>
</body>
</html>