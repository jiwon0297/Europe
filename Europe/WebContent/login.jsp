<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<form action="loginprocess.jsp" method="post" style ="margin:0 auto; width:500px;">
  <fieldset>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label">ID</label>
      <div class="col-sm-10">
        <input type="id" class="form-control" name="id" style="width:300px;">
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