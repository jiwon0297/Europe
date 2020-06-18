<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ page import="dao.MemberTableDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<div style="text-align: center">
<h3>* 아이디 중복확인 *</h3>
<%
	String id = (String)request.getParameter("id");
	
	MemberTableDAO dao = MemberTableDAO.getInstance();
	boolean result = dao.confirmId(id);
	
	if(result){
		out.println("이미 사용중인 ID 입니다.");
	}else {
		out.println("사용 가능한 ID 입니다.");
	}
	
	
%>

</body>
</html>