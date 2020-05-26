<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>join</title>
<style>
div.button{
	margin: auto;
	width : 50%;
}
</style>
<script type="text/javascript">
	function checkForm(){
		if(!document.join.id.value){
			alert("아이디를 입력하세요.");
			return false;
		}
		
		if(!document.join.password.value){
			alert("비밀번호를 입력하세요.");
			return false;
		}
		
		if(document.join.password.value != document.join.passwordconfirm.value){
			alert("비밀번호를 동일하게 입력하세요.");
			return false;
		}
		alert("회원가입이 완료되었습니다. 로그인 해주세요.");
		return true;
	}
</script>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3" align="center">Join</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<br><br>
<form name="join" action="JoinMemberAction.do" method="post" onsubmit = "return checkForm();" style ="margin:0 auto; width:500px;">
  <fieldset>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label">Id</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="id" placeholder="Id" style="width:300px;">
      </div>
    </div>
    <div class="form-group row">
      <label for="name" class="col-sm-2 col-form-label">Name</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="name" placeholder="Name" style="width:300px;">
      </div>
    </div>
    <div class="form-group row">
      <label for="nickname" class="col-sm-2 col-form-label">Nickname</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="nickname" placeholder="Nickname" style="width:300px;">
      </div>
    </div>
    <div class="form-group row">
      <label for="exampleInputEmail1" class="col-sm-2 com-form-label">Email address</label>
      <div class="col-sm-10">
      <input type="text" class="form-control" name="email1" aria-describedby="emailHelp" placeholder="Enter email" maxlength="20" style="width:150px; float:left;"><p style="float:left;">@</p>
      <select name="email2" style="width:150px;">
					<option>naver.com</option>
					<option>daum.net</option>
					<option>gmail.com</option>
					<option>nate.com</option>
				</select>
		</div>
    </div>
    <div class="form-group row">
      <label for="exampleInputPassword1" class="col-sm-2 col-form-label">Password</label>
      <div class="col-sm-10">
      <input type="password" class="form-control" name="password" id="password" placeholder="Password" style="width:300px;">
      </div>
    </div>
    <div class="form-group row">
			<label for="exampleInputPassword1" class="col-sm-2 col-form-label">Password Confirm</label>
			<div class="col-sm-10">
			<input type="password" class="form-control" name ="passwordconfirm" id="passwordconfirm" placeholder="Password Confirm" style="width:300px;">
			</div>
		</div>
    <div class="form-group row">
      <label for="phonenumber" class="col-sm-2 col-form-label">Phone Number</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="phone1" value="010" maxlength="3" style="width:90px; float:left;">
        <p style="float:left;"> - </p><input type="text" class="form-control" name="phone2" maxlength="4" style="width:90px; float:left;">
        <p style="float:left;"> - </p><input type="text" class="form-control" name="phone3" maxlength="4" style="width:90px;">
      </div>
    </div>
    <div class="form-group row">
      <label for="address" class="col-sm-2 col-form-label">Address</label>
      <div class="col-sm-10">
      <input type="text" class="form-control" name="address" placeholder="Address" style="width:500px;">
    </div>
    </div>
 </fieldset>
    <fieldset class="form-group row">
      <label class="col-sm-2 col-form-label">Gender</label>
      <div class="form-check">
        <label class="form-check-label">
          <input type="radio" class="form-check-input" name="gender" id="optionsRadios1" value="female" checked="">Female
        </label>
      </div>
      <div class="form-check">
      <label class="form-check-label">
          <input type="radio" class="form-check-input" name="gender" id="optionsRadios2" value="male"> Male
        </label>
      </div>
    </fieldset>
    <div class="button">
	<input type="submit" class="btn btn-primary" value="Submit">
	<input type="reset" class="btn btn-primary" value="Cancel" onclick="location='index.jsp'">
	</div>
</form>
</body>
</html>