<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function cancel(){
	window.history.back(); 
}
</script>
<% request.setCharacterEncoding("utf-8"); %>
<body>
<%
String userID = (String)session.getAttribute("userID");
String userPW = (String)session.getAttribute("userPW"); 
%>
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
                                 	   <h2 style="font-size:50pt;">WRITE</h2>
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
<form action="AddAction.do" enctype="multipart/form-data" method="post" style ="margin:0 auto; width:1000px;">
	<fieldset>
	<div class="form-group row">
      <label for="Category" class="col-sm-2 com-form-label" style="position: relative; font-size:15pt; left:130px;">나라/주제</label>
      <div style="position: relative; left:95px;">
      <select name="country" style="background-color:#fbfbfb; width:150px; float:left;">
					<option>Korea</option>
					<option>England</option>
					<option>France</option>
					<option>Swiss</option>
					<option>Germany</option>
					<option>Hungary</option>
					<option>Czech</option>
					<option>Italy</option>
	  </select>
	  <select name="cate1" style="background-color:#fbfbfb; width:150px; float:left;">
					<option>Information</option>
					<option>Market</option>
					<option>Together</option>
	  </select>
	</div>
	</div>
	<div class="form-group row">
      <label for="title" class="col-sm-2 col-form-label" style="position: relative; font-size:15pt; left:130px; margin-top:10px;">제목</label>
      <input type="text" class="form-control" name="title" placeholder="제목을 입력해주세요." style="background-color:#fbfbfb; width:700px; position: relative; left:95px;">
     </div>
     <div class="form-group">
      <label for="inputfile" style="position: relative; font-size:15pt; left:130px;">파일첨부</label>
      <div class="col-sm-10" style="position: relative; left:70px; float:right;">
      <input type="file" class="form-control-file" name="file" aria-describedby="fileHelp">
      <small id="fileHelp" class="form-text text-muted" style="color:red">※글과 관련된 사진만 첨부하여 주십시오.※</small>
    </div>
    </div>
    <div class="form-group">
      <label for="detail" style="position: relative; font-size:15pt; left:130px; margin-top:10px;">내용</label>
      <br>
      <textarea class="form-control" name="detail" placeholder="내용을 입력해주세요." style="background-color:#fbfbfb; height:600px; width:830px; position: relative; left:130px;"></textarea>
    </div>
    <input type="hidden" name="name" value="${member.getId()}">
	</fieldset>
	<div style="position: relative; left:350px;">
	<input type="submit" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="작성">
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="취소" onclick = "cancel()">
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