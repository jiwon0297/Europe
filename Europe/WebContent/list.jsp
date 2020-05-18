<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.MemberTableDAO" %>
<%@ page import="dao.MarketTableDAO" %>
<%@ page import="dao.NewsTableDAO" %>
<%@ page import="dao.ReviewTableDAO" %>
<%@ page import="dao.TipTableDAO" %>
<%@ page import="dao.TogetherTableDAO" %>
<%@ page import="dto.MemberElementBean" %>
<%@ page import="dto.MarketElementBean" %>
<%@ page import="dto.NewsElementBean" %>
<%@ page import="dto.ReviewElementBean" %>
<%@ page import="dto.TipElementBean" %>
<%@ page import="dto.TogetherElementBean" %>

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

<form action="content.jsp" method="post" style ="margin:0 auto; width:1000px;">
<div class="card mb-3">
  <h3 class="card-header">List</h3>
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
</body>
</html>