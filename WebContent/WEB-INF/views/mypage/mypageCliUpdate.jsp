<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
<link rel="stylesheet" href="/css/mypage.css">
</head>
<body>
<header>
        <jsp:include page="/HeaderNFooterJSP/Header.jsp"></jsp:include>
</header>
 <div style="margin: 0 auto;">
        <div class="mypage">
            <h2>마이페이지</h2>
        </div>
        <aside id="menucontainer">
            <ul class="menu">
                <li><a href="./mypage_clientUpdate.html">회원정보 수정</a></li>
                <li><a href="./mypage_order.html">주문내역</a></li>
                <li><a href="./mypage_point.html">포인트조회/충전</a></li>
                <li><a href="./mypage_hospitalbook.html">병원예약조회</a></li>
                <li><a href="./mypage_checkResult.html">검사내역</a></li>
            </ul>
        </aside>
        <article>
            <div id="clientupdate">
                <h3>회원정보 수정</h3>
                <form action="https:/www.naver.com" method="post">
                    <input type="hidden" name="userid" value="">
                    <div id="result-div" style="height: 30px; width: 200px; margin-left: 380px;margin-bottom: 20px;"></div>
                    <table class="cliupdateTable">
                        <tr>
                            <td>아이디</td>
                            <td><input type="text" class="userid1" id="user-id"></td>
                        </tr>
                        </table>
                        <table class="cliupdateTable1" style="background-color: rgba(173, 196, 136, 0.445);">
                            <tr>
                                <td>현재 비밀번호</td>
                                <td><input type="password" name="pw1" id="user-currPw"></td>
                            </tr>
                            <tr>
                                <td>신규 비밀번호</td>
                                <td><input type="password" name="pw2" id="user-newPw"></td>
                            </tr>
                            <tr>
                                <td>비밀번호 확인</td>
                                <td><input type="password" name="pw2" id="user-reNewPw"><br><input type="submit" value="확인" style="margin: 10px 0 3px 100px;width: 50px;cursor:pointer;background-color: rgb(193, 219, 152);border:1px solid rgb(153, 153, 153);border-radius: 3px;"></td>
                            </tr>
                        </table>
                        <table class="cliupdateTable3">
                        <tr>
                            <td>이름</td>
                            <td><input type="text" name="name" id="user-name"></td>
                        </tr>
                        <tr>
                            <td>주민등록번호</td>
                            <td><input type="text" name="zumin" id="zumin"></td>
                        </tr>
                        <tr>
                            <td>연락처</td>
                            <td><input type="text" name="tel" id="tel1" size="3">&nbsp;-&nbsp;<input type="text" name="tel" id="tel2" size="3">&nbsp;-&nbsp;<input type="text" name="tel" id="tel3" size="3"></td>
                        </tr>
                        <tr>
                            <td>이메일</td>
                            <td><input type="text" id="email-id" name="email-id" class="email_id" value="" title="이메일 아이디" placeholder="이메일" maxlength="18" >@
                                <select class="select" name="email-addr" title="이메일 도메인 주소 선택" id="email-addr" onclick="">
                                    <option value="">-선택-</option>
                                    <option value="naver.com">naver.com</option>
                                    <option value="gmail.com">gmail.com</option>
                                    <option value="hanmail.net">hanmail.net</option>
                                    <option value="hotmail.com">hotmail.com</option>
                                    <option value="korea.com">korea.com</option>
                                    <option value="nate.com">nate.com</option>
                                    <option value="yahoo.com">yahoo.com</option>
                                </select></td>
                        </tr>
                        <tr>
                            <td>주소</td>
                            <td><input type="text" name="addr" id="addr"></td>
                        </tr>
                       
                    </table>
                    <div class="cliupdateBtn">
                        <input type="submit" value="정보수정" class="clibt" onclick="return check();"><br>
                        <input type="submit" value="회원탈퇴" class="clibt" onclick="">
                    </div>
                </form>
            </div>
            <br><br><br><br><br><br><br><br><br>
        </article>
    </div>
<footer>
    	<jsp:include page="/HeaderNFooterJSP/Footer.jsp"></jsp:include>
    </footer>
</body>
</html>