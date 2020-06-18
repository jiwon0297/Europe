<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ page import="dao.MemberTableDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function cancel(){
	self.opener = self;
	self.close();
	}
</script>
<body>
<br><br>
<div style="text-align: center">
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
<br>
<input type="button" value="확인" name="confirm_id" onclick="cancel()" style="color: black; background-color:lightgray;">

</body>
</html>