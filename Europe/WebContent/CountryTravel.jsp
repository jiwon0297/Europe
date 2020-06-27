<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.MemberTableDAO" %>
<%@ page import="dto.MemberElementBean" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="description" content="">
        <title>MY TRAVEL DETAIL FORM</title>
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
        <!--For Plugins external css-->


        <!--Theme custom css -->
        <link rel="stylesheet" href="resources/assets/css/style.css">

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="resources/assets/css/responsive.css" />

<script type="text/javascript">
function deleteConfirm(number){
	if(confirm("정말로 이 여행을 삭제하시겠습니까? 삭제하면 되돌릴 수 없습니다.")==true)
		location.href = "DeleteTravelAction.do?number=" + number;
	else
		return;	
}

function lcDeleteConfirm(number,travelnumber){
	if(confirm("정말로 이 장소를 삭제하시겠습니까? 삭제하면 되돌릴 수 없습니다.")==true)
		location.href = "DeleteLocationAction.do?number=" + number + "&&travelnumber=" + travelnumber;
	else
		return;	
}

function myLocationAddOpen(location_num){
    window.name = "myLocationForm";
    var _width = 1050;
	var _height = 650;

	var _left = Math.ceil(( window.screen.width - _width )/2);
	var _top = Math.ceil(( window.screen.width - _height )/9); 
	
	var number = location_num;
	
    window.open("CountryTravelAction.do?number=" + number,
                "locationAddForm", "resizable = no, height=" + _height  + ", width=" + _width  + ", left="+ _left + ", top="+ _top);
}



</script>
</head>
<body style="height:1700px">
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
                                 	   <h2 style="font-size:50pt;">MY TRAVEL</h2>
                                    </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!-- End off container --> 
            </section>
        </div>
<br><br>
<!-- 나라/날짜 출력 -->
<div class="head_title text-center" style="margin:auto;">
	<br>
	<a href="ListTravelAction.do" style="position:relative; right:400px; color:#d4446c; font-size:11pt"><< 여행 목록으로 돌아가기</a>
	<br><br>
	<p style="position:relative; right:400px; color:#d4446c; font-size:11pt">>> 계획되어있는 여행</p>
	<br><h2 style="background-color:#e5e6ec; font-family:Serif; font-weight: bold; float:left; position:relative; left:530px; color:#635575; font-size:57pt">${tList.getCountry()}</h2>
	<input type="button" style="position:relative; left:50px; margin-top:18px; border: 1px solid #a6a6d0; background-color: #a6a6d0; color:white; padding:3px;
	border-top-right-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-bottom-left-radius: 10px;" value="여행 삭제하기" onclick="deleteConfirm('${tList.getNumber()}')">
	<p style="color:gray; position:relative; margin-top: 20px; font-size:12pt ">${tList.getStartDate()} 에 출발하는 ${tList.getNights()}박 ${tList.getDays()}일 간의 여행</p>
	<hr size="1" width="1000">
</div>
<!-- 추가버튼 -->
<c:if test="${tList.getNumber() != null}">
	<h3 style="font-weight:540; color:#635575; float:left; left: 430px; position:relative; margin-top: 20px; font-size:25pt ">추가된 일정</h3>
	<input type="button" style="position:relative; left:460px; margin-top:25px; border: 1px solid #a6a6d0; background-color: #a6a6d0; color:white; padding:3px;
	border-top-right-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-bottom-left-radius: 10px;" value="장소추가하기" onclick = "myLocationAddOpen('${tList.getNumber()}')">

</c:if>
<!-- 장소리스트 출력 -->
<br><br>
<div style="background-color:beige;width:600px; border-top-right-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-bottom-left-radius: 10px; position:relative; left:500px;">
<table border="0" style="width:70%; margin:auto;">
	<c:forEach var="l" items="${lList}">
		<tr style="text-align:center; width:300px; height:100px;">
		<td>
				<h2 style="float:left; color:#9a5454; font-size:14pt; font-weight:550; position:relative;">• ${l.getLocation()}</h2>
				<input type="button" style="position:relative; right:60px; margin-top:5px; border: 1px solid #a6a6d0; background-color: #a6a6d0; color:white; padding:3px;
	border-top-right-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-bottom-left-radius: 10px;" value="삭제" onclick="lcDeleteConfirm('${l.getNumber()}','${tList.getNumber()}')">
		</td>
		</tr>
	</c:forEach>
</table>
</div>


	
       

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