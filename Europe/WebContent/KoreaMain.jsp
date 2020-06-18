<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
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

    <!--top place start-->
    <section class="event_part section_padding" style="background-image: url('marine/img/Korea.jpg'); background-size:cover; height:560px;">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="event_slider owl-carousel">
                        <div class="single_event_slider">
                            <div class="row justify-content-end">
                                <div class="col-lg-6 col-md-6">
                                    <div class="event_slider_content" style="opacity:0.8; background-color:#fff1d3">
                                        <h5 style="font-size:14pt">Korea</h5>
                                        <h2 style="color:black; font-size:25pt">Korea</h2>
                                        <p style="color:gray; font-size:14pt">
                                        	유럽여행 가기전, 국내여행을 떠나보는 건 어떨까요?<br>
                                        	국내 여름여행지 TOP2를 만나보세요!
                                        </p>
                                        <a href="MyTravelAdd.jsp" class="btn_1">Add to MyTravel</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="single_event_slider">
                            <div class="row justify-content-end">
                                <div class="col-lg-6 col-md-6">
                                    <div class="event_slider_content" style="opacity:0.8; background-color:#fff1d3">
                                        <h5 style="font-size:14pt">Korea</h5>
                                        <h2 style="color:black; font-size:25pt">Jeju Island</h2>
                                        <p style="color:gray; font-size:14pt">
                                           	여름하면 빼놓을 수 없는 국내여행지 제주도-!<br>
                                           	맑고 눈부신 해변을 즐길 수 있는 제주도로 떠나보아요
                                        </p>
                                        <a href="MyTravelAdd.jsp" class="btn_1">Add to MyTravel</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="single_event_slider">
                            <div class="row justify-content-end">
                                <div class="col-lg-6 col-md-6">
                                    <div class="event_slider_content" style="opacity:0.8; background-color:#fff1d3">
                                        <h5 style="font-size:14pt">Korea</h5>
                                        <h2 style="color:black; font-size:25pt">Gapyeong</h2>		
                                        <p style="color:gray; font-size:14pt">
                                        	  여름단골 여행지 경기도 가평<br>
                                        	 청춘열차 타고 수상레저 즐기러 가볼까요?
                                     	</p>
                                        <a href="MyTravelAdd.jsp" class="btn_1">Add to MyTravel</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--top place end-->
    <div style="background-color:#e6a76b;">
    	<jsp:include page="header.jsp"/>
    </div>
    <!--::industries start::-->
    <section class="hotel_list section_padding" style="background-color:#daa521;">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-6">
                    <div class="section_tittle text-center">
                        <h2 style="font-size:50pt; margin-top:-80px; color:#810102">Korea</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-sm-6">
                    <div class="single_ihotel_list">
                        <a href="KoreaInformationListViewAction.do"><img src="marine/img/information.jpg" alt=""></a>
                        <div class="hotel_text_iner">
                            <h3 style="font-size:23pt;"><a href="KoreaInfoListViewAction.do" style="color:darkred"> Travel Information</a></h3>
                            <p style="font-size:13pt; color:white;">You can share your experience and you can get the information, too</p><br>
							<a href="KoreaInformationListViewAction.do"style="color:darkred"><h5 style="text-align:right; font-size:13pt;">>> Detail</h5></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <div class="single_ihotel_list">
                        <a href="KoreaMarketListViewAction.do"><img src="marine/img/market.jpg" alt=""></a>
                        <div class="hotel_text_iner">
                            <h3 style="font-size:23pt;"><a href="KoreaMarketListViewAction.do" style="color:darkred"> Market</a></h3>
                            <p style="font-size:13pt; color:white;">You can exchange your USIM, money etc. you can buy or sell, too.</p><br>
							<a href="KoreaMarketListViewAction.do"style="color:darkred"><h5 style="text-align:right; font-size:13pt;">>> Detail</h5></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <div class="single_ihotel_list">
                        <a href="KoreaTogetherListViewAction.do"><img src="marine/img/together.jpg" alt=""></a>
                        <div class="hotel_text_iner">
                            <h3 style="font-size:23pt;"><a href="KoreaTogetherListViewAction.do" style="color:darkred"> Together</a></h3>
                            <p style="font-size:13pt; color:white;">You can find the traveler. And you can trip and eat with them.</p><br>
							<a href="KoreaTogetherListViewAction.do" style="color:darkred"><h5 style="text-align:right; font-size:13pt;">>> Detail</h5></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
         <div style="position: relative; left:95px; background-color:#daa521;"><jsp:include page="country.jsp"/></div>
    </section>
    <!--::industries end::-->


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