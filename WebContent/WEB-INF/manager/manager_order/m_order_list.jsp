<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FullLife</title>
<link rel="stylesheet" href="/m_css/m_order_list.css">
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
                <li class="main-li"><a href="/manager/m_member_list">&nbsp;회원 정보 관리</a></li>
                <li class="main-li" id="choice"><a href="/manager/m_order_list">&nbsp;주문 관리</a></li>
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
    <div id="main-div">
        <div id="title">
            주문 관리
        </div>
        <div id="line-div"></div>
        <div id="contents">
            <div id="table-div">
                    <table border="1" cellspacing="0">
                        <tr>
                            <th>주문 번호</th>
                            <th>장기 번호</th>
                            <th>회원 아이디</th>
                            <th>주문 날짜</th>
                            <th>결제 금액</th>
                            <th>결제 날짜</th>
                            <th>사용 포인트</th>
                            <th>주문 취소</th>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>1</td>
                            <td>rkdwodnjs11</td>
                            <td>21.09.23</td>
                            <td>123,456</td>
                            <td>21.09.23</td>
                            <td>0pt</td>
                            <td>
                                <form action="">
                                    <input type="submit" value="주문취소">
                                </form>
                            </td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>2</td>
                            <td>rkdgPwjd33</td>
                            <td>21.09.01</td>
                            <td>789,456</td>
                            <td>21.09.01</td>
                            <td>1000pt</td>
                            <td>
                                <form action="">
                                    <input type="submit" value="주문취소">
                                </form>
                            </td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>2</td>
                            <td>rkdgPwjd33</td>
                            <td>21.09.01</td>
                            <td>789,456</td>
                            <td>21.09.01</td>
                            <td>1000pt</td>
                            <td>
                                <form action="">
                                    <input type="submit" value="주문취소">
                                </form>
                            </td>
                        </tr>
                        
                    </table>
            </div>
        </div>
    </div>
</body>
</html>