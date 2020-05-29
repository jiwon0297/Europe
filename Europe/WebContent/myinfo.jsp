<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>my info</title>
<style>
div.button{
	margin: auto;
	width : 50%;
}
</style>
</head>
<body>
<%
String userID = (String)session.getAttribute("userID");
String userPW = (String)session.getAttribute("userPW"); 
%>
<!-- 회원 정보 -->
<jsp:include page="countryheader.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">MY INFORMATION</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<% if(userID == null && userPW == null)  { %>
	<br><br>
	<a class="nav-link" href="login.jsp?login=no" role="button" style="text-align:center;">로그인하러가기</a>
<%} else { %>
	<br><br>
<form method="post" style ="margin:0 auto; width:500px;">
  <fieldset>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label">Id</label>
      <div class="col-sm-10">
        ${member.getId()}
      </div>
    </div>
    <div class="form-group row">
      <label for="name" class="col-sm-2 col-form-label">Name</label>
      <div class="col-sm-10">
        ${member.getName()}
      </div>
    </div>
    <div class="form-group row">
      <label for="nickname" class="col-sm-2 col-form-label">Nickname</label>
      <div class="col-sm-10">
        ${member.getNickName()}
      </div>
    </div>
    <div class="form-group row">
      <label for="exampleInputEmail1" class="col-sm-2 com-form-label">Email address</label>
      <div class="col-sm-10">
      ${member.getEmail()}
		</div>
    </div>
    <div class="form-group row">
      <label for="phonenumber" class="col-sm-2 col-form-label">Phone Number</label>
      <div class="col-sm-10">
        ${member.getPhone()}
      </div>
    </div>
    <div class="form-group row">
      <label for="address" class="col-sm-2 col-form-label">Address</label>
      <div class="col-sm-10">
      ${member.getAddress()}
    </div>
    </div>
    <div class="form-group row">
      <label for="address" class="col-sm-2 col-form-label">Gender</label>
      <div class="col-sm-10">
      ${member.getGender()}
    </div>
    </div>
 </fieldset>
    <div class="button">
    <input type="button" class="btn btn-primary" value="Edit" onclick="location.href=MemberEditViewAction.do" />
	<input type="button" class="btn btn-primary" value="Logout" onclick="location.href=LogoutAction.do" />
	</div>
</form>
<%}%>


</body>
</html>