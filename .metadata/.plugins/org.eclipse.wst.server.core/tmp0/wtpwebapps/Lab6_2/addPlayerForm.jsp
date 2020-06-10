<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Add Player</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:include page="header.jsp" /><br><br>
<div style="background-image: url('./resource/main.png'); width:100%;height:230px;">
	<br><br>
	<h1><strong>PLAYER등록하기</strong></h1>
</div><br><br>
	<div class="container">
		<form name="addPlayer" action="AddPlayerElementAction.do" method="post">		
			<div class="form-group row">
			<label class="col-sm-2">번호</label>
			<div class="col-sm-3">
			<input type="text" name="number" class="form-control" value="숫자로 입력해주세요.">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">분류</label>
			<div class="col-sm-3">
			<input type="text" name="kind" class="form-control" value="PLAYER라고 입력해주세요">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">성함</label>
			<div class="col-sm-3">
			<input type="text" name="name" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">나이</label>
			<div class="col-sm-3">
			<input type="text" name="age" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">성별</label>
			<div class="col-sm-3">
			<select name="gender">
				<option value="">성별선택</option>
				<option value="남">남</option>
				<option value="여">여</option>
			</select>
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">사는 지역</label>
			<div class="col-sm-3">
			<input type="text" name="area" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">경력사항</label>
			<div class="col-sm-3">
			<textarea rows="5" cols="50" name="career">300자 이내로 적어주세요</textarea>
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">자기소개</label>
			<div class="col-sm-3">
			<textarea rows="5" cols="80" name="introduction">500자 이내로 적어주세요</textarea>
			</div>
			</div>
			
	 		<div class="form-group row">
			<div class="col-sm-offset-2 col-sm-10">
			<input type="submit" class="btn btn-primary" value="Add">
			</div>
			</div>
		</form>
	</div>
</body>
</html>