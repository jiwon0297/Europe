<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.MemberTableDAO" %>
<%@ page import="dto.MemberElementBean" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="description" content="">
        <title>LOGIN</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">


        <link rel="stylesheet" href="resources/assets/css/iconfont.css">
        <link rel="stylesheet" href="resources/assets/css/slick/slick.css">
        <link rel="stylesheet" href="resources/assets/css/slick/slick-theme.css">
        <link rel="stylesheet" href="resources/assets/css/stylesheet.css">
        <link rel="stylesheet" href="resources/assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="resources/assets/css/jquery.fancybox.css">
        <link rel="stylesheet" href="resources/assets/css/bootstrap.css">
        <link rel="stylesheet" href="resources/assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/assets/css/magnific-popup.css">
        <!--        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">-->

        <!--Theme custom css -->
        <link rel="stylesheet" href="resources/assets/css/style.css">

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="resources/assets/css/responsive.css" />


<script type="text/javascript">
	function checkForm(){
		if(!document.login.id.value){
			alert("아이디를 입력하세요.");
			return false;
		}
		
		if(!document.login.pw.value){
			alert("비밀번호를 입력하세요.");
			return false;
		}
		
		return true;
	}
</script>
</head>
<body>
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
                                 	   <h2 style="font-size:50pt;">LOGIN</h2>
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
<form name="login" action="LoginAction.do" method="post" onsubmit = "return checkForm();" style ="margin:0 auto; width:500px;" >
  <fieldset>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label" style="position: relative; font-size:15pt; left:40px; margin-top:10px;">ID</label>
      <input type="text" class="form-control" placeholder="Please Input your ID" name="id" style="width:300px; position: relative; left:95px;">
    </div>
    <div class="form-group row">
      <label for="password" class="col-sm-2 col-form-label" style="position: relative; font-size:15pt; left:40px; margin-top:10px;">Password</label>
        <input type="Password" class="form-control" placeholder="Please Input your Password" name="pw" style="width:300px; position: relative; left:95px;">
    </div>
  </fieldset>
  <div style="position: relative; left:95px;">
  	<input type="submit" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="Login">
  	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="Join" onclick="location='join.jsp'">
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