<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문내역</title>
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
        <article>
            <form id="order" action="/mypage/hispory" method="post" name="mypageHistory">
                <h3>주문내역</h3>
                <table class="jumun">
                    <tr>
                        <th>주문번호</th>
                        <th>구매장기</th>
                        <th>구매수량</th>
                        <th>예약병원</th>
                        <th>결제금액</th>
                        <th>결제일자</th>
                        <th>구매날짜</th>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                
                </table>
            </form>
            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        </article>
    </div>
<footer>
	<jsp:include page="/html/hjfooter.html"></jsp:include>
</footer>
</body>
</html>