<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
	String id, pw;
	String jiwon = "jiwon";
	String pass = "1234";
%>

<%
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	
	if(id.equals(jiwon) && pw.equals(pass)){
		Cookie cookie = new Cookie("id",id);
		cookie.setMaxAge(60); //1�е��� ����
		response.addCookie(cookie);
		response.sendRedirect("welcome.jsp");
	} else if(id.equals("") || pw.equals("")){
		out.println("<script>");
		out.println("alert('���̵�� ��й�ȣ�� �Է����ּ���.');");
		out.println("location.href='login.jsp'");
		out.println("</script>"); 
	} else {
		out.println("<script>");
		out.println("alert('���̵�� ��й�ȣ�� ��ġ�����ʽ��ϴ�.');");
		out.println("location.href='login.jsp'");
		out.println("</script>"); 
	}
%>
</body>
</html>