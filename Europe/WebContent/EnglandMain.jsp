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
    <link rel="stylesheet" href="marine/csxs/animate.css">
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
    <section class="event_part section_padding" style="background-image: url('marine/img/England.jpg'); background-size:cover; height:560px;">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="event_slider owl-carousel">
                        <div class="single_event_slider">
                            <div class="row justify-content-end">
                                <div class="col-lg-6 col-md-6">
                                    <div class="event_slider_content" style="opacity:0.9; background-color:lightgray">
                                        <h5>United Kingdom</h5>
                                        <h2>United Kingdom</h2>
                                        <p>United Kingdom Detail
                                        </p>
                                        <a href="#" class="btn_1">Plan Details</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="single_event_slider">
                            <div class="row justify-content-end">
                                <div class="col-lg-6 col-md-6">
                                    <div class="event_slider_content" style="opacity:0.9; background-color:lightgray">
                                        <h5>United Kingdom</h5>
                                        <h2>United Kingdom</h2>
                                        <p>United Kingdom Detail
                                        </p>
                                        <a href="#" class="btn_1">Plan Details</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="single_event_slider">
                            <div class="row justify-content-end">
                                <div class="col-lg-6 col-md-6">
                                    <div class="event_slider_content" style="opacity:0.9; background-color:lightgray">
                                        <h5>United Kingdom</h5>
                                        <h2>United Kingdom</h2>
                                        <p>United Kingdom Detail
                                        </p>
                                        <a href="#" class="btn_1">Plan Details</a>
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
    <div style="background-color:whitesmoke;">
    	<jsp:include page="header.jsp"/>
    </div>
    <!--::industries start::-->
    <section class="hotel_list section_padding" style="background-color:whitesmoke;">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-6">
                    <div class="section_tittle text-center">
                        <h2 style="font-size:50pt; margin-top:-80px">United Kingdom</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-sm-6">
                    <div class="single_ihotel_list">
                        <a href="EnglandInformationListViewAction.do"><img src="marine/img/information.jpg" alt=""></a>
                        <div class="hotel_text_iner">
                            <h3 style="font-size:23pt;"><a href="EnglandInfoListViewAction.do"> Travel Information</a></h3>
                            <p style="font-size:13pt;">You can share your experience and you can get the information, too</p><br>
							<a href="EnglandInformationListViewAction.do"><h5 style="text-align:right; font-size:13pt;"><span>>> Detail</span></h5></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <div class="single_ihotel_list">
                        <a href="EnglandMarketListViewAction.do"><img src="marine/img/market.jpg" alt=""></a>
                        <div class="hotel_text_iner">
                            <h3 style="font-size:23pt;"><a href="EnglandMarketListViewAction.do"> Market</a></h3>
                            <p style="font-size:13pt;">You can exchange your USIM, money etc. you can buy or sell, too.</p><br>
							<a href="EnglandMarketListViewAction.do"><h5 style="text-align:right; font-size:13pt;"><span>>> Detail</span></h5></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <div class="single_ihotel_list">
                        <a href="EnglandTogetherListViewAction.do"><img src="marine/img/together.jpg" alt=""></a>
                        <div class="hotel_text_iner">
                            <h3 style="font-size:23pt;"><a href="EnglandTogetherListViewAction.do"> Together</a></h3>
                            <p style="font-size:13pt;">You can find the traveler. And you can trip and eat with them.</p><br>
							<a href="EnglandTogetherListViewAction.do"><h5 style="text-align:right; font-size:13pt;"><span>>> Detail</span></h5></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
         <div style="position: relative; left:95px"><jsp:include page="country.jsp"/></div>
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