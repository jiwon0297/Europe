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
	conn = ConnectionProvider.getConnection();
	MemberTableDAO dao = MemberTableDAO.getInstance();
	int a = dao.login(conn, id, pw); //insert data
	if(a==1){
		session.setAttribute("id", id);
		session.setAttribute("login","yes");
	} else if(a==2 || a==3){
		out.println("<script>");
		out.println("alert('존재하지 않는 회원정보입니다. 회원가입을 하시거나, 다시 시도해주세요.');");
		out.println("location.href='login.jsp'");
		out.println("</script>"); 
	}
	
	String login = (String)session.getAttribute("login");
	if(login!=null && login.equals("yes")){
		out.println("<script>");
		out.println("alert('로그인 되었습니다. 환영합니다');");
		out.println("location.href='index.jsp'");
		out.println("</script>"); 
	}
	
	
} catch(SQLException e){
	e.printStackTrace();
} finally {
	try {
		if(conn!=null) conn.close();
	} catch(SQLException se){
		se.printStackTrace();
	}
}
%>

</body>
</html>