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
    <a class="nav-link" href="list.jsp?mode=internal">����</a>
  </li>
  <li class="nav-item dropdown">
    <a class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" href="#" aria-haspopup="true" aria-expanded="true">����</a>
    <div class="dropdown-menu" style="" aria-labelledby="dropdown">
   		<a class="dropdown-item" href="list.jsp?mode=UK">����</a>
      	<a class="dropdown-item" href="list.jsp?mode=France">������</a>
      	<a class="dropdown-item" href="list.jsp?mode=Switzerland">������</a>
      	<a class="dropdown-item" href="list.jsp?mode=Germany">����</a>
      	<a class="dropdown-item" href="list.jsp?mode=Czech">ü��</a>
      	<a class="dropdown-item" href="list.jsp?mode=Hungary">�밡��</a>
      	<a class="dropdown-item" href="list.jsp?mode=Austria">����Ʈ����</a>
      	<a class="dropdown-item" href="list.jsp?mode=Italy">��Ż����</a>
    </div>
  </li>
</ul>
</div>

</body>
</html>