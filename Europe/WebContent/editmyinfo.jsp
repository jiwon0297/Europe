<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>my info</title>
</head>
<script type="text/javascript">
	function checkForm(){
		if(document.join.password.value != document.join.passwordconfirm.value){
			alert("비밀번호를 동일하게 입력하세요.");
			return false;
		}
		return true;
	}
</script>
<body>
<%
String userID = (String)session.getAttribute("userID");
String userPW = (String)session.getAttribute("userPW"); 
%>
<!-- 회원 정보 -->
<div class='preloader'><div class='loaded'>&nbsp;</div></div>
        <div class="culmn">
        <jsp:include page="header.jsp" />
        		 <!-- Counter Section --> 
            <section id="counter" class="counter">
                <div class="video_overlay">
                    <div class="container">
                        <div class="row">  
                            <div class="col-sm-12">               
                                <div class="main_counter_area text-center">

                                    <div class="row">
									 <div class="head_title text-center" style="color:white; margin-top:80px;">
                                 	   <h2 style="font-size:50pt;">MY PAGE</h2>
                                    </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!-- End off container --> 
            </section>
        </div>
<br><br><br>

<form name="editinfo" method="post" action="MemberEditAction.do" onsubmit = "return checkForm();" style ="margin:0 auto; width:500px;">
	<small id="fileHelp" class="form-text text-muted" style="color:red; position:relative; left:40px;">※변경은 오직 비밀번호와 닉네임만 가능합니다.※</small>
	<br>
  <fieldset>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px">ID</label>
      <input type="text" name="id" style="background-color:#fbfbfb; width:300px; position: relative; left:95px;" class="form-control" value="${member.getId()}" readonly />
    </div>
    <div class="form-group row">
      <label for="name" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px">Name</label>
      <input type="text" name="name" style="background-color:#fbfbfb; width:300px; position: relative; left:95px;" class="form-control" value="${member.getName()}" disabled />
    </div>
    <div class="form-group row">
      <label for="nickname" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px">Nickname</label>
      <input type="text" name="nickname" style="background-color:#fbfbfb; width:300px; position: relative; left:95px;" class="form-control" value="${member.getNickname()}">
    </div>
    <div class="form-group row">
      <label for="nickname" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px">Password</label>
      <input type="password" name="password" style="background-color:#fbfbfb; width:300px; position: relative; left:95px;" class="form-control" value="${member.getPassword()}">
    </div>
    <div class="form-group row">
      <label for="nickname" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px">Password Confirm</label>
      <input type="password" name="password confirm" style="background-color:#fbfbfb; width:300px; position: relative; left:95px;" class="form-control">
    </div>
    <div class="form-group row">
      <label for="exampleInputEmail1" class="col-sm-2 com-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px">Email address</label>
      <input type="text" name="email" style="background-color:#fbfbfb; width:300px; position: relative; left:95px;" class="form-control" value="${member.getEmail()}" disabled />
    </div>
    <div class="form-group row">
      <label for="phonenumber" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px">Phone Number</label>
      <input type="text" name="phone" style="background-color:#fbfbfb; width:300px; position: relative; left:95px;" class="form-control" value="${member.getPhone()}" disabled />
    </div>
    <div class="form-group row">
      <label for="address" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px">Address</label>
      <input type="text" name="address" style="background-color:#fbfbfb; width:300px; position: relative; left:95px;" class="form-control" value="${member.getAddress()}" disabled />
    </div>
    <div class="form-group row">
      <label for="address" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px">Gender</label>
      <input type="text" name="gender" style="background-color:#fbfbfb; width:300px; position: relative; left:95px;" class="form-control" value="${member.getGender()}" disabled />
    </div>
 </fieldset>
    <div style="position: relative; left:95px;">
    <input type="submit" class="btn btn-default" value="Edit" style="color:white; background-color:#68a5f3;" />
	<input type="button" class="btn btn-default" value="Cancle" style="color:white; background-color:#68a5f3;" onclick="location.href='MemberEditViewAction.do'" />
	</div>
</form>
<br><br><br><br><br>

        <script src="resources/assets/js/vendor/jquery-1.11.2.min.js"></script>
        <script src="resources/assets/js/vendor/bootstrap.min.js"></script>

        <script src="resources/assets/js/jquery.magnific-popup.js"></script>
        <script src="resources/assets/js/jquery.mixitup.min.js"></script>
        <script src="resources/assets/js/jquery.easing.1.3.js"></script>
        <script src="resources/assets/js/jquery.masonry.min.js"></script>

        <!--slick slide js -->
        <script src="resources/assets/css/slick/slick.js"></script>
        <script src="resources/assets/css/slick/slick.min.js"></script>


        <script src="resources/assets/js/plugins.js"></script>
        <script src="resources/assets/js/main.js"></script>
</body>
</html>