<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="EUC-KR">
<title>Sign up Member</title>
</head>
<body>
<script type="text/javascript">
	function checkForm(){
		if (!document.member.memberId.value){
			alert("아이디를 입력하세요.");
			return false;
		}
		if(!document.member.memberPassword.value){
			alert("비밀번호를 입력하세요.");
			return false;
		}
		if (document.member.memberPassword.value != document.member.memberPasswordConfirmation.value){
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
				<input type="text" name="memberId" class="form-control" value="memberId">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Password</label>
			<div class="col-sm-3">
				<input type="password" name="memberPassword" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Password Confirmation</label>
			<div class="col-sm-3">
				<input type="password" name="memberPasswordConfirmation" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Name</label>
			<div class="col-sm-3">
				<input type="text" name="memberName" class="form-control" value="memberName">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Email</label>
			<div class="col-sm-3">
				<input type="text" name="memberEmail1" maxlength="50">@
				<select name="memberEmail2">
					<option>naver.com</option>
					<option>daum.net</option>
					<option>gmail.com</option>
					<option>nate.com</option>
				</select>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Phone Number</label>
			<div class="col-sm-3">
				<input type="text" name="memberPhone" class="form-control" value="memberPhone">	
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">Address</label>
			<div class="col-sm-5">
				<input type="text" name="memberAddress" class="form-control" value="memberAddress">
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