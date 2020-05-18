<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.MemberTableDAO" %>
<%@ page import="dao.ReviewTableDAO" %>
<%@ page import="dto.MemberElementBean" %>
<%@ page import="dto.ReviewElementBean" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Add Review</title>
</head>
<body>
<%
int number = 1;
String country = request.getParameter("category1");		// ���� ����
String cate1 = request.getParameter("category2");		// ���Ӹ� ����
String name = "bbb";		// �̸�
String title = request.getParameter("title");		// ����
// String file = request.getParameter("file");		-> ���� �ҷ�����
String detail = request.getParameter("content");	// ����

ReviewElementBean re = new ReviewElementBean(number, country, cate1, name, title, detail);
%>

<%
	Connection conn = null;
try {
	conn = ConnectionProvider.getConnection();
	ReviewTableDAO dao = ReviewTableDAO.getInstance();	
	dao.insert(conn, re);	// insert
	response.sendRedirect("review.jsp");
} catch(SQLException e){
	//Handle errors for JDBC
	e.printStackTrace();
} finally {
	//finally block used to close resources
	try {
		if(conn!=null) conn.close();
	} catch(SQLException se){
		se.printStackTrace();
	}//end finally try
}//end try
%>

</body>
</html>