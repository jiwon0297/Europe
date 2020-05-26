<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>market</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">MARKET</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<br>
<table>
<tr><td width="100" valign="top">
<jsp:include page="category.jsp" flush="false"></jsp:include>
</td>
<td width="300" valign="top">
<%  
  String id = (String)session.getAttribute("id");  
   
  if (id == null){%> 
    <br><br>
	<a class="nav-link" style="text-align:center; float:left;">로그인을 해야만 글쓰기가 가능합니다.</a>
	<a class="nav-link" href="login.jsp?login=no" role="button" style="text-align:center;">로그인 하러가기</a> 
  <% 
  }else{%> 
  	<p><a href="MarketAddviewAction.do" class="btn btn-primary" role="button">글쓰기</a></p>
  <% 
  }%>
<br><br>
<form action="content.jsp" method="post" style ="margin:0 auto; width:1000px;">
<div class="card mb-3">
  <h3 class="card-header">List(페이지가 아닌 마켓 전체 리스트)</h3>
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
<%
String mode = request.getParameter("mode");
if(mode == null || mode.isEmpty()) mode = "All";
else if (mode == "internal") mode = "internal";			// 국내
else if (mode == "UK") mode = "UK";						// 영국
else if (mode == "France") mode = "France";				// 프랑스
else if (mode == "Switzerland") mode = "Switzerland";	// 스위스
else if (mode == "Germany") mode = "Germany";			// 독일
else if (mode == "Czech") mode = "Czech";				// 체코
else if (mode == "Hungary") mode = "Hungary";			// 헝가리
else if (mode == "Austria") mode = "Austria";			// 오스트리아
else if (mode == "Italy") mode = "Italy";				// 이탈리아
%>
</body>
</html>