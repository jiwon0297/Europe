<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>category</title>
</head>
<body>

<div style = "width:200px; height:500px;">
<ul class="nav nav-pills flex-column">
  <li class="nav-item">
    <a class="nav-link active" href="#">Category</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="list.jsp?mode=internal">국내</a>
  </li>
  <li class="nav-item dropdown">
    <a class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" href="#" aria-haspopup="true" aria-expanded="true">국외</a>
    <div class="dropdown-menu" style="" aria-labelledby="dropdown">
   		<a class="dropdown-item" href="list.jsp?mode=UK">영국</a>
      	<a class="dropdown-item" href="list.jsp?mode=France">프랑스</a>
      	<a class="dropdown-item" href="list.jsp?mode=Switzerland">스위스</a>
      	<a class="dropdown-item" href="list.jsp?mode=Germany">독일</a>
      	<a class="dropdown-item" href="list.jsp?mode=Czech">체코</a>
      	<a class="dropdown-item" href="list.jsp?mode=Hungary">헝가리</a>
      	<a class="dropdown-item" href="list.jsp?mode=Austria">오스트리아</a>
      	<a class="dropdown-item" href="list.jsp?mode=Italy">이탈리아</a>
    </div>
  </li>
</ul>
</div>

</body>
</html>