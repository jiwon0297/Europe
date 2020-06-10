<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.SingerTableDAO" %>
<%@ page import="dto.SingerElementBean" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Edit Singer</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:include page="header.jsp" /><br><br>
<div style="background-image: url('./resource/main.png'); width:100%;height:230px;">
	<br><br>
	<h1><strong>PLAYER 편집하기</strong></h1>
</div><br><br>
	<div class="container">
		<form name="editSinger" action="EditPlayerElementAction.do" method="post">		
			<div class="form-group row">
			<label class="col-sm-2">번호</label>
			<div class="col-sm-3">
			<input type="text" name="number" class="form-control" value="${pe.getNumber()}">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">분류</label>
			<div class="col-sm-3">
			<input type="text" name="kind" class="form-control" value="${pe.getKind()}">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">성함</label>
			<div class="col-sm-3">
			<input type="text" name="name" class="form-control" value="${pe.getName()}">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">나이</label>
			<div class="col-sm-3">
			<input type="text" name="age" class="form-control" value="${pe.getAge()}">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">성별</label>
			<div class="col-sm-3">
			<select name="gender">
				<option value="">성별선택</option>
				<option value="남" <c:if test="${pe.getGender() =='남'}">selected='selected'</c:if>>남</option>
				<option value="여" <c:if test="${pe.getGender() =='여'}">selected='selected'</c:if>>여</option>
			</select>
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">사는 지역</label>
			<div class="col-sm-3">
			<input type="text" name="area" class="form-control" value="${pe.getArea()}">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">경력사항</label>
			<div class="col-sm-3">
			<textarea rows="5" cols="50" name="career">${pe.getCareer()}</textarea>
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">자기소개</label>
			<div class="col-sm-3">
			<textarea rows="5" cols="80" name="introduction">${pe.getIntroduction()}</textarea>
			</div>
			</div>
			
	 		<div class="form-group row">
			<div class="col-sm-offset-2 col-sm-10">
			<input type="submit" class="btn btn-primary" value="Edit">
			</div>
			</div>
		</form>
	</div>
</body>
</html>