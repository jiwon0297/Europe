<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("euc-kr"); %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Martine</title>
    <link rel="icon" href="marine/img/favicon.png">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="marine/css/bootstrap.min.css">
    <!-- animate CSS -->
    <link rel="stylesheet" href="marine/css/animate.css">
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="marine/css/owl.carousel.min.css">
    <!-- themify CSS -->
    <link rel="stylesheet" href="marine/css/themify-icons.css">
    <!-- flaticon CSS -->
    <link rel="stylesheet" href="marine/css/flaticon.css">
    <!-- fontawesome CSS -->
    <link rel="stylesheet" href="marine/fontawesome/css/all.min.css">
    <!-- magnific CSS -->
    <link rel="stylesheet" href="marine/css/magnific-popup.css">
    <link rel="stylesheet" href="marine/css/gijgo.min.css">
    <!-- niceselect CSS -->
    <link rel="stylesheet" href="marine/css/nice-select.css">
    <!-- slick CSS -->
    <link rel="stylesheet" href="marine/css/slick.css">
    <!-- style CSS -->
    <link rel="stylesheet" href="marine/css/style.css">
</head>
<body>
<%
String userID = (String)session.getAttribute("userID");
String userPW = (String)session.getAttribute("userPW"); 
%>
<c:forEach var="re" items="${rList}" begin="0" end="0">
 <!--top place start-->
    <section class="event_part section_padding" style="background-image: url('marine/img/${re.getCountry()}.jpg'); background-size:cover; height:400px;">
            <div class="container" style="background-color:white; opacity:0.6; margin-top:-20px">
            <div class="row justify-content-center">
                <div class="col-xl-6"><br><br>
                    <div class="section_tittle text-center" >
                        <a href="${re.getCountry()}${re.getCate1()}ListViewAction.do"><h2 style="font-size:40pt; color:black; margin-top:20px">${re.getCountry()} ${re.getCate1()}</h2></a>
                    </div>
                </div>
            </div>
            </div>
    </section>
    <!--top place end-->
    <div style="background-color:beige;">
       <jsp:include page="header.jsp"/>
    </div>
   			<% if(userID == null && userPW == null) { %>
   			<small id="fileHelp" class="form-text text-muted" style="position:relative; float:right; font-size:13pt; right:20px; margin-top:20px; margin-bottom:20px ">※로그인을 해야만 글쓰기가 가능합니다.※</small>
            <%} else { %>
            <a href="AddviewAction.do" class="btn btn-default" role="button" style="margin-bottom:20px;position:relative; right:20px; color:white; background-color:#68a5f3; float:right">Add &raquo;</a>
            <%}%>
            <input type = "button" class="btn btn-default" style="color:white; background-color:#68a5f3; position:relative; left:20px; margin-bottom:20px" value="Main으로" onclick="location='${re.getCountry()}Main.jsp'">
            <form name="search" action="ReviewSelect.do" method="post">
            	<select name="kind" style="background-color:#fbfbfb; width:100px; float:left;">
					<option name="writer" value="writer">작성자</option>
					<option name="title" value="title">제목</option>
	  			</select>&nbsp;
	  			<input type="text" size="40" name="title"/>&nbsp;
	  			<input type="hidden" name="country" value="${re.getCountry()}">
	  			<input type="hidden" name="cate1" value="${re.getCate1()}">
            	<input type="submit" value="검색"/>
            </form>
            <table class="table table-hover" style="text-align:center">
			<tr style="background-color:lightgray">
				<td style="width:200px; text-align:center; font-size:13pt"><strong>말머리</strong></td>
				<td style="width:300px; text-align:center; font-size:13pt"><strong>작성자</strong></td>
				<td style="text-align:center; font-size:13pt"><strong>제목</strong></td>
			</tr>
				<c:forEach var="re" items="${rList}">
				<tr role="button" style="background-color:beige" onclick="location='DetailViewAction.do?number=${re.getNumber()}'">
					<td style="width:200px; text-align:center; font-size:13pt">[${re.getCountry()}/${re.getCate1()}]</td>
					<td style="width:300px; text-align:center; font-size:13pt">${re.getName()}</td>
					<td style="text-align:center; font-size:13pt">${re.getTitle()}</td>
				</tr>
				</c:forEach>
		</table>
       </c:forEach>
       
       <br><br><br><br><br>
<!-- jquery plugins here-->
    <script src="marine/js/jquery-1.12.1.min.js"></script>
    <!-- popper js -->
    <script src="marine/js/popper.min.js"></script>
    <!-- bootstrap js -->
    <script src="marine/js/bootstrap.min.js"></script>
    <!-- magnific js -->
    <script src="marine/js/jquery.magnific-popup.js"></script>
    <!-- swiper js -->
    <script src="marine/js/owl.carousel.min.js"></script>
    <!-- masonry js -->
    <script src="marine/js/masonry.pkgd.js"></script>
    <!-- masonry js -->
    <script src="marine/js/jquery.nice-select.min.js"></script>
    <script src="marine/js/gijgo.min.js"></script>
    <!-- contact js -->
    <script src="marine/js/jquery.ajaxchimp.min.js"></script>
    <script src="marine/js/jquery.form.js"></script>
    <script src="marine/js/jquery.validate.min.js"></script>
    <script src="marine/js/mail-script.js"></script>
    <script src="marine/js/contact.js"></script>
    <!-- custom js -->
    <script src="marine/js/custom.js"></script>
</body>
</html>