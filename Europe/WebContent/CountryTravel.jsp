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
        <link rel="stylesheet" href="resources/ssets/css/plugins.css" />

        <!--Theme custom css -->
        <link rel="stylesheet" href="resources/assets/css/style.css">

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="resources/assets/css/responsive.css" />

        <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
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
    var _width = 1200;
	var _height = 500;

	var _left = Math.ceil(( window.screen.width - _width )/2);
	var _top = Math.ceil(( window.screen.width - _height )/4); 
	
	var number = location_num;
	
    window.open("CountryTravelAction.do?number=" + number,
                "locationAddForm", "resizable = no, height=" + _height  + ", width=" + _width  + ", left="+ _left + ", top="+ _top);
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
	<h2 style="color:skyblue;">${tList.getCountry()}</h2>
	<p>${tList.getNights()}박 ${tList.getDays()}일</p>
	<p>출발 날짜 : ${tList.getStartDate()}</p>
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="삭제" onclick="deleteConfirm('${tList.getNumber()}')">
	<div class="separator"></div>
</div>
<!-- 추가버튼 -->
<c:if test="${tList.getNumber() != null}">
	<input type="button" style=" border: 1px solid skyblue; background-color: skyblue; color:white; padding:3px;
	border-top-right-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-bottom-left-radius: 10px;" value="추가하기" onclick = "myLocationAddOpen('${tList.getNumber()}')">
</c:if>
<!-- 장소리스트 출력 -->
<br><br>
<table border="0" style="width:70%; margin:auto;">
	<c:forEach var="l" items="${lList}">
		<tr>
			<td style="text-align:center;width:300px; height:300px; background-size:200px 200px; background-repeat:no-repeat; background-position:center center;">
				<h2>${l.getLocation()}</h2><input type="button" style="color:blue;  border: 1px solid white; background-color:white;" value="[삭제]" onclick="lcDeleteConfirm('${l.getNumber()}','${tList.getNumber()}')">
			</td>
		<tr>
	</c:forEach>
</table>


	
       

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