<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CountryTravelAdd</title>
<!-- Required meta tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
	<link rel="stylesheet" href="marine/css/nice-select.css">
	<!-- font awesome CSS -->
	<link rel="stylesheet" href="marine/css/magnific-popup.css">
	<!-- swiper CSS -->
	<link rel="stylesheet" href="marine/css/slick.css">
	<!-- style CSS -->
	<link rel="stylesheet" href="marine/css/style.css">
	
<script>

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


function addLocation()
{
    var form = document.getElementById("mylocationadd");

    var location = form.location.value;
    
}

function checkFunc(){
    if(httpRequest.readyState == 4){
        // 결과값을 가져온다.
        var resultText = httpRequest.responseText;
        if(resultText == 1){
            if (opener != null) {
                // 부모창 새로고침
                window.opener.document.location.reload(); 
                opener.travelAddForm = null;
                self.close();
            }
        }
    }
}

</script>
</head>
<body>

<%
	String country = (String)request.getParameter("country");
%>

<% if (country == "England") { %>
	<form name="mylocationadd" target="myLocationForm">
	<div class="section-top-border">
				<h3 class="mb-30">영국 리스트</h3>
				<div class="progress-table-wrap">
					<div class="progress-table">
						<div class="table-row">
							<div>
								<input type="radio" name="location" value="-------------">
							</div>
							<div class="percentage">------구분선-------</div>
						</div>
						<div class="table-row">
							<div >
								<input type="radio" name="location" value="런던 아이">
							</div>
							<div class="country"> <img src="resources/countryimg/eng1.png">런던 아이</div>
							<div class="visit">런던, 템즈 강</div>
							<div class="percentage">런던 도심 일대의 전경을 내려다볼 수 있는 유럽에서 가장 큰 대관람차</div>
						</div>
						<div class="table-row">
							<div>
								<input type="radio" name="location" value="타워 브릿지">
							</div>
							<div class="country"> <img src="resources/countryimg/eng2.png">타워 브릿지</div>
							<div class="visit">런던, 템즈 강</div>
							<div class="percentage">런던 일대의 전경을 조망하기에 더할 나위 없는 전망 명소</div>
						</div>
						<div class="table-row">
							<div>
								<input type="radio" name="location" value="셜록 홈즈 박물관">
							</div>
							<div class="country"> <img src="resources/countryimg/eng3.png">셜록 홈즈 박물관</div>
							<div class="visit">런던, 베이커 스트리트</div>
							<div class="percentage"> ‘셜록 홈즈’의 집과 소설 속 장면을 재현해놓은 박물관</div>
						</div>
						<br>
						<div class="form-group row">
  						<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="addLocation()">
            			<input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            			</div>
					</div>
					
				</div>
			</div>
	</form>
<%} else if (country == "Korea") { %>
<form name = "place" action = "placeAction.do" >
	<div class="section-top-border">
				<h3 class="mb-30">한국 리스트</h3>
				<div class="progress-table-wrap">
					<div class="progress-table">
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="-------------">
							</div>
							<div class="percentage">------구분선-------</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="런던 아이">
							</div>
							<div class="country"> <img src="resources/countryimg/eng1.png">런던 아이</div>
							<div class="visit">런던, 템즈 강</div>
							<div class="percentage">런던 도심 일대의 전경을 내려다볼 수 있는 유럽에서 가장 큰 대관람차</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="타워 브릿지">
							</div>
							<div class="country"> <img src="resources/countryimg/eng2.png">타워 브릿지</div>
							<div class="visit">런던, 템즈 강</div>
							<div class="percentage">런던 일대의 전경을 조망하기에 더할 나위 없는 전망 명소</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="셜록 홈즈 박물관">
							</div>
							<div class="country"> <img src="resources/countryimg/eng2.png">셜록 홈즈 박물관</div>
							<div class="visit">런던, 베이커 스트리트</div>
							<div class="percentage"> ‘셜록 홈즈’의 집과 소설 속 장면을 재현해놓은 박물관</div>
						</div>
						<br>
						<div class="form-group row">
  						<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="addLocation()">
            			<input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            			</div>
					</div>
				</div>
			</div>
	</form>
<%} else if (country == "France") { %>
<form name = "place" action = "placeAction.do" >
	<div class="section-top-border">
				<h3 class="mb-30">프랑스 리스트</h3>
				<div class="progress-table-wrap">
					<div class="progress-table">
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="-------------">
							</div>
							<div class="percentage">------구분선-------</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="에펠탑">
							</div>
							<div class="country"> <img src="resources/countryimg/france1.png">에펠탑</div>
							<div class="visit">파리, Bir-Hakeim역</div>
							<div class="percentage">건축가 ‘에펠’이 지은 파리를 상징하는 세계적인 명소, 해 질 녘부터 다음날 새벽까지 에펠탑 일루미네이션을 하니 놓치지 마세요!</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="몽마르뜨 언덕">
							</div>
							<div class="country"> <img src="resources/countryimg/france2.png">몽마르뜨 언덕</div>
							<div class="visit">파리, Anvers 역</div>
							<div class="percentage">아름다운 풍경을 즐길 수 있는 ‘예술가의 언덕’</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="베르사유 궁전">
							</div>
							<div class="country"> <img src="resources/countryimg/france3.png">베르사유 궁전</div>
							<div class="visit">파리, RER C</div>
							<div class="percentage"> 17세기 프랑스 절대 왕정을 상징하는 웅장하고 화려한 궁전, 왕실의 사치스러운 삶을 엿볼 수 있는 화려한 볼거리가 많아요!</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="디즈니랜드">
							</div>
							<div class="country"> <img src="countryimg/france4.png">디즈니랜드</div>
							<div class="visit">파리, RER선</div>
							<div class="percentage">디즈니와 함께 떠나는 꿈과 환상의 세계! 퍼레이드 시간과 폐장 때는 곳곳이 화려하게 빛나는 일루미네이션도 있으니 놓치지 마세요!</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="몽생미셸">
							</div>
							<div class="country"> <img src="countryimg/france5.png">몽생미셸</div>
							<div class="visit">노르망디, 몽생미셸</div>
							<div class="percentage"> ‘천공의 섬’이라고 불리는 1,300년 역사의 수도원</div>
						</div>
						<br>
						<div class="form-group row">
  						<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="addLocation()">
            			<input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            			</div>
					</div>
				</div>
			</div>
	</form>
<%} else if (country == "Swiss") { %>
<form name = "place" action = "placeAction.do" >
	<div class="section-top-border">
				<h3 class="mb-30">스위스 리스트</h3>
				<div class="progress-table-wrap">
					<div class="progress-table">
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="-------------">
							</div>
							<div class="percentage">------구분선-------</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="뮈렌">
							</div>
							<div class="country"> <img src="resources/countryimg/swiss1.png">런던 아이</div>
							<div class="visit">인터라켄, 라우터브루넨에서 BLM 탑승</div>
							<div class="percentage">알프스 봉우리에 뚤러싸인 아름다운 동화 속 마을, 뮈렌의 전경과 함께 사진을 남길 수 있는 통나무 포토존이 있어요!</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="융프라우요흐">
							</div>
							<div class="country"> <img src="resources/countryimg/swiss2.png">융프라우요흐</div>
							<div class="visit">인터라켄, 인터라켄 동역</div>
							<div class="percentage">해발 3,454미터 고지에 있는 유럽에서 가장 높은 전망대</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="그린델발트">
							</div>
							<div class="country"> <img src="resources/countryimg/swiss3.png">그린델발트</div>
							<div class="visit">인터라켄, 인터라켄 동역</div>
							<div class="percentage">설산과 초원의 풍경이 어우러진 해발 1,034미터 높이에 있는 산악 마을</div>
						</div>
						<br>
						<div class="form-group row">
  						<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="addLocation()">
            			<input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            			</div>
					</div>
				</div>
			</div>
	</form>
<%} else if (country == "Germany") { %>
<form name = "place" action = "placeAction.do" >
	<div class="section-top-border">
				<h3 class="mb-30">독일 리스트</h3>
				<div class="progress-table-wrap">
					<div class="progress-table">
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="-------------">
							</div>
							<div class="percentage">------구분선-------</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="마리엔광장">
							</div>
							<div class="country"> <img src="resources/countryimg/ger1.png">마리엔 광장</div>
							<div class="visit">뮌헨, 구시가지</div>
							<div class="percentage">명 관광지와 쇼핑 스팟이 모여있는 뮌헨 관광의 중심지</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="노이슈반슈타인 성">
							</div>
							<div class="country"> <img src="resources/countryimg/ger2.png">노이슈반슈타인 성</div>
							<div class="visit">퓌센, 마리엔 다리</div>
							<div class="percentage">월트 디즈니 성의 모티브가 된 궁전, 백조의 성이라고 불리는 퓌센의 대표 관광지</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="호프브로이">
							</div>
							<div class="country"> <img src="resources/countryimg/ger3.png">호프브로이</div>
							<div class="visit">뮌헨, 중앙역</div>
							<div class="percentage">세계에서 가장 유명한 맥주 양조장 중 하나</div>
						</div>
						<br>
						<div class="form-group row">
  						<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="addLocation()">
            			<input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            			</div>
					</div>
				</div>
			</div>
	</form>
<%} else if (country == "Czech") { %>
<form name = "place" action = "placeAction.do" >
	<div class="section-top-border">
				<h3 class="mb-30">체코 리스트</h3>
				<div class="progress-table-wrap">
					<div class="progress-table">
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="-------------">
							</div>
							<div class="percentage">------구분선-------</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="하벨 시장">
							</div>
							<div class="country"> <img src="resources/countryimg/cze1.png">하벨 시장</div>
							<div class="visit">프라하, 구시가지</div>
							<div class="percentage">프라하만의 독특한 기념품을 구입할 수 있는 전통 시장</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="체스키 크룸로프 성">
							</div>
							<div class="country"> <img src="resources/countryimg/cze2.png">체스키 크룸로프 성</div>
							<div class="visit">체스키 크룸로프, 버스 터미널</div>
							<div class="percentage">체스키 크룸로프 뷰 포인트로 인기 있는 탑, 360도로 내려다보이는 주황빛의 체스키 크룸로프!</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="프라하 성">
							</div>
							<div class="country"> <img src="resources/countryimg/cze3.png">프라하 성</div>
							<div class="visit">프라하, Prazsky hrad역</div>
							<div class="percentage">세계에서 가장 큰 성으로 기네스북에 등재된 프라하 대표 랜드마크, 다양한 건축 양식이 혼재되어 있는 오래된 성채</div>
						</div>
						<br>
						<div class="form-group row">
  						<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="addLocation()">
            			<input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            			</div>
					</div>
				</div>
			</div>
	</form>
<%} else if (country == "Hungary") { %>
<form name = "place" action = "placeAction.do" >
	<div class="section-top-border">
				<h3 class="mb-30">헝가리 리스트</h3>
				<div class="progress-table-wrap">
					<div class="progress-table">
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="-------------">
							</div>
							<div class="percentage">------구분선-------</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="뉴욕 카페">
							</div>
							<div class="country"> <img src="resources/countryimg/hun1.png">뉴욕 카페</div>
							<div class="visit">부다페스트, 안드라시 거리</div>
							<div class="percentage">고풍스러운 르네상스 인테리어의 분위기 좋은 카페</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="겔레르트 언덕">
							</div>
							<div class="country"> <img src="resources/countryimg/hun2.png">겔레르트 언덕</div>
							<div class="visit">부다페스트, 부다 지구</div>
							<div class="percentage">야경 명소로 유명하며 도심을 조망할 수 있는 선셋 포인트가 있음! 헝가리의 근대 역사가 담긴 장소</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="국회의사당">
							</div>
							<div class="country"> <img src="resources/countryimg/hun3.png">국회의사당</div>
							<div class="visit">부다페스트, 다뉴브 강</div>
							<div class="percentage">역사와 문화가 담겨있는 고딕 양식 건축물, 유럽 3대 야경 명소로 꼽히는 공공기관</div>
						</div>
						<br>
						<div class="form-group row">
  						<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="addLocation()">
            			<input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            			</div>
					</div>
				</div>
			</div>
	</form>
<%} else if (country == "Italy") {%>
<form name = "place" action = "placeAction.do" >
	<div class="section-top-border">
				<h3 class="mb-30">이탈리아 리스트</h3>
				<div class="progress-table-wrap">
					<div class="progress-table">
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="-------------">
							</div>
							<div class="percentage">------구분선-------</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="부라노 섬">
							</div>
							<div class="country"> <img src="resources/countryimg/ita1.png">부라노 섬</div>
							<div class="visit">베니스, 부라노섬</div>
							<div class="percentage">아이유 뮤비 촬영지로도 유명한 알록달록한 건물로 가득 차 있는 매력적인 섬</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="콜로세움">
							</div>
							<div class="country"> <img src="resources/countryimg/ita2.png">콜로세움</div>
							<div class="visit">로마, Piazza del Colosseo</div>
							<div class="percentage">검투사들의 목숨을 건 대결이 펼쳐지던, 로마의 핵심 랜드마크! ‘중세의 세계 7대 불가사의’로 꼽히는 웅장한 건축물</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="바티칸 박물관">
							</div>
							<div class="country"> <img src="resources/countryimg/ita3.png">바티칸 박물관</div>
							<div class="visit">로마, 바티칸 시국</div>
							<div class="percentage">미켈란젤로, 라파엘로 등 유명 작가들의 작품을 볼 수 있는 세계 3대 박물관</div>
						</div>
						<div class="table-row">
							<div class="primary-radio">
								<input type="radio" name="location" value="미켈란젤로 광장">
							</div>
							<div class="country"> <img src="resources/countryimg/ita4.png">미켈란젤로 광장</div>
							<div class="visit">피렌체, Piazzale Michelangelo</div>
							<div class="percentage">피렌체 시내를 파노라마뷰로 즐길 수 있는 전망 명소</div>
						</div>
						<br>
						<div class="form-group row">
  						<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="addLocation()">
            			<input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            			</div>
					</div>
				</div>
			</div>
	</form>
<%} %>


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