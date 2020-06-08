<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% request.setCharacterEncoding("euc-kr"); %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function cancel(){
	window.history.back(); 
}
</script>
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
<form action="AddAction.do" method="post" style ="margin:0 auto; width:1000px;">
	<fieldset>
	<div class="form-group row">
      <label for="Category" class="col-sm-2 com-form-label" style="position: relative; font-size:15pt; left:130px;">����/����</label>
      <div style="position: relative; left:95px;">
      <select name="country" style="background-color:#fbfbfb; width:150px; float:left;">
					<option>korea</option>
					<option>england</option>
					<option>france</option>
					<option>swiss</option>
					<option>germany</option>
					<option>hungary</option>
					<option>czech</option>
					<option>italy</option>
	  </select>
	  <select name="cate1" style="background-color:#fbfbfb; width:150px; float:left;">
					<option>information</option>
					<option>market</option>
					<option>together</option>
	  </select>
	</div>
	</div>
	<div class="form-group row">
      <label for="title" class="col-sm-2 col-form-label" style="position: relative; font-size:15pt; left:130px; margin-top:10px;">����</label>
      <input type="text" class="form-control" name="title" placeholder="������ �Է����ּ���." style="background-color:#fbfbfb; width:700px; position: relative; left:95px;">
     </div>
     <div class="form-group">
      <label for="inputfile" style="position: relative; font-size:15pt; left:130px;">����÷��</label>
      <div class="col-sm-10" style="position: relative; left:70px; float:right;">
      <input type="file" class="form-control-file" name="inputfile" aria-describedby="fileHelp">
      <small id="fileHelp" class="form-text text-muted" style="color:red">�ر۰� ���õ� ������ ÷���Ͽ� �ֽʽÿ�.��</small>
    </div>
    </div>
    <div class="form-group">
      <label for="detail" style="position: relative; font-size:15pt; left:130px; margin-top:10px;">����</label>
      <br>
      <textarea class="form-control" name="detail" placeholder="������ �Է����ּ���." style="background-color:#fbfbfb; height:600px; width:830px; position: relative; left:130px;"></textarea>
    </div>
    <input type="hidden" name="name" value="${member.getNickname()}">
	</fieldset>
	<div style="position: relative; left:350px;">
	<input type="submit" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="�ۼ�">
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="���" onclick = "cancel()">
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