<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>my page</title>
</head>
<body>
<!-- ����, ���� �� �� -->
<jsp:include page="header.jsp" />
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3" align="center">MY PAGE</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<br><br>

<ul class="nav nav-tabs">
  <li class="nav-item">
    <a class="nav-link active" data-toggle="tab1" href="#">���� �� ��</a>
  </li>

</ul>
<div id="tab1" class="list-group">
	<a href="#" class="list-group-item list-group-item-action">�� ��1</a>
	<a href="#" class="list-group-item list-group-item-action">�� ��2</a>
</div>


</body>
</html>