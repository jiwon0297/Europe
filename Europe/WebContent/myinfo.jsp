<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.MemberTableDAO" %>
<%@ page import="dto.MemberElementBean" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
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
String id = (String)session.getAttribute("id");

Connection conn = null;
conn = ConnectionProvider.getConnection();
MemberTableDAO dao = MemberTableDAO.getInstance();
List<MemberElementBean> mList = dao.infolist(conn, id);
%>
<!-- 회원 정보 -->
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">MY INFORMATION</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<% if(id==null) { %>
	<br><br>
	<a class="nav-link" href="login.jsp?login=no" role="button" style="text-align:center;">로그인하러가기</a>
<%} else { %>
	<br><br>
<form action="joinProcess.jsp" method="post" onsumbmit="return checkForm()" style ="margin:0 auto; width:500px;">
  <fieldset>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label">Id</label>
      <div class="col-sm-10">
        <%= mList.get(0).getId() %>
      </div>
    </div>
    <div class="form-group row">
      <label for="name" class="col-sm-2 col-form-label">Name</label>
      <div class="col-sm-10">
        <%= mList.get(0).getName() %>
      </div>
    </div>
    <div class="form-group row">
      <label for="nickname" class="col-sm-2 col-form-label">Nickname</label>
      <div class="col-sm-10">
        <%= mList.get(0).getNickname() %>
        <input type="button" class="btn btn-primary" value="Edit" onclick="location.href='edit.jsp'" />
      </div>
    </div>
    <div class="form-group row">
      <label for="exampleInputEmail1" class="col-sm-2 com-form-label">Email address</label>
      <div class="col-sm-10">
      <%= mList.get(0).getEmail() %>
		</div>
    </div>
    <div class="form-group row">
      <label for="exampleInputPassword1" class="col-sm-2 col-form-label">Password</label>
      <div class="col-sm-10">
      <input type="button" class="btn btn-primary" value="Edit" onclick="location.href='edit.jsp'" />
      </div>
    </div>
    <div class="form-group row">
      <label for="phonenumber" class="col-sm-2 col-form-label">Phone Number</label>
      <div class="col-sm-10">
        <%= mList.get(0).getPhone() %>
      </div>
    </div>
    <div class="form-group row">
      <label for="address" class="col-sm-2 col-form-label">Address</label>
      <div class="col-sm-10">
      <%= mList.get(0).getAddress() %>
    </div>
    </div>
    <div class="form-group row">
      <label for="address" class="col-sm-2 col-form-label">Gender</label>
      <div class="col-sm-10">
      <%= mList.get(0).getGender() %>
    </div>
    </div>
 </fieldset>
    <div class="button">
	<input type="button" class="btn btn-primary" value="Logout" onclick="location.href='logout.jsp'" />
	</div>
</form>
<%}%>


</body>
</html>