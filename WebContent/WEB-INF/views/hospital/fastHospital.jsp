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
    
    <link rel="stylesheet" href="/FONT/fontawesome-free-5.15.4-web/css/all.css">
    <link rel="stylesheet" href="/css/FullLife-Hospital.css">
    <link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Do+Hyeon&display=swap" rel="stylesheet">
    <script src="/js/jquery-3.6.0.min.js"></script>
</head>
<body>
    <script>
        window.onload = function() {
        	 	
            var locationTag = document.querySelector("#location");
			var result = "";
            locationTag.addEventListener("change", function() {
				result = locationTag.value;
				location.href="/hospital/listAll?location="+result;	
            });
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            

=======
=======
>>>>>>> origin/JaeWon
=======
>>>>>>> origin/JaeWon
=======
            

=======
>>>>>>> origin/Hyunseok
            document.querySelector("input[name='chosen-hospital']").addEventListener("change", function(){
            	console.log(this.value);
            });
//             console.log(document.querySelector("input[name='chosen-hospital']:checked").value);

			var BtnTag = querySelector("#submitBtn");
			
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7f17ff42baf25563595b9152103373b9fc4b11f9
=======
=======
>>>>>>> origin/JaeWon
=======
            

>>>>>>> origin/Hyunseok
=======
<<<<<<< HEAD
>>>>>>> origin/Hyunseok
>>>>>>> origin/JaeWon
=======
>>>>>>> origin/JaeWon
>>>>>>> origin/Hyunseok
>>>>>>> origin/JaeWon
        }
    </script>
    <header>
    	<jsp:include page="/HeaderNFooterJSP/Header.jsp"></jsp:include>
    </header>
	<!---------------------------------->
    <main>
        <section class="hospital-div">
            <div class="input-div">
                <div class="input-header">
                    <h1>????????????</h1>
                </div>
                <div class="input-footer">
                    <p>????????? ?????? ??????</p>
                    <h6>????????? ??????????????????.</h6>
                    <c:if test="${sessionScope.userId ne null or requestScope.location ne null }">
                    <form action="/reserve/reservation" method="get">
                    </c:if>
                    <c:if test="${sessionScope.userId eq null or requestScope.location eq null }">
                    <form action="/member/login" method="get">
                    </c:if>
                        <div class="select">
                           	<select name="metro-city" id="location">
                            	<option value="" disabled <c:if test="${requestScope.location eq null }">selected</c:if>>?????? ??????</option>
                                <option value="seoul" <c:if test="${requestScope.location eq 'seoul' }">selected</c:if>>??????</option>
                                <option value="daejeon" <c:if test="${requestScope.location eq 'daejeon' }">selected</c:if>>??????</option>
                                <option value="daegu" <c:if test="${requestScope.location eq 'daegu' }">selected</c:if>>??????</option>
                                <option value="busan" <c:if test="${requestScope.location eq 'busan' }">selected</c:if>>??????</option>
                                <option value="gwangju" <c:if test="${requestScope.location eq 'gwangju' }">selected</c:if>>??????</option>
                            </select>
                        </div>
                        <br><br><br>
                        <input type="submit" value="?????? ????????????">
                    </form>
                </div>
            </div>
            
            <div class="output-div">
                <div>
                	<c:if test="${requestScope.city ne null }">
                    <p><b id="location-result">${city }</b>?????? ????????? ?????? ?????? ??????</p>
                    </c:if>
                    <c:if test="${city eq null }">
                    <p><b id="location-result">??? ??????</b>?????? ????????? ?????? ?????? ??????</p>
                    </c:if>
                </div>
                <div id="hospital-result">
                	<c:forEach items="${requestScope.hospitals }" var="hospital" varStatus="index">
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                		<label><input type="radio" name="chosen-hospital" value="${hospital.hospitalNo }"><b style="font-size:25px">${hospital.hospitalName }</b></label>
=======
=======
>>>>>>> origin/JaeWon
=======
>>>>>>> origin/JaeWon
=======
                		<label><input type="radio" name="chosen-hospital" value="${hospital.hospitalNo }"><b style="font-size:25px">${hospital.hospitalName }</b></label>
=======
>>>>>>> origin/Hyunseok
                		<label>
                		<input type="radio" name="chosen-hospital" value="${hospital.hospitalNo }">
                		<b style="font-size:25px">${hospital.hospitalName }</b>
                		</label>
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7f17ff42baf25563595b9152103373b9fc4b11f9
=======
=======
>>>>>>> origin/JaeWon
=======
                		<label><input type="radio" name="chosen-hospital" value="${hospital.hospitalNo }"><b style="font-size:25px">${hospital.hospitalName }</b></label>
>>>>>>> origin/Hyunseok
=======
<<<<<<< HEAD
>>>>>>> origin/Hyunseok
>>>>>>> origin/JaeWon
=======
>>>>>>> origin/JaeWon
>>>>>>> origin/Hyunseok
>>>>>>> origin/JaeWon
                		<h4 style="margin:10px">${hospital.hospitalAddr }</h4>
                		<a href="#"><h5 style="margin: 0 0 40px 30px">${hospital.hospitalPhone }</h5></a>
                	</c:forEach>
                </div>
            </div>
        </section>
        <section>
            <div class="con1">
                <h1>?????? ?????? ?????? 1,000,000???</h1>
            </div>
            <div>
                <fieldset class="con2">
                    <legend>3D ?????????????????????????</legend>
                    <p>3D ??????????????????(bioprinting)??? ????????? ????????? ????????? ????????? ????????? ?????? ???????????? ????????? ??????
                        ?????? ????????? ?????? ???????????? ????????? ??? ?????? ?????? ????????? ????????? ??? ??? ?????? ????????? ?????? ?????? ??????
                        ??? ?????? ???????????? ????????? ???????????? ????????????. 3D ????????????????????? ?????? 3D ????????? ????????????, ??????
                        ??? ???????????????, ????????? ????????????????????? ????????????. ????????? ?????? (???????????????(????????????), ????????????,
                        ???????????? ????????? ???????????????(bioink)??? 3D ????????????????????? ?????? ???????????? ????????????(printability),
                        ??????(gelation) ??????, ????????????(biodegradability), ???????????????(cell-compatibility), ????????? ?????? ??????
                        (proliferation)??? ??????(differentiation)??? ????????? ??? ?????? ????????? ????????? ??????.????????? ????????? ????????? ????????? ?????? ????????? ????????? ????????? ?????????
                        ????????? ????????? ????????? ?????????????????? ??????????????? ??????????????? ?????? ????????????. ????????????????????? ?????? ??????????????? ??????????????? ?????????
                        ????????? ????????? ??? ????????? ?????? ??? ?????? ?????? ?????? ????????????. ????????????????????? ???????????? ???????????????
                        ??? ????????? ???????????? ????????? ??????????????? ????????? ????????? ????????? ????????? ????????? ????????? ????????? ?????????</p>
                </fieldset>
            </div>
        </section>
        <section class="vid-section">
            <video width="2000px" height="400px" src="https://cdn.thewellbio.com/wp-content/uploads/2020/10/HomeBannerVideo-Mini.mp4" autoplay loop></video>
        </section>
        <section class="intro-section">
            <div class="pic-div">
                <img src="../../../img/aside.png" alt="" style="width: 100%; height: 100%;">
            </div>
            <p style="color:gray;">
         ?????? ???????????? 1??? 95%, 5??? 92% , FullLife??? ????????? ????????? ???????????? ???????????????.</p>
        </section>
    </main>
    <br>
    <!-- ------------------------------ -->
    <footer>
    	<jsp:include page="/HeaderNFooterJSP/Footer.jsp"></jsp:include>
    </footer>
</body>
</html>