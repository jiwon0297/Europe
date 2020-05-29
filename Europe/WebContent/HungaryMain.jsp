<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
        <style>
        section {
        	background-color : lightslategray;
        	margin-top : -4%;
        }
        </style>
</head>
<body>
        <!-- START SCROLL TO TOP  -->
        <div class="scrollup">
            <a href="#"><i class="fa fa-chevron-up"></i></a>
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
<jsp:include page="countryheader.jsp"/>
<section id="portfolio" class="portfolio sections">
                <div class="container">
                    <div class="row">
                        <div class="main_portfolio">
                            <div class="col-sm-12">
                                <div class="head_title text-center">
                                    <a href="HungaryMain.jsp" style="color:white;"><h2>Hungary</h2></a>
                                    <div class="subtitle" style="color:white;">
                                        Choose the category what you want.
                                    </div>
                                    <div class="separator"></div>
                                    <div><img src="resources/assets/images/hungary.PNG" style="width:800px; height:500px"></div>
                                </div>
                            </div>
                            </div>

                            <div style="clear:both;"></div>  
                        </div>
                    </div>
                    
                    <div class="container" style="position: relative; left:145px">
                    <div class="row">
                        <div class="main_feature text-center">
						<a href="HungaryInfoListViewAction.do" style="color:white">
                            <div class="col-sm-3">
                                <div class="single_feature">
                                    <div class="single_feature_icon">
                                        <i class="fa fa-clone"></i>
                                    </div>
                                    <h4>TRAVEL INFORMATION</h4>
                                    <div class="separator3"></div>
                                    <p>You can share your experience and you can get the information, too</p>
                                </div>
                            </div>
                            </a>
                            
                            <a href="HungaryMarketListViewAction.do" style="color:white">
                            <div class="col-sm-3">
                                <div class="single_feature">
                                    <div class="single_feature_icon">
                                        <i class="fa fa-heart-o"></i>
                                    </div>

                                    <h4>MARKET</h4>
                                    <div class="separator3"></div>
                                    <p>You can exchange your USIM, money etc. you can buy or sell, too.</p>
                                </div>
                            </div>
                            </a>
                            
                            <a href="HungaryTogethersListViewAction.do" style="color:white;">
                            <div class="col-sm-3">
                                <div class="single_feature">
                                    <div class="single_feature_icon">
                                        <i class="fa fa-lightbulb-o"></i>
                                    </div>
                                    <h4>TOGETHER</h4>
                                    <div class="separator3"></div>
                                    <p>You can find the travler to trip together.</p>
                                </div>
                            </div>
                            </a>

                        </div>
                    </div>
                </div>
            </section> <!-- End off Work Section -->   
            
<jsp:include page="country.jsp"/>
</body>
</html>