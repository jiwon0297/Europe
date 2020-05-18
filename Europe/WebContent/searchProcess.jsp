<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.ReviewTableDAO" %>
<%@ page import="dto.ReviewElementBean" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Search Process</title>
</head>
<body>
<%
	String title = request.getParameter("title");
%>
<%
	Connection conn = null;
	try{
	 	conn =ConnectionProvider.getConnection();
	 	ReviewTableDAO dao = ReviewTableDAO.getInstance(); //getInstance
	 	dao.select(conn,title);
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