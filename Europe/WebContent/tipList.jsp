<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.MemberTableDAO" %>
<%@ page import="dao.TipTableDAO" %>
<%@ page import="dto.MemberElementBean" %>
<%@ page import="dto.TipElementBean" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>list</title>
</head>
<body>
<%
	String mode = request.getParameter("mode");
%>
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">TIP</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<table>
<tr><td width="100" valign="top">
<jsp:include page="category.jsp" flush="false"></jsp:include>
</td>
<td width="300" valign="top">
<input type="button" class="btn btn-primary" value="글쓰기" onclick="location='reviewwrite.jsp'">
<br><br>
<%-- list --%>
<form action="content.jsp" method="post" style ="margin:0 auto; width:1000px;">
<div class="card mb-3">
  <h3 class="card-header"><%=mode %> List</h3>
  <div class="card-body">
    <a href="content.jsp" class="card-link">제목1</a>
  </div>
  <div class="card-body">
    <a href="content.jsp" class="card-link">제목2</a>
  </div>
  <div class="card-footer text-muted">
    우선 리스트 끝
  </div>
  </div>
 </form>
</td>
</tr>
</table>

</body>
</html>