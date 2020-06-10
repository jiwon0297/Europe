<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>
<jsp:include page="header.jsp" /><br><br>
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3">Login</h1>
	</div>
</div>
	<div class="container">
		<form name="Login" action="LoginAction.do" method="post">
		
			<div class="form-group row">
			<label class="col-sm-2">아이디</label>
			<div class="col-sm-3">
			<input type="text" name="id" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">비밀번호</label>
			<div class="col-sm-3">
			<input type="password" name="pw" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<div class="col-sm-offset-2 col-sm-10">
			<input type="submit" class="btn btn-primary" value="Login">
			</div>
			</div>
			
			<div class="form-group row">
			<div class="col-sm-offset-2 col-sm-10">
			<p><a href="member.jsp" class="btn btn-secondary" role="button">join</a>
			</div>
			</div>

		</form>
	</div>
</body>
</html>