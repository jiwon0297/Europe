<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>join</title>
<style>
form{
	margin: 0 auto;
	width : 500px;
}
div.button{
	margin: auto;
	width : 50%;
}
</style>
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
<form>
  <fieldset>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label">Id</label>
      <div class="col-sm-10">
        <input type="id" class="form-control" id="id" placeholder="Id" style="width:300px;">
      </div>
    </div>
    <div class="form-group row">
      <label for="name" class="col-sm-2 col-form-label">Name</label>
      <div class="col-sm-10">
        <input type="name" class="form-control" id="name" placeholder="Name" style="width:300px;">
      </div>
    </div>
    <div class="form-group row">
      <label for="nickname" class="col-sm-2 col-form-label">Nickname</label>
      <div class="col-sm-10">
        <input type="nickname" class="form-control" id="nickname" placeholder="Nickname" style="width:300px;">
      </div>
    </div>
    <div class="form-group row">
      <label for="exampleInputEmail1" class="col-sm-2 com-form-label">Email address</label>
      <div class="col-sm-10">
      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" maxlength="20" style="width:150px; float:left;"><p style="float:left;">@</p>
      <select name="memberEmail2" style="width:150px;">
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
      <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" style="width:300px;">
      </div>
    </div>
    <div class="form-group row">
			<label for="exampleInputPassword1" class="col-sm-2 col-form-label">Password Confirm</label>
			<div class="col-sm-10">
			<input type="password confirm" class="form-control" id="passwordconfirm" placeholder="Password Confirm" style="width:300px;">
			</div>
		</div>
    <div class="form-group row">
      <label for="phonenumber" class="col-sm-2 col-form-label">Phone Number</label>
      <div class="col-sm-10">
        <input type="phone1" class="form-control" id="phone1" value="010" maxlength="3" style="width:90px; float:left;">
        <p style="float:left;"> - </p><input type="phone2" class="form-control" id="phone2" maxlength="4" style="width:90px; float:left;">
        <p style="float:left;"> - </p><input type="phone3" class="form-control" id="phone3" maxlength="4" style="width:90px;">
      </div>
    </div>
    <div class="form-group row">
      <label for="address" class="col-sm-2 col-form-label">Address</label>
      <div class="col-sm-10">
      <input type="address" class="form-control" id="address" placeholder="Address" style="width:500px;">
    </div>
    </div>
    <fieldset class="form-group row">
      <label class="col-sm-2 col-form-label">Gender</label>
      <div class="form-check">
        <label class="form-check-label">
          <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios1" value="option1" checked="">Female
        </label>
      </div>
      <div class="form-check">
      <label class="form-check-label">
          <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios2" value="option2"> Male
        </label>
      </div>
    </fieldset>
	<div class="button"><button type="submit" class="btn btn-primary">Submit</button></div>
</form>
</body>
</html>