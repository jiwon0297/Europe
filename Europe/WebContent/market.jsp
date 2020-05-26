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
	<a class="nav-link" style="text-align:center; float:left;">�α����� �ؾ߸� �۾��Ⱑ �����մϴ�.</a>
	<a class="nav-link" href="login.jsp?login=no" role="button" style="text-align:center;">�α��� �Ϸ�����</a> 
  <% 
  }else{%> 
  	<p><a href="MarketAddviewAction.do" class="btn btn-primary" role="button">�۾���</a></p>
  <% 
  }%>
<br><br>
<form action="content.jsp" method="post" style ="margin:0 auto; width:1000px;">
<div class="card mb-3">
  <h3 class="card-header">List(�������� �ƴ� ���� ��ü ����Ʈ)</h3>
  <div class="card-body">
    <a href="content.jsp" class="card-link">����1</a>
  </div>
  <div class="card-body">
    <a href="content.jsp" class="card-link">����2</a>
  </div>
  <div class="card-footer text-muted">
    �켱 ����Ʈ ��
  </div>
  </div>
 </form>
</td>
</tr>
</table>
<%
String mode = request.getParameter("mode");
if(mode == null || mode.isEmpty()) mode = "All";
else if (mode == "internal") mode = "internal";			// ����
else if (mode == "UK") mode = "UK";						// ����
else if (mode == "France") mode = "France";				// ������
else if (mode == "Switzerland") mode = "Switzerland";	// ������
else if (mode == "Germany") mode = "Germany";			// ����
else if (mode == "Czech") mode = "Czech";				// ü��
else if (mode == "Hungary") mode = "Hungary";			// �밡��
else if (mode == "Austria") mode = "Austria";			// ����Ʈ����
else if (mode == "Italy") mode = "Italy";				// ��Ż����
%>
</body>
</html>