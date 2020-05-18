<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.MemberTableDAO" %>
<%@ page import="dto.MemberElementBean" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login process</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>
<%
	Connection conn = null;
	try{
	 	conn =ConnectionProvider.getConnection();
	 	MemberTableDAO dao = MemberTableDAO.getInstance(); //getInstance
	 	dao.select(conn,id,pw); //select
	 	if(id.equals(id) && pw.equals(pw)){
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
	}catch (SQLException e){
		e.printStackTrace();
	}finally{
		try{
	if(conn!=null) conn.close();
		}catch(SQLException se){
	se.printStackTrace();
		}
	}
%>

</body>
</html>