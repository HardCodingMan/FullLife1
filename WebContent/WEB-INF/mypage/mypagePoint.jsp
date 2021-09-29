<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/mypage.css">
</head>
<body>
<header>
	<jsp:include page="/html/hjheader.html"></jsp:include>
</header>
	<div style="margin: 0;width: 2080px;">
        <div class="mypage">
            <h2>마이페이지</h2>
        </div>
        <aside id="menucontainer">
            <ul class="menu">
                 <li><a href="/mypage/cliUpdate">회원정보 수정</a></li>
                <li><a href="/mypage/history">주문내역</a></li>
                <li><a href="/mypage/point">포인트조회/충전</a></li>
                <li><a href="/mypage/regHospital">병원예약조회</a></li>
                <li><a href="/mypage/checkResult">검사내역</a></li>
            </ul>
        </aside>
        <article id="point1">
            <h3>포인트 조회</h3>
            <form class="save">보유포인트<input type="text"> </form>
            <button type="button" onclick="location.href='/mypage/chargePoint'" class="bt">포인트 충전</button>
            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        </article>
    </div>
<footer>
	<jsp:include page="/html/hjfooter.html"></jsp:include>
</footer>
</body>
</html>