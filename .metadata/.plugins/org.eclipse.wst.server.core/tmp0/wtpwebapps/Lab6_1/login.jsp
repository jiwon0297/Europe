<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3">Login</h1>
	</div>
</div>
	<div class="container">
		<form name="Login" action="LoginAction.do" method="post">
		
			<div class="form-group row">
			<label class="col-sm-2">userID</label>
			<div class="col-sm-3">
			<input type="text" name="userID" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">userPW</label>
			<div class="col-sm-3">
			<input type="password" name="userPW" class="form-control">
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