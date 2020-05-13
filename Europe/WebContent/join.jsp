<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>join</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3" align="center">Join</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />

<form>
  <fieldset>
    <legend align="center">Join Us</legend>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label">Id</label>
      <div class="col-sm-10">
        <input type="id" class="form-control" id="id" placeholder="Id">
      </div>
    </div>
    <div class="form-group row">
      <label for="name" class="col-sm-2 col-form-label">Name</label>
      <div class="col-sm-10">
        <input type="name" class="form-control" id="name" placeholder="Name">
      </div>
    </div>
    <div class="form-group">
      <label for="exampleInputEmail1">Email address</label>
      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" maxlength="20">@
      <select name="memberEmail2">
					<option>naver.com</option>
					<option>daum.net</option>
					<option>gmail.com</option>
					<option>nate.com</option>
				</select>
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Password</label>
      <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div class="form-group">
			<label for="exampleInputPassword1">Password Confirm</label>
			<input type="password confirm" class="form-control" id="passwordconfirm" placeholder="Password Confirm">
		</div>
    <div class="form-group row">
      <label for="phonenumber" class="col-sm-2 col-form-label">Phone Number</label>
      <div class="col-sm-10">
        <input type="phone1" class="form-control" id="phone1" value="010" maxlength="3">-<input type="phone2" class="form-control" id="phone2" maxlength="4">-<input type="phone3" class="form-control" id="phone3" maxlength="4">
      </div>
    </div>
    <div class="form-group">
      <label for="address">Address</label>
      <input type="address" class="form-control" id="address" placeholder="Address">
    </div>
    <fieldset class="form-group">
      <legend>Gender</legend>
      <div class="form-check">
        <label class="form-check-label">
          <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios1" value="option1" checked="">
          Female
        </label>
      </div>
      <div class="form-check">
      <label class="form-check-label">
          <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios2" value="option2">
          Male
        </label>
      </div>
    </fieldset>
	<button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>