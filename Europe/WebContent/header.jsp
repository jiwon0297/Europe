<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>header</title>
<script>
function mySubmit(val){
  var f = document.myForm;
  f.myhidden.value = val;
  f.submit();
}
</script>
</head>
<body>
<%
String id = (String)session.getAttribute("id");  
%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor03" aria-controls="navbarColor03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor03">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
		<% if(id==null) { %>
			<a class="nav-link" href="login.jsp?login=no" role="button">Login</a>
		<%} else { %>
			<a class="nav-link" href="logout.jsp" role="button">Logout</a>
		<%}%>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="mypage.jsp">Mypage</a>
      </li>
      <li class="nav-item">
     	 <form action="MemberDatailViewAction.do" name="myForm" method="POST">
			<input class="nav-link" type="hidden" name="myhidden" value="<%=id%>">
		 </form>
        <a class="nav-link" href="#" onclick="mySubmit('jiwon')">Myinfo</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
 </nav>
</body>
</html>