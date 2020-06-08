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
<br><br><br><br>

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