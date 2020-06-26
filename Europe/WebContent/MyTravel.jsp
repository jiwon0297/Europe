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
        <title>MY TRAVEL</title>
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
        function myTravelAddOpen(){
            window.name = "mytravelForm";
            var _width = 570;
    		var _height = 300;

    		var _left = Math.ceil(( window.screen.width - _width )/2);
    		var _top = Math.ceil(( window.screen.width - _height )/4); 

            window.open("MyTravelAdd.jsp",
                        "travelAddForm", "resizable = no, scrollbars = no, height=" + _height  + ", width=" + _width  + ", left="+ _left + ", top="+ _top);
        }
        
        var httpRequest = null;
        
        // httpRequest 객체 생성
        function getXMLHttpRequest(){
            var httpRequest = null;
        
            if(window.ActiveXObject){
                try{
                    httpRequest = new ActiveXObject("Msxml2.XMLHTTP");    
                } catch(e) {
                    try{
                        httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
                    } catch (e2) { httpRequest = null; }
                }
            }
            else if(window.XMLHttpRequest){
                httpRequest = new window.XMLHttpRequest();
            }
            return httpRequest;    
        }
        
        
        function checkFunc(){
            if(httpRequest.readyState == 4){
                // 결과값을 가져온다.
                var resultText = httpRequest.responseText;
                if(resultText == 1){ 
                    document.location.reload(); // 상세보기 창 새로고침
                }
            }
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
<div class="head_title text-center" style="margin:auto;">
	<h2 style="color:skyblue;">Travel List</h2>
	<div class="separator"></div>
</div>

<c:if test="${userID == null}">
	<div class="head_title text-center">
	<small id="fileHelp" class="form-text text-muted" style="font-size:13pt;">※로그인을 해야만 추가가 가능합니다.※</small>
	</div>
</c:if>

<c:if test="${userID != null}">
	<c:set var="i" value="0" />
	<c:set var="j" value="3" />
	<button style="position:relative; left:1300px; border: 1px solid skyblue; background-color: skyblue; color:white; padding:3px;
	border-top-right-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-bottom-left-radius: 10px;" onclick="myTravelAddOpen();">
	<h3 style="font-style:bold; font-size:11pt; font-weight:bold;">여행 추가하기</h3></button>
	<table border="0" style="width:70%; margin:auto;">
		<c:forEach var="tl" items="${tList}">
			<c:if test="${i%j == 0 }">
			<tr> </c:if>
				<td style="text-align:center;width:300px; height:300px;background:url('resources/assets/images/folder.png'); background-size:200px 200px; background-repeat:no-repeat; background-position:center center;">
				<a href = ""><h2 style="margin-top:60px">${tl.getCountry()}</h2></td>
			<c:if test="${i%j == j-1}">
			</tr></c:if>
		<c:set var="i" value="${i+1}" />
		</c:forEach>
	</table>
</c:if>

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