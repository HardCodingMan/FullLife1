<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FullLife</title>
    
    <link rel="stylesheet" href="../../../FONT/fontawesome-free-5.15.4-web/css/all.css">
    <link rel="stylesheet" href="../../../CSS/FullLife-Hospital.css">
    <link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Do+Hyeon&display=swap" rel="stylesheet">
</head>
<body>
    <script>
        window.onload = function() {
        	 	
            var locationTag = document.querySelector("#location");
            var hospitalRadio = document.querySelector("#hospital-name");
			var result = "";
            locationTag.addEventListener("change", function() {
				result = locationTag.value;
				location.href="/hospital/listAll?location="+result;
				
            });
            
        }
    </script>
    <header>
        <div id="logo">
            <img src="../../../img/FullLife_Logo.png" alt="">
        </div>
        <div id="blank"></div>
        <div id="header-menu">
            <ul>
                <li class="main-menu"><a href="#">장기이식</a></li>
                <li class="main-menu">
                    <a href="#">후원</a>
                    <ul class="serv-menu">
                        <li><a href="#">후원</a></li>
                        <li><a href="#">후원게시판</a></li>
                        <li><a href="#">신청게시판</a></li>
                    </ul>
                </li>
                <li class="main-menu">
                    <a href="#">상담</a> 
                    <ul class="serv-menu">
                        <li><a href="#">FAQ</a></li>
                        <li><a href="#">문의하기</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <div id="btn-div">
            <c:if test="${sessionScope.userId eq null }">
            	<button><a href="/member/login">LOGIN</a></button>
            </c:if>
            <c:if test="${sessionScope.userId ne null }">
            	<button style="width:90px;"><a href="/member/myInfo?userId=${sessionScope.userId }" style="font-weight: 800;">
            	마이페이지</a></button>
            </c:if>
        </div>
    </header>
<!--     ------------------------------ -->
    <main>
        <section class="hospital-div">
            <div class="input-div">
                <div class="input-header">
                    <h1>협력병원</h1>
                </div>
                <div class="input-footer">
                    <p>가까운 병원 찾기</p>
                    <h6>지역을 선택해주세요.</h6>
                    <form action="#" method="get">
                        <div class="select">
                            <c:if test="${requestScope.location eq '' || requestScope.location eq null}">
                            <select name="metro-city" id="location">
                            	<option value="" selected disabled>지역 선택</option>
                                <option value="seoul">서울</option>
                                <option value="daejeon">대전</option>
                                <option value="daegu">대구</option>
                                <option value="busan">부산</option>
                                <option value="gwangju">광주</option>
                            </select>
                            </c:if>
                            <c:if test="${requestScope.location eq 'seoul' }">
                           	<select name="metro-city" id="location">
                            	<option value="" disabled>지역 선택</option>
                                <option value="seoul" selected>서울</option>
                                <option value="daejeon">대전</option>
                                <option value="daegu">대구</option>
                                <option value="busan">부산</option>
                                <option value="gwangju">광주</option>
                            </select>
                            </c:if>
                            <c:if test="${requestScope.location eq 'daejeon' }">
                           	<select name="metro-city" id="location">
                            	<option value="" disabled>지역 선택</option>
                                <option value="seoul">서울</option>
                                <option value="daejeon" selected>대전</option>
                                <option value="daegu">대구</option>
                                <option value="busan">부산</option>
                                <option value="gwangju">광주</option>
                            </select>
                            </c:if>
                            <c:if test="${requestScope.location eq 'daegu' }">
                           	<select name="metro-city" id="location">
                            	<option value="" disabled>지역 선택</option>
                                <option value="seoul">서울</option>
                                <option value="daejeon">대전</option>
                                <option value="daegu" selected>대구</option>
                                <option value="busan">부산</option>
                                <option value="gwangju">광주</option>
                            </select>
                            </c:if>
                            <c:if test="${requestScope.location eq 'busan' }">
                           	<select name="metro-city" id="location">
                            	<option value="" disabled>지역 선택</option>
                                <option value="seoul">서울</option>
                                <option value="daejeon">대전</option>
                                <option value="daegu">대구</option>
                                <option value="busan"selected>부산</option>
                                <option value="gwangju">광주</option>
                            </select>
                            </c:if>
                            <c:if test="${requestScope.location eq 'gwangju' }">
                           	<select name="metro-city" id="location">
                            	<option value="" disabled>지역 선택</option>
                                <option value="seoul">서울</option>
                                <option value="daejeon">대전</option>
                                <option value="daegu">대구</option>
                                <option value="busan">부산</option>
                                <option value="gwangju"selected>광주</option>
                            </select>
                            </c:if>
                        </div>
                        <br><br><br>
                        <input type="submit" value="바로 예약하기">
                    </form>
                </div>
            </div>
            
            <div class="output-div">
                <div>
                	<c:if test="${requestScope.city ne null }">
                    <p><b id="location-result">${city }</b>에서 가까운 병원 조회 결과</p>
                    </c:if>
                    <c:if test="${city eq null }">
                    <p><b id="location-result">내 지역</b>에서 가까운 병원 조회 결과</p>
                    </c:if>
                </div>
                <div id="hospital-result">
                	<c:forEach items="${requestScope.hospitals }" var="hospital" varStatus="index">
                		<label><input type="radio" id="hospital-name" name="chosen-hospital"><b style="font-size:25px">${hospital.hospitalName }</b></label>
                		<h4 style="margin:10px">${hospital.hospitalAddr }</h4>
                		<a href="#"><h5 style="margin: 0 0 40px 30px">${hospital.hospitalPhone }</h5></a>
                	</c:forEach>
                </div>
            </div>
        </section>
        <section>
            <div class="con1">
                <h1>수술 성공 사례 1,000,000건</h1>
            </div>
            <div>
                <fieldset class="con2">
                    <legend>3D 바이오프린팅이란?</legend>
                    <p>3D 바이오프린팅(bioprinting)은 인체의 복잡한 구조의 조직과 기관을 닮은 구조체를 컴퓨터 프로
                        그램 설계를 통해 정확하게 구현할 수 있고 환자 맞춤형 치료를 할 수 있는 장점이 있어 조직 공학
                        과 재생 의약에서 활발히 연구되는 기술이다. 3D 바이오프린팅은 주로 3D 프린터 하드웨어, 컴퓨
                        터 프로그래밍, 그리고 바이오잉크으로 구성된다. 세포와 물질 (세포외기질(매트릭스), 성장인자,
                        입자들로 구성된 바이오잉크(bioink)는 3D 바이오프린팅의 핵심 소재이며 인쇄적성(printability),
                        젤화(gelation) 특성, 생분해성(biodegradability), 세포적합성(cell-compatibility), 그리고 세포 성장
                        (proliferation)과 분화(differentiation)를 조절할 수 있는 특성을 가져야 한다.다양한 세포로 구성된 기능을 가진 인체의 조직과 기관을 만들어
                        손상된 조직과 기관을 대체하는것은 조직공학과 재생의약의 주된 목표이다. 바이오프린팅은 이런 조직공학과 재생의약의 목표를
                        빠르게 실현할 수 있도록 도울 수 있는 최근 핵심 기술이다. 바이오프린팅은 자동화된 바이오프린
                        터 기술을 기반으로 세포와 생체재료를 이용해 원하는 삼차원 구조의 조직과 기관을 만드는 것이다</p>
                </fieldset>
            </div>
        </section>
        <section class="vid-section">
            <video width="2000px" height="400px" src="https://cdn.thewellbio.com/wp-content/uploads/2020/10/HomeBannerVideo-Mini.mp4" autoplay loop></video>
        </section>
        <section class="intro-section">
            <div class="pic-div">
                <img src="../../../	img/aside.png" alt="" style="width: 100%; height: 100%;">
            </div>
            <p style="color:gray;">
         평균 생존율은 1년 95%, 5년 92% , FullLife는 언제나 최고의 연구진과 함께합니다.</p>
        </section>
    </main>
    <br>
    <!-- ------------------------------ -->
    <footer class="footer">
        <div>
            <div class="footer-field1">
                <h4>QUICK LINKS</h4> <br>
                <a href="#">Distributors</a> <br>
                <a href="#">Products </a><br>
                <a href="#">News & Events</a> <br>
                <input type="button" value="GET THE NEWSLETTER">
            </div>
            <div class="footer-field2">
                <h4>LATEST APPLICATION NOTES</h4>
                <p>Advanced 3D Luminal Breast Cancer Model in FullLife
                    :Long-term 3D Cell Culture and Co-culture with Fibroblast Cells
                    <br><br>
                    Long Term 3D Tumor Spheroid Culture in VitroGel Hydrogel Matrix
                    <br><br>
                    3D Invasion of Giloblastoma Cells in vitro Gel Hydrogel System
                </p>
            </div>
            <div class="footer-field3">
                <h4>RESOURCES</h4>
                <p>Citation/Publications <br>
                    Knowledge Base /FAQ <br>
                    Video Protocols <br></p>
                    <hr>
                <p> Order Support <br>
                    Track Online Order Status
                </p>
            </div>
            <div class="footer-field4">
                <h4>CONTACT INFO</h4>
                <p>FullLife BioScience Inc. <br>
                    Seoul Korea <br>
                    Seocho-dong, Gangnam-gu, 81634
                    <br>
                    <br>
                    866.3D.CELLS | 010.3232.1010 <br>
                    Phone: 010-1234-1234 <br>
                    Faxes: 02-123-1234 <br>
                    Email: office@fulllife.com <br>
                    Email: support@fulllife.com <br>
                    <div class="contact-logo">
                        <a href="#"><i class="fab fa-facebook"></i></a>
                        <a href="#"><i class="fab fa-instagram-square"></i></a>
                        <a href="#"><i class="fab fa-youtube"></i></a>
                        <a href="#"><i class="fab fa-twitter-square"></i></a>
                    </div>
                </p>

            </div>
        </div>
    </footer>
</body>
</html>