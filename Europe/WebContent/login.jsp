<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.MemberTableDAO" %>
<%@ page import="dto.MemberElementBean" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
<style>
div.button{
	margin: auto;
	width : 50%;
}
</style>
<script type="text/javascript">
	function checkForm(){
		if(!document.login.id.value){
			alert("아이디를 입력하세요.");
			return false;
		}
		
		if(!document.login.pw.value){
			alert("비밀번호를 입력하세요.");
			return false;
		}
		
		return true;
	}
</script>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">Login Page</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<br><br>
<form name="login" action="loginprocess.jsp" method="post" onsubmit = "return checkForm();" style ="margin:0 auto; width:500px;">
  <fieldset>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label">ID</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="id" style="width:300px;">
      </div>
    </div>
    <div class="form-group row">
      <label for="Password" class="col-sm-2 col-form-label">Password</label>
      <div class="col-sm-10">
        <input type="Password" class="form-control" name="pw" style="width:300px;">
      </div>
    </div>
  </fieldset>
  <div class="button">
  	<input type="submit" class="btn btn-primary" value="Login">
  	<input type="button" class="btn btn-primary" value="Join" onclick="location='join.jsp'">
  </div>
</form>    
</body>
</html>