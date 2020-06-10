<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="EUC-KR">
<title>Sign up Member</title>
</head>
<body>
<script type="text/javascript">
	function checkForm(){
		if (!document.member.id.value){
			alert("아이디를 입력하세요.");
			return false;
		}
		if(!document.member.password.value){
			alert("비밀번호를 입력하세요.");
			return false;
		}
		if (document.member.password.value != document.member.passwordconfirm.value){
			alert("비밀번호를 동일하게 입력하세요.");
			return false;
		}
	}
</script>

<div class="jumbotron">
	<div class="container">
		<h1 class="display-3">Sign up member</h1>
	</div>
</div>
<div class="container">
	<form name="member" action="JoinMemberAction.do" method="post" onsubmit="return checkForm();">
		<div class="form-group row">
			<label class="col-sm-2">Member Id</label>
			<div class="col-sm-3">
				<input type="text" name="id" class="form-control" value="id를 입력하세요">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Password</label>
			<div class="col-sm-3">
				<input type="password" name="password" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Password Confirmation</label>
			<div class="col-sm-3">
				<input type="password" name="passwordconfirm" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Address</label>
			<div class="col-sm-3">
				<input type="text" name="address" class="form-control" value="address를 입력하세요">	
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Kind</label>
			<div class="col-sm-5">
				<select name="kind">
				<option>singer</option>
				<option>dancer</option>
				<option>player</option>
				</select>
			</div>
		</div>
		
		<div class="form-group row">
			<label class="col-sm-2">Gender</label>
			<div class="col-sm-3">
				<select name="gender">
				<option>남</option>
				<option>여</option>
				</select>	
			</div>
		</div>
		<div class="form-group row">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-primary" value="Submit">
				<input type="reset" class="btn btn-primary" value="Cancel" onclick="location='index.jsp'">
			</div>
		</div>
		
	</form>
</div>
</body>
</html>