<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FullLife</title>
<link rel="stylesheet" href="/m_css/m_member_list.css">
</head>
<body>
    <header>
        <div id="logo">
            <a href="#"><img src="/img/fulllife로고3 (1).png" alt=""></a>
        </div>
        <div id="logout">
            <button>로그아웃</button>
        </div>
    </header>
    <aside id="left-aside">
        <div id="main-ul">
            <ul>
                <li class="main-li" id="choice"><a href="/manager/m_member_list">&nbsp;회원 정보 관리</a></li>
                <li class="main-li"><a href="/manager/m_order_list">&nbsp;주문 관리</a></li>
                <li class="serv-li">
                    <a href="/manager/m_support_list">&nbsp;게시판 관리</a>
                    <div class="board-class">
                        <ul>
                            <li><a href="/manager/m_support_list">후원 게시판</a></li>
                            <li><a href="/manager/m_apply_list">신청 게시판</a></li>
                            <li><a href="/manager/m_ask_list">문의 게시판</a></li>
                            <li><a href="/manager/m_result_list">검사 결과 관리</a></li>
                        </ul>
                    </div>
                </li>
            </ul>
        </div>
    </aside>
    <article>
        <div id="main-div">
            <div id="title">
                회원정보관리
            </div>
            <div id="membersearch"> 
                <form action="/manager/m_member_search" method="get">
                    <input type="search" id="search1" name="searchId" placeholder="회원아이디 입력">&nbsp;&nbsp;
                    <input type="submit" id="searchbt" style="margin:-6px;" value="검색">
                </form>
            </div>
            <div id="table-div">
            <form action="">
                    <table border="1" cellspacing="0">
                        <tr>
                            <th>번호</th>
                            <th>아이디</th>
                            <th>이름</th>
                            <th>주민번호</th>
                            <th>주소</th>
                            <th>전화번호</th>
                            <th>포인트</th>
                            <th>가입날짜</th>
                            <th></th>
                        </tr>
                        <c:forEach items="${requestScope.member}" var="member" varStatus="index">
                        <tr>
                            <td>${member.userNo}</td>
                            <td>${member.userId}</td>
                            <td>${member.userName}</td>
                            <td>${member.zumin}</td>
                            <td>${member.addr}</td>
                            <td>${member.phone}</td>
                            <td>${member.point}</td>
                            <td>${member.regDate}</td>
                            <td>
                            	<form>
                                	<input type="submit" class="bt1" value="수정">&nbsp;&nbsp;&nbsp;
                                	<input type="submit" class="bt1" value="삭제">
                            	</form>                          
                            </td>
                        </tr>
                      </c:forEach>
                    </table>
                    </form>
            </div>
            <div>
            	${pageNavi}
            </div>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </article>
    
</body>
</html>