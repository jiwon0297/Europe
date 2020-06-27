<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>HEADER</title>
        <meta name="description" content="">
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
		<link rel="stylesheet" href="resources/assets/css/bootstrap-theme.min.css">



        <!--Theme custom css -->
        <link rel="stylesheet" href="resources/assets/css/style.css">

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="resources/assets/css/responsive.css" />

</head>
<body>
<%
String userID = (String)session.getAttribute("userID");
String userPW = (String)session.getAttribute("userPW"); 
%>
<div class="work_menu text-center">
	<div id="filters" class="toolbar mb2 mt2">
		<button class="btn-md fil-cat filter" onclick="location='index.jsp'" style="font-size : 15pt;">HOME</button>
		<button class="btn-md fil-cat filter" onclick="location='main.jsp'" style="font-size : 15pt;">MENU</button>
		<% if(userID == null && userPW == null) { %>
		<button class="btn-md fil-cat filter" onclick="location='login.jsp'" style="font-size : 15pt; color:orangered">LOGIN/JOIN</button>
		<%} else { %>
		<button class="btn-md fil-cat filter" onclick="location='LogoutAction.do'" style="font-size : 15pt; color:orangered">LOGOUT</button>
		<button class="btn-md fil-cat filter" onclick="location='MemberDetailViewAction.do'" style="font-size : 15pt;">MY PAGE</button>
		<button class="btn-md fil-cat filter" onclick="location='ListTravelAction.do'" style="font-size : 15pt;">MY TRAVEL</button>
		<%}%>
	</div> 
</div>
</body>
</html>