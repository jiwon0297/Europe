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
<title>join process</title>
</head>
<body>
<%
String id = request.getParameter("id");
String password = request.getParameter("password");
String name = request.getParameter("name");
String phone = request.getParameter("phone1") + "-" + request.getParameter("phone2") + "-" + request.getParameter("phone3") ;
String email = request.getParameter("email1") + "@" + request.getParameter("email2");
String address = request.getParameter("address");
String nickname= request.getParameter("nickname");
String gender = request.getParameter("gender");
MemberElementBean member = new MemberElementBean(id, password,name,phone,email,address,nickname,gender);
%>

<%
Connection conn = null;
try{
   conn = ConnectionProvider.getConnection();
   MemberTableDAO dao = MemberTableDAO.getInstance();
   dao.insert(conn, member); //insert data
   out.println("<script>");
   out.println("alert('회원가입이 완료되었습니다. 로그인 해주세요.');");
   out.println("location.href='login.jsp'");
   out.println("</script>"); 
   
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